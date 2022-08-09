/*
 * eHelply SDK - 1.1.101
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.101
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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TagApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TagApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagApi(ApiClient apiClient) {
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
     * Build call for deleteTag
     * @param tagUuid  (required)
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
        <tr><td> 404 </td><td> Route not found - Denied by eHelply </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteTagCall(String tagUuid, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/places/tags/{tag_uuid}"
            .replaceAll("\\{" + "tag_uuid" + "\\}", localVarApiClient.escapeString(tagUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteTagValidateBeforeCall(String tagUuid, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'tagUuid' is set
        if (tagUuid == null) {
            throw new ApiException("Missing the required parameter 'tagUuid' when calling deleteTag(Async)");
        }
        

        okhttp3.Call localVarCall = deleteTagCall(tagUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, _callback);
        return localVarCall;

    }

    /**
     * Deletetag
     * Deletes the tag member with the given ID and returns True if successful
     * @param tagUuid  (required)
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
        <tr><td> 404 </td><td> Route not found - Denied by eHelply </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public Object deleteTag(String tagUuid, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData) throws ApiException {
        ApiResponse<Object> localVarResp = deleteTagWithHttpInfo(tagUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        return localVarResp.getData();
    }

    /**
     * Deletetag
     * Deletes the tag member with the given ID and returns True if successful
     * @param tagUuid  (required)
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
        <tr><td> 404 </td><td> Route not found - Denied by eHelply </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> deleteTagWithHttpInfo(String tagUuid, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData) throws ApiException {
        okhttp3.Call localVarCall = deleteTagValidateBeforeCall(tagUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deletetag (asynchronously)
     * Deletes the tag member with the given ID and returns True if successful
     * @param tagUuid  (required)
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
        <tr><td> 404 </td><td> Route not found - Denied by eHelply </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteTagAsync(String tagUuid, String xAccessToken, String xSecretToken, String authorization, String ehelplyActiveParticipant, String ehelplyProject, String ehelplyData, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteTagValidateBeforeCall(tagUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
