package com.module.autographs.cvmanufacturing.microservice.repository;

import com.module.autographs.cvmanufacturing.microservice.model.NewCVManufacturingDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface NewCVManufacturingRepository extends MongoRepository<NewCVManufacturingDataModel, String> {

    @Query("{type:'?0'}")
    List<NewCVManufacturingDataModel> findAllCVManufacturingDataByType(String type);
}