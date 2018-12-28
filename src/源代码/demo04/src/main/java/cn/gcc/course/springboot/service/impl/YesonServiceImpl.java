package cn.gcc.course.springboot.service.impl;


import cn.gcc.course.springboot.mapper.YesonMapper;
import cn.gcc.course.springboot.model.Yeson;
import cn.gcc.course.springboot.service.YesonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YesonServiceImpl implements YesonService {

    @Autowired
    private YesonMapper yesonMapper;

    @Override
    public List<Yeson> getAllYeson() {
        return yesonMapper.selectList(null);
    }


}
