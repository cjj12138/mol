package com.exam.demo.Service.Serviceimplement;

import com.exam.demo.Service.UserService;
import com.exam.demo.entity.User;
import com.exam.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User confirmuser(String userid, String password) {
        return this.userMapper.confirmuser(userid,password);
    }
}
