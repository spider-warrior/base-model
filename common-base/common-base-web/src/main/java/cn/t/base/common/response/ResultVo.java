package cn.t.base.common.response;


import cn.t.base.common.service.ErrorInfo;
import cn.t.base.common.service.ErrorInfoEnum;

import java.io.Serializable;

public class ResultVo implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SUCCESS = "200";
    
    private String code;

    private String message;

    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static ResultVo buildSuccess() {
        return buildSuccess(null, null);
    }

    public static ResultVo buildSuccess(Object data) {
        return buildSuccess(null, data);
    }

    public static ResultVo buildSuccess(String message, Object data) {
        return doBuild(SUCCESS, message, data);
    }

    public static ResultVo buildFail() {
        return buildFail(ErrorInfoEnum.SERVER_INTERNAL_ERROR.errorInfo);
    }

    public static ResultVo buildFail(ErrorInfo errorInfo) {
        return buildFail(errorInfo.getCode(), errorInfo.getMsg());
    }

    public static ResultVo buildFail(ErrorInfo errorInfo, Object data) {
        return buildFail(errorInfo.getCode(), errorInfo.getMsg(), data);
    }

    public static ResultVo buildFail(String errorCode, String msg) {
        return buildFail(errorCode, msg, null);
    }

    public static ResultVo buildFail(String errorCode, Object data) {
        return buildFail(errorCode, null, data);
    }

    public static ResultVo buildFail(String errorCode, String message, Object data) {
        return doBuild(errorCode, message, data);
    }

    private static ResultVo doBuild(String code, String message, Object data) {
        ResultVo vo = new ResultVo();
        vo.setCode(code);
        vo.setMessage(message);
        vo.setData(data);
        return vo;
    }
}
