package com.module.autographs.cvmanufacturing.microservice.util;

public class Constants {

    // HTTP STATUS CODES
    public static final String HTTP_RESPONSE_CODE_OK = "200";
    public static final String HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR = "500";

    // ALL API PATHS

    // 1 - NEW CV MANUFACTURING
    public static final String GET_API_PATH = "/getAllNewCVManufacturingData";
    public static final String POST_API_PATH = "/addNewCVManufacturingData";
    public static final String DELETE_ALL_API_PATH = "/deleteAllNewCVManufacturingData";

    // 2 - NEW CV MANUFACTURING BY TYPE
    public static final String GET_API_PATH_BY_TYPE = "/getAllNewCVManufacturingByTypeData";
    public static final String POST_API_PATH_BY_TYPE = "/addNewCVManufacturingByTypeData";
    public static final String DELETE_API_PATH_BY_TYPE = "/deleteAllNewCVManufacturingByTypeData";


    // ALL SWAGGER CONSTANTS BELOW ---------------------------------------------------------------------------------------------------------

    // 1 - NEW CV MANUFACTURING
    // GET API
    public static final String SWAGGER_GET_API_SUMMARY = "GET - NEW CV MANUFACTURING DATA";
    public static final String SWAGGER_GET_API_SUCCESS = "NEW CV MANUFACTURING DATA FETCHED SUCCESSFULLY.";
    public static final String SWAGGER_GET_API_NO_DATA_FOUND = "NO DATA FOUND FOR NEW CV MANUFACTURING.";
    // POST API
    public static final String SWAGGER_POST_API_SUMMARY = "POST - ADD NEW CV MANUFACTURING";
    public static final String SWAGGER_POST_API_SUCCESS = "NEW CV MANUFACTURING DATA ADDED SUCCESSFULLY.";
    public static final String SWAGGER_POST_API_FAILURE = "FAILURE OCCURRED WHILE ADDING NEW CV MANUFACTURING DATA.";
    // DELETE API
    public static final String SWAGGER_DELETE_API_SUMMARY = "DELETE ALL - NEW CV MANUFACTURING DATA";
    public static final String SWAGGER_DELETE_API_SUCCESS = "NEW CV MANUFACTURING DATA DELETED SUCCESSFULLY.";
    public static final String SWAGGER_DELETE_API_FAILURE = "FAILURE OCCURRED WHILE DELETING NEW CV MANUFACTURING DATA.";


    // 2 - NEW CV MANUFACTURING BY TYPE
    // GET API
    public static final String SWAGGER_GET_API_BY_TYPE_SUMMARY = "GET - NEW CV MANUFACTURING BY TYPE DATA";
    public static final String SWAGGER_GET_API_BY_TYPE_SUCCESS = "NEW CV MANUFACTURING BY TYPE DATA FETCHED SUCCESSFULLY.";
    public static final String SWAGGER_GET_API_BY_TYPE_NO_DATA_FOUND = "NO DATA FOUND FOR NEW CV MANUFACTURING BY TYPE.";
    // POST API
    public static final String SWAGGER_POST_API_BY_TYPE_SUMMARY = "POST - ADD NEW CV MANUFACTURING BY TYPE";
    public static final String SWAGGER_POST_API_BY_TYPE_SUCCESS = "NEW CV MANUFACTURING DATA BY TYPE ADDED SUCCESSFULLY.";
    public static final String SWAGGER_POST_API_BY_TYPE_FAILURE = "FAILURE OCCURRED WHILE ADDING NEW CV MANUFACTURING BY TYPE DATA.";
    // DELETE API
    public static final String SWAGGER_DELETE_API_BY_TYPE_SUMMARY = "DELETE ALL - NEW CV MANUFACTURING BY TYPE  DATA";
    public static final String SWAGGER_DELETE_API_BY_TYPE_SUCCESS = "NEW CV MANUFACTURING BY TYPE DATA DELETED SUCCESSFULLY.";
    public static final String SWAGGER_DELETE_API_BY_TYPE_FAILURE = "FAILURE OCCURRED WHILE DELETING NEW CV MANUFACTURING BY TYPE DATA.";

    // LOGGER CONSTANTS ---------------------------------------------------
    public static final String LOGGER_GET_API_SUCCESS = "NewCVManufacturingRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_FAILURE = "NewCVManufacturingRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_SUCCESS = "NewCVManufacturingRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_FAILURE = "NewCVManufacturingRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_SUCCESS = "NewCVManufacturingRestController : LOGGER : DELETE API : Data Deleting Success";

    public static final String LOGGER_GET_API_BY_TYPE_SUCCESS = "NewCarManufacturingByTypeRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_BY_TYPE_FAILURE = "NewCarManufacturingByTypeRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_BY_TYPE_SUCCESS = "NewCarManufacturingByTypeRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_BY_TYPE_FAILURE = "NewCarManufacturingByTypeRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_BY_TYPE_SUCCESS = "NewCarManufacturingByTypeRestController : LOGGER : DELETE API : Data Deleting Success";



}