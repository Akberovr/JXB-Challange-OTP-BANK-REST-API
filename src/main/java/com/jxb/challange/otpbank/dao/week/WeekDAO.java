package com.jxb.challange.otpbank.dao.week;

import com.jxb.challange.otpbank.entity.Week;

import java.util.List;

public interface WeekDAO {


    public List<Week> findAll();

    public Week findById(int theId);

    public void save(Week theAtm);

    public void deleteById(int theId);


}
