/*
 * eHelply SDK - 1.1.93
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.93
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.AppointmentBase;
import com.ehelply.client.model.AppointmentResponse;
import com.ehelply.client.model.CatalogBase;
import com.ehelply.client.model.CatalogReturn;
import com.ehelply.client.model.CreateReview;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.Page;
import com.ehelply.client.model.ProductBase;
import com.ehelply.client.model.ProductReturn;
import com.ehelply.client.model.UpdateReview;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Attach Entity To Appointment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void attachEntityToAppointmentTest() throws ApiException {
        String appointmentUuid = null;
        String entityUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.attachEntityToAppointment(appointmentUuid, entityUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Attach Product To Catalog
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void attachProductToCatalogTest() throws ApiException {
        String catalogUuid = null;
        String productUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.attachProductToCatalog(catalogUuid, productUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Create Appointment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAppointmentTest() throws ApiException {
        AppointmentBase appointmentBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AppointmentResponse response = api.createAppointment(appointmentBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Create Catalog
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCatalogTest() throws ApiException {
        CatalogBase catalogBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CatalogReturn response = api.createCatalog(catalogBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Create Product
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProductTest() throws ApiException {
        ProductBase productBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ProductReturn response = api.createProduct(productBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Create Review
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createReviewTest() throws ApiException {
        String entityType = null;
        String entityUuid = null;
        CreateReview createReview = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.createReview(entityType, entityUuid, createReview, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Delete Appointment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAppointmentTest() throws ApiException {
        String appointmentUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.deleteAppointment(appointmentUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Delete Catalog
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCatalogTest() throws ApiException {
        String catalogUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.deleteCatalog(catalogUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Delete Product
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProductTest() throws ApiException {
        String productUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.deleteProduct(productUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Delete Review
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteReviewTest() throws ApiException {
        String entityType = null;
        String entityUuid = null;
        String reviewUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.deleteReview(entityType, entityUuid, reviewUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Detach Entity From Appointment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void detachEntityFromAppointmentTest() throws ApiException {
        String appointmentUuid = null;
        String entityUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.detachEntityFromAppointment(appointmentUuid, entityUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Detach Product From Catalog
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void detachProductFromCatalogTest() throws ApiException {
        String catalogUuid = null;
        String productUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.detachProductFromCatalog(catalogUuid, productUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Get Appointment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAppointmentTest() throws ApiException {
        String appointmentUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AppointmentResponse response = api.getAppointment(appointmentUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Get Catalog
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCatalogTest() throws ApiException {
        String catalogUuid = null;
        Boolean withMeta = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CatalogReturn response = api.getCatalog(catalogUuid, withMeta, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Get Product
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductTest() throws ApiException {
        String productUuid = null;
        Boolean withAddons = null;
        Boolean withMeta = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ProductReturn response = api.getProduct(productUuid, withAddons, withMeta, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Get Review
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReviewTest() throws ApiException {
        String entityType = null;
        String entityUuid = null;
        String reviewUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.getReview(entityType, entityUuid, reviewUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Appointment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAppointmentTest() throws ApiException {
        String placeUuid = null;
        Boolean excludeCancelled = null;
        Boolean isDeleted = null;
        String startRange = null;
        String endRange = null;
        Integer page = null;
        Integer pageSize = null;
        String sortOn = null;
        Boolean sortDesc = null;
        String search = null;
        String searchOn = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.searchAppointment(placeUuid, excludeCancelled, isDeleted, startRange, endRange, page, pageSize, sortOn, sortDesc, search, searchOn, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Appointment Entities
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAppointmentEntitiesTest() throws ApiException {
        String appointmentUuid = null;
        Integer page = null;
        Integer pageSize = null;
        String sortOn = null;
        Boolean sortDesc = null;
        String search = null;
        String searchOn = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.searchAppointmentEntities(appointmentUuid, page, pageSize, sortOn, sortDesc, search, searchOn, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Catalog Products
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCatalogProductsTest() throws ApiException {
        String catalogUuid = null;
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
        Page response = api.searchCatalogProducts(catalogUuid, withMeta, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Catalogs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCatalogsTest() throws ApiException {
        Boolean withMeta = null;
        String name = null;
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
        Page response = api.searchCatalogs(withMeta, name, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Get Entities Appointments
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchEntityAppointmentsTest() throws ApiException {
        String entityUuid = null;
        String startDate = null;
        String endDate = null;
        Boolean includeCancelled = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.searchEntityAppointments(entityUuid, startDate, endDate, includeCancelled, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Products
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchProductTest() throws ApiException {
        Boolean withMeta = null;
        String name = null;
        List<String> addons = null;
        Integer priceMax = null;
        Integer priceMin = null;
        Boolean quantityAvailable = null;
        Boolean isDeleted = null;
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
        Page response = api.searchProduct(withMeta, name, addons, priceMax, priceMin, quantityAvailable, isDeleted, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Product Catalogs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchProductCatalogTest() throws ApiException {
        String productUuid = null;
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
        Page response = api.searchProductCatalog(productUuid, withMeta, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Review
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchReviewsTest() throws ApiException {
        String entityType = null;
        String entityUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.searchReviews(entityType, entityUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Update Appointment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAppointmentTest() throws ApiException {
        String appointmentUuid = null;
        AppointmentBase appointmentBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AppointmentResponse response = api.updateAppointment(appointmentUuid, appointmentBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Update Catalog
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCatalogTest() throws ApiException {
        String catalogUuid = null;
        CatalogBase catalogBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CatalogReturn response = api.updateCatalog(catalogUuid, catalogBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Update Product
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProductTest() throws ApiException {
        String productUuid = null;
        ProductBase productBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ProductReturn response = api.updateProduct(productUuid, productBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Update Review
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateReviewTest() throws ApiException {
        String entityType = null;
        String entityUuid = null;
        String reviewUuid = null;
        UpdateReview updateReview = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.updateReview(entityType, entityUuid, reviewUuid, updateReview, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
