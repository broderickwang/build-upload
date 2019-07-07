package com.lancoder.buildupload.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ST_Parameter")
public class StParameter {
    @Id
    private long id;
    @Column(name = "PName")
    private String pName;
    @Column(name = "PValue")
    private String PValue;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPValue() {
        return PValue;
    }

    public void setPValue(String PValue) {
        this.PValue = PValue;
    }
}
