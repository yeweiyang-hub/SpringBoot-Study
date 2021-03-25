package com.soft1921.mybatis.controller.dto;

import lombok.Data;

/**
 * @author：yeweiyang
 * @date: 2021/3/25-17:02
 */

@Data
public class AjaxResponse {

    private Integer code;

    private String message;

    private Object data;

    private AjaxResponse() {
        //无参构造
    }

    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");
        return ajaxResponse;

    }

    public static AjaxResponse success(Object data) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");
        ajaxResponse.setData(data);
        return ajaxResponse;
    }


    public static  AjaxResponse success(Object data,String message){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(data);
        return ajaxResponse;
    }
}
