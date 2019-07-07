package com.lancoder.buildupload.dto;

/**
 * 异步请求实体类
 * Auto-generated: 2019-04-10 15:33:25
 */
public class PlantResultDTO {

    private Data data;
    private Integer code;
    private String message;
    public void setData(Data data) {
        this.data = data;
    }
    public Data getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    public Integer getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public class Data {

        private String requestSerialCode;
        private String result;
        private int status;
        public void setRequestSerialCode(String requestSerialCode) {
            this.requestSerialCode = requestSerialCode;
        }
        public String getRequestSerialCode() {
            return requestSerialCode;
        }

        public void setResult(String result) {
            this.result = result;
        }
        public String getResult() {
            return result;
        }

        public void setStatus(int status) {
            this.status = status;
        }
        public int getStatus() {
            return status;
        }

    }

}