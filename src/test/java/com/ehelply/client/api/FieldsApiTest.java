/*
 * eHelply SDK - 1.1.122
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.122
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.CreateField200Response;
import com.ehelply.client.model.DeleteField200Response;
import com.ehelply.client.model.Field;
import com.ehelply.client.model.FieldDynamo;
import com.ehelply.client.model.GetAppointment403Response;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.UpdateField200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FieldsApi
 */
@Disabled
public class FieldsApiTest {

    private final FieldsApi api = new FieldsApi();

    /**
     * Createfield
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFieldTest() throws ApiException {
        Field field = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CreateField200Response response = api.createField(field, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Deletefield
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFieldTest() throws ApiException {
        String fieldUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        DeleteField200Response response = api.deleteField(fieldUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getfield
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFieldTest() throws ApiException {
        String fieldUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        FieldDynamo response = api.getField(fieldUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Updatefield
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFieldTest() throws ApiException {
        String fieldUuid = null;
        Field field = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        UpdateField200Response response = api.updateField(fieldUuid, field, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
