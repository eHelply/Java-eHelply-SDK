/*
 * eHelply SDK - 1.1.92
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.92
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiCallback;
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.ApiResponse;
import com.ehelply.client.Configuration;
import com.ehelply.client.Pair;
import com.ehelply.client.ProgressRequestBody;
import com.ehelply.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.LoggingDynamo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LoggingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LoggingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoggingApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getLogs
     * @param service  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLogsCall(String service, String dateStart, String dateEnd, Boolean desc, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sam/logging/logs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (service != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("service", service));
        }

        if (dateStart != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_start", dateStart));
        }

        if (dateEnd != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_end", dateEnd));
        }

        if (desc != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("desc", desc));
        }

        if (xAccessToken != null) {
            localVarHeaderParams.put("x-access-token", localVarApiClient.parameterToString(xAccessToken));
        }

        if (xSecretToken != null) {
            localVarHeaderParams.put("x-secret-token", localVarApiClient.parameterToString(xSecretToken));
        }

        if (authorization != null) {
            localVarHeaderParams.put("authorization", localVarApiClient.parameterToString(authorization));
        }

        if (ehelplyActiveParticipant != null) {
            localVarHeaderParams.put("ehelply-active-participant", localVarApiClient.parameterToString(ehelplyActiveParticipant));
        }

        if (ehelplyProject != null) {
            localVarHeaderParams.put("ehelply-project", localVarApiClient.parameterToString(ehelplyProject));
        }

        if (ehelplyData != null) {
            localVarHeaderParams.put("ehelply-data", localVarApiClient.parameterToString(ehelplyData));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLogsValidateBeforeCall(String service, String dateStart, String dateEnd, Boolean desc, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getLogsCall(service, dateStart, dateEnd, desc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, _callback);
        return localVarCall;

    }

    /**
     * Getlogs
     * 
     * @param service  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @return List&lt;LoggingDynamo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public List<LoggingDynamo> getLogs(String service, String dateStart, String dateEnd, Boolean desc, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData) throws ApiException {
        ApiResponse<List<LoggingDynamo>> localVarResp = getLogsWithHttpInfo(service, dateStart, dateEnd, desc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        return localVarResp.getData();
    }

    /**
     * Getlogs
     * 
     * @param service  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @return ApiResponse&lt;List&lt;LoggingDynamo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LoggingDynamo>> getLogsWithHttpInfo(String service, String dateStart, String dateEnd, Boolean desc, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData) throws ApiException {
        okhttp3.Call localVarCall = getLogsValidateBeforeCall(service, dateStart, dateEnd, desc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, null);
        Type localVarReturnType = new TypeToken<List<LoggingDynamo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Getlogs (asynchronously)
     * 
     * @param service  (optional)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLogsAsync(String service, String dateStart, String dateEnd, Boolean desc, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback<List<LoggingDynamo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLogsValidateBeforeCall(service, dateStart, dateEnd, desc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, _callback);
        Type localVarReturnType = new TypeToken<List<LoggingDynamo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getServiceLogs
     * @param service  (required)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param limit  (optional, default to 50)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getServiceLogsCall(String service, String dateStart, String dateEnd, Boolean desc, Integer limit, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sam/logging/logs/services/{service}"
            .replaceAll("\\{" + "service" + "\\}", localVarApiClient.escapeString(service.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dateStart != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_start", dateStart));
        }

        if (dateEnd != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_end", dateEnd));
        }

        if (desc != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("desc", desc));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (xAccessToken != null) {
            localVarHeaderParams.put("x-access-token", localVarApiClient.parameterToString(xAccessToken));
        }

        if (xSecretToken != null) {
            localVarHeaderParams.put("x-secret-token", localVarApiClient.parameterToString(xSecretToken));
        }

        if (authorization != null) {
            localVarHeaderParams.put("authorization", localVarApiClient.parameterToString(authorization));
        }

        if (ehelplyActiveParticipant != null) {
            localVarHeaderParams.put("ehelply-active-participant", localVarApiClient.parameterToString(ehelplyActiveParticipant));
        }

        if (ehelplyProject != null) {
            localVarHeaderParams.put("ehelply-project", localVarApiClient.parameterToString(ehelplyProject));
        }

        if (ehelplyData != null) {
            localVarHeaderParams.put("ehelply-data", localVarApiClient.parameterToString(ehelplyData));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getServiceLogsValidateBeforeCall(String service, String dateStart, String dateEnd, Boolean desc, Integer limit, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new ApiException("Missing the required parameter 'service' when calling getServiceLogs(Async)");
        }
        

        okhttp3.Call localVarCall = getServiceLogsCall(service, dateStart, dateEnd, desc, limit, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, _callback);
        return localVarCall;

    }

    /**
     * Getservicelogs
     * 
     * @param service  (required)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param limit  (optional, default to 50)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @return List&lt;LoggingDynamo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public List<LoggingDynamo> getServiceLogs(String service, String dateStart, String dateEnd, Boolean desc, Integer limit, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData) throws ApiException {
        ApiResponse<List<LoggingDynamo>> localVarResp = getServiceLogsWithHttpInfo(service, dateStart, dateEnd, desc, limit, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        return localVarResp.getData();
    }

    /**
     * Getservicelogs
     * 
     * @param service  (required)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param limit  (optional, default to 50)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @return ApiResponse&lt;List&lt;LoggingDynamo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LoggingDynamo>> getServiceLogsWithHttpInfo(String service, String dateStart, String dateEnd, Boolean desc, Integer limit, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData) throws ApiException {
        okhttp3.Call localVarCall = getServiceLogsValidateBeforeCall(service, dateStart, dateEnd, desc, limit, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, null);
        Type localVarReturnType = new TypeToken<List<LoggingDynamo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Getservicelogs (asynchronously)
     * 
     * @param service  (required)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param limit  (optional, default to 50)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getServiceLogsAsync(String service, String dateStart, String dateEnd, Boolean desc, Integer limit, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback<List<LoggingDynamo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getServiceLogsValidateBeforeCall(service, dateStart, dateEnd, desc, limit, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, _callback);
        Type localVarReturnType = new TypeToken<List<LoggingDynamo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSubjectLogs
     * @param service  (required)
     * @param subject  (required)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param limit  (optional, default to 50)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSubjectLogsCall(String service, String subject, String dateStart, String dateEnd, Boolean desc, Integer limit, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sam/logging/logs/services/{service}/subjects/{subject}"
            .replaceAll("\\{" + "service" + "\\}", localVarApiClient.escapeString(service.toString()))
            .replaceAll("\\{" + "subject" + "\\}", localVarApiClient.escapeString(subject.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dateStart != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_start", dateStart));
        }

        if (dateEnd != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_end", dateEnd));
        }

        if (desc != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("desc", desc));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (xAccessToken != null) {
            localVarHeaderParams.put("x-access-token", localVarApiClient.parameterToString(xAccessToken));
        }

        if (xSecretToken != null) {
            localVarHeaderParams.put("x-secret-token", localVarApiClient.parameterToString(xSecretToken));
        }

        if (authorization != null) {
            localVarHeaderParams.put("authorization", localVarApiClient.parameterToString(authorization));
        }

        if (ehelplyActiveParticipant != null) {
            localVarHeaderParams.put("ehelply-active-participant", localVarApiClient.parameterToString(ehelplyActiveParticipant));
        }

        if (ehelplyProject != null) {
            localVarHeaderParams.put("ehelply-project", localVarApiClient.parameterToString(ehelplyProject));
        }

        if (ehelplyData != null) {
            localVarHeaderParams.put("ehelply-data", localVarApiClient.parameterToString(ehelplyData));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSubjectLogsValidateBeforeCall(String service, String subject, String dateStart, String dateEnd, Boolean desc, Integer limit, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new ApiException("Missing the required parameter 'service' when calling getSubjectLogs(Async)");
        }
        
        // verify the required parameter 'subject' is set
        if (subject == null) {
            throw new ApiException("Missing the required parameter 'subject' when calling getSubjectLogs(Async)");
        }
        

        okhttp3.Call localVarCall = getSubjectLogsCall(service, subject, dateStart, dateEnd, desc, limit, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, _callback);
        return localVarCall;

    }

    /**
     * Getsubjectlogs
     * 
     * @param service  (required)
     * @param subject  (required)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param limit  (optional, default to 50)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public Object getSubjectLogs(String service, String subject, String dateStart, String dateEnd, Boolean desc, Integer limit, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData) throws ApiException {
        ApiResponse<Object> localVarResp = getSubjectLogsWithHttpInfo(service, subject, dateStart, dateEnd, desc, limit, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        return localVarResp.getData();
    }

    /**
     * Getsubjectlogs
     * 
     * @param service  (required)
     * @param subject  (required)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param limit  (optional, default to 50)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getSubjectLogsWithHttpInfo(String service, String subject, String dateStart, String dateEnd, Boolean desc, Integer limit, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData) throws ApiException {
        okhttp3.Call localVarCall = getSubjectLogsValidateBeforeCall(service, subject, dateStart, dateEnd, desc, limit, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Getsubjectlogs (asynchronously)
     * 
     * @param service  (required)
     * @param subject  (required)
     * @param dateStart  (optional)
     * @param dateEnd  (optional)
     * @param desc  (optional, default to true)
     * @param limit  (optional, default to 50)
     * @param xAccessToken  (optional)
     * @param xSecretToken  (optional)
     * @param authorization  (optional)
     * @param ehelplyActiveParticipant  (optional)
     * @param ehelplyProject  (optional)
     * @param ehelplyData  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSubjectLogsAsync(String service, String subject, String dateStart, String dateEnd, Boolean desc, Integer limit, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSubjectLogsValidateBeforeCall(service, subject, dateStart, dateEnd, desc, limit, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
