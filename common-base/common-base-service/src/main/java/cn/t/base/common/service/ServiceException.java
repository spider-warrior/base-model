package cn.t.base.common.service;

import java.util.HashMap;
import java.util.Map;

public class ServiceException extends Exception {

    private String msg;
    private String code;

    private Map<String, Object> data = new HashMap<>();

    public ServiceException(String message, String msg, String code) {
        super(message);
        this.msg = msg;
        this.code = code;
    }

    public ServiceException(String message, String msg, String code, Map<String, Object> data) {
        super(message);
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
