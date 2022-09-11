package com.module.autographs.cvmanufacturing.microservice.repository;

import com.module.autographs.cvmanufacturing.microservice.model.NewCVManufacturingByTypeDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface NewCVManufacturingByTypeRepository extends MongoRepository<NewCVManufacturingByTypeDataModel, String> {

    @Query("{type:'?0'}")
    List<NewCVManufacturingByTypeDataModel> findAllCVManufacturingByTypeByType(String type);
}