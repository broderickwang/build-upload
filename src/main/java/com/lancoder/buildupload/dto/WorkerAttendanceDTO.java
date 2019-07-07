package com.lancoder.buildupload.dto;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 国家平台对接实体类
 */
public class WorkerAttendanceDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String image;
	/**
	 * 证件类型
	 */
	private String idCardType = "01";
	/**
	 * 身份证号
	 */
	private String idCardNumber;
	/**
	 * 考勤时间
	 */
	private String date;
	/**
	 * 进出场方向
	 */
	private String direction;

	/**
	 * 通道名称
	 */
	private String channel;
	/**
	 * 通行类型
	 */
	private String attendType;

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

	public WorkerAttendanceDTO(String idCardNumber, String date,String direction, String channel) {
		this.idCardNumber = idCardNumber;
		this.date = date;
		this.direction = direction;
		this.channel = channel;
	}
}
