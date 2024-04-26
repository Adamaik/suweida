package com.example.fastreachserve.service.business.impl;

import com.example.fastreachserve.mapper.business.BusinessStatisticsMapper;
import com.example.fastreachserve.service.business.BusinessStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessStatisticsServiceImpl implements BusinessStatisticsService {
    @Autowired
    BusinessStatisticsMapper businessStatisticsMapper;
}
