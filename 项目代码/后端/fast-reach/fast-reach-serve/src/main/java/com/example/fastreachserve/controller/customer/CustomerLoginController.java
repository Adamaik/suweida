package com.example.fastreachserve.controller.customer;

/*
 * 功能：顾客登录
 * 负责人：
 * */

import com.example.fastreachserve.service.customer.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerLoginController {
    @Autowired
    CustomerLoginService customerLoginService;
}
