package cn.gzcc.course.demo07.controller;

import cn.gzcc.course.demo07.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/users")
    @ResponseBody
    public List<User> getAll(){
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setUsername("黎明");
        user.setRegisterDatetime("2018-01-01");
        user.setRole("影帝");
        user.setStatus("活跃");
        users.add(user);
        return users;
    }
}
