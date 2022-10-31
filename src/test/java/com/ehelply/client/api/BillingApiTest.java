/*
 * eHelply SDK - 1.1.120
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.120
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.GetAppointment403Response;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.Payment;
import com.ehelply.client.model.PaymentMethodResponse;
import com.ehelply.client.model.StripeAccountResponse;
import com.ehelply.client.model.StripeCustomerSecretResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillingApi
 */
@Disabled
public class BillingApiTest {

    private final BillingApi api = new BillingApi();

    /**
     * Createbillingaccount
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBillingAccountTest() throws ApiException {
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        StripeAccountResponse response = api.createBillingAccount(xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getclientsecret
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getClientSecretTest() throws ApiException {
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        StripeCustomerSecretResponse response = api.getClientSecret(xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Haspayment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void hasPaymentTest() throws ApiException {
        Object projectUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.hasPayment(projectUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Listpaymentmethods
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPaymentMethodsTest() throws ApiException {
        Object projectUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<PaymentMethodResponse> response = api.listPaymentMethods(projectUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Processpayment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void processPaymentTest() throws ApiException {
        Payment payment = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        String response = api.processPayment(payment, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Reconcilepaymentmethod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reconcilePaymentMethodTest() throws ApiException {
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.reconcilePaymentMethod(xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Removepaymentmethod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removePaymentMethodTest() throws ApiException {
        Object projectUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        String response = api.removePaymentMethod(projectUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
