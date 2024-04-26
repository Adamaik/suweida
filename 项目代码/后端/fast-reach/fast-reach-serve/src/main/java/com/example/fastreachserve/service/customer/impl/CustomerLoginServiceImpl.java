package com.example.fastreachserve.service.customer.impl;

import com.example.fastreachserve.mapper.customer.CustomerLoginMapper;
import com.example.fastreachserve.service.customer.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService {
    @Autowired
    CustomerLoginMapper customerLoginMapper;
}
