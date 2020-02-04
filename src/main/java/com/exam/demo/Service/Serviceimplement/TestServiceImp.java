package com.exam.demo.Service.Serviceimplement;

import com.exam.demo.entity.User;
import com.exam.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImp{
    @Autowired
    UserMapper userMapper;


}
