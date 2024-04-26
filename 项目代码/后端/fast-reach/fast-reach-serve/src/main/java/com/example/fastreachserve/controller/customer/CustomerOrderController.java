package com.example.fastreachserve.controller.customer;

import com.example.fastreachserve.service.customer.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/*
 * 功能：顾客点餐
 * 负责人：
 * */
@RestController
public class CustomerOrderController {
    @Autowired
    CustomerOrderService customerOrderService;
}
