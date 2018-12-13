package cn.gcc.course.springboot.dao;

import cn.gcc.course.springboot.model.User;
import cn.gcc.course.springboot.model.Yeson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMapper {

    List<User> getAll();

}
