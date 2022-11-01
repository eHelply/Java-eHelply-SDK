/*
 * eHelply SDK - 1.1.121
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.121
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.api;

import com.ehelply.client.ApiException;
import com.ehelply.client.model.AlarmAcknowledge;
import com.ehelply.client.model.AlarmAssign;
import com.ehelply.client.model.AlarmCreate;
import com.ehelply.client.model.AlarmIgnore;
import com.ehelply.client.model.AlarmNote;
import com.ehelply.client.model.AlarmResponse;
import com.ehelply.client.model.AlarmTerminate;
import com.ehelply.client.model.AlarmTicket;
import com.ehelply.client.model.GetAppointment403Response;
import com.ehelply.client.model.GetServiceServiceWithSpecsResponse;
import com.ehelply.client.model.GetServiceSpecResponse;
import com.ehelply.client.model.GetServiceSpecsResponse;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.HeartbeatResponse;
import com.ehelply.client.model.KpiResponse;
import com.ehelply.client.model.Page;
import com.ehelply.client.model.ServiceCreate;
import com.ehelply.client.model.ServiceMessageResponse;
import com.ehelply.client.model.ServiceResponse;
import com.ehelply.client.model.ServiceSuperStackMeta;
import com.ehelply.client.model.StatsVitalsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MonitorApi
 */
@Disabled
public class MonitorApiTest {

    private final MonitorApi api = new MonitorApi();

    /**
     * Acknowledgealarm
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void acknowledgeAlarmTest() throws ApiException {
        String service = null;
        String stage = null;
        String alarmUuid = null;
        AlarmAcknowledge alarmAcknowledge = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AlarmResponse response = api.acknowledgeAlarm(service, stage, alarmUuid, alarmAcknowledge, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Assignalarm
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignAlarmTest() throws ApiException {
        String service = null;
        String stage = null;
        String alarmUuid = null;
        AlarmAssign alarmAssign = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AlarmResponse response = api.assignAlarm(service, stage, alarmUuid, alarmAssign, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Attachalarmnote
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void attachAlarmNoteTest() throws ApiException {
        String service = null;
        String stage = null;
        String alarmUuid = null;
        AlarmNote alarmNote = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AlarmResponse response = api.attachAlarmNote(service, stage, alarmUuid, alarmNote, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Attachalarmticket
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void attachAlarmTicketTest() throws ApiException {
        String service = null;
        String stage = null;
        String alarmUuid = null;
        AlarmTicket alarmTicket = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AlarmResponse response = api.attachAlarmTicket(service, stage, alarmUuid, alarmTicket, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Clearalarm
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clearAlarmTest() throws ApiException {
        String service = null;
        String stage = null;
        String alarmUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AlarmResponse response = api.clearAlarm(service, stage, alarmUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Deleteservicesuperstackmeta
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteServiceSuperStackMetaTest() throws ApiException {
        String service = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.deleteServiceSuperStackMeta(service, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getservice
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceTest() throws ApiException {
        String service = null;
        Boolean heartbeats = null;
        Integer heartbeatLimit = null;
        Boolean alarms = null;
        Integer alarmLimit = null;
        String stage = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ServiceResponse response = api.getService(service, heartbeats, heartbeatLimit, alarms, alarmLimit, stage, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getservicealarm
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceAlarmTest() throws ApiException {
        String service = null;
        String stage = null;
        String alarmUuid = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AlarmResponse response = api.getServiceAlarm(service, stage, alarmUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getservicealarms
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceAlarmsTest() throws ApiException {
        String service = null;
        String stage = null;
        Integer history = null;
        Boolean includeTerminated = null;
        Boolean includeCleared = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<AlarmResponse> response = api.getServiceAlarms(service, stage, history, includeTerminated, includeCleared, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getserviceheartbeat
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceHeartbeatTest() throws ApiException {
        String service = null;
        String stage = null;
        Integer history = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<HeartbeatResponse> response = api.getServiceHeartbeat(service, stage, history, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getservicekpis
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceKpisTest() throws ApiException {
        String service = null;
        Integer history = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<KpiResponse> response = api.getServiceKpis(service, history, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getservicespec
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceSpecTest() throws ApiException {
        String service = null;
        String spec = null;
        GetServiceSpecResponse response = api.getServiceSpec(service, spec);
        // TODO: test validations
    }

    /**
     * Getservicespecs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceSpecsTest() throws ApiException {
        String service = null;
        GetServiceSpecsResponse response = api.getServiceSpecs(service);
        // TODO: test validations
    }

    /**
     * Getservicevitals
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceVitalsTest() throws ApiException {
        String service = null;
        String stage = null;
        Integer history = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<StatsVitalsResponse> response = api.getServiceVitals(service, stage, history, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getservices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServicesTest() throws ApiException {
        Boolean heartbeats = null;
        Integer heartbeatLimit = null;
        Boolean alarms = null;
        Integer alarmLimit = null;
        Boolean includeHidden = null;
        String stage = null;
        String key = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        List<ServiceResponse> response = api.getServices(heartbeats, heartbeatLimit, alarms, alarmLimit, includeHidden, stage, key, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Getserviceswithspecs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServicesWithSpecsTest() throws ApiException {
        GetServiceServiceWithSpecsResponse response = api.getServicesWithSpecs();
        // TODO: test validations
    }

    /**
     * Getsupertackservices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSupertackServicesTest() throws ApiException {
        List<ServiceSuperStackMeta> response = api.getSupertackServices();
        // TODO: test validations
    }

    /**
     * Hideservice
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void hideServiceTest() throws ApiException {
        String service = null;
        String stage = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ServiceMessageResponse response = api.hideService(service, stage, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Ignorealarm
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ignoreAlarmTest() throws ApiException {
        String service = null;
        String stage = null;
        String alarmUuid = null;
        AlarmIgnore alarmIgnore = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AlarmResponse response = api.ignoreAlarm(service, stage, alarmUuid, alarmIgnore, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Registerservice
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerServiceTest() throws ApiException {
        ServiceCreate serviceCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ServiceResponse response = api.registerService(serviceCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Saveservicesuperstackmeta
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void saveServiceSuperStackMetaTest() throws ApiException {
        String service = null;
        ServiceSuperStackMeta serviceSuperStackMeta = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        Object response = api.saveServiceSuperStackMeta(service, serviceSuperStackMeta, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Searchalarms
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAlarmsTest() throws ApiException {
        String service = null;
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
        Page response = api.searchAlarms(service, page, pageSize, search, searchOn, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Showservice
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showServiceTest() throws ApiException {
        String service = null;
        String stage = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        ServiceMessageResponse response = api.showService(service, stage, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Terminatealarm
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void terminateAlarmTest() throws ApiException {
        String service = null;
        String stage = null;
        String alarmUuid = null;
        AlarmTerminate alarmTerminate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AlarmResponse response = api.terminateAlarm(service, stage, alarmUuid, alarmTerminate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

    /**
     * Triggeralarm
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerAlarmTest() throws ApiException {
        String service = null;
        String stage = null;
        AlarmCreate alarmCreate = null;
        String xAccessToken = null;
        String xSecretToken = null;
        String authorization = null;
        String ehelplyActiveParticipant = null;
        String ehelplyProject = null;
        String ehelplyData = null;
        AlarmResponse response = api.triggerAlarm(service, stage, alarmCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
        // TODO: test validations
    }

}
