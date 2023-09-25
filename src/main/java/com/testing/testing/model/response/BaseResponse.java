package com.testing.testing.model.response;

public class BaseResponse<T> {
    public String status;
    public String errorcode;
    public String errormesage;
    public T data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    public String getErrormesage() {
        return errormesage;
    }

    public void setErrormesage(String errormesage) {
        this.errormesage = errormesage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
