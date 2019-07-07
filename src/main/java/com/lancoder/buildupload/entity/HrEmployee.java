package com.lancoder.buildupload.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 人员信息表
 */
@Entity
@Table(name = "HR_Employee")
public class HrEmployee {

  private String accountId;
  private String jobNo;
  private String serialNo;
  private String chnName;
  private String enName;
  private String idNum;
  private java.sql.Timestamp birthDay;
  private String sex;
  private String nation;
  private String snative;
  private String education;
  private String marStatus;
  private String phone;
  private String eMail;
  private String address;
  private String postCode;
  private String carNum;
  private long depId;
  private String empPosition;
  private String title;
  private java.sql.Timestamp entryDate;
  private String political;
  private String bloodType;
  private String safetyEedu;
  private java.sql.Timestamp trainTime;
  private String workerType;
  private String jobs;
  private String paperType;
  private String socInsurance;
  private String insNumber;
  private String laborContract;
  private String contractNo;
  private String dailyWage;
  private String realNameCard;
  private java.sql.Timestamp toDate;
  private long restDays;
  private String freeCard;
  private String facInspection;
  private String photo;
  private String passWord;
  private long delFlg;
  private String issued;
  private java.sql.Timestamp issueDate;
  private String cardSerial;
  private java.sql.Timestamp accessTime;
  private String accessState;
  private String accessDoor;
  private java.sql.Timestamp quitDate;
  private String quitType;
  private String quitRemarks;
  private long status;
  private String remarks;
  private String techGrade;
  private String emergencyContact;
  private String emergencyContactPhone;
  private String cityFiling;
  private long workerId;
  private long upLoad;
  private java.sql.Timestamp upLoadDate;
  private java.sql.Timestamp finalAnalysisTime;
  private long intervalDays;
  private String imageSid;
  private String regAdmin;
  private String appendId;
  private long rightId;
  private long userFlag;
  private long userType;
  private long bRtUser;
  private java.sql.Timestamp registTime;
  private java.sql.Timestamp deadLineTime;
  private java.sql.Timestamp lastUpdTime;
  private java.sql.Timestamp typeUpdTime;
  private long featLen;
  private long picLen;
  private String isVipCard;
  private String dormitory;
  private String bednumber;
  private java.sql.Timestamp lastInTime;
  private String lastInDoor;
  private java.sql.Timestamp lastOutTime;
  private String lastOutDoor;
  private String guid;
  private java.sql.Timestamp postTime;
  private long sync;
  private java.sql.Timestamp syncTime;
  private long memberTypeId;
  private String memberType;
  private java.sql.Timestamp memberValidityBegin;
  private java.sql.Timestamp memberValidityEnd;
  private long memberStatus;
  private java.sql.Timestamp memberDisableTime;
  private java.sql.Timestamp operate;
  private String operator;
  private String faceExpire;
  private java.sql.Timestamp faceExpireTime;
  private String bankcardno;
  private long faceRegState;
  private String requestSerialCode;
  private String reviewStatus;
  private String isTeamLeader;
  private String idCardType;
  private String workRole;
  private String politicsType;
  private String grantOrg;
  private String facePermission;
  private long entryUpLoad;
  private java.sql.Timestamp entryUpLoadTime;
  private String requestSerialCodeEntry;
  private String reviewStatusEntry;
  private long exitUpLoad;
  private java.sql.Timestamp exitUpLoadTime;
  private String requestSerialCodeExit;
  private String reviewStatusExit;
  private java.sql.Timestamp faceEffectiveTime;

  @Id
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public String getJobNo() {
    return jobNo;
  }

  public void setJobNo(String jobNo) {
    this.jobNo = jobNo;
  }


