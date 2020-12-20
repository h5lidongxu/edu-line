package com.ldx.eduline.common.bean;

import com.ldx.eduline.common.utils.MyStateCodeEnum;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {

    private Integer code;

    private String message;

    private Map<String,Object> dateMap = new HashMap<>();

    public static R success(){
        R r = new R();
        r.setCode(MyStateCodeEnum.SUCCESS.getCode());
        r.setMessage(MyStateCodeEnum.SUCCESS.getMsg());
        return r;
    }

    public static R fail(){
        R r = new R();
        r.setCode(MyStateCodeEnum.REQUEST_ERROR.getCode());
        r.setMessage(MyStateCodeEnum.REQUEST_ERROR.getMsg());
        return r;
    }

    public R addData(String key, Object value){
        this.dateMap.put(key,value);
        return this;
    }


}
