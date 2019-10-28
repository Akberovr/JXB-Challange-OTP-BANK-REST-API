package com.jxb.challange.otpbank.dao.atm;

import java.util.List;

import com.jxb.challange.otpbank.entity.Atm;

public interface AtmDAO {

    public List<Atm> findAll();

    public Atm findById(int theId);

    public void save(Atm theAtm);

    public void deleteById(int theId);

}
