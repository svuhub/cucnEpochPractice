package com.mmall.service.impl;

import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class UserServiceImplTest {

    @Autowired
    private IUserService iUserService;

    @Test
    public void register() {
        User user = new User();
        user.setId(22);
        user.setUsername("zhaol");
        user.setPassword("123456");
        user.setEmail("170736012@qq.com");
        user.setPhone("17751780934");
        user.setQuestion("123");
        user.setAnswer("456");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setRole(1);
        iUserService.register(user);

    }
}