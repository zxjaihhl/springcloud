package com.zxjaihhl.order.service.impl;

import com.zxjaihhl.order.data.ProductInfo;
import com.zxjaihhl.order.mapper.OrderMapper;
import com.zxjaihhl.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zxjaihhl on 2018/12/29.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<ProductInfo> findSellProduct(List<Integer> ids) {
        List<ProductInfo> sellProductList = orderMapper.findSellProduct(ids);
        return sellProductList;
    }
}
