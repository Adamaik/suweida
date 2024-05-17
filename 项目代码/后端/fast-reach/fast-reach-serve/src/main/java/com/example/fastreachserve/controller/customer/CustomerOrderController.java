package com.example.fastreachserve.controller.customer;

import com.example.fastreachserve.service.customer.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import result.PageResult;
import result.Result;
import vo.business.BusinessOrderVO;

import java.util.List;

/*
 * 功能：顾客点餐
 * 负责人：
 * */
@RestController
@RequestMapping("/customer")
public class CustomerOrderController {
    @Autowired
    CustomerOrderService customerOrderService;
    @GetMapping("/xsy1")
    public Result editMoney(@RequestParam("money") double money,@RequestParam("id") int id) {
        customerOrderService.editMoney(money ,id);
return Result.sucess();
    }
}
