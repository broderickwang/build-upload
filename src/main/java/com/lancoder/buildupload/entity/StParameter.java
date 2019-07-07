package com.lancoder.buildupload.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ST_Parameter")
public class StParameter {
  @Id
  private long id;
  private String pName;
  private String pValue;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPName() {
    return pName;
  }

  public void setPName(String pName) {
    this.pName = pName;
  }


  public String getPValue() {
    return pValue;
  }

  public void setPValue(String pValue) {
    this.pValue = pValue;
  }

}
