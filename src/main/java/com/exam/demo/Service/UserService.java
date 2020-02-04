package com.exam.demo.Service;

import com.exam.demo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User confirmuser(@Param("userid")String userid, @Param("password")String password);
}
