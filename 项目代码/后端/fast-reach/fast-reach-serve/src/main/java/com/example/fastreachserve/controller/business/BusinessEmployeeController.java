package com.example.fastreachserve.controller.business;

import com.example.fastreachserve.service.business.BusinessEmployeeService;
import dto.business.BusinessEmployeePageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import result.PageResult;
import result.Result;
import utils.OBSUtils;

import java.util.List;

/*
 * 功能：员工管理
 * 负责人：何子恒
 * */
@Slf4j
@RestController
@RequestMapping("/business/employee")
public class BusinessEmployeeController {

    @Autowired
    private BusinessEmployeeService businessEmployeeService;
    // 新增的员工分页查询方法
    @GetMapping("/page")
    public Result page(BusinessEmployeePageDTO businessEmployeePageDTO) {
        log.info("员工分页查询，{}",  businessEmployeePageDTO);
        // 调用服务层方法进行分页查询，这里假设返回一个PageResult对象
        PageResult pageResult = businessEmployeeService.page(businessEmployeePageDTO);
        log.info("TEST:",pageResult);
        return Result.sucess(pageResult);
    }
 //   @DeleteMapping("/delete")
//    public Result delete(@PathVariable List<Integer>ids){
//        log.info("批量删除,ids:{}",ids);
//        BusinessEmployeeService.delete(ids);
//        return Result.sucess();
//    }
}




