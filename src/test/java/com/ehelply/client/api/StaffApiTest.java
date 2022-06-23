/*
 * eHelply SDK - 1.1.82
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.82
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.Page;
import com.ehelply.client.model.StaffCreate;
import com.ehelply.client.model.StaffDb;
import com.ehelply.client.model.StaffResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StaffApi
 */
@Disabled
public class StaffApiTest {

    private final StaffApi api = new StaffApi();

    /**
     * Create Staff
     *
     * Creates a staff member
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createStaffPlacesStaffPostTest() throws ApiException {
        StaffCreate staffCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        StaffDb response = api.createStaffPlacesStaffPost(staffCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Delete Staff
     *
     * Deletes the staff member with the given ID and returns True if successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteStaffPlacesStaffStaffUuidDeleteTest() throws ApiException {
        String staffUuid = null;
        Boolean softDelete = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.deleteStaffPlacesStaffStaffUuidDelete(staffUuid, softDelete, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Get Staff
     *
     * Gets the staff member information given the staff ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStaffPlacesStaffStaffUuidGetTest() throws ApiException {
        String staffUuid = null;
        Boolean withPlaces = null;
        Boolean withCompanies = null;
        Boolean withCatalog = null;
        Boolean withSchedule = null;
        Boolean withRoles = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        StaffResponse response = api.getStaffPlacesStaffStaffUuidGet(staffUuid, withPlaces, withCompanies, withCatalog, withSchedule, withRoles, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Staff
     *
     * TODO Item return format: &#x60;&#x60;&#x60; {     uuid                                **type:** string     project_uuid                        **type:** string or None      entity                              **type:** string or None      place                               **type:** dict or None      company                             **type:** dict or None      schedule                            **type:** dict or None      catalog                             **type:** dict or None      reviews                             **type:** dict or None      created_at                          **type:** string or None      updated_at                          **type:** string or None      deleted_at                          **type:** string or None  } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchStaffPlacesStaffGetTest() throws ApiException {
        String projectUuid = null;
        String firstName = null;
        String lastName = null;
        Boolean isDeleted = null;
        Boolean withCompanies = null;
        Boolean withPlaces = null;
        Boolean withSchedule = null;
        Boolean withCatalog = null;
        Boolean withReviews = null;
        Boolean withRoles = null;
        Integer page = null;
        Integer pageSize = null;
        String sortOn = null;
        Boolean sortDesc = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Page response = api.searchStaffPlacesStaffGet(projectUuid, firstName, lastName, isDeleted, withCompanies, withPlaces, withSchedule, withCatalog, withReviews, withRoles, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Update Staff
     *
     * Update staff with given info, only updating the fields supplied. Staff Uuid must be sent however.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateStaffPlacesStaffStaffUuidPutTest() throws ApiException {
        String staffUuid = null;
        StaffCreate staffCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        StaffResponse response = api.updateStaffPlacesStaffStaffUuidPut(staffUuid, staffCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}