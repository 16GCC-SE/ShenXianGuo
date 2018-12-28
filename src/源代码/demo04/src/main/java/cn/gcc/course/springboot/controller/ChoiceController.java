package cn.gcc.course.springboot.controller;

import cn.gcc.course.springboot.model.Choice;
import cn.gcc.course.springboot.service.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ChoiceController {

    @Autowired
    private ChoiceService choiceService;

    @RequestMapping("/choice")
    @ResponseBody
    public List<Choice> getAlles(){
        return choiceService.getAlles();
    }

}
