package cn.gcc.course.springboot.dao;

import cn.gcc.course.springboot.model.Select;
import cn.gcc.course.springboot.model.Yeson;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface YesonMapper {


    List<Yeson> getAllYeson();
}
