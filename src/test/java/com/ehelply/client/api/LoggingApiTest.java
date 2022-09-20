/*
 * eHelply SDK - 1.1.109
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.109
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.LoggingDynamo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoggingApi
 */
@Disabled
public class LoggingApiTest {

    private final LoggingApi api = new LoggingApi();

    /**
     * Getsubjectlogs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubjectLogsTest() throws ApiException {
        String service = null;
        String subject = null;
        String dateStart = null;
        String dateEnd = null;
        Boolean desc = null;
        Integer limit = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<LoggingDynamo> response = api.getSubjectLogs(service, subject, dateStart, dateEnd, desc, limit, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
