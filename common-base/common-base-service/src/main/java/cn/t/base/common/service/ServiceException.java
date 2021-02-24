package cn.t.base.common.service;

import java.util.HashMap;
import java.util.Map;

public class ServiceException extends RuntimeException {

    private ErrorInfo errorInfo;

    private Map<String, Object> data = new HashMap<>();

    public ServiceException(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public ServiceException(ErrorInfo errorInfo, Map<String, Object> data) {
        this.errorInfo = errorInfo;
        this.data = data;
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
