package com.module.autographs.cvmanufacturing.microservice.service.impl;

import com.module.autographs.cvmanufacturing.microservice.model.NewCVManufacturingDataModel;
import com.module.autographs.cvmanufacturing.microservice.service.NewCVManufacturingService;
import com.module.autographs.cvmanufacturing.microservice.repository.NewCVManufacturingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewCVManufacturingServiceImpl implements NewCVManufacturingService {

    @Autowired
    NewCVManufacturingRepository newCVManufacturingRepository;

    @Override
    public List<NewCVManufacturingDataModel> findAll() {
        return newCVManufacturingRepository.findAll();
    }

    @Override
    public List<NewCVManufacturingDataModel> addNewCVManufacturingData(List<NewCVManufacturingDataModel> newCVManufacturingDataModelList) {
        return newCVManufacturingRepository.saveAll(newCVManufacturingDataModelList);
    }

    public List<NewCVManufacturingDataModel> findAllNewCVManufacturing(String type) {
        List<NewCVManufacturingDataModel> newCVManufacturingDataModelList = newCVManufacturingRepository.findAllCVManufacturingDataByType(type);
        return newCVManufacturingDataModelList;
    }

}