package com.example.fastreachserve.mapper.business;

import com.github.pagehelper.Page;
import dto.business.BusinessDishPageDTO;
import entity.Dish;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BusinessDishMapper {
    @Update("UPDATE dishes SET image = #{temp} WHERE id = #{id}")
    void uploadPic(String temp, Integer id);

    //@Select("select * from dishes")
    List<Dish> page(BusinessDishPageDTO businessDishPageDTO);
}
