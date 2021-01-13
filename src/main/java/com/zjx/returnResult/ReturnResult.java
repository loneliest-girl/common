package com.zjx.returnResult;

/**
 * @program: common
 * @description 统一返回结果
 * @author: zhujingxing
 * @create: 2021-01-13 09:42
 **/
public class ReturnResult<T> {
    private T data;
    private Boolean success;

    public ReturnResult(T t) {
        this.data = t;
        this.success = true;
    }

    public ReturnResult() {

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
