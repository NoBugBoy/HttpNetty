package server.utils;

import lombok.Data;

@Data
public class ResponseData {
    private Object data;
    private String msg;
    private int code;

    public ResponseData() {
        this.msg = "success";
        this.code = 200;
    }
}
