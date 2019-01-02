package com.zxjaihhl.order.client;

import com.zxjaihhl.order.vo.ProductIdsVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * Created by zxjaihhl on 2018/12/29.
 */
@FeignClient(name="product")
public interface ProductClient {
    @PostMapping("/product/checkProductStatus")
    boolean checkProductStatus(@RequestBody ProductIdsVO productIdsVO);
}
