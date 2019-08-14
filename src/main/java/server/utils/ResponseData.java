package server.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseData<T> implements Serializable{
    private T data;
    private String msg;
    private int code;

    public ResponseData() {
        this.msg = "success";
        this.code = 200;
    }
    public ResponseData(T data) {
        this.msg = "success";
        this.code = 200;
        this.data = data;
    }

}
