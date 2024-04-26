package com.example.fastreachserve.controller.business;

import com.example.fastreachserve.service.business.BusinessStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
/*
 * 功能：数据统计
 * 负责人：沈浩天
 * */
@RestController
public class BusinessStatisticsController {
    @Autowired
    BusinessStatisticsService businessStatisticsService;
}
