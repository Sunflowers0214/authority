package com.flysnow.demo.dao;

import com.flysnow.demo.model.Appointment;

import java.util.List;

public interface AppointmentDao {

    /**
     * 插入预约图书记录
     *
     * @param appointment
     * @return 插入的行数
     */
    Appointment insertAppointment(Appointment appointment);

    /**
     * 通过查询图书预约记录
     *
     * @param bookId
     * @return
     */
    List<Appointment> queryListWithBook(String bookId);

}
