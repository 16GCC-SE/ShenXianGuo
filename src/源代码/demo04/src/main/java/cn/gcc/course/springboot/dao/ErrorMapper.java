package cn.gcc.course.springboot.dao;

import cn.gcc.course.springboot.model.Error;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ErrorMapper {

    List<Error> getAlls();

}
