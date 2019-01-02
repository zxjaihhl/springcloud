package com.zxjiahhl.product.service.impl;

import com.zxjiahhl.product.data.ProductInfo;
import com.zxjiahhl.product.mapper.ProductMapper;
import com.zxjiahhl.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zxjaihhl on 2018/12/28.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Boolean checkProductStatus(List<Integer> ids) {
        List<ProductInfo> productInfoList = productMapper.checkProductStatus(ids);
        for (ProductInfo productInfo : productInfoList) {
            Integer productStatus = productInfo.getProductStatus();
            Integer productStock = productInfo.getProductStock();
            if (productStatus == 0 || productStock == 0) {
                return false;
            }
        }
        return true;
    }
}