  public String getSerialNo() {
    return serialNo;
  }

  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }


  public String getChnName() {
    return chnName;
  }

  public void setChnName(String chnName) {
    this.chnName = chnName;
  }


  public String getEnName() {
    return enName;
  }

  public void setEnName(String enName) {
    this.enName = enName;
  }


  public String getIdNum() {
    return idNum;
  }

  public void setIdNum(String idNum) {
    this.idNum = idNum;
  }


  public java.sql.Timestamp getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(java.sql.Timestamp birthDay) {
    this.birthDay = birthDay;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }

  @Column(name = "native")
  public String getNative() {
    return snative;
  }

  public void setNative(String snative) {
    this.snative = snative;
  }


  public String getEducation() {
    return education;
  }

  public void setEducation(String education) {
    this.education = education;
  }


  public String getMarStatus() {
    return marStatus;
  }

  public void setMarStatus(String marStatus) {
    this.marStatus = marStatus;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEMail() {
    return eMail;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public String getCarNum() {
    return carNum;
  }

  public void setCarNum(String carNum) {
    this.carNum = carNum;
  }


  public long getDepId() {
    return depId;
  }

  public void setDepId(long depId) {
    this.depId = depId;
  }


  public String getEmpPosition() {
    return empPosition;
  }

  public void setEmpPosition(String empPosition) {
    this.empPosition = empPosition;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public java.sql.Timestamp getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(java.sql.Timestamp entryDate) {
    this.entryDate = entryDate;
  }


  public String getPolitical() {
    return political;
  }

  public void setPolitical(String political) {
    this.political = political;
  }


  public String getBloodType() {
    return bloodType;
  }

  public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
  }


  public String getSafetyEedu() {
    return safetyEedu;
  }

  public void setSafetyEedu(String safetyEedu) {
    this.safetyEedu = safetyEedu;
  }


  public java.sql.Timestamp getTrainTime() {
    return trainTime;
  }

  public void setTrainTime(java.sql.Timestamp trainTime) {
    this.trainTime = trainTime;
  }


  public String getWorkerType() {
    return workerType;
  }

  public void setWorkerType(String workerType) {
    this.workerType = workerType;
  }


  public String getJobs() {
    return jobs;
  }

  public void setJobs(String jobs) {
    this.jobs = jobs;
  }


  public String getPaperType() {
    return paperType;
  }

  public void setPaperType(String paperType) {
    this.paperType = paperType;
  }


  public String getSocInsurance() {
    return socInsurance;
  }

  public void setSocInsurance(String socInsurance) {
    this.socInsurance = socInsurance;
  }


  public String getInsNumber() {
    return insNumber;
  }

  public void setInsNumber(String insNumber) {
    this.insNumber = insNumber;
  }


  public String getLaborContract() {
    return laborContract;
  }

  public void setLaborContract(String laborContract) {
    this.laborContract = laborContract;
  }


  public String getContractNo() {
    return contractNo;
  }

  public void setContractNo(String contractNo) {
    this.contractNo = contractNo;
  }


  public String getDailyWage() {
    return dailyWage;
  }

  public void setDailyWage(String dailyWage) {
    this.dailyWage = dailyWage;
  }


  public String getRealNameCard() {
    return realNameCard;
  }

  public void setRealNameCard(String realNameCard) {
    this.realNameCard = realNameCard;
  }


  public java.sql.Timestamp getToDate() {
    return toDate;
  }

  public void setToDate(java.sql.Timestamp toDate) {
    this.toDate = toDate;
  }


  public long getRestDays() {
    return restDays;
  }

  public void setRestDays(long restDays) {
    this.restDays = restDays;
  }


  public String getFreeCard() {
    return freeCard;
  }

  public void setFreeCard(String freeCard) {
    this.freeCard = freeCard;
  }


  public String getFacInspection() {
    return facInspection;
  }

  public void setFacInspection(String facInspection) {
    this.facInspection = facInspection;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }


  public long getDelFlg() {
    return delFlg;
  }

  public void setDelFlg(long delFlg) {
    this.delFlg = delFlg;
  }


  public String getIssued() {
    return issued;
  }

  public void setIssued(String issued) {
    this.issued = issued;
  }


  public java.sql.Timestamp getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(java.sql.Timestamp issueDate) {
    this.issueDate = issueDate;
  }


  public String getCardSerial() {
    return cardSerial;
  }

  public void setCardSerial(String cardSerial) {
    this.cardSerial = cardSerial;
  }


  public java.sql.Timestamp getAccessTime() {
    return accessTime;
  }

  public void setAccessTime(java.sql.Timestamp accessTime) {
    this.accessTime = accessTime;
  }


  public String getAccessState() {
    return accessState;
  }

  public void setAccessState(String accessState) {
    this.accessState = accessState;
  }


  public String getAccessDoor() {
    return accessDoor;
  }

  public void setAccessDoor(String accessDoor) {
    this.accessDoor = accessDoor;
  }


  public java.sql.Timestamp getQuitDate() {
    return quitDate;
  }

  public void setQuitDate(java.sql.Timestamp quitDate) {
    this.quitDate = quitDate;
  }


  public String getQuitType() {
    return quitType;
  }

  public void setQuitType(String quitType) {
    this.quitType = quitType;
  }


  public String getQuitRemarks() {
    return quitRemarks;
  }

  public void setQuitRemarks(String quitRemarks) {
    this.quitRemarks = quitRemarks;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public String getTechGrade() {
    return techGrade;
  }

  public void setTechGrade(String techGrade) {
    this.techGrade = techGrade;
  }


  public String getEmergencyContact() {
    return emergencyContact;
  }

  public void setEmergencyContact(String emergencyContact) {
    this.emergencyContact = emergencyContact;
  }


  public String getEmergencyContactPhone() {
    return emergencyContactPhone;
  }

  public void setEmergencyContactPhone(String emergencyContactPhone) {
    this.emergencyContactPhone = emergencyContactPhone;
  }


  public String getCityFiling() {
    return cityFiling;
  }

  public void setCityFiling(String cityFiling) {
    this.cityFiling = cityFiling;
  }


  public long getWorkerId() {
    return workerId;
  }

  public void setWorkerId(long workerId) {
    this.workerId = workerId;
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


  public java.sql.Timestamp getFinalAnalysisTime() {
    return finalAnalysisTime;
  }

  public void setFinalAnalysisTime(java.sql.Timestamp finalAnalysisTime) {
    this.finalAnalysisTime = finalAnalysisTime;
  }


  public long getIntervalDays() {
    return intervalDays;
  }

  public void setIntervalDays(long intervalDays) {
    this.intervalDays = intervalDays;
  }


  public String getImageSid() {
    return imageSid;
  }

  public void setImageSid(String imageSid) {
    this.imageSid = imageSid;
  }


  public String getRegAdmin() {
    return regAdmin;
  }

  public void setRegAdmin(String regAdmin) {
    this.regAdmin = regAdmin;
  }


  public String getAppendId() {
    return appendId;
  }

  public void setAppendId(String appendId) {
    this.appendId = appendId;
  }


  public long getRightId() {
    return rightId;
  }

  public void setRightId(long rightId) {
    this.rightId = rightId;
  }


  public long getUserFlag() {
    return userFlag;
  }

  public void setUserFlag(long userFlag) {
    this.userFlag = userFlag;
  }


  public long getUserType() {
    return userType;
  }

  public void setUserType(long userType) {
    this.userType = userType;
  }


  public long getBRtUser() {
    return bRtUser;
  }

  public void setBRtUser(long bRtUser) {
    this.bRtUser = bRtUser;
  }


  public java.sql.Timestamp getRegistTime() {
    return registTime;
  }

  public void setRegistTime(java.sql.Timestamp registTime) {
    this.registTime = registTime;
  }


  public java.sql.Timestamp getDeadLineTime() {
    return deadLineTime;
  }

  public void setDeadLineTime(java.sql.Timestamp deadLineTime) {
    this.deadLineTime = deadLineTime;
  }


  public java.sql.Timestamp getLastUpdTime() {
    return lastUpdTime;
  }

  public void setLastUpdTime(java.sql.Timestamp lastUpdTime) {
    this.lastUpdTime = lastUpdTime;
  }


  public java.sql.Timestamp getTypeUpdTime() {
    return typeUpdTime;
  }

  public void setTypeUpdTime(java.sql.Timestamp typeUpdTime) {
    this.typeUpdTime = typeUpdTime;
  }


  public long getFeatLen() {
    return featLen;
  }

  public void setFeatLen(long featLen) {
    this.featLen = featLen;
  }


  public long getPicLen() {
    return picLen;
  }

  public void setPicLen(long picLen) {
    this.picLen = picLen;
  }


  public String getIsVipCard() {
    return isVipCard;
  }

  public void setIsVipCard(String isVipCard) {
    this.isVipCard = isVipCard;
  }


  public String getDormitory() {
    return dormitory;
  }

  public void setDormitory(String dormitory) {
    this.dormitory = dormitory;
  }


  public String getBednumber() {
    return bednumber;
  }

  public void setBednumber(String bednumber) {
    this.bednumber = bednumber;
  }


  public java.sql.Timestamp getLastInTime() {
    return lastInTime;
  }

  public void setLastInTime(java.sql.Timestamp lastInTime) {
    this.lastInTime = lastInTime;
  }


  public String getLastInDoor() {
    return lastInDoor;
  }

  public void setLastInDoor(String lastInDoor) {
    this.lastInDoor = lastInDoor;
  }


  public java.sql.Timestamp getLastOutTime() {
    return lastOutTime;
  }

  public void setLastOutTime(java.sql.Timestamp lastOutTime) {
    this.lastOutTime = lastOutTime;
  }


  public String getLastOutDoor() {
    return lastOutDoor;
  }

  public void setLastOutDoor(String lastOutDoor) {
    this.lastOutDoor = lastOutDoor;
  }


  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }


  public java.sql.Timestamp getPostTime() {
    return postTime;
  }

  public void setPostTime(java.sql.Timestamp postTime) {
    this.postTime = postTime;
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


  public long getMemberTypeId() {
    return memberTypeId;
  }

  public void setMemberTypeId(long memberTypeId) {
    this.memberTypeId = memberTypeId;
  }


  public String getMemberType() {
    return memberType;
  }

  public void setMemberType(String memberType) {
    this.memberType = memberType;
  }


  public java.sql.Timestamp getMemberValidityBegin() {
    return memberValidityBegin;
  }

  public void setMemberValidityBegin(java.sql.Timestamp memberValidityBegin) {
    this.memberValidityBegin = memberValidityBegin;
  }


  public java.sql.Timestamp getMemberValidityEnd() {
    return memberValidityEnd;
  }

  public void setMemberValidityEnd(java.sql.Timestamp memberValidityEnd) {
    this.memberValidityEnd = memberValidityEnd;
  }


  public long getMemberStatus() {
    return memberStatus;
  }

  public void setMemberStatus(long memberStatus) {
    this.memberStatus = memberStatus;
  }


  public java.sql.Timestamp getMemberDisableTime() {
    return memberDisableTime;
  }

  public void setMemberDisableTime(java.sql.Timestamp memberDisableTime) {
    this.memberDisableTime = memberDisableTime;
  }


  public java.sql.Timestamp getOperate() {
    return operate;
  }

  public void setOperate(java.sql.Timestamp operate) {
    this.operate = operate;
  }


  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }


  public String getFaceExpire() {
    return faceExpire;
  }

  public void setFaceExpire(String faceExpire) {
    this.faceExpire = faceExpire;
  }


  public java.sql.Timestamp getFaceExpireTime() {
    return faceExpireTime;
  }

  public void setFaceExpireTime(java.sql.Timestamp faceExpireTime) {
    this.faceExpireTime = faceExpireTime;
  }


  public String getBankcardno() {
    return bankcardno;
  }

  public void setBankcardno(String bankcardno) {
    this.bankcardno = bankcardno;
  }


  public long getFaceRegState() {
    return faceRegState;
  }

  public void setFaceRegState(long faceRegState) {
    this.faceRegState = faceRegState;
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


  public String getIsTeamLeader() {
    return isTeamLeader;
  }

  public void setIsTeamLeader(String isTeamLeader) {
    this.isTeamLeader = isTeamLeader;
  }


  public String getIdCardType() {
    return idCardType;
  }

  public void setIdCardType(String idCardType) {
    this.idCardType = idCardType;
  }


  public String getWorkRole() {
    return workRole;
  }

  public void setWorkRole(String workRole) {
    this.workRole = workRole;
  }


  public String getPoliticsType() {
    return politicsType;
  }

  public void setPoliticsType(String politicsType) {
    this.politicsType = politicsType;
  }


  public String getGrantOrg() {
    return grantOrg;
  }

  public void setGrantOrg(String grantOrg) {
    this.grantOrg = grantOrg;
  }


  public String getFacePermission() {
    return facePermission;
  }

  public void setFacePermission(String facePermission) {
    this.facePermission = facePermission;
  }


  public long getEntryUpLoad() {
    return entryUpLoad;
  }

  public void setEntryUpLoad(long entryUpLoad) {
    this.entryUpLoad = entryUpLoad;
  }


  public java.sql.Timestamp getEntryUpLoadTime() {
    return entryUpLoadTime;
  }

  public void setEntryUpLoadTime(java.sql.Timestamp entryUpLoadTime) {
    this.entryUpLoadTime = entryUpLoadTime;
  }


  public String getRequestSerialCodeEntry() {
    return requestSerialCodeEntry;
  }

  public void setRequestSerialCodeEntry(String requestSerialCodeEntry) {
    this.requestSerialCodeEntry = requestSerialCodeEntry;
  }


  public String getReviewStatusEntry() {
    return reviewStatusEntry;
  }

  public void setReviewStatusEntry(String reviewStatusEntry) {
    this.reviewStatusEntry = reviewStatusEntry;
  }


  public long getExitUpLoad() {
    return exitUpLoad;
  }

  public void setExitUpLoad(long exitUpLoad) {
    this.exitUpLoad = exitUpLoad;
  }


  public java.sql.Timestamp getExitUpLoadTime() {
    return exitUpLoadTime;
  }

  public void setExitUpLoadTime(java.sql.Timestamp exitUpLoadTime) {
    this.exitUpLoadTime = exitUpLoadTime;
  }


  public String getRequestSerialCodeExit() {
    return requestSerialCodeExit;
  }

  public void setRequestSerialCodeExit(String requestSerialCodeExit) {
    this.requestSerialCodeExit = requestSerialCodeExit;
  }


  public String getReviewStatusExit() {
    return reviewStatusExit;
  }

  public void setReviewStatusExit(String reviewStatusExit) {
    this.reviewStatusExit = reviewStatusExit;
  }


  public java.sql.Timestamp getFaceEffectiveTime() {
    return faceEffectiveTime;
  }

  public void setFaceEffectiveTime(java.sql.Timestamp faceEffectiveTime) {
    this.faceEffectiveTime = faceEffectiveTime;
  }

}
