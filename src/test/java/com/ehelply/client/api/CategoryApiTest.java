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
import com.ehelply.client.model.CategoryBase;
import com.ehelply.client.model.CategoryDb;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.Page;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoryApi
 */
@Disabled
public class CategoryApiTest {

    private final CategoryApi api = new CategoryApi();

    /**
     * Create Category
     *
     * Creates a category
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCategoryPlacesCategoriesPostTest() throws ApiException {
        CategoryBase categoryBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CategoryDb response = api.createCategoryPlacesCategoriesPost(categoryBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Delete Category
     *
     * Deletes the category with the given ID and returns True if successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCategoryPlacesCategoriesCategoryUuidDeleteTest() throws ApiException {
        String categoryUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.deleteCategoryPlacesCategoriesCategoryUuidDelete(categoryUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Get Category
     *
     * Gets the category information given the category ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCategoryPlacesCategoriesCategoryUuidGetTest() throws ApiException {
        String categoryUuid = null;
        Boolean withMeta = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CategoryBase response = api.getCategoryPlacesCategoriesCategoryUuidGet(categoryUuid, withMeta, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Categories
     *
     * TODO Item return format: &#x60;&#x60;&#x60; {     uuid                                **type:** string     project_uuid                        **type:** string or None      name                                **type:** string or None      meta                                **type:** dict or None      created_at                          **type:** string or None      updated_at                          **type:** string or None      deleted_at                          **type:** string or None  } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCategoriesPlacesCategoriesGetTest() throws ApiException {
        String projectUuid = null;
        String name = null;
        Boolean withMeta = null;
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
        Page response = api.searchCategoriesPlacesCategoriesGet(projectUuid, name, withMeta, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Update Category
     *
     * Update category with given info, only updating the fields supplied. Category Uuid must be sent however.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCategoryPlacesCategoriesCategoryUuidPutTest() throws ApiException {
        String categoryUuid = null;
        CategoryBase categoryBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CategoryBase response = api.updateCategoryPlacesCategoriesCategoryUuidPut(categoryUuid, categoryBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
