package com.jxb.challange.otpbank.rest;


import com.jxb.challange.otpbank.entity.Week;
import com.jxb.challange.otpbank.service.week.WeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class WeekRestController {

    WeekService weekService;

    @Autowired
    public WeekRestController(WeekService weekService) {
        this.weekService = weekService;
    }

    @GetMapping("/weeks")
    public List<Week> findAll(){
        return weekService.findAll();
    }


}
