/*
 * eHelply SDK - 1.1.119
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.119
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.CreateMeta200Response;
import com.ehelply.client.model.CreateSlug200Response;
import com.ehelply.client.model.DeleteMeta200Response;
import com.ehelply.client.model.GetAppointment403Response;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.MetaCreate;
import com.ehelply.client.model.MetaDynamo;
import com.ehelply.client.model.Slugger;
import com.ehelply.client.model.TouchMeta200Response;
import com.ehelply.client.model.UpdateMeta200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetaApi
 */
@Disabled
public class MetaApiTest {

    private final MetaApi api = new MetaApi();

    /**
     * Createmeta
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMetaTest() throws ApiException {
        String service = null;
        String typeName = null;
        String entityUuid = null;
        MetaCreate metaCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CreateMeta200Response response = api.createMeta(service, typeName, entityUuid, metaCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Createslug
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSlugTest() throws ApiException {
        Slugger slugger = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CreateSlug200Response response = api.createSlug(slugger, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Deletemeta
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMetaTest() throws ApiException {
        String metaUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        DeleteMeta200Response response = api.deleteMeta(metaUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Deletemetafromparts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMetaFromPartsTest() throws ApiException {
        String service = null;
        String typeName = null;
        String entityUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        DeleteMeta200Response response = api.deleteMetaFromParts(service, typeName, entityUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getmeta
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetaTest() throws ApiException {
        String metaUuid = null;
        Boolean detailed = null;
        Boolean custom = null;
        Integer history = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        MetaDynamo response = api.getMeta(metaUuid, detailed, custom, history, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getmetafromparts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetaFromPartsTest() throws ApiException {
        String service = null;
        String typeName = null;
        String entityUuid = null;
        Boolean detailed = null;
        Boolean custom = null;
        Integer history = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        MetaDynamo response = api.getMetaFromParts(service, typeName, entityUuid, detailed, custom, history, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Touchmeta
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void touchMetaTest() throws ApiException {
        String metaUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        TouchMeta200Response response = api.touchMeta(metaUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Updatemeta
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMetaTest() throws ApiException {
        String metaUuid = null;
        MetaCreate metaCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        UpdateMeta200Response response = api.updateMeta(metaUuid, metaCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Updatemetafromparts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMetaFromPartsTest() throws ApiException {
        String service = null;
        String typeName = null;
        String entityUuid = null;
        MetaCreate metaCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        UpdateMeta200Response response = api.updateMetaFromParts(service, typeName, entityUuid, metaCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
