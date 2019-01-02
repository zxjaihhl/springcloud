package com.zxjiahhl.product.controller;

import com.zxjiahhl.product.common.constant.ResultStatus;
import com.zxjiahhl.product.common.utils.R;
import com.zxjiahhl.product.service.ProductService;
import com.zxjiahhl.product.vo.ProductIdsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zxjaihhl on 2018/12/28.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/checkProductStatus")
    public boolean checkProductStatus(@RequestBody ProductIdsVO productIdsVO) {
        List<Integer> ids = productIdsVO.getIds();
        return productService.checkProductStatus(ids);
    }

}
