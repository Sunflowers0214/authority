package com.flysnow.common;

public class Result {
    private boolean success;// 是否成功标志
    private Object data;// 成功时返回的数据
    private String error;// 错误信息

    public Result() {
    }

    // 成功时的构造器
    public Result(boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    // 错误时的构造器
    public Result(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
