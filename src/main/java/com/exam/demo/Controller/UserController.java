package com.exam.demo.Controller;

import com.exam.demo.Service.Serviceimplement.UserServiceImp;
import com.exam.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    UserServiceImp userServiceImp;

    @RequestMapping(value = "lg")
    public String login(@RequestBody User user, HttpServletRequest request){
        User login=this.userServiceImp.confirmuser(user.getUserid(),user.getPassword());
        System.out.println(login.toString());
        return "hello,world!";
    }
}
