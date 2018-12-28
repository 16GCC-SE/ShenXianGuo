package cn.gcc.course.springboot.dao;

import cn.gcc.course.springboot.model.Role;
import cn.gcc.course.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMapper {

    List<User> getAll();

}
