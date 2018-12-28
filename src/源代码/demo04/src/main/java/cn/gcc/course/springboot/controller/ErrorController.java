package cn.gcc.course.springboot.controller;

import cn.gcc.course.springboot.model.Error;
import cn.gcc.course.springboot.service.ErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import java.math.BigInteger;
import cn.gcc.course.springboot.model.vo.Response;
import java.util.List;

@Controller
public class ErrorController {

    @Autowired
    private ErrorService errorService;

    @RequestMapping("/errors")
    @ResponseBody
    public List<Error> getAlls(){
        return errorService.getAlls();
    }
    @RequestMapping("/errors/delete")
    @ResponseBody
    public int delete(@RequestBody BigInteger ids){

        return errorService.deleteById(ids);
    }
    @RequestMapping("/errors/create")
    @ResponseBody
    public Response<Error> create(@RequestBody  Error error){
        Response<Error> response = new Response<>();
        Error newId = errorService.create(error);
        if(newId == null){
            response.setSuccess(false);
            response.setMessage("同名用户已经存在。");
            response.setData(null);
        }else{
            response.setSuccess(true);
            response.setMessage("创建用户成功");
            response.setData(error);
        }
        return response;
    }
    @RequestMapping("/errors/login")
    @ResponseBody
    public Response<Error> login(@RequestBody  Error error){
        Response<Error> response = new Response<>();
        return response;
    }
//
//    @RequestMapping("/users/delete")
//    @ResponseBody
//    public int delete(@RequestBody BigInteger[] ids){
//        return userService.deleteByIds(ids);
//    }
}
