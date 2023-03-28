package com.car.carDetails.entity;

import javax.persistence.*;
@Entity
public class CarEntity {
    @Id
//    @GeneratedValue
    @Column()
    private Integer regn_No;
    @Column()
    private String car_Company;

    @Column()
    private String car_Model;

    @Column()
    private String year_Of_Manufacturing;

    @Column()
    private String owner_Name;

    public CarEntity() {
    }

    public CarEntity(Integer regn_No, String car_Company, String car_Model, String year_Of_Manufacturing, String owner_Name) {
        this.regn_No = regn_No;
        this.car_Company = car_Company;
        this.car_Model = car_Model;
        this.year_Of_Manufacturing = year_Of_Manufacturing;
        this.owner_Name = owner_Name;
    }

    public Integer getRegn_No() {
        return regn_No;
    }

    public void setRegn_No(Integer regn_No) {
        this.regn_No = regn_No;
    }

    public String getCar_Company() {
        return car_Company;
    }

    public void setCar_Company(String car_Company) {
        this.car_Company = car_Company;
    }

    public String getCar_Model() {
        return car_Model;
    }

    public void setCar_Model(String car_Model) {
        this.car_Model = car_Model;
    }

    public String getYear_Of_Manufacturing() {
        return year_Of_Manufacturing;
    }

    public void setYear_Of_Manufacturing(String year_Of_Manufacturing) {
        this.year_Of_Manufacturing = year_Of_Manufacturing;
    }

    public String getOwner_Name() {
        return owner_Name;
    }

    public void setOwner_Name(String owner_Name) {
        this.owner_Name = owner_Name;
    }
}
