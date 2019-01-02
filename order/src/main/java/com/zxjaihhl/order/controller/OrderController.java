package com.zxjaihhl.order.controller;

import com.zxjaihhl.order.client.ProductClient;
import com.zxjaihhl.order.common.constant.ResultStatus;
import com.zxjaihhl.order.common.utils.R;
import com.zxjaihhl.order.data.ProductInfo;
import com.zxjaihhl.order.service.OrderService;
import com.zxjaihhl.order.vo.ProductIdsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zxjaihhl on 2018/12/29.
 */
@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderController {
    @Value("${env}")
    private String env;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductClient productClient;

    @PostMapping("/getSellProduct")
    public R findSellProduct(@RequestBody ProductIdsVO productIdsVO){
        List<Integer> ids=productIdsVO.getIds();
        //检查product是否上架和是否有库存
        boolean b = productClient.checkProductStatus(productIdsVO);
        if(b){
            List<ProductInfo> sellProductList = orderService.findSellProduct(ids);
            return R.ok(sellProductList);
        }else {
            return R.error(ResultStatus.NO_Product.getCode(),ResultStatus.NO_Product.getMessage());
        }
    }

    @GetMapping("/getConfig")
    public R getConfig(){
       return R.ok(env);
    }
}
