package com.jxb.challange.otpbank.service.atm;

import com.jxb.challange.otpbank.entity.Atm;

import java.util.List;

public interface AtmService {

    public List<Atm> findAll();

    public Atm findById(int theId);

    public void save(Atm theAtm);

    public void deleteById(int theId);
}
