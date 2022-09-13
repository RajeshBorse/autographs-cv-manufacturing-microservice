package com.module.autographs.cvmanufacturing.microservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cvManufacturingCollection")
public class NewCVManufacturingDataModel {

    @Id
    private String id;
    private String year;
    private String month;
    private String newCVManufacturingCount;


    public NewCVManufacturingDataModel() {
    }

    public NewCVManufacturingDataModel(String id, String year, String month, String newCVManufacturingCount) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.newCVManufacturingCount = newCVManufacturingCount;
    }

    @Override
    public String toString() {
        return "NewCVManufacturingDataModel{" + "id='" + id + '\'' + ", year='" + year + '\'' + ", month='" + month + '\'' + ", newCVManufacturingCount='" + newCVManufacturingCount + '\'' + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getNewCVManufacturingCount() {
        return newCVManufacturingCount;
    }

    public void setNewCVManufacturingCount(String newCVManufacturingCount) {
        this.newCVManufacturingCount = newCVManufacturingCount;
    }
}