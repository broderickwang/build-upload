
package com.lancoder.buildupload.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 *  上传工人考勤
 *  WorkerAttendance.Add
 * Auto-generated: 2019-03-28 15:19:48
 */
public class WorkerAttendanceAddDto {

    private String projectCode;
    private int teamSysNo;
    private List<DataList> dataList;
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }
    public String getProjectCode() {
        return projectCode;
    }

    public void setTeamSysNo(int teamSysNo) {
        this.teamSysNo = teamSysNo;
    }
    public int getTeamSysNo() {
        return teamSysNo;
    }

    public void setDataList(List<DataList> dataList) {
        this.dataList = dataList;
    }
    public List<DataList> getDataList() {
        return dataList;
    }

    public static class DataList {

        private String image;
        private String idCardType;
        private String idCardNumber;
        private String date;
        private String direction;
        private String channel;
        private String attendType;
        private BigDecimal lng;
        private BigDecimal lat;
        public void setImage(String image) {
            this.image = image;
        }
        public String getImage() {
            return image;
        }

        public void setIdCardType(String idCardType) {
            this.idCardType = idCardType;
        }
        public String getIdCardType() {
            return idCardType;
        }

        public void setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
        }
        public String getIdCardNumber() {
            return idCardNumber;
        }

        public void setDate(String date) {
            this.date = date;
        }
        public String getDate() {
            return date;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }
        public String getDirection() {
            return direction;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }
        public String getChannel() {
            return channel;
        }

        public void setAttendType(String attendType) {
            this.attendType = attendType;
        }
        public String getAttendType() {
            return attendType;
        }

        public void setLng(BigDecimal lng) {
            this.lng = lng;
        }
        public BigDecimal getLng() {
            return lng;
        }

        public void setLat(BigDecimal lat) {
            this.lat = lat;
        }
        public BigDecimal getLat() {
            return lat;
        }

    }

}