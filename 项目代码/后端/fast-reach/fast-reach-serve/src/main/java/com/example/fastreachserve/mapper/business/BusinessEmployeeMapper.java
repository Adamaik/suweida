package com.example.fastreachserve.mapper.business;

import dto.business.BusinessEmployeePageDTO;
import dto.business.BussinessEmployeeAddDTO;
import dto.business.BussinessEmployeeEditDTO;
import entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BusinessEmployeeMapper {
    //@Select("select * from employees")
    List<Employee> page(BusinessEmployeePageDTO businessEmployeePageDTO);

   // void delete(List<Integer>ids);

    @Insert("INSERT INTO employees (name, account, password, phone_number,gender,permission) VALUES (#{name},#{account},#{password},#{phoneNumber},#{gender},#{permission})")
    void add(BussinessEmployeeAddDTO businessDishAddDTO);

    @Update("UPDATE employees SET name = #{name},password=#{password},phone_number=#{phoneNumber},gender=#{gender},permission=#{permission}  WHERE employee_id = #{id}")
    void edit(BussinessEmployeeEditDTO bussinessEmployeeEditDTO);
}