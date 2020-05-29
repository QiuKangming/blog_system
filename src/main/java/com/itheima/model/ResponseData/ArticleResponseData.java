package com.itheima.model.ResponseData;

import lombok.Data;

/**
 * 前端请求响应的封装类
 */
@Data
public class ArticleResponseData<T> {
    private T payload;        //服务器响应数据
    private boolean success; //请求是否成功
    private String msg;       // 错误信息
    private int code = -1;   // 状态码
    private long timestamp; //服务器响应时间

    {
        //构造代码块
        this.timestamp = System.currentTimeMillis() / 1000;
    }

    public ArticleResponseData() {
    }

    public ArticleResponseData(boolean success) {
        this.success = success;
    }

    public ArticleResponseData(boolean success, T payload) {
        this.success = success;
        this.payload = payload;
    }

    public ArticleResponseData(boolean success, T payload, int code) {
        this.success = success;
        this.payload = payload;
        this.code = code;
    }

    public ArticleResponseData(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ArticleResponseData(boolean success, String msg, int code) {
        this.success = success;
        this.msg = msg;
        this.code = code;
    }


    public static ArticleResponseData ok() {
        return new ArticleResponseData(true);
    }

    public static <T> ArticleResponseData ok(T payload) {
        return new ArticleResponseData(true, payload);
    }

    public static <T> ArticleResponseData ok(int code) {
        return new ArticleResponseData(true, null, code);
    }

    public static <T> ArticleResponseData ok(T payload, int code) {
        return new ArticleResponseData(true, payload, code);
    }

    public static ArticleResponseData fail() {
        return new ArticleResponseData(false);
    }

    public static ArticleResponseData fail(String msg) {
        return new ArticleResponseData(false, msg);
    }

    public static ArticleResponseData fail(int code) {
        return new ArticleResponseData(false, null, code);
    }

    public static ArticleResponseData fail(int code, String msg) {
        return new ArticleResponseData(false, msg, code);
    }

}
