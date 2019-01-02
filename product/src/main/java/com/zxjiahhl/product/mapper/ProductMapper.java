package com.zxjiahhl.product.mapper;

import com.zxjiahhl.product.data.ProductInfo;

import java.util.List;

/**
 * Created by zxjaihhl on 2018/12/28.
 */
public interface ProductMapper {
    List<ProductInfo> checkProductStatus(List<Integer> ids);
}
