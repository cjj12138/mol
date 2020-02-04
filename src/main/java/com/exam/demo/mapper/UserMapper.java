package com.exam.demo.mapper;

import com.exam.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User confirmuser(@Param("userid")String userid,@Param("password")String password);
}
