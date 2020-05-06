package cn.t.base.common.response;


public class ResultVo {

    private String code;

    private String message;

    private Object data;

    public String getCode() {
        return code;
    }

    public ResultVo setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResultVo setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
