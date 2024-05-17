package com.example.fastreachserve.service.customer.impl;

import com.example.fastreachserve.mapper.customer.CustomerOrderMapper;
import com.example.fastreachserve.service.customer.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {
    @Autowired
    CustomerOrderMapper customerOrderMapper;

    @Override
    public void editMoney(double money, int id) {
        customerOrderMapper.editMoney(money,id);
    }
}
