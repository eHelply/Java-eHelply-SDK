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
import com.ehelply.client.model.GetAppointment403Response;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.ResponseCreatekey;
import com.ehelply.client.model.ResponseDeletekey;
import com.ehelply.client.model.ResponseGeneratetoken;
import com.ehelply.client.model.SecurityCreateToken;
import com.ehelply.client.model.SecurityEncryptionKeyGet;
import com.ehelply.client.model.SecurityEncryptionKeyResponse;
import com.ehelply.client.model.SecurityKeyCreate;
import com.ehelply.client.model.SecurityKeyGet;
import com.ehelply.client.model.SecurityKeyVerify;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityApi
 */
@Disabled
public class SecurityApiTest {

    private final SecurityApi api = new SecurityApi();

    /**
     * Createencryptionkey
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEncryptionKeyTest() throws ApiException {
        String category = null;
        String ehelplySecuritySecretKey = null;
        SecurityEncryptionKeyResponse response = api.createEncryptionKey(category, ehelplySecuritySecretKey);
        // TODO: test validations
    }

    /**
     * Createkey
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createKeyTest() throws ApiException {
        SecurityKeyCreate securityKeyCreate = null;
        Integer accessLength = null;
        Integer secretLength = null;
        ResponseCreatekey response = api.createKey(securityKeyCreate, accessLength, secretLength);
        // TODO: test validations
    }

    /**
     * Deletekey
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteKeyTest() throws ApiException {
        String keyUuid = null;
        ResponseDeletekey response = api.deleteKey(keyUuid);
        // TODO: test validations
    }

    /**
     * Generatetoken
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateTokenTest() throws ApiException {
        SecurityCreateToken securityCreateToken = null;
        ResponseGeneratetoken response = api.generateToken(securityCreateToken);
        // TODO: test validations
    }

    /**
     * Getencryptionkey
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEncryptionKeyTest() throws ApiException {
        String category = null;
        String ehelplySecuritySecretKey = null;
        List<SecurityEncryptionKeyGet> response = api.getEncryptionKey(category, ehelplySecuritySecretKey);
        // TODO: test validations
    }

    /**
     * Getkey
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getKeyTest() throws ApiException {
        String keyUuid = null;
        SecurityKeyGet response = api.getKey(keyUuid);
        // TODO: test validations
    }

    /**
     * Searchkeys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchKeysTest() throws ApiException {
        List<SecurityKeyGet> response = api.searchKeys();
        // TODO: test validations
    }

    /**
     * Verifykey
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verifyKeyTest() throws ApiException {
        SecurityKeyVerify securityKeyVerify = null;
        SecurityKeyGet response = api.verifyKey(securityKeyVerify);
        // TODO: test validations
    }

}
