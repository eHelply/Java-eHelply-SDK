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
import java.math.BigDecimal;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.Page;
import com.ehelply.client.model.PlaceBase;
import com.ehelply.client.model.PlaceResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlacesApi
 */
@Disabled
public class PlacesApiTest {

    private final PlacesApi api = new PlacesApi();

    /**
     * Create Place
     *
     * Creates a Place.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPlacePlacesPlacesPostTest() throws ApiException {
        PlaceBase placeBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        PlaceResponse response = api.createPlacePlacesPlacesPost(placeBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Delete Place
     *
     * Deletes the place with the given ID and returns True if successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePlacePlacesPlacesPlaceUuidDeleteTest() throws ApiException {
        String placeUuid = null;
        Boolean softDelete = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.deletePlacePlacesPlacesPlaceUuidDelete(placeUuid, softDelete, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Forward Geocoding
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void forwardGeocodingPlacesGeocodingForwardGetTest() throws ApiException {
        String searchingPlace = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.forwardGeocodingPlacesGeocodingForwardGet(searchingPlace, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Get Place
     *
     * Gets the place information given the Place ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlacePlacesPlacesPlaceUuidGetTest() throws ApiException {
        String placeUuid = null;
        Boolean withMeta = null;
        Boolean withCatalog = null;
        Boolean withReviews = null;
        Boolean withSchedule = null;
        Boolean withCollection = null;
        Boolean withBlog = null;
        Boolean withTags = null;
        Boolean withCategories = null;
        Boolean withCompany = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        PlaceResponse response = api.getPlacePlacesPlacesPlaceUuidGet(placeUuid, withMeta, withCatalog, withReviews, withSchedule, withCollection, withBlog, withTags, withCategories, withCompany, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Reverse Geocoding
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reverseGeocodingPlacesGeocodingReverseGetTest() throws ApiException {
        BigDecimal _long = null;
        BigDecimal lat = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.reverseGeocodingPlacesGeocodingReverseGet(_long, lat, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Places By Search String
     *
     * Search places by a search string
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchPlacesBySearchStringPlacesSearchPlacesStringGetTest() throws ApiException {
        String searchString = null;
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
        Page response = api.searchPlacesBySearchStringPlacesSearchPlacesStringGet(searchString, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Search Places
     *
     * Search all places and returns paginated results with Places being stored in items field. Can search by &#x60;project_uuid, name, address, address_line_2, city, province_state, country, postal_zip_code, lat, lng email&#x60; string fields or the &#x60;is_public and is_deleted&#x60; boolean fields. To search with these fields use query params with string values. For sorting fill out \&quot;sort_desc\&quot; field with either true/false and the \&quot;sort_on\&quot; query parameter with column you want to sort on (ex: name). Max pagination items per page is 50. Item return format: &#x60;&#x60;&#x60; {     uuid                                **type:** string     project_uuid                        **type:** string or None      meta_uuid                           **type:** string or None      catalog_data                        **type:** dict or None      review_group_data                   **type:** dict or None      schedule_data                       **type:** dict or None      collection_data                     **type:** dict or None      blog_data                           **type:** dict or None      tags                                **type:** [TagBase] or None      categories                          **type:** [CategoryBase] or None      company                             **type:** CompanyBase or None      created_at                          **type:** string or None      updated_at                          **type:** string or None      deleted_at                          **type:** string or None  } &#x60;&#x60;&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchPlacesPlacesPlacesGetTest() throws ApiException {
        String projectUuid = null;
        String name = null;
        String addressLine1 = null;
        String addressLine2 = null;
        String city = null;
        String provinceState = null;
        String country = null;
        String postalZipCode = null;
        String lat = null;
        String lng = null;
        String email = null;
        Boolean isPublic = null;
        Boolean isDeleted = null;
        Boolean withCompany = null;
        Boolean withMeta = null;
        Boolean withCatalog = null;
        Boolean withReviews = null;
        Boolean withSchedule = null;
        Boolean withCollection = null;
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
        Page response = api.searchPlacesPlacesPlacesGet(projectUuid, name, addressLine1, addressLine2, city, provinceState, country, postalZipCode, lat, lng, email, isPublic, isDeleted, withCompany, withMeta, withCatalog, withReviews, withSchedule, withCollection, withBlog, withTags, withCategories, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Update Place
     *
     * Update Place with given info, only updating the fields supplied. Place Uuid must be sent however.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePlacePlacesPlacesPlaceUuidPutTest() throws ApiException {
        String placeUuid = null;
        PlaceBase placeBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        PlaceResponse response = api.updatePlacePlacesPlacesPlaceUuidPut(placeUuid, placeBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
