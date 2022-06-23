/*
 * eHelply SDK - 1.1.81
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.81
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.Payment;
import org.openapitools.client.model.PaymentMethodResponse;
import org.openapitools.client.model.StripeAccountResponse;
import org.openapitools.client.model.StripeCustomerSecretResponse;
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
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.hasPayment(xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Listpaymentmethods
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPaymentMethodsTest() throws ApiException {
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<PaymentMethodResponse> response = api.listPaymentMethods(xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
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
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        String response = api.removePaymentMethod(xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
