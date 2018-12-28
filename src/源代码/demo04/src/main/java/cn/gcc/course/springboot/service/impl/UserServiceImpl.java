package cn.gcc.course.springboot.service.impl;

import cn.gcc.course.springboot.mapper.UserMapper;

import cn.gcc.course.springboot.model.User;
import cn.gcc.course.springboot.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.selectList(null);
    }

    @Override
    public User create(User user) {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.lambda().eq(User::getUsername,user.getUsername());
        if( userMapper.selectCount(qw)>=1){
            return  null;
        }else{
            userMapper.insert(user);
        }
        return user;
    }

    @Override
    public User creates(User user) {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.lambda().eq(User::getUsername,user.getUsername());

        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public int deleteById(BigInteger id) {
        userMapper.deleteById(id);
        return 0;
    }

    @Override
    public int deleteByIds(BigInteger[] ids) {
        for(BigInteger id : ids){
            User user = userMapper.selectById(id);
            if(user == null){
                return 0;
            }
        }
        for(BigInteger id : ids){
            userMapper.deleteById(id);
        }

        return ids.length;
    }
}
