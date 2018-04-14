package com.example.service;

import com.example.dao.UserDao;
import com.example.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserSeImp implements UserSe {
    @Resource
    private UserDao userDao;
    @Override
    public String inserd(User user) {
        String want = "";
        int i =userDao.inserd(user);
        System.out.println(i);
        if (i>0)
            want = "添加成功";
        else
            want ="添加失败";
        return  want;
    }
}
