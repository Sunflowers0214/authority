package com.flysnow.demo.dao.impl;

import com.flysnow.common.BaseDao;
import com.flysnow.demo.dao.AppointmentDao;
import com.flysnow.demo.model.Appointment;

import java.util.Date;
import java.util.List;

public class AppointmentDaoImpl extends BaseDao implements AppointmentDao {

    public Appointment insertAppointment(Appointment appointment) {
        appointment.setAppointTime(new Date());
        super.insert(AppointmentDao.class.getName() + ".insertAppointment", appointment);
        return appointment;
    }

    public List<Appointment> queryListWithBook(String bookId) {
        Appointment appointment = new Appointment();
        appointment.setBookId(bookId);
        return super.queryForList(AppointmentDao.class.getName() + ".queryListWithBook", appointment);
    }
}
