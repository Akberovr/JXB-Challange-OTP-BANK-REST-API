package com.jxb.challange.otpbank.service.week;

import com.jxb.challange.otpbank.entity.Week;

import java.util.List;

public interface WeekService {

    public List<Week> findAll();

    public Week findById(int theId);

    public void save(Week theWeek);

    public void deleteById(int theId);

}
