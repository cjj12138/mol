package com.exam.demo.Service;

import com.exam.demo.entity.User;
import com.exam.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestService {
    @Autowired
    UserMapper userMapper;

    public User check(){
        return userMapper.checkuser();
    }
}
