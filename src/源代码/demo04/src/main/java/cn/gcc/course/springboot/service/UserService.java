package cn.gcc.course.springboot.service;


import cn.gcc.course.springboot.model.User;

import java.math.BigInteger;
import java.util.List;

public interface UserService {
    List<User> getAll();


    User create(User user);

    User creates(User user);

    User update(User user);

    int deleteById(BigInteger id);

    int deleteByIds(BigInteger[] ids);
}
