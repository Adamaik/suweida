package com.example.fastreachserve.service.business;

import dto.business.BusinessDishPageDTO;
import result.PageResult;

public interface BusinessDishService {
    void uploadPic(String temp, Integer id);

    PageResult page(BusinessDishPageDTO businessDishPageDTO);
}
