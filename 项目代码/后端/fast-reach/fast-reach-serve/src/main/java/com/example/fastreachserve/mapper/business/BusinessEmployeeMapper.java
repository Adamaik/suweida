package com.example.fastreachserve.mapper.business;

import dto.business.BusinessEmployeePageDTO;
import entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BusinessEmployeeMapper {
    //@Select("select * from employees")
    List<Employee> page(BusinessEmployeePageDTO businessEmployeePageDTO);

    void delete(List<Integer>ids);
}