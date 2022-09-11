package com.module.autographs.cvmanufacturing.microservice.controller;

import com.module.autographs.cvmanufacturing.microservice.dto.NewCVManufacturingDTO;
import com.module.autographs.cvmanufacturing.microservice.model.NewCVManufacturingDataModel;
import com.module.autographs.cvmanufacturing.microservice.service.NewCVManufacturingService;
import com.module.autographs.cvmanufacturing.microservice.util.Constants;
import com.module.autographs.cvmanufacturing.microservice.util.ObjectMapperUtils;
import com.module.autographs.cvmanufacturing.microservice.repository.NewCVManufacturingRepository;
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
@Tag(name = "NewCVManufacturing")

public class NewCVManufacturingRestController {

    @Autowired
    private NewCVManufacturingService newCVManufacturingService;

    @Autowired
    private NewCVManufacturingRepository newCVManufacturingRepository;

    @GetMapping(value = Constants.NEW_CV_MANUFACTURING_GET_API_PATH)
    @Operation(summary = Constants.NEW_CV_MANUFACTURING_GET_SUMMARY, responses = {@ApiResponse(description =
            Constants.NEW_CV_MANUFACTURING_SUCCESS, responseCode = Constants.HTTP_RESPONSE_CODE_OK,
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewCVManufacturingDTO.class))),
            @ApiResponse(description = Constants.NEW_CV_MANUFACTURING_NO_DATA_FOUND, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewCVManufacturingDTO> getNewCVManufacturingData() {
        List<NewCVManufacturingDTO> newCVManufacturingDTOList = ObjectMapperUtils.mapAll(newCVManufacturingService.findAll(), NewCVManufacturingDTO.class);
        if (newCVManufacturingDTOList.size() > 0) {
            return ResponseEntity.ok(newCVManufacturingDTOList).getBody();
        } else {
            throw new ResponseStatusException(HttpStatus.OK, Constants.NEW_CV_MANUFACTURING_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = Constants.NEW_CV_MANUFACTURING_POST_API_PATH)
    @Operation(summary = Constants.NEW_CV_MANUFACTURING_POST_SUMMARY,
            responses = {@ApiResponse(description = Constants.NEW_CV_MANUFACTURING_ADD_SUCCESS,
                    responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCVManufacturingDTO.class))), @ApiResponse(description = Constants.NEW_CV_MANUFACTURING_ADD_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addNewCVManufacturingData(@RequestBody List<NewCVManufacturingDTO> newCVManufacturingDTOList) {
        List<NewCVManufacturingDataModel> newCVManufacturingDataModelList = newCVManufacturingService.addNewCVManufacturingData(ObjectMapperUtils.mapAll(newCVManufacturingDTOList, NewCVManufacturingDataModel.class));
        if (newCVManufacturingDataModelList.size() > 0) {
            return ResponseEntity.ok(Constants.NEW_CV_MANUFACTURING_ADD_SUCCESS);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, Constants.NEW_CV_MANUFACTURING_ADD_FAILURE);
        }
    }

    @DeleteMapping(value = Constants.NEW_CV_MANUFACTURING_DELETE_ALL_API_PATH)
    @Operation(summary = Constants.NEW_CV_MANUFACTURING_DELETE_ALL_SUMMARY, responses = {@ApiResponse(description = Constants.NEW_CV_MANUFACTURING_DELETE_ALL_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCVManufacturingDTO.class))), @ApiResponse(description = Constants.NEW_CV_MANUFACTURING_DELETE_ALL_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllNewCVManufacturingData() {
        newCVManufacturingRepository.deleteAll();
        return ResponseEntity.ok(Constants.NEW_CV_MANUFACTURING_DELETE_ALL_SUCCESS);
    }

}
