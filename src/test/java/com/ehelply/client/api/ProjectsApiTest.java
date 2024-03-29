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
import com.ehelply.client.model.CreateKeyResponse;
import com.ehelply.client.model.CreateProjectCredential;
import com.ehelply.client.model.CreateProjectCredit;
import com.ehelply.client.model.CreateProjectInvoice;
import com.ehelply.client.model.GetAppointment403Response;
import com.ehelply.client.model.GetProjectCredential;
import com.ehelply.client.model.GetProjectInvoiceHistory;
import com.ehelply.client.model.GetProjectInvoiceResponse;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.Page;
import com.ehelply.client.model.ProjectCreditResponse;
import com.ehelply.client.model.ProjectDB;
import com.ehelply.client.model.ProjectsProjectCreate;
import com.ehelply.client.model.ProjectsProjectGet;
import com.ehelply.client.model.ProjectsProjectMemberDB;
import com.ehelply.client.model.ProjectsProjectUpdate;
import com.ehelply.client.model.ProjectsProjectUsageDB;
import com.ehelply.client.model.ProjectsUsageTypeCreate;
import com.ehelply.client.model.ProjectsUsageTypeDB;
import com.ehelply.client.model.ProjectsUsageTypeGet;
import com.ehelply.client.model.ProjectsUsageTypeUpdate;
import com.ehelply.client.model.ResponseAddmembertoproject;
import com.ehelply.client.model.ResponseArchiveproject;
import com.ehelply.client.model.ResponseCreateprojectcredential;
import com.ehelply.client.model.ResponseCreateprojectinvoice;
import com.ehelply.client.model.ResponseDeleteprojectcredential;
import com.ehelply.client.model.ResponseDeleteusagetype;
import com.ehelply.client.model.ResponseRemovememberfromproject;
import com.ehelply.client.model.ResponseRevokeprojectcredit;
import com.ehelply.client.model.ResponseUpdateprojectcredential;
import com.ehelply.client.model.SecurityKeyCreate;
import com.ehelply.client.model.UpdateProjectCredentialRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Disabled
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    /**
     * Addmembertoproject
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addMemberToProjectTest() throws ApiException {
        String projectUuid = null;
        String entityUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ResponseAddmembertoproject response = api.addMemberToProject(projectUuid, entityUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Archiveproject
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void archiveProjectTest() throws ApiException {
        String projectUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ResponseArchiveproject response = api.archiveProject(projectUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Createproject
     *
     * Create a new Project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        ProjectsProjectCreate projectsProjectCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ProjectDB response = api.createProject(projectsProjectCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Createprojectcredential
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectCredentialTest() throws ApiException {
        String projectUuid = null;
        CreateProjectCredential createProjectCredential = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ResponseCreateprojectcredential response = api.createProjectCredential(projectUuid, createProjectCredential, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Createprojectcredit
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectCreditTest() throws ApiException {
        String projectUuid = null;
        CreateProjectCredit createProjectCredit = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ProjectCreditResponse response = api.createProjectCredit(projectUuid, createProjectCredit, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Createprojectinvoice
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectInvoiceTest() throws ApiException {
        String projectUuid = null;
        CreateProjectInvoice createProjectInvoice = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ResponseCreateprojectinvoice response = api.createProjectInvoice(projectUuid, createProjectInvoice, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Createprojectkey
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectKeyTest() throws ApiException {
        String projectUuid = null;
        SecurityKeyCreate securityKeyCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        CreateKeyResponse response = api.createProjectKey(projectUuid, securityKeyCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Createusagetype
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUsageTypeTest() throws ApiException {
        ProjectsUsageTypeCreate projectsUsageTypeCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ProjectsUsageTypeDB response = api.createUsageType(projectsUsageTypeCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Deleteprojectcredential
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectCredentialTest() throws ApiException {
        String projectUuid = null;
        String serviceName = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ResponseDeleteprojectcredential response = api.deleteProjectCredential(projectUuid, serviceName, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Deleteprojectkey
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectKeyTest() throws ApiException {
        String projectUuid = null;
        String accessToken = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        String response = api.deleteProjectKey(projectUuid, accessToken, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Deleteusagetype
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUsageTypeTest() throws ApiException {
        String usageTypeKey = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ResponseDeleteusagetype response = api.deleteUsageType(usageTypeKey, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getallprojectcredentials
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProjectCredentialsTest() throws ApiException {
        String projectUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<GetProjectCredential> response = api.getAllProjectCredentials(projectUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getallprojectcredits
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProjectCreditsTest() throws ApiException {
        String projectUuid = null;
        Boolean fullyConsumed = null;
        Boolean revoked = null;
        Integer page = null;
        Integer pageSize = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Page response = api.getAllProjectCredits(projectUuid, fullyConsumed, revoked, page, pageSize, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getallprojectusage
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProjectUsageTest() throws ApiException {
        String projectUuid = null;
        Integer year = null;
        Integer month = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<ProjectsProjectUsageDB> response = api.getAllProjectUsage(projectUuid, year, month, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getmemberprojects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMemberProjectsTest() throws ApiException {
        String entityUuid = null;
        String role = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<ProjectsProjectGet> response = api.getMemberProjects(entityUuid, role, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getproject
     *
     * Get a Project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String projectUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ProjectDB response = api.getProject(projectUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getprojectcredittransactions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectCreditTransactionsTest() throws ApiException {
        String projectUuid = null;
        String creditUuid = null;
        Integer page = null;
        Integer pageSize = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Page response = api.getProjectCreditTransactions(projectUuid, creditUuid, page, pageSize, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getprojectinvoice
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectInvoiceTest() throws ApiException {
        String projectUuid = null;
        Boolean withInvoice = null;
        Integer year = null;
        Integer month = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        GetProjectInvoiceResponse response = api.getProjectInvoice(projectUuid, withInvoice, year, month, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getprojectinvoicehistory
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectInvoiceHistoryTest() throws ApiException {
        String projectUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        GetProjectInvoiceHistory response = api.getProjectInvoiceHistory(projectUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getprojectkeys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectKeysTest() throws ApiException {
        String projectUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<ProjectsProjectMemberDB> response = api.getProjectKeys(projectUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getprojectmembers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectMembersTest() throws ApiException {
        String projectUuid = null;
        String role = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<ProjectsProjectMemberDB> response = api.getProjectMembers(projectUuid, role, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getspecificprojectcredential
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificProjectCredentialTest() throws ApiException {
        String projectUuid = null;
        String serviceName = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        GetProjectCredential response = api.getSpecificProjectCredential(projectUuid, serviceName, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getspecificprojectusage
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificProjectUsageTest() throws ApiException {
        String usageTypeKey = null;
        String projectUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ProjectsProjectUsageDB response = api.getSpecificProjectUsage(usageTypeKey, projectUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getusagetype
     *
     * Get a UsageType  No auth because we may want to use this on pricing/docs pages
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsageTypeTest() throws ApiException {
        String usageTypeKey = null;
        ProjectsUsageTypeGet response = api.getUsageType(usageTypeKey);
        // TODO: test validations
    }

    /**
     * Removememberfromproject
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeMemberFromProjectTest() throws ApiException {
        String projectUuid = null;
        String entityUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ResponseRemovememberfromproject response = api.removeMemberFromProject(projectUuid, entityUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Revokeprojectcredit
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeProjectCreditTest() throws ApiException {
        String projectUuid = null;
        String creditUuid = null;
        String revokedReason = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ResponseRevokeprojectcredit response = api.revokeProjectCredit(projectUuid, creditUuid, revokedReason, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Searchprojects
     *
     * Search projects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchProjectsTest() throws ApiException {
        Boolean isActive = null;
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
        Page response = api.searchProjects(isActive, page, pageSize, search, searchOn, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Searchusagetype
     *
     * Get a UsageType  No auth because we may want to use this on pricing/docs pages
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchUsageTypeTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String search = null;
        String searchOn = null;
        String sortOn = null;
        Boolean sortDesc = null;
        Page response = api.searchUsageType(page, pageSize, search, searchOn, sortOn, sortDesc);
        // TODO: test validations
    }

    /**
     * Updateproject
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProjectTest() throws ApiException {
        String projectUuid = null;
        ProjectsProjectUpdate projectsProjectUpdate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.updateProject(projectUuid, projectsProjectUpdate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Updateprojectcredential
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProjectCredentialTest() throws ApiException {
        String projectUuid = null;
        String serviceName = null;
        UpdateProjectCredentialRequest updateProjectCredentialRequest = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ResponseUpdateprojectcredential response = api.updateProjectCredential(projectUuid, serviceName, updateProjectCredentialRequest, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Updateusagetype
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUsageTypeTest() throws ApiException {
        String usageTypeKey = null;
        ProjectsUsageTypeUpdate projectsUsageTypeUpdate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ProjectsUsageTypeDB response = api.updateUsageType(usageTypeKey, projectsUsageTypeUpdate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
