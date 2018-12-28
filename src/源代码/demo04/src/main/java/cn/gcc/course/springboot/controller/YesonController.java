package cn.gcc.course.springboot.controller;

import cn.gcc.course.springboot.model.Yeson;

import cn.gcc.course.springboot.service.YesonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class YesonController {

    @Autowired
    private YesonService yesonService;

    @RequestMapping("/yeson")
    @ResponseBody
    public List<Yeson> getAll(){
        return yesonService.getAllYeson();
    }
}
