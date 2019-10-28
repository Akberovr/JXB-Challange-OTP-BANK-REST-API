package com.jxb.challange.otpbank.service.week;

import com.jxb.challange.otpbank.dao.week.WeekDAO;
import com.jxb.challange.otpbank.entity.Week;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeekServiceImpl implements WeekService {

    WeekDAO weekDAO;
    @Autowired
    public WeekServiceImpl(WeekDAO weekDAO) {
        this.weekDAO = weekDAO;
    }

    @Override
    public List<Week> findAll() {
        return weekDAO.findAll();
    }

    @Override
    public Week findById(int theId) {
        return weekDAO.findById(theId);
    }

    @Override
    public void save(Week theWeek) {
        weekDAO.save(theWeek);
    }

    @Override
    public void deleteById(int theId) {
        weekDAO.deleteById(theId);
    }
}
