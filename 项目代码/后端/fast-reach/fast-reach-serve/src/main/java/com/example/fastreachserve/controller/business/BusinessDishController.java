package com.example.fastreachserve.controller.business;

import com.example.fastreachserve.service.business.BusinessDishService;
import dto.business.BusinessDishPageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import result.PageResult;
import result.Result;
import utils.OBSUtils;

/*
* 功能：菜品管理
* 负责人：
* */
@RestController
@Slf4j
@RequestMapping("/business/dish")
public class BusinessDishController {
    @Autowired
    private BusinessDishService businessDishService;
    private final OBSUtils obsUtils = new OBSUtils();
    @PostMapping("/upload")
    public Result upload(MultipartFile file,Integer id){
        String temp = obsUtils.upload(file);
        businessDishService.uploadPic(temp,id);
        return Result.sucess();
    }
    @GetMapping("/page")
    public Result<PageResult>page(BusinessDishPageDTO businessDishPageDTO){
        log.info("菜品分页查询：{}",businessDishPageDTO);
        PageResult pageResult =businessDishService.page(businessDishPageDTO);
        return Result.sucess(pageResult);
    }


}
