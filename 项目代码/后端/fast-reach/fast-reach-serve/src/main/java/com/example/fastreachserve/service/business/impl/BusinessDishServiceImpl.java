package com.example.fastreachserve.service.business.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import result.PageResult;
import com.example.fastreachserve.mapper.business.BusinessDishMapper;
import com.example.fastreachserve.service.business.BusinessDishService;

import dto.business.BusinessDishPageDTO;
import entity.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BusinessDishServiceImpl implements BusinessDishService {
    @Autowired
    BusinessDishMapper businessDishMapper;

    @Override
    public void uploadPic(String temp, Integer id) {
        businessDishMapper.uploadPic(temp,id);
    }

    @Override
    public PageResult page(BusinessDishPageDTO businessDishPageDTO) {

        PageHelper.startPage(1,10);
        List<Dish> page = businessDishMapper.page(businessDishPageDTO);
        PageInfo<Dish> pageInfo = new PageInfo<Dish>(page);
        log.info("fef{}",pageInfo.getSize());
        return new PageResult(pageInfo.getTotal(), pageInfo.getList());

    }
}
