package cn.gcc.course.springboot.service;

import cn.gcc.course.springboot.model.Error;

import java.math.BigInteger;
import java.util.List;

public interface ErrorService {
    List<Error> getAlls();

    Error create(Error error);

    Error login(Error error);

    Error update(Error error);

    int deleteById(BigInteger id);

    int deleteByIds(BigInteger[] ids);

}
