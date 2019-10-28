package com.jxb.challange.otpbank.service.address;

import com.jxb.challange.otpbank.entity.Address;

import java.util.List;

public interface AddressService {

    public List<Address> findAll();

    public Address findById(int theId);

    public void save(Address theAddress);

    public void deleteById(int theId);

}
