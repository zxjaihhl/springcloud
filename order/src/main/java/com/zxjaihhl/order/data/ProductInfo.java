package com.zxjaihhl.order.data;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zxjaihhl on 2018/12/28.
 */
@Data
public class ProductInfo {
    private Integer productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus;
    private Integer categoryType;
    private Date createTime;
    private Date upDataTime;

}
