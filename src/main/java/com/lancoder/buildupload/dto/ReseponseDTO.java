package com.lancoder.buildupload.dto;

public class ReseponseDTO<T> {

    private Integer code;

    private String message;

    private Data data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data{
        private String requestSerialCode;

        public String getRequestSerialCode() {
            return requestSerialCode;
        }

        public void setRequestSerialCode(String requestSerialCode) {
            this.requestSerialCode = requestSerialCode;
        }
    }

    @Override
    public String toString() {
        return "ReseponseDTO{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
