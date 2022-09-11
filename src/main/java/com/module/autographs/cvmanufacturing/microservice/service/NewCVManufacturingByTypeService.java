package com.module.autographs.cvmanufacturing.microservice.service;

import com.module.autographs.cvmanufacturing.microservice.model.NewCVManufacturingByTypeDataModel;

import java.util.List;

public interface NewCVManufacturingByTypeService {

    List<NewCVManufacturingByTypeDataModel> findAll();

    List<NewCVManufacturingByTypeDataModel> addNewCVManufacturingByTypeData(List<NewCVManufacturingByTypeDataModel> newCVManufacturingByTypeDataModelList);

    List<NewCVManufacturingByTypeDataModel> findAllNewCVManufacturingByType(String type);
}
