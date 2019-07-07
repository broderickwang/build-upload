package com.lancoder.buildupload.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 班组信息表
 */
@Entity
@Table(name = "HR_Dept")
public class HrDept {

  private long depId;
  private String depCode;
  private String depName;
  private long depType;
  private long parentDep;
  private long subcontractorId;
  private String subcontractor;
  private long layerNo;
  private String jobNumPre;
  private String head;
  private String depPhone;
  private String idNumber;
  private String dailyWage;
  private long upLoad;
  private java.sql.Timestamp upLoadDate;
  private String svrGroupId;
  private double workhours;
  private long sync;
  private java.sql.Timestamp syncTime;
  private long preparationNum;
  private String requestSerialCode;
  private String reviewStatus;
  private String teamSysNo;

  @Id
  public long getDepId() {
    return depId;
  }

  public void setDepId(long depId) {
    this.depId = depId;
  }


  public String getDepCode() {
    return depCode;
  }

  public void setDepCode(String depCode) {
    this.depCode = depCode;
  }


  public String getDepName() {
    return depName;
  }

  public void setDepName(String depName) {
    this.depName = depName;
  }


  public long getDepType() {
    return depType;
  }

  public void setDepType(long depType) {
    this.depType = depType;
  }


  public long getParentDep() {
    return parentDep;
  }

  public void setParentDep(long parentDep) {
    this.parentDep = parentDep;
  }


  public long getSubcontractorId() {
    return subcontractorId;
  }

  public void setSubcontractorId(long subcontractorId) {
    this.subcontractorId = subcontractorId;
  }


  public String getSubcontractor() {
    return subcontractor;
  }

  public void setSubcontractor(String subcontractor) {
    this.subcontractor = subcontractor;
  }


  public long getLayerNo() {
    return layerNo;
  }

  public void setLayerNo(long layerNo) {
    this.layerNo = layerNo;
  }


  public String getJobNumPre() {
    return jobNumPre;
  }

  public void setJobNumPre(String jobNumPre) {
    this.jobNumPre = jobNumPre;
  }


  public String getHead() {
    return head;
  }

  public void setHead(String head) {
    this.head = head;
  }


  public String getDepPhone() {
    return depPhone;
  }

  public void setDepPhone(String depPhone) {
    this.depPhone = depPhone;
  }


  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }


  public String getDailyWage() {
    return dailyWage;
  }

  public void setDailyWage(String dailyWage) {
    this.dailyWage = dailyWage;
  }


  public long getUpLoad() {
    return upLoad;
  }

  public void setUpLoad(long upLoad) {
    this.upLoad = upLoad;
  }


  public java.sql.Timestamp getUpLoadDate() {
    return upLoadDate;
  }

  public void setUpLoadDate(java.sql.Timestamp upLoadDate) {
    this.upLoadDate = upLoadDate;
  }


  public String getSvrGroupId() {
    return svrGroupId;
  }

  public void setSvrGroupId(String svrGroupId) {
    this.svrGroupId = svrGroupId;
  }


  public double getWorkhours() {
    return workhours;
  }

  public void setWorkhours(double workhours) {
    this.workhours = workhours;
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


  public long getPreparationNum() {
    return preparationNum;
  }

  public void setPreparationNum(long preparationNum) {
    this.preparationNum = preparationNum;
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


  public String getTeamSysNo() {
    return teamSysNo;
  }

  public void setTeamSysNo(String teamSysNo) {
    this.teamSysNo = teamSysNo;
  }

}
