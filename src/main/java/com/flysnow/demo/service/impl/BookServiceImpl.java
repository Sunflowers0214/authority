package com.flysnow.demo.service.impl;

import com.flysnow.common.BaseService;
import com.flysnow.common.FrameworkException;
import com.flysnow.common.StatusEnum;
import com.flysnow.demo.dao.AppointmentDao;
import com.flysnow.demo.dao.BookDao;
import com.flysnow.demo.model.Appointment;
import com.flysnow.demo.model.Book;
import com.flysnow.demo.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BookServiceImpl extends BaseService implements BookService {

    private BookDao bookDao;
    private AppointmentDao appointmentDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setAppointmentDao(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    public List<Book> getList() {
        return bookDao.queryAll(0, 1000);
    }

    public Book getById(String bookId) {
        return bookDao.queryById(bookId);
    }

    @Transactional
    public StatusEnum appoint(String bookId, String studentId) {
        try {
            // 减库存
            int update = bookDao.reduceNumber(bookId);
            if (update <= 0) {// 库存不足
                throw new FrameworkException("no number");
            } else {
                // 执行预约操作
                Appointment appointment = new Appointment();
                appointment.setBookId(bookId);
                appointment.setStudentId(studentId);
                appointment = appointmentDao.insertAppointment(appointment);
                return StatusEnum.VALID;
            }
            // 要先于catch Exception异常前先catch住再抛出，不然自定义的异常也会被转换为AppointException，导致控制层无法具体识别是哪个异常
        } catch (FrameworkException e) {
            throw e;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            // 所有编译期异常转换为运行期异常
            throw new FrameworkException("appoint inner error:" + e.getMessage());
        }
    }

    @Override
    public List appointList(String bookId) {
        return appointmentDao.queryListWithBook(bookId);
    }

}
