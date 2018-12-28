package cn.gcc.course.springboot.service.impl;

import cn.gcc.course.springboot.mapper.ChoiceMapper;
import cn.gcc.course.springboot.model.Choice;
import cn.gcc.course.springboot.service.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceServiceImpl implements ChoiceService {

    @Autowired
    private ChoiceMapper choiceMapper;

    @Override
    public List<Choice> getAlles() {
        return choiceMapper.selectList(null);
    }
}
