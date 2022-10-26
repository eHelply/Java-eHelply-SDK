/*
 * eHelply SDK - 1.1.112
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.112
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.CreateNote200Response;
import com.ehelply.client.model.DeleteNote200Response;
import com.ehelply.client.model.GetAppointment403Response;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.NoteBase;
import com.ehelply.client.model.NoteDynamoHistoryResponse;
import com.ehelply.client.model.UpdateNote200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotesApi
 */
@Disabled
public class NotesApiTest {

    private final NotesApi api = new NotesApi();

    /**
     * Createnote
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNoteTest() throws ApiException {
        NoteBase noteBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CreateNote200Response response = api.createNote(noteBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Deletenote
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteNoteTest() throws ApiException {
        String noteId = null;
        String method = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        DeleteNote200Response response = api.deleteNote(noteId, method, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getnote
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNoteTest() throws ApiException {
        String noteId = null;
        Integer history = null;
        Boolean historyContent = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        NoteDynamoHistoryResponse response = api.getNote(noteId, history, historyContent, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Updatenote
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateNoteTest() throws ApiException {
        String noteId = null;
        NoteBase noteBase = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        UpdateNote200Response response = api.updateNote(noteId, noteBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
