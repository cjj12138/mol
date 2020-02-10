package com.exam.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.exam.demo.Utils.GetRequestJsonUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.Resource;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@CrossOrigin
@RestController
public class uploadController {
    @RequestMapping(value = "upload")
    public String upload(HttpServletRequest request, MultipartFile file){
        String userid=request.getParameter("userid");
        System.out.println("收到上传请求");
        String fileName = file.getOriginalFilename();
        System.out.println(userid);
        if (!file.isEmpty()) {
            try {
                // 文件保存路径
                File img_path=new File("F:\\img"+"\\"+userid+"\\upload");
                if ( !img_path.exists()){//若此目录不存在，则创建之// 这个东西只能简历一级文件夹，两级是无法建立的。。。。。
                    img_path.mkdirs();
                    System.out.println("创建文件夹路径为："+ "F:\\img"+"\\"+userid+"\\upload");
                    file.transferTo(new File(img_path+ "\\"+ fileName));
                }else {
                    file.transferTo(new File(img_path+ "\\"+ fileName));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return "";
    }
}
