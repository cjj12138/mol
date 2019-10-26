package com.exam.demo.mapper;

import com.exam.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User checkuser();
}
