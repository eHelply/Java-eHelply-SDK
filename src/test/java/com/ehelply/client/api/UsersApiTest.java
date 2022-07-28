/*
 * eHelply SDK - 1.1.106
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.106
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
import com.ehelply.client.model.ParticipantCreate;
import com.ehelply.client.model.ParticipantUpdate;
import com.ehelply.client.model.ParticipantUserReturn;
import com.ehelply.client.model.User;
import com.ehelply.client.model.UserConfirmation;
import com.ehelply.client.model.UserLogin;
import com.ehelply.client.model.UserLoginReturn;
import com.ehelply.client.model.UserPasswordReset;
import com.ehelply.client.model.UserPasswordResetConfirmation;
import com.ehelply.client.model.UserResponse;
import com.ehelply.client.model.UserSignup;
import com.ehelply.client.model.UserSignupReturn;
import com.ehelply.client.model.UserTokenReturn;
import com.ehelply.client.model.UserValidations;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Confirmsignup
     *
     * Validates a user signup with a given confirmation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void confirmSignupTest() throws ApiException {
        UserConfirmation userConfirmation = null;
        Object response = api.confirmSignup(userConfirmation);
        // TODO: test validations
    }

    /**
     * Createparticipant
     *
     * Creates a participant given the participant info (meta and user_id)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createParticipantTest() throws ApiException {
        ParticipantCreate participantCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ParticipantUserReturn response = api.createParticipant(participantCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Createuser
     *
     * Usually ran after login and will do the following: - If no user exists (AKA signed in with social media) it will create a new user and default participant - If a user exists, sync Cognito data from Cognito to the user - Determine missing fields that SHOULD be filled
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        String authorization = null;
        UserResponse response = api.createUser(authorization);
        // TODO: test validations
    }

    /**
     * Deleteparticipant
     *
     * Delete participants related to the given participant_id, returns True if successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteParticipantTest() throws ApiException {
        String participantId = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.deleteParticipant(participantId, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Deleteuser
     *
     * Soft deletes the user with the provided user id, granted the deleter is the same person or an admin. Returns True if successful
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String userId = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.deleteUser(userId, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getparticipant
     *
     * Gets a participant given their participant ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getParticipantTest() throws ApiException {
        String participantId = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ParticipantUserReturn response = api.getParticipant(participantId, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getuser
     *
     * Gets the user object given user id (uuid) or cognito id (cognito)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String userId = null;
        String idType = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        UserResponse response = api.getUser(userId, idType, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Login
     *
     * Login endpoint, returns tokens. EMAIL NEEDS TO BE VERIFIED (can be done through the email the user received).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        UserLogin userLogin = null;
        UserLoginReturn response = api.login(userLogin);
        // TODO: test validations
    }

    /**
     * Refreshtoken
     *
     * Refreshes tokens given a refresh token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refreshTokenTest() throws ApiException {
        String appClient = null;
        String body = null;
        UserTokenReturn response = api.refreshToken(appClient, body);
        // TODO: test validations
    }

    /**
     * Resetpassword
     *
     * Sends the user an email with a confirmation code so they can reset their password
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetPasswordTest() throws ApiException {
        UserPasswordReset userPasswordReset = null;
        Object response = api.resetPassword(userPasswordReset);
        // TODO: test validations
    }

    /**
     * Resetpasswordconfirmation
     *
     * Resets the given user&#39;s password to the given password when the proper code is provided
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetPasswordConfirmationTest() throws ApiException {
        UserPasswordResetConfirmation userPasswordResetConfirmation = null;
        Object response = api.resetPasswordConfirmation(userPasswordResetConfirmation);
        // TODO: test validations
    }

    /**
     * Searchparticipants
     *
     * Search participants using a user uuid, returns pagination information and list of &#x60;items&#x60; (ParticipantUserReturn from GET Participant). Can search on \&quot;user_uuid\&quot;, and sort on any field. To search enter search value into \&quot;search\&quot; query param and the field into \&quot;search on\&quot; (currently only \&quot;user\&quot;uuid\&quot;). For sorting fill out \&quot;sort_desc\&quot; field with either true/false and the \&quot;sort_on\&quot; query parameter with column you want to sort on (ex: date_created). Max pagination items per page is 50.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchParticipantsTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        String searchOn = null;
        String sortOn = null;
        Boolean sortDesc = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Page response = api.searchParticipants(page, pageSize, search, searchOn, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Signup
     *
     * Signup to eHelply, creates a user and default participant behind the scenes. Does not verify email.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signupTest() throws ApiException {
        UserSignup userSignup = null;
        UserSignupReturn response = api.signup(userSignup);
        // TODO: test validations
    }

    /**
     * Updateparticipant
     *
     * Update participant data given
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateParticipantTest() throws ApiException {
        String participantId = null;
        ParticipantUpdate participantUpdate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ParticipantUserReturn response = api.updateParticipant(participantId, participantUpdate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Updateuser
     *
     * Update the given user and sync the cognito data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String userId = null;
        User user = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        UserResponse response = api.updateUser(userId, user, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Uservalidations
     *
     * Validates a certain field.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userValidationsTest() throws ApiException {
        String field = null;
        UserValidations userValidations = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Boolean response = api.userValidations(field, userValidations, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
