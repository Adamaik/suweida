package com.example.fastreachserve.service.business;

import com.example.fastreachserve.controller.business.BusinessEmployeeController;
import dto.business.BusinessDishPageDTO;
import dto.business.BusinessEmployeePageDTO;
import org.apache.ibatis.annotations.Mapper;
import result.PageResult;

import java.util.List;

public interface BusinessEmployeeService {
//    static void delete(List<Integer> ids) {
//    }
    PageResult page(BusinessEmployeePageDTO businessEmployeePageDTO);
}
