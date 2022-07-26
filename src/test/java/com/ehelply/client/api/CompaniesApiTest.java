/*
 * eHelply SDK - 1.1.97
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.97
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.CompanyBase;
import com.ehelply.client.model.CompanyResponse;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.Page;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompaniesApi
 */
@Disabled
public class CompaniesApiTest {

    private final CompaniesApi api = new CompaniesApi();

    /**
     * Create Company
     *
     * Creates a company
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCompanyPlacesCompaniesPostTest() throws ApiException {
        CompanyBase companyBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CompanyResponse response = api.createCompanyPlacesCompaniesPost(companyBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Delete Place
     *
     * Deletes the company with the given ID and returns True if successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePlacePlacesCompaniesCompanyUuidDeleteTest() throws ApiException {
        String companyUuid = null;
        Boolean softDelete = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.deletePlacePlacesCompaniesCompanyUuidDelete(companyUuid, softDelete, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Get Company
     *
     * Gets the company information given the Place ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompanyPlacesCompaniesCompanyUuidGetTest() throws ApiException {
        String companyUuid = null;
        Boolean withMeta = null;
        Boolean withCatalog = null;
        Boolean withReviews = null;
        Boolean withSchedule = null;
        Boolean withBlog = null;
        Boolean withTags = null;
        Boolean withCategories = null;
        Boolean withPlaces = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CompanyResponse response = api.getCompanyPlacesCompaniesCompanyUuidGet(companyUuid, withMeta, withCatalog, withReviews, withSchedule, withBlog, withTags, withCategories, withPlaces, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Companies
     *
     * Search all companies and returns paginated results with Companies being stored in items field. Can search by &#x60;project_uuid, name, email&#x60; string fields or the &#x60;is_public and is_deleted&#x60; boolean fields. To search with these fields use query params with string values. For sorting fill out \&quot;sort_desc\&quot; field with either true/false and the \&quot;sort_on\&quot; query parameter with column you want to sort on (ex: name). Max pagination items per page is 50. Item return format: &#x60;&#x60;&#x60; {     uuid                                **type:** string     project_uuid                        **type:** string or None      meta_uuid                           **type:** string or None      catalog_data                        **type:** dict or None      review_group_data                   **type:** dict or None      schedule_data                       **type:** dict or None      blog_data                           **type:** dict or None      tags                                **type:** [TagBase] or None      categories                          **type:** [CategoryBase] or None      places                              **type:** PlaceBase or None      created_at                          **type:** string or None      updated_at                          **type:** string or None      deleted_at                          **type:** string or None  } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCompaniesPlacesCompaniesGetTest() throws ApiException {
        String projectUuid = null;
        String name = null;
        String email = null;
        Boolean isPublic = null;
        Boolean isDeleted = null;
        Boolean withPlaces = null;
        Boolean withMeta = null;
        Boolean withCatalog = null;
        Boolean withReviews = null;
        Boolean withSchedule = null;
        Boolean withBlog = null;
        Boolean withTags = null;
        Boolean withCategories = null;
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
        Page response = api.searchCompaniesPlacesCompaniesGet(projectUuid, name, email, isPublic, isDeleted, withPlaces, withMeta, withCatalog, withReviews, withSchedule, withBlog, withTags, withCategories, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Update Company
     *
     * Update company with given info, only updating the fields supplied. Company Uuid must be sent however.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCompanyPlacesCompaniesCompanyUuidPutTest() throws ApiException {
        String companyUuid = null;
        CompanyBase companyBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CompanyResponse response = api.updateCompanyPlacesCompaniesCompanyUuidPut(companyUuid, companyBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
