package com.zxjaihhl.order.service;

import com.zxjaihhl.order.data.ProductInfo;

import java.util.List;

/**
 * Created by zxjaihhl on 2018/12/29.
 */
public interface OrderService {
    List<ProductInfo> findSellProduct(List<Integer> ids);
}
