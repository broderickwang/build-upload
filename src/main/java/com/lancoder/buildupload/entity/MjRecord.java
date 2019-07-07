package com.lancoder.buildupload.entity;

import javax.persistence.*;

/**
 * 工人考勤表
 */

@Entity
@Table(name = "MJ_Record")
public class MjRecord {

  private long recId;
  private String accountId;
  private String empName;
  private String cardno;
  private java.sql.Timestamp recTime;
  private String macSn;
  private String doorName;
  private long doorId;
  private long controlId;
  private long reader;
  private long eventType;
  private String photoSerial;
  private String inOut;
  private String bz;
  private long upload;
  private long sync;
  private java.sql.Timestamp syncTime;
  private java.sql.Timestamp uploadTime;
  private String suppCause;
  private long imgUpload;
  private java.sql.Timestamp imgUploadTime;
  private long scenarios;
  private String requestSerialCode;
  private String reviewStatus;

  @Id
  public long getRecId() {
    return recId;
  }

  public void setRecId(long recId) {
    this.recId = recId;
  }


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }


  public String getCardno() {
    return cardno;
  }

  public void setCardno(String cardno) {
    this.cardno = cardno;
  }


  public java.sql.Timestamp getRecTime() {
    return recTime;
  }

  public void setRecTime(java.sql.Timestamp recTime) {
    this.recTime = recTime;
  }


  public String getMacSn() {
    return macSn;
  }

  public void setMacSn(String macSn) {
    this.macSn = macSn;
  }


  public String getDoorName() {
    return doorName;
  }

  public void setDoorName(String doorName) {
    this.doorName = doorName;
  }


  public long getDoorId() {
    return doorId;
  }

  public void setDoorId(long doorId) {
    this.doorId = doorId;
  }


  public long getControlId() {
    return controlId;
  }

  public void setControlId(long controlId) {
    this.controlId = controlId;
  }


  public long getReader() {
    return reader;
  }

  public void setReader(long reader) {
    this.reader = reader;
  }


  public long getEventType() {
    return eventType;
  }

  public void setEventType(long eventType) {
    this.eventType = eventType;
  }


  public String getPhotoSerial() {
    return photoSerial;
  }

  public void setPhotoSerial(String photoSerial) {
    this.photoSerial = photoSerial;
  }


  public String getInOut() {
    return inOut;
  }

  public void setInOut(String inOut) {
    this.inOut = inOut;
  }


  public String getBz() {
    return bz;
  }

  public void setBz(String bz) {
    this.bz = bz;
  }


  public long getUpload() {
    return upload;
  }

  public void setUpload(long upload) {
    this.upload = upload;
  }


  public long getSync() {
    return sync;
  }

  public void setSync(long sync) {
    this.sync = sync;
  }


  public java.sql.Timestamp getSyncTime() {
    return syncTime;
  }

  public void setSyncTime(java.sql.Timestamp syncTime) {
    this.syncTime = syncTime;
  }


  public java.sql.Timestamp getUploadTime() {
    return uploadTime;
  }

  public void setUploadTime(java.sql.Timestamp uploadTime) {
    this.uploadTime = uploadTime;
  }


  public String getSuppCause() {
    return suppCause;
  }

  public void setSuppCause(String suppCause) {
    this.suppCause = suppCause;
  }


  public long getImgUpload() {
    return imgUpload;
  }

  public void setImgUpload(long imgUpload) {
    this.imgUpload = imgUpload;
  }


  public java.sql.Timestamp getImgUploadTime() {
    return imgUploadTime;
  }

  public void setImgUploadTime(java.sql.Timestamp imgUploadTime) {
    this.imgUploadTime = imgUploadTime;
  }


  public long getScenarios() {
    return scenarios;
  }

  public void setScenarios(long scenarios) {
    this.scenarios = scenarios;
  }


  public String getRequestSerialCode() {
    return requestSerialCode;
  }

  public void setRequestSerialCode(String requestSerialCode) {
    this.requestSerialCode = requestSerialCode;
  }


  public String getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(String reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

}
