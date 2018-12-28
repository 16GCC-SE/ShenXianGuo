package cn.gcc.course.springboot.service.impl;

import cn.gcc.course.springboot.mapper.ErrorMapper;
import cn.gcc.course.springboot.model.Error;
import cn.gcc.course.springboot.service.ErrorService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class ErrorServiceImpl implements ErrorService {

    @Autowired
    private ErrorMapper errorMapper;

    @Override
    public List<Error> getAlls() {
        return errorMapper.selectList(null);
    }

    @Override
    public Error create(Error error) {
        QueryWrapper<Error> qww = new QueryWrapper<>();
        qww.lambda().eq(Error::getId,error.getId());
        if( errorMapper.selectCount(qww)>=1){
            return  null;
        }else{
            errorMapper.insert(error);
        }

        return error;
    }

    @Override
    public Error login(Error error) {

        errorMapper.deleteById(0);
        QueryWrapper<Error> qww = new QueryWrapper<>();
        qww.lambda().eq(Error::getId,error.getId());
        if( errorMapper.selectCount(qww)>=1){
            return  null;
        }else{
            errorMapper.insert(error);
        }
        return error;
    }

    @Override
    public Error update(Error error) {
        return null;
    }

    @Override
    public int deleteById(BigInteger ids) {
        errorMapper.deleteById(ids);
        return 0;
    }

    @Override
    public int deleteByIds(BigInteger[] ids) {
        for(BigInteger id : ids){
            Error user = errorMapper.selectById(id);
            if(user == null){
                return 0;
            }
        }
        for(BigInteger id : ids){
            errorMapper.deleteById(id);
        }

        return ids.length;
    }


}
