package com.lancoder.buildupload.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 工程信息表
 */
@Entity
@Table(name = "ST_Project")
public class StProject {

  private String contruntionPermitNo;
  private String contruntionUnit;
  private String projectName;
  private String contruntionAddress;
  private double contruntionScale;
  private double contractPrice;
  private String designUnit;
  private String performingUnit;
  private String supervision;
  private java.sql.Timestamp contractStartDate;
  private java.sql.Timestamp contractCompletionDate;
  private String projectManager;
  private String contactNumber;
  private String labourManager;
  private String labourManagerPhone;
  private String conManager;
  private String conManagerPhone;
  private String enterpriseCode;
  private String projectCode;
  private long upload;
  private java.sql.Timestamp uploadDate;
  private String sessionToken;
  private long geoP;
  private String geoPName;
  private long geoM;
  private String geoMName;
  private long geoD;
  private String geoDName;
  private String progress;
  private long length;
  private long floor;
  private long downFloor;
  @Column(name="builderCode")
  private String builderCode;
  private String safety;
  private long school;
  private String lng;
  private String lat;
  private long bdlevel;
  private long sync;
  private java.sql.Timestamp syncTime;
  private String countryProjectCode;
  private String requestSerialCode;
  private String reviewStatus;
  private String category;
  private long parUpLoad;
  private java.sql.Timestamp parUpLoadTime;
  private String requestSerialCodePar;
  private String reviewStatusPar;
  private String introduction;


  @Id
  public String getContruntionPermitNo() {
    return contruntionPermitNo;
  }

  public void setContruntionPermitNo(String contruntionPermitNo) {
    this.contruntionPermitNo = contruntionPermitNo;
  }


  public String getContruntionUnit() {
    return contruntionUnit;
  }

  public void setContruntionUnit(String contruntionUnit) {
    this.contruntionUnit = contruntionUnit;
  }


  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public String getContruntionAddress() {
    return contruntionAddress;
  }

  public void setContruntionAddress(String contruntionAddress) {
    this.contruntionAddress = contruntionAddress;
  }


  public double getContruntionScale() {
    return contruntionScale;
  }

  public void setContruntionScale(double contruntionScale) {
    this.contruntionScale = contruntionScale;
  }


  public double getContractPrice() {
    return contractPrice;
  }

  public void setContractPrice(double contractPrice) {
    this.contractPrice = contractPrice;
  }


  public String getDesignUnit() {
    return designUnit;
  }

  public void setDesignUnit(String designUnit) {
    this.designUnit = designUnit;
  }


  public String getPerformingUnit() {
    return performingUnit;
  }

  public void setPerformingUnit(String performingUnit) {
    this.performingUnit = performingUnit;
  }


  public String getSupervision() {
    return supervision;
  }

  public void setSupervision(String supervision) {
    this.supervision = supervision;
  }


  public java.sql.Timestamp getContractStartDate() {
    return contractStartDate;
  }

  public void setContractStartDate(java.sql.Timestamp contractStartDate) {
    this.contractStartDate = contractStartDate;
  }


  public java.sql.Timestamp getContractCompletionDate() {
    return contractCompletionDate;
  }

  public void setContractCompletionDate(java.sql.Timestamp contractCompletionDate) {
    this.contractCompletionDate = contractCompletionDate;
  }


  public String getProjectManager() {
    return projectManager;
  }

  public void setProjectManager(String projectManager) {
    this.projectManager = projectManager;
  }


  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }


  public String getLabourManager() {
    return labourManager;
  }

  public void setLabourManager(String labourManager) {
    this.labourManager = labourManager;
  }


  public String getLabourManagerPhone() {
    return labourManagerPhone;
  }

  public void setLabourManagerPhone(String labourManagerPhone) {
    this.labourManagerPhone = labourManagerPhone;
  }


  public String getConManager() {
    return conManager;
  }

  public void setConManager(String conManager) {
    this.conManager = conManager;
  }


  public String getConManagerPhone() {
    return conManagerPhone;
  }

  public void setConManagerPhone(String conManagerPhone) {
    this.conManagerPhone = conManagerPhone;
  }


  public String getEnterpriseCode() {
    return enterpriseCode;
  }

  public void setEnterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
  }


  public String getProjectCode() {
    return projectCode;
  }

  public void setProjectCode(String projectCode) {
    this.projectCode = projectCode;
  }


  public long getUpload() {
    return upload;
  }

  public void setUpload(long upload) {
    this.upload = upload;
  }


  public java.sql.Timestamp getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(java.sql.Timestamp uploadDate) {
    this.uploadDate = uploadDate;
  }


  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }


  public long getGeoP() {
    return geoP;
  }

  public void setGeoP(long geoP) {
    this.geoP = geoP;
  }


  public String getGeoPName() {
    return geoPName;
  }

  public void setGeoPName(String geoPName) {
    this.geoPName = geoPName;
  }


  public long getGeoM() {
    return geoM;
  }

  public void setGeoM(long geoM) {
    this.geoM = geoM;
  }


  public String getGeoMName() {
    return geoMName;
  }

  public void setGeoMName(String geoMName) {
    this.geoMName = geoMName;
  }


  public long getGeoD() {
    return geoD;
  }

  public void setGeoD(long geoD) {
    this.geoD = geoD;
  }


  public String getGeoDName() {
    return geoDName;
  }

  public void setGeoDName(String geoDName) {
    this.geoDName = geoDName;
  }


  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }


  public long getLength() {
    return length;
  }

  public void setLength(long length) {
    this.length = length;
  }


  public long getFloor() {
    return floor;
  }

  public void setFloor(long floor) {
    this.floor = floor;
  }


  public long getDownFloor() {
    return downFloor;
  }

  public void setDownFloor(long downFloor) {
    this.downFloor = downFloor;
  }


  public String getBuilderCode() {
    return builderCode;
  }

  public void setBuilderCode(String builderCode) {
    this.builderCode = builderCode;
  }


  public String getSafety() {
    return safety;
  }

  public void setSafety(String safety) {
    this.safety = safety;
  }


  public long getSchool() {
    return school;
  }

  public void setSchool(long school) {
    this.school = school;
  }


  public String getLng() {
    return lng;
  }

  public void setLng(String lng) {
    this.lng = lng;
  }


  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }


  public long getBdlevel() {
    return bdlevel;
  }

  public void setBdlevel(long bdlevel) {
    this.bdlevel = bdlevel;
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


  public String getCountryProjectCode() {
    return countryProjectCode;
  }

  public void setCountryProjectCode(String countryProjectCode) {
    this.countryProjectCode = countryProjectCode;
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


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public long getParUpLoad() {
    return parUpLoad;
  }

  public void setParUpLoad(long parUpLoad) {
    this.parUpLoad = parUpLoad;
  }


  public java.sql.Timestamp getParUpLoadTime() {
    return parUpLoadTime;
  }

  public void setParUpLoadTime(java.sql.Timestamp parUpLoadTime) {
    this.parUpLoadTime = parUpLoadTime;
  }


  public String getRequestSerialCodePar() {
    return requestSerialCodePar;
  }

  public void setRequestSerialCodePar(String requestSerialCodePar) {
    this.requestSerialCodePar = requestSerialCodePar;
  }


  public String getReviewStatusPar() {
    return reviewStatusPar;
  }

  public void setReviewStatusPar(String reviewStatusPar) {
    this.reviewStatusPar = reviewStatusPar;
  }


  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

}
