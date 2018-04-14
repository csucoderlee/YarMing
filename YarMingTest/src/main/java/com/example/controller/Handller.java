package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserSe;
import com.example.service.UserSeImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Handller {


    @Autowired
    private UserSe userSe;

    @RequestMapping("/jump")
    public String hallo(int empid,String ename,String hiredate,int photo){
        User user = new User(empid,ename,hiredate,photo);
        String inserd = userSe.inserd(user);
        System.out.println(inserd);
        return "success";
    }
}
