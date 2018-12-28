package cn.gcc.course.springboot.controller;


import cn.gcc.course.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

@Controller
public class LoginController {

    @PostMapping("login")

    public ModelAndView login(
            @RequestParam("username") String username,
            @RequestParam("password")String password,
            ModelAndView mv)
    {
        System.out.println("LoginController login 方法调用---");
        System.out.println("登录名："+username+"密码:"+password);
        mv.setViewName("redirect:/register");

        return mv;
    }
    @Autowired
    private UserService userService;

    @RequestMapping("/uploadForm")
    public String toUploadForm(Model model){
        return "persion.html";
    }
}
