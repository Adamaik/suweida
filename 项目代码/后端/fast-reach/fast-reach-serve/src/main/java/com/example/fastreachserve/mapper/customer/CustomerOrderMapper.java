package com.example.fastreachserve.mapper.customer;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CustomerOrderMapper {
    @Update("UPDATE employees SET money=#{money} WHERE id = #{id}")
    void editMoney(double money, int id);

}
