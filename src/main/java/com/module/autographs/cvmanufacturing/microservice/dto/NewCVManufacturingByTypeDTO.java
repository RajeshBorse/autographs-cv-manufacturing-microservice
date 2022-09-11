package com.module.autographs.cvmanufacturing.microservice.dto;

import org.springframework.data.annotation.Id;

/**
 * rsb34
 */

public class NewCVManufacturingByTypeDTO {

    @Id
    private String id;
    private String year;
    private String month;
    private String type;
    private String newCVManufacturingByTypeCount;
    private String percentage;


    public NewCVManufacturingByTypeDTO() {
    }

    public NewCVManufacturingByTypeDTO(String id, String year, String month, String type, String newCVManufacturingByTypeCount, String percentage) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.type = type;
        this.newCVManufacturingByTypeCount = newCVManufacturingByTypeCount;
        this.percentage = percentage;
    }


    @Override
    public String toString() {
        return "NewCVManufacturingByTypeDTO{" + "id='" + id + '\'' + ", year='" + year + '\'' + ", month='" + month + '\'' + ", type='" + type + '\'' + ", newCVManufacturingByTypeCount='" + newCVManufacturingByTypeCount + '\'' + ", percentage='" + percentage + '\'' + '}';
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNewCVManufacturingByTypeCount() {
        return newCVManufacturingByTypeCount;
    }

    public void setNewCVManufacturingByTypeCount(String newCVManufacturingByTypeCount) {
        this.newCVManufacturingByTypeCount = newCVManufacturingByTypeCount;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}