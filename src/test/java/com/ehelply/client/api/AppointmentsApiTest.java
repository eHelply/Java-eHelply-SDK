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
import com.ehelply.client.model.AppointmentBase;
import com.ehelply.client.model.AppointmentResponse;
import com.ehelply.client.model.GetAppointment403Response;
import com.ehelply.client.model.HTTPValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppointmentsApi
 */
@Disabled
public class AppointmentsApiTest {

    private final AppointmentsApi api = new AppointmentsApi();

    /**
     * Addentitytoappointment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEntityToAppointmentTest() throws ApiException {
        String appointmentUuid = null;
        String entityUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.addEntityToAppointment(appointmentUuid, entityUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Createappointment
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
     * Deleteappointment
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
     * Removeentityfromappointment
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
     * Getappointment
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
     * Searchappointments
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
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.searchAppointment(placeUuid, excludeCancelled, isDeleted, startRange, endRange, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Searchappointmententities
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
     * Getentityappointments
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchEntityAppointmentsTest() throws ApiException {
        String entityUuid = null;
        String startDate = null;
        String endDate = null;
        Boolean excludeCancelled = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.searchEntityAppointments(entityUuid, startDate, endDate, excludeCancelled, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Updateappointment
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

}
