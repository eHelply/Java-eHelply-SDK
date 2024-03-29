/*
 * eHelply SDK - 1.1.118
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.118
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.DeleteFact200Response;
import com.ehelply.client.model.Fact;
import com.ehelply.client.model.FactCreate;
import com.ehelply.client.model.GetAppointment403Response;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.SaveFact200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FactsApi
 */
@Disabled
public class FactsApiTest {

    private final FactsApi api = new FactsApi();

    /**
     * Deletefact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFactTest() throws ApiException {
        String factName = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        DeleteFact200Response response = api.deleteFact(factName, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Deletefact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFact_0Test() throws ApiException {
        String factName = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        DeleteFact200Response response = api.deleteFact_0(factName, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getfact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFactTest() throws ApiException {
        String factName = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Fact response = api.getFact(factName, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getfact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFact_0Test() throws ApiException {
        String factName = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Fact response = api.getFact_0(factName, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getfacts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFactsTest() throws ApiException {
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<Fact> response = api.getFacts(xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getfacts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFacts_0Test() throws ApiException {
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<Fact> response = api.getFacts_0(xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Savefact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void saveFactTest() throws ApiException {
        FactCreate factCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        SaveFact200Response response = api.saveFact(factCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Savefact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void saveFact_0Test() throws ApiException {
        FactCreate factCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        SaveFact200Response response = api.saveFact_0(factCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
