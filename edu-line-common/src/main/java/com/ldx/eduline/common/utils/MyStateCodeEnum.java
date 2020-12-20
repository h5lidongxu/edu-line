package com.ldx.eduline.common.utils;

public enum MyStateCodeEnum {

    UNKNOWN_ERROR(-1, "未知错误"),
    SUCCESS(200, "请求成功"),
    TOKEN_OVERDUE(601,"token过期"),
    SIGN_VERIFY_FAIL(602,"签名验证失败"),
    COMMON_ERROR(603,"公共错误"),
    REQUEST_ERROR(500,"请求数据失败")
//    USER_NOT_EXIST(701, "用户不存在"),
//    DATA_IS_NULL(703, "数据为空"),
//    DATA_IS_ERROR(704, "数据不合法，请检查！！")
    ;
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    MyStateCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
