package com.zxjaihhl.order.common.constant;

import lombok.Getter;

/**
 * @Auther: 周明军
 * @Date: 2018/9/20 09:35
 * @Description: 响应状态
 */
@Getter
public enum ResultStatus {
    OK(0, "成功"),
    ERROR(-1,"操作失败"),
    BAD_REQUEST(400, "错误请求"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "未找到结果"),
    TIMEOUT(408, "超时"),
    SERVER_ERROR(500, "服务器错误"),

    PARAM_EMPTY(600, "参数为空"),
    PARAM_INSUFFICIENT(601, "参数不全"),
    INVALID_JSON(602, "JSON格式错误"),
    PARAM_ERROR(603, "参数错误"),
    NO_SERVICE(700, "未找到该服务"),
    NO_Product(800,"没有库存")
    ;

    private Integer code;
    private String message;

    ResultStatus(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}