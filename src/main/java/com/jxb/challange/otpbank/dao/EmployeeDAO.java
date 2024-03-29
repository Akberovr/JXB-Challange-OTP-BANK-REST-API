package com.jxb.challange.otpbank.dao;

import java.util.List;

import com.jxb.challange.otpbank.entity.Employee;

public interface EmployeeDAO {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteByid(int theId);


}
