package com.module.autographs.cvmanufacturing.microservice.service.impl;

import com.module.autographs.cvmanufacturing.microservice.model.NewCVManufacturingByTypeDataModel;
import com.module.autographs.cvmanufacturing.microservice.service.NewCVManufacturingByTypeService;
import com.module.autographs.cvmanufacturing.microservice.repository.NewCVManufacturingByTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewCVManufacturingByTypeServiceImpl implements NewCVManufacturingByTypeService {

    @Autowired
    NewCVManufacturingByTypeRepository newCVManufacturingByTypeRepository;

    @Override
    public List<NewCVManufacturingByTypeDataModel> findAll() {
        return newCVManufacturingByTypeRepository.findAll();
    }

    @Override
    public List<NewCVManufacturingByTypeDataModel> addNewCVManufacturingByTypeData(List<NewCVManufacturingByTypeDataModel> newCVManufacturingByTypeDataModelList) {
        return newCVManufacturingByTypeRepository.saveAll(newCVManufacturingByTypeDataModelList);
    }

    public List<NewCVManufacturingByTypeDataModel> findAllNewCVManufacturingByType(String type) {
        List<NewCVManufacturingByTypeDataModel> newCVManufacturingByTypeDataModelList = newCVManufacturingByTypeRepository.findAllCVManufacturingByTypeByType(type);
        return newCVManufacturingByTypeDataModelList;
    }

}
