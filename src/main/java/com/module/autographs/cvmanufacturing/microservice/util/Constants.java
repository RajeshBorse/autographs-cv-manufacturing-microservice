package com.module.autographs.cvmanufacturing.microservice.util;

public class Constants {

    // HTTP STATUS CODES
    public static final String HTTP_RESPONSE_CODE_OK = "200";
    public static final String HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR = "500";

    // ALL API PATHS

    // 1 - NEW CV MANUFACTURING
    public static final String NEW_CV_MANUFACTURING_GET_API_PATH = "/getAllNewCVManufacturingData";
    public static final String NEW_CV_MANUFACTURING_POST_API_PATH = "/addNewCVManufacturingData";
    public static final String NEW_CV_MANUFACTURING_DELETE_ALL_API_PATH = "/deleteAllNewCVManufacturingData";

    // 2 - NEW CV MANUFACTURING BY TYPE
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_GET_API_PATH = "/getAllNewCVManufacturingByTypeData";
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_POST_API_PATH = "/addNewCVManufacturingByTypeData";
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_DELETE_ALL_API_PATH = "/deleteAllNewCVManufacturingByTypeData";

    // 11 - USED CAR SALES
    public static final String USED_CARS_SALES_GET_API_PATH = "/getAllUsedCarSalesData";
    public static final String USED_CARS_SALES_POST_API_PATH = "/addUsedCarSalesData";
    public static final String USED_CARS_SALES_DELETE_ALL_API_PATH = "/deleteAllUsedCarSalesData";

    // 12 - USED CAR SALES TOP COLORS
    public static final String USED_CARS_TOP_COLORS_SALES_GET_API_PATH = "/getAllUsedCarSalesTopColorsData";
    public static final String USED_CARS_TOP_COLORS_SALES_POST_API_PATH = "/addUsedCarSalesTopColorsData";
    public static final String USED_CARS_TOP_COLORS_SALES_DELETE_ALL_API_PATH = "/deleteAllUsedCarSalesTopColorsData";

    // 13 - USED CAR SALES TOP MODELS
    public static final String USED_CARS_TOP_MODELS_SALES_GET_API_PATH = "/getAllUsedCarSalesTopModelsData";
    public static final String USED_CARS_TOP_MODELS_SALES_POST_API_PATH = "/addUsedCarSalesTopModelsData";
    public static final String USED_CARS_TOP_MODELS_SALES_DELETE_ALL_API_PATH = "/deleteAllUsedCarSalesTopModelData";

    // 14 - USED CAR SALES TOP REGIONS
    public static final String USED_CARS_TOP_REGIONS_SALES_GET_API_PATH = "/getAllUsedCarSalesTopRegionsData";
    public static final String USED_CARS_TOP_REGIONS_SALES_POST_API_PATH = "/addUsedCarSalesTopRegionsData";
    public static final String USED_CARS_TOP_REGIONS_SALES_DELETE_ALL_API_PATH = "/deleteAllUsedCarSalesTopRegionsData";

    // 15 - USER PREFERENCES SEARCH
    public static final String USER_PREFERENCES_SEARCH_GET_API_PATH = "/getUserPreferencesDataByQuery";
    public static final String USER_PREFERENCES_SEARCH_POST_API_PATH = "/addAllUserPreferencesDataByQuery";
    public static final String USER_PREFERENCES_SEARCH_DELETE_ALL_API_PATH = "/deleteAllUserPreferencesDataByQuery";


    // ALL SWAGGER CONSTANTS BELOW ---------------------------------------------------------------------------------------------------------

    // 1 - NEW CV MANUFACTURING
    // GET API
    public static final String NEW_CV_MANUFACTURING_GET_SUMMARY = "GET - NEW CV MANUFACTURING DATA";
    public static final String NEW_CV_MANUFACTURING_SUCCESS = "NEW CV MANUFACTURING DATA FETCHED SUCCESSFULLY.";
    public static final String NEW_CV_MANUFACTURING_NO_DATA_FOUND = "NO DATA FOUND FOR NEW CV MANUFACTURING.";
    // POST API
    public static final String NEW_CV_MANUFACTURING_POST_SUMMARY = "POST - ADD NEW CV MANUFACTURING";
    public static final String NEW_CV_MANUFACTURING_ADD_SUCCESS = "NEW CV MANUFACTURING DATA ADDED SUCCESSFULLY.";
    public static final String NEW_CV_MANUFACTURING_ADD_FAILURE = "FAILURE OCCURRED WHILE ADDING NEW CV MANUFACTURING DATA.";
    // DELETE API
    public static final String NEW_CV_MANUFACTURING_DELETE_ALL_SUMMARY = "DELETE ALL - NEW CV MANUFACTURING DATA";
    public static final String NEW_CV_MANUFACTURING_DELETE_ALL_SUCCESS = "NEW CV MANUFACTURING DATA DELETED SUCCESSFULLY.";
    public static final String NEW_CV_MANUFACTURING_DELETE_ALL_FAILURE = "FAILURE OCCURRED WHILE DELETING NEW CV MANUFACTURING DATA.";


    // 2 - NEW CV MANUFACTURING BY TYPE
    // GET API
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_GET_SUMMARY = "GET - NEW CV MANUFACTURING BY TYPE DATA";
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_SUCCESS = "NEW CV MANUFACTURING BY TYPE DATA FETCHED SUCCESSFULLY.";
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_NO_DATA_FOUND = "NO DATA FOUND FOR NEW CV MANUFACTURING BY TYPE.";
    // POST API
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_POST_SUMMARY = "POST - ADD NEW CV MANUFACTURING BY TYPE";
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_ADD_SUCCESS = "NEW CV MANUFACTURING DATA BY TYPE ADDED SUCCESSFULLY.";
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_ADD_FAILURE = "FAILURE OCCURRED WHILE ADDING NEW CV MANUFACTURING BY TYPE DATA.";
    // DELETE API
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_DELETE_ALL_SUMMARY = "DELETE ALL - NEW CV MANUFACTURING BY TYPE  DATA";
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_DELETE_ALL_SUCCESS = "NEW CV MANUFACTURING BY TYPE DATA DELETED SUCCESSFULLY.";
    public static final String NEW_CV_MANUFACTURING_BY_TYPE_DELETE_ALL_FAILURE = "FAILURE OCCURRED WHILE DELETING NEW CV MANUFACTURING BY TYPE DATA.";

}