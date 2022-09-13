package com.module.autographs.cvmanufacturing.microservice.controller;

import com.module.autographs.cvmanufacturing.microservice.AutographsCVManufacturingApplication;
import com.module.autographs.cvmanufacturing.microservice.dto.NewCVManufacturingByTypeDTO;
import com.module.autographs.cvmanufacturing.microservice.model.NewCVManufacturingByTypeDataModel;
import com.module.autographs.cvmanufacturing.microservice.repository.NewCVManufacturingByTypeRepository;
import com.module.autographs.cvmanufacturing.microservice.service.NewCVManufacturingByTypeService;
import com.module.autographs.cvmanufacturing.microservice.util.ObjectMapperUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static com.module.autographs.cvmanufacturing.microservice.util.Constants.*;

@RestController
@RequestMapping("/api/v1/newCVManufacturing")
@Tag(name = "NewCVManufacturingByTypeRestController")

public class NewCVManufacturingByTypeRestController {

    @Autowired
    private NewCVManufacturingByTypeService newCVManufacturingByTypeService;

    @Autowired
    private NewCVManufacturingByTypeRepository newCVManufacturingByTypeRepository;
    private static final Logger logger = LogManager.getLogger(AutographsCVManufacturingApplication.class);

    @GetMapping(value = GET_API_PATH_BY_TYPE)
    @Operation(summary = SWAGGER_GET_API_BY_TYPE_SUMMARY, responses = {@ApiResponse(description =
            SWAGGER_GET_API_BY_TYPE_SUCCESS, responseCode = HTTP_RESPONSE_CODE_OK,
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewCVManufacturingByTypeDTO.class))),
            @ApiResponse(description = SWAGGER_GET_API_BY_TYPE_NO_DATA_FOUND, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewCVManufacturingByTypeDTO> getNewCVManufacturingByTypeData() {
        List<NewCVManufacturingByTypeDTO> NewCVManufacturingByTypeDTOList = ObjectMapperUtils.mapAll(newCVManufacturingByTypeService.findAll(), NewCVManufacturingByTypeDTO.class);
        if (NewCVManufacturingByTypeDTOList.size() > 0) {
            logger.info(LOGGER_GET_API_BY_TYPE_SUCCESS);
            return ResponseEntity.ok(NewCVManufacturingByTypeDTOList).getBody();
        } else {
            logger.info(LOGGER_GET_API_BY_TYPE_FAILURE);
            throw new ResponseStatusException(HttpStatus.OK, SWAGGER_GET_API_BY_TYPE_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = POST_API_PATH_BY_TYPE)
    @Operation(summary = SWAGGER_POST_API_BY_TYPE_SUMMARY,
            responses = {@ApiResponse(description = SWAGGER_POST_API_BY_TYPE_SUCCESS,
                    responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCVManufacturingByTypeDTO.class))), @ApiResponse(description = SWAGGER_POST_API_BY_TYPE_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addNewCVManufacturingByTypeData(@RequestBody List<NewCVManufacturingByTypeDTO> NewCVManufacturingByTypeDTOList) {
        List<NewCVManufacturingByTypeDataModel> NewCVManufacturingByTypeDataModelList = newCVManufacturingByTypeService.addNewCVManufacturingByTypeData(ObjectMapperUtils.mapAll(NewCVManufacturingByTypeDTOList, NewCVManufacturingByTypeDataModel.class));
        if (NewCVManufacturingByTypeDataModelList.size() > 0) {
            logger.info(LOGGER_POST_API_BY_TYPE_SUCCESS);
            return ResponseEntity.ok(SWAGGER_POST_API_BY_TYPE_SUCCESS);
        } else {
            logger.info(LOGGER_POST_API_BY_TYPE_FAILURE);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, SWAGGER_POST_API_BY_TYPE_FAILURE);
        }
    }

    @DeleteMapping(value = DELETE_API_PATH_BY_TYPE)
    @Operation(summary = SWAGGER_DELETE_API_BY_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_DELETE_API_BY_TYPE_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCVManufacturingByTypeDTO.class))), @ApiResponse(description = SWAGGER_DELETE_API_BY_TYPE_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllNewCVManufacturingByTypeData() {
        logger.info(LOGGER_DELETE_API_BY_TYPE_SUCCESS);
        newCVManufacturingByTypeRepository.deleteAll();
        return ResponseEntity.ok(SWAGGER_DELETE_API_BY_TYPE_SUCCESS);
    }

}
