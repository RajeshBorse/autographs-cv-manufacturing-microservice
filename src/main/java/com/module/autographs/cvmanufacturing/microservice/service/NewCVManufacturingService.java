package com.module.autographs.cvmanufacturing.microservice.service;

import com.module.autographs.cvmanufacturing.microservice.model.NewCVManufacturingDataModel;

import java.util.List;

public interface NewCVManufacturingService {

    List<NewCVManufacturingDataModel> findAll();

    List<NewCVManufacturingDataModel> addNewCVManufacturingData(List<NewCVManufacturingDataModel> newCVManufacturingDataModelList);

    List<NewCVManufacturingDataModel> findAllNewCVManufacturing(String type);
}
