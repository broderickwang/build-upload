package com.lancoder.buildupload.dto;


import java.io.Serializable;
import java.math.BigDecimal;


public class WorkerAttendanceDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String image;
	private String idCardType;
	private String idCardNumber;
	private String date;
	private String time;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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
