/*
 * eHelply SDK - 1.1.104
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.104
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
import com.ehelply.client.model.GetServiceServiceWithSpecsResponse;
import com.ehelply.client.model.GetServiceSpecResponse;
import com.ehelply.client.model.GetServiceSpecsResponse;
import com.ehelply.client.model.GetServicesWithSpecs403Response;
import com.ehelply.client.model.HTTPValidationError;
import com.ehelply.client.model.HeartbeatResponse;
import com.ehelply.client.model.KpiResponse;
import com.ehelply.client.model.Page;
import com.ehelply.client.model.ServiceCreate;
import com.ehelply.client.model.ServiceMessageResponse;
import com.ehelply.client.model.ServiceResponse;
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
        AlarmResponse response = api.acknowledgeAlarm(service, stage, alarmUuid, alarmAcknowledge);
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
        AlarmResponse response = api.assignAlarm(service, stage, alarmUuid, alarmAssign);
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
        AlarmResponse response = api.attachAlarmNote(service, stage, alarmUuid, alarmNote);
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
        AlarmResponse response = api.attachAlarmTicket(service, stage, alarmUuid, alarmTicket);
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
        AlarmResponse response = api.clearAlarm(service, stage, alarmUuid);
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
        ServiceResponse response = api.getService(service, heartbeats, heartbeatLimit, alarms, alarmLimit, stage);
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
        AlarmResponse response = api.getServiceAlarm(service, stage, alarmUuid);
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
        List<AlarmResponse> response = api.getServiceAlarms(service, stage, history, includeTerminated, includeCleared);
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
        List<HeartbeatResponse> response = api.getServiceHeartbeat(service, stage, history);
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
        List<KpiResponse> response = api.getServiceKpis(service, history);
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
        List<StatsVitalsResponse> response = api.getServiceVitals(service, stage, history);
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
        List<ServiceResponse> response = api.getServices(heartbeats, heartbeatLimit, alarms, alarmLimit, includeHidden, stage, key);
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
     * Hideservice
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void hideServiceTest() throws ApiException {
        String service = null;
        String stage = null;
        ServiceMessageResponse response = api.hideService(service, stage);
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
        AlarmResponse response = api.ignoreAlarm(service, stage, alarmUuid, alarmIgnore);
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
        ServiceResponse response = api.registerService(serviceCreate);
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
        Page response = api.searchAlarms(service, page, pageSize, search, searchOn, sortOn, sortDesc);
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
        ServiceMessageResponse response = api.showService(service, stage);
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
        AlarmResponse response = api.terminateAlarm(service, stage, alarmUuid, alarmTerminate);
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
        AlarmResponse response = api.triggerAlarm(service, stage, alarmCreate);
        // TODO: test validations
    }

}
