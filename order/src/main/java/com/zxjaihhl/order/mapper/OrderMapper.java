package com.zxjaihhl.order.mapper;

import com.zxjaihhl.order.data.ProductInfo;

import java.util.List;

/**
 * Created by zxjaihhl on 2018/12/29.
 */
public interface OrderMapper {
    List<ProductInfo> findSellProduct(List<Integer> ids);
}
