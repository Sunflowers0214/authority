package com.flysnow.demo.dao;

import com.flysnow.common.UUIDUtil;
import com.flysnow.demo.model.Appointment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/spring-service.xml", "classpath:config/spring/spring-mybatis.xml", "classpath:config/spring/demo-*.xml"})
public class AppointmentDaoTest {

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void testInsertAppointment() throws Exception {
        String bookId = "1000";
        Appointment appointment = new Appointment();
        appointment.setBookId(bookId);
        appointment.setStudentId(UUIDUtil.genKey());
        appointment = appointmentDao.insertAppointment(appointment);
        System.out.println(appointment);
    }

    @Test
    public void testQueryByKeyWithBook() throws Exception {
        String bookId = "1000";
        List<Appointment> appointmentList = appointmentDao.queryListWithBook(bookId);
        for (Appointment appointment : appointmentList) {
            System.out.println(appointment);
        }
    }
}
