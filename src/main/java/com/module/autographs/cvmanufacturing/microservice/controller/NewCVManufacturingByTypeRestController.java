package com.module.autographs.cvmanufacturing.microservice.controller;

import com.module.autographs.cvmanufacturing.microservice.dto.NewCVManufacturingByTypeDTO;
import com.module.autographs.cvmanufacturing.microservice.model.NewCVManufacturingByTypeDataModel;
import com.module.autographs.cvmanufacturing.microservice.util.Constants;
import com.module.autographs.cvmanufacturing.microservice.util.ObjectMapperUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/newCVManufacturing")
@Tag(name = "NewCVManufacturingByType")

public class NewCVManufacturingByTypeRestController {

    @Autowired
    private com.module.autographs.cvmanufacturing.microservice.service.NewCVManufacturingByTypeService NewCVManufacturingByTypeService;

    @Autowired
    private com.module.autographs.cvmanufacturing.microservice.repository.NewCVManufacturingByTypeRepository NewCVManufacturingByTypeRepository;

    @GetMapping(value = Constants.NEW_CV_MANUFACTURING_BY_TYPE_GET_API_PATH)
    @Operation(summary = Constants.NEW_CV_MANUFACTURING_BY_TYPE_GET_SUMMARY, responses = {@ApiResponse(description =
            Constants.NEW_CV_MANUFACTURING_BY_TYPE_SUCCESS, responseCode = Constants.HTTP_RESPONSE_CODE_OK,
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewCVManufacturingByTypeDTO.class))),
            @ApiResponse(description = Constants.NEW_CV_MANUFACTURING_BY_TYPE_NO_DATA_FOUND, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewCVManufacturingByTypeDTO> getNewCVManufacturingByTypeData() {
        List<NewCVManufacturingByTypeDTO> NewCVManufacturingByTypeDTOList = ObjectMapperUtils.mapAll(NewCVManufacturingByTypeService.findAll(), NewCVManufacturingByTypeDTO.class);
        if (NewCVManufacturingByTypeDTOList.size() > 0) {
            return ResponseEntity.ok(NewCVManufacturingByTypeDTOList).getBody();
        } else {
            throw new ResponseStatusException(HttpStatus.OK, Constants.NEW_CV_MANUFACTURING_BY_TYPE_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = Constants.NEW_CV_MANUFACTURING_BY_TYPE_POST_API_PATH)
    @Operation(summary = Constants.NEW_CV_MANUFACTURING_BY_TYPE_POST_SUMMARY,
            responses = {@ApiResponse(description = Constants.NEW_CV_MANUFACTURING_BY_TYPE_ADD_SUCCESS,
                    responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCVManufacturingByTypeDTO.class))), @ApiResponse(description = Constants.NEW_CV_MANUFACTURING_BY_TYPE_ADD_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addNewCVManufacturingByTypeData(@RequestBody List<NewCVManufacturingByTypeDTO> NewCVManufacturingByTypeDTOList) {
        List<NewCVManufacturingByTypeDataModel> NewCVManufacturingByTypeDataModelList = NewCVManufacturingByTypeService.addNewCVManufacturingByTypeData(ObjectMapperUtils.mapAll(NewCVManufacturingByTypeDTOList, NewCVManufacturingByTypeDataModel.class));
        if (NewCVManufacturingByTypeDataModelList.size() > 0) {
            return ResponseEntity.ok(Constants.NEW_CV_MANUFACTURING_BY_TYPE_ADD_SUCCESS);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, Constants.NEW_CV_MANUFACTURING_BY_TYPE_ADD_FAILURE);
        }
    }

    @DeleteMapping(value = Constants.NEW_CV_MANUFACTURING_BY_TYPE_DELETE_ALL_API_PATH)
    @Operation(summary = Constants.NEW_CV_MANUFACTURING_BY_TYPE_DELETE_ALL_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_CV_MANUFACTURING_BY_TYPE_DELETE_ALL_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCVManufacturingByTypeDTO.class))), @ApiResponse(description = Constants.NEW_CV_MANUFACTURING_BY_TYPE_DELETE_ALL_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllNewCVManufacturingByTypeData() {
        NewCVManufacturingByTypeRepository.deleteAll();
        return ResponseEntity.ok(Constants.NEW_CV_MANUFACTURING_BY_TYPE_DELETE_ALL_SUCCESS);
    }

}
