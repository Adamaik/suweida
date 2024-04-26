package com.example.fastreachserve.service.customer.impl;

import com.example.fastreachserve.mapper.customer.CustomerOrderMapper;
import com.example.fastreachserve.service.customer.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {
    @Autowired
    CustomerOrderMapper customerOrderMapper;
}
