package com.module.autographs.cvmanufacturing.microservice.controller;

import com.module.autographs.cvmanufacturing.microservice.AutographsCVManufacturingApplication;
import com.module.autographs.cvmanufacturing.microservice.dto.NewCVManufacturingDTO;
import com.module.autographs.cvmanufacturing.microservice.model.NewCVManufacturingDataModel;
import com.module.autographs.cvmanufacturing.microservice.repository.NewCVManufacturingRepository;
import com.module.autographs.cvmanufacturing.microservice.service.NewCVManufacturingService;
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
@Tag(name = "NewCVManufacturingRestController")

public class NewCVManufacturingRestController {

    @Autowired
    private NewCVManufacturingService newCVManufacturingService;

    @Autowired
    private NewCVManufacturingRepository newCVManufacturingRepository;

    private static final Logger logger = LogManager.getLogger(AutographsCVManufacturingApplication.class);

    @GetMapping(value = GET_API_PATH)
    @Operation(summary = SWAGGER_GET_API_SUMMARY, responses = {@ApiResponse(description =
            SWAGGER_GET_API_SUCCESS, responseCode = HTTP_RESPONSE_CODE_OK,
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = NewCVManufacturingDTO.class))),
            @ApiResponse(description = SWAGGER_GET_API_NO_DATA_FOUND, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<NewCVManufacturingDTO> getNewCVManufacturingData() {
        List<NewCVManufacturingDTO> newCVManufacturingDTOList = ObjectMapperUtils.mapAll(newCVManufacturingService.findAll(), NewCVManufacturingDTO.class);
        if (newCVManufacturingDTOList.size() > 0) {
            logger.info(LOGGER_GET_API_SUCCESS);
            return ResponseEntity.ok(newCVManufacturingDTOList).getBody();
        } else {
            logger.info(LOGGER_GET_API_FAILURE);
            throw new ResponseStatusException(HttpStatus.OK, SWAGGER_GET_API_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = POST_API_PATH)
    @Operation(summary = SWAGGER_POST_API_SUMMARY,
            responses = {@ApiResponse(description = SWAGGER_POST_API_SUCCESS,
                    responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCVManufacturingDTO.class))), @ApiResponse(description = SWAGGER_POST_API_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addNewCVManufacturingData(@RequestBody List<NewCVManufacturingDTO> newCVManufacturingDTOList) {
        List<NewCVManufacturingDataModel> newCVManufacturingDataModelList = newCVManufacturingService.addNewCVManufacturingData(ObjectMapperUtils.mapAll(newCVManufacturingDTOList, NewCVManufacturingDataModel.class));
        if (newCVManufacturingDataModelList.size() > 0) {
            logger.info(LOGGER_POST_API_SUCCESS);
            return ResponseEntity.ok(SWAGGER_POST_API_SUCCESS);
        } else {
            logger.info(LOGGER_POST_API_FAILURE);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, SWAGGER_POST_API_FAILURE);
        }
    }

    @DeleteMapping(value = DELETE_ALL_API_PATH)
    @Operation(summary = SWAGGER_DELETE_API_SUMMARY, responses = {@ApiResponse(description = SWAGGER_DELETE_API_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = NewCVManufacturingDTO.class))), @ApiResponse(description = SWAGGER_DELETE_API_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllNewCVManufacturingData() {
        logger.info(LOGGER_DELETE_API_SUCCESS);
        newCVManufacturingRepository.deleteAll();
        return ResponseEntity.ok(SWAGGER_DELETE_API_SUCCESS);
    }

}
