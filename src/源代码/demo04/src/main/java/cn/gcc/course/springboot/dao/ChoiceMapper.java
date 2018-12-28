package cn.gcc.course.springboot.dao;

import cn.gcc.course.springboot.model.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChoiceMapper {

    List<Select> getAlles();

}
