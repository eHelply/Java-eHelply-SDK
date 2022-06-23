/*
 * eHelply SDK - 1.1.84
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.84
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.Contact;
import com.ehelply.client.model.ContactResponse;
import com.ehelply.client.model.CreateTicket;
import com.ehelply.client.model.GetAppointment403Response;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.TicketResponse;
import com.ehelply.client.model.TicketsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SupportApi
 */
@Disabled
public class SupportApiTest {

    private final SupportApi api = new SupportApi();

    /**
     * Createcontact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createContactTest() throws ApiException {
        Contact contact = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ContactResponse response = api.createContact(contact, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Createticket
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTicketTest() throws ApiException {
        String projectUuid = null;
        String memberUuid = null;
        CreateTicket createTicket = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        TicketResponse response = api.createTicket(projectUuid, memberUuid, createTicket, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Listtickets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTicketsTest() throws ApiException {
        String projectUuid = null;
        String memberUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<TicketsResponse> response = api.listTickets(projectUuid, memberUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Updateticket
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTicketTest() throws ApiException {
        String projectUuid = null;
        String memberUuid = null;
        String ticketId = null;
        CreateTicket createTicket = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        TicketResponse response = api.updateTicket(projectUuid, memberUuid, ticketId, createTicket, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Viewticket
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewTicketTest() throws ApiException {
        String projectUuid = null;
        String memberUuid = null;
        String ticketId = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        TicketResponse response = api.viewTicket(projectUuid, memberUuid, ticketId, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
