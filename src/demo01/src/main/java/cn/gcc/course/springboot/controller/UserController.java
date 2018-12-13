package cn.gcc.course.springboot.controller;

import cn.gcc.course.springboot.model.User;
import cn.gcc.course.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    @ResponseBody
    public List<User> getAll(){
        return userService.getAll();
    }

//    @RequestMapping("/users/create")
//    @ResponseBody
//    public Response<User> create(@RequestBody  User user){
//        Response<User> response = new Response<>();
//        User newUser = userService.create(user);
//        if(newUser == null){
//            response.setSuccess(false);
//            response.setMessage("同名用户已经存在。");
//            response.setData(null);
//        }else{
//            response.setSuccess(true);
//            response.setMessage("创建用户成功");
//            response.setData(user);
//        }
//        return response;
//    }
//
//    @RequestMapping("/users/delete")
//    @ResponseBody
//    public int delete(@RequestBody BigInteger[] ids){
//        return userService.deleteByIds(ids);
//    }
}
