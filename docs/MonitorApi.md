# MonitorApi

All URIs are relative to *https://api.prod.ehelply.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acknowledgeAlarm**](MonitorApi.md#acknowledgeAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/acknowledge | Acknowledgealarm |
| [**assignAlarm**](MonitorApi.md#assignAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/assign | Assignalarm |
| [**attachAlarmNote**](MonitorApi.md#attachAlarmNote) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/note | Attachalarmnote |
| [**attachAlarmTicket**](MonitorApi.md#attachAlarmTicket) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/ticket | Attachalarmticket |
| [**clearAlarm**](MonitorApi.md#clearAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/clear | Clearalarm |
| [**getService**](MonitorApi.md#getService) | **GET** /sam/monitor/services/{service} | Getservice |
| [**getServiceAlarm**](MonitorApi.md#getServiceAlarm) | **GET** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid} | Getservicealarm |
| [**getServiceAlarms**](MonitorApi.md#getServiceAlarms) | **GET** /sam/monitor/services/{service}/stages/{stage}/alarms | Getservicealarms |
| [**getServiceHeartbeat**](MonitorApi.md#getServiceHeartbeat) | **GET** /sam/monitor/services/{service}/stages/{stage}/heartbeats | Getserviceheartbeat |
| [**getServiceKpis**](MonitorApi.md#getServiceKpis) | **GET** /sam/monitor/services/{service}/kpis | Getservicekpis |
| [**getServiceSpec**](MonitorApi.md#getServiceSpec) | **GET** /sam/monitor/services/{service}/specs/{spec} | Getservicespec |
| [**getServiceSpecs**](MonitorApi.md#getServiceSpecs) | **GET** /sam/monitor/services/{service}/specs | Getservicespecs |
| [**getServiceVitals**](MonitorApi.md#getServiceVitals) | **GET** /sam/monitor/services/{service}/stages/{stage}/vitals | Getservicevitals |
| [**getServices**](MonitorApi.md#getServices) | **GET** /sam/monitor/services | Getservices |
| [**getServicesWithSpecs**](MonitorApi.md#getServicesWithSpecs) | **GET** /sam/monitor/specs/services | Getserviceswithspecs |
| [**hideService**](MonitorApi.md#hideService) | **POST** /sam/monitor/services/{service}/stages/{stage}/hide | Hideservice |
| [**ignoreAlarm**](MonitorApi.md#ignoreAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/ignore | Ignorealarm |
| [**registerService**](MonitorApi.md#registerService) | **POST** /sam/monitor/services | Registerservice |
| [**searchAlarms**](MonitorApi.md#searchAlarms) | **GET** /sam/monitor/services/{service}/alarms | Searchalarms |
| [**showService**](MonitorApi.md#showService) | **POST** /sam/monitor/services/{service}/stages/{stage}/show | Showservice |
| [**terminateAlarm**](MonitorApi.md#terminateAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/terminate | Terminatealarm |
| [**triggerAlarm**](MonitorApi.md#triggerAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms | Triggeralarm |


<a name="acknowledgeAlarm"></a>
# **acknowledgeAlarm**
> AlarmResponse acknowledgeAlarm(service, stage, alarmUuid, alarmAcknowledge)

Acknowledgealarm

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    String alarmUuid = "alarmUuid_example"; // String | 
    AlarmAcknowledge alarmAcknowledge = new AlarmAcknowledge(); // AlarmAcknowledge | 
    try {
      AlarmResponse result = apiInstance.acknowledgeAlarm(service, stage, alarmUuid, alarmAcknowledge);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#acknowledgeAlarm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **alarmUuid** | **String**|  | |
| **alarmAcknowledge** | [**AlarmAcknowledge**](AlarmAcknowledge.md)|  | |

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="assignAlarm"></a>
# **assignAlarm**
> AlarmResponse assignAlarm(service, stage, alarmUuid, alarmAssign)

Assignalarm

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    String alarmUuid = "alarmUuid_example"; // String | 
    AlarmAssign alarmAssign = new AlarmAssign(); // AlarmAssign | 
    try {
      AlarmResponse result = apiInstance.assignAlarm(service, stage, alarmUuid, alarmAssign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#assignAlarm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **alarmUuid** | **String**|  | |
| **alarmAssign** | [**AlarmAssign**](AlarmAssign.md)|  | |

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="attachAlarmNote"></a>
# **attachAlarmNote**
> AlarmResponse attachAlarmNote(service, stage, alarmUuid, alarmNote)

Attachalarmnote

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    String alarmUuid = "alarmUuid_example"; // String | 
    AlarmNote alarmNote = new AlarmNote(); // AlarmNote | 
    try {
      AlarmResponse result = apiInstance.attachAlarmNote(service, stage, alarmUuid, alarmNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#attachAlarmNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **alarmUuid** | **String**|  | |
| **alarmNote** | [**AlarmNote**](AlarmNote.md)|  | |

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="attachAlarmTicket"></a>
# **attachAlarmTicket**
> AlarmResponse attachAlarmTicket(service, stage, alarmUuid, alarmTicket)

Attachalarmticket

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    String alarmUuid = "alarmUuid_example"; // String | 
    AlarmTicket alarmTicket = new AlarmTicket(); // AlarmTicket | 
    try {
      AlarmResponse result = apiInstance.attachAlarmTicket(service, stage, alarmUuid, alarmTicket);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#attachAlarmTicket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **alarmUuid** | **String**|  | |
| **alarmTicket** | [**AlarmTicket**](AlarmTicket.md)|  | |

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="clearAlarm"></a>
# **clearAlarm**
> AlarmResponse clearAlarm(service, stage, alarmUuid)

Clearalarm

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    String alarmUuid = "alarmUuid_example"; // String | 
    try {
      AlarmResponse result = apiInstance.clearAlarm(service, stage, alarmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#clearAlarm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **alarmUuid** | **String**|  | |

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getService"></a>
# **getService**
> ServiceResponse getService(service, heartbeats, heartbeatLimit, alarms, alarmLimit, stage)

Getservice

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    Boolean heartbeats = false; // Boolean | 
    Integer heartbeatLimit = 5; // Integer | 
    Boolean alarms = false; // Boolean | 
    Integer alarmLimit = 5; // Integer | 
    String stage = "stage_example"; // String | 
    try {
      ServiceResponse result = apiInstance.getService(service, heartbeats, heartbeatLimit, alarms, alarmLimit, stage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#getService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **heartbeats** | **Boolean**|  | [optional] [default to false] |
| **heartbeatLimit** | **Integer**|  | [optional] [default to 5] |
| **alarms** | **Boolean**|  | [optional] [default to false] |
| **alarmLimit** | **Integer**|  | [optional] [default to 5] |
| **stage** | **String**|  | [optional] |

### Return type

[**ServiceResponse**](ServiceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getServiceAlarm"></a>
# **getServiceAlarm**
> AlarmResponse getServiceAlarm(service, stage, alarmUuid)

Getservicealarm

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    String alarmUuid = "alarmUuid_example"; // String | 
    try {
      AlarmResponse result = apiInstance.getServiceAlarm(service, stage, alarmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#getServiceAlarm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **alarmUuid** | **String**|  | |

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getServiceAlarms"></a>
# **getServiceAlarms**
> List&lt;AlarmResponse&gt; getServiceAlarms(service, stage, history, includeTerminated, includeCleared)

Getservicealarms

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    Integer history = 5; // Integer | 
    Boolean includeTerminated = false; // Boolean | 
    Boolean includeCleared = false; // Boolean | 
    try {
      List<AlarmResponse> result = apiInstance.getServiceAlarms(service, stage, history, includeTerminated, includeCleared);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#getServiceAlarms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **history** | **Integer**|  | [optional] [default to 5] |
| **includeTerminated** | **Boolean**|  | [optional] [default to false] |
| **includeCleared** | **Boolean**|  | [optional] [default to false] |

### Return type

[**List&lt;AlarmResponse&gt;**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getServiceHeartbeat"></a>
# **getServiceHeartbeat**
> List&lt;HeartbeatResponse&gt; getServiceHeartbeat(service, stage, history)

Getserviceheartbeat

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    Integer history = 5; // Integer | 
    try {
      List<HeartbeatResponse> result = apiInstance.getServiceHeartbeat(service, stage, history);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#getServiceHeartbeat");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **history** | **Integer**|  | [optional] [default to 5] |

### Return type

[**List&lt;HeartbeatResponse&gt;**](HeartbeatResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getServiceKpis"></a>
# **getServiceKpis**
> List&lt;KpiResponse&gt; getServiceKpis(service, history)

Getservicekpis

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    Integer history = 5; // Integer | 
    try {
      List<KpiResponse> result = apiInstance.getServiceKpis(service, history);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#getServiceKpis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **history** | **Integer**|  | [optional] [default to 5] |

### Return type

[**List&lt;KpiResponse&gt;**](KpiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getServiceSpec"></a>
# **getServiceSpec**
> GetServiceSpecResponse getServiceSpec(service, spec)

Getservicespec

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String spec = "spec_example"; // String | 
    try {
      GetServiceSpecResponse result = apiInstance.getServiceSpec(service, spec);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#getServiceSpec");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **spec** | **String**|  | |

### Return type

[**GetServiceSpecResponse**](GetServiceSpecResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Unauthorized - Denied by eHelply |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getServiceSpecs"></a>
# **getServiceSpecs**
> GetServiceSpecsResponse getServiceSpecs(service)

Getservicespecs

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    try {
      GetServiceSpecsResponse result = apiInstance.getServiceSpecs(service);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#getServiceSpecs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |

### Return type

[**GetServiceSpecsResponse**](GetServiceSpecsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Unauthorized - Denied by eHelply |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getServiceVitals"></a>
# **getServiceVitals**
> List&lt;StatsVitalsResponse&gt; getServiceVitals(service, stage, history)

Getservicevitals

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    Integer history = 5; // Integer | 
    try {
      List<StatsVitalsResponse> result = apiInstance.getServiceVitals(service, stage, history);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#getServiceVitals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **history** | **Integer**|  | [optional] [default to 5] |

### Return type

[**List&lt;StatsVitalsResponse&gt;**](StatsVitalsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getServices"></a>
# **getServices**
> List&lt;ServiceResponse&gt; getServices(heartbeats, heartbeatLimit, alarms, alarmLimit, includeHidden, stage, key)

Getservices

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    Boolean heartbeats = false; // Boolean | 
    Integer heartbeatLimit = 5; // Integer | 
    Boolean alarms = false; // Boolean | 
    Integer alarmLimit = 5; // Integer | 
    Boolean includeHidden = false; // Boolean | 
    String stage = "stage_example"; // String | 
    String key = "key_example"; // String | 
    try {
      List<ServiceResponse> result = apiInstance.getServices(heartbeats, heartbeatLimit, alarms, alarmLimit, includeHidden, stage, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#getServices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **heartbeats** | **Boolean**|  | [optional] [default to false] |
| **heartbeatLimit** | **Integer**|  | [optional] [default to 5] |
| **alarms** | **Boolean**|  | [optional] [default to false] |
| **alarmLimit** | **Integer**|  | [optional] [default to 5] |
| **includeHidden** | **Boolean**|  | [optional] [default to false] |
| **stage** | **String**|  | [optional] |
| **key** | **String**|  | [optional] |

### Return type

[**List&lt;ServiceResponse&gt;**](ServiceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getServicesWithSpecs"></a>
# **getServicesWithSpecs**
> GetServiceServiceWithSpecsResponse getServicesWithSpecs()

Getserviceswithspecs

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    try {
      GetServiceServiceWithSpecsResponse result = apiInstance.getServicesWithSpecs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#getServicesWithSpecs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetServiceServiceWithSpecsResponse**](GetServiceServiceWithSpecsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Unauthorized - Denied by eHelply |  -  |
| **404** | Not found |  -  |

<a name="hideService"></a>
# **hideService**
> ServiceMessageResponse hideService(service, stage)

Hideservice

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    try {
      ServiceMessageResponse result = apiInstance.hideService(service, stage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#hideService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |

### Return type

[**ServiceMessageResponse**](ServiceMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="ignoreAlarm"></a>
# **ignoreAlarm**
> AlarmResponse ignoreAlarm(service, stage, alarmUuid, alarmIgnore)

Ignorealarm

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    String alarmUuid = "alarmUuid_example"; // String | 
    AlarmIgnore alarmIgnore = new AlarmIgnore(); // AlarmIgnore | 
    try {
      AlarmResponse result = apiInstance.ignoreAlarm(service, stage, alarmUuid, alarmIgnore);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#ignoreAlarm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **alarmUuid** | **String**|  | |
| **alarmIgnore** | [**AlarmIgnore**](AlarmIgnore.md)|  | |

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="registerService"></a>
# **registerService**
> ServiceResponse registerService(serviceCreate)

Registerservice

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    ServiceCreate serviceCreate = new ServiceCreate(); // ServiceCreate | 
    try {
      ServiceResponse result = apiInstance.registerService(serviceCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#registerService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceCreate** | [**ServiceCreate**](ServiceCreate.md)|  | |

### Return type

[**ServiceResponse**](ServiceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="searchAlarms"></a>
# **searchAlarms**
> Page searchAlarms(service, page, pageSize, search, searchOn, sortOn, sortDesc)

Searchalarms

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    Integer page = 1; // Integer | 
    Integer pageSize = 25; // Integer | 
    String search = "search_example"; // String | 
    String searchOn = "searchOn_example"; // String | 
    String sortOn = "sortOn_example"; // String | 
    Boolean sortDesc = false; // Boolean | 
    try {
      Page result = apiInstance.searchAlarms(service, page, pageSize, search, searchOn, sortOn, sortDesc);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#searchAlarms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **page** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 25] |
| **search** | **String**|  | [optional] |
| **searchOn** | **String**|  | [optional] |
| **sortOn** | **String**|  | [optional] |
| **sortDesc** | **Boolean**|  | [optional] [default to false] |

### Return type

[**Page**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="showService"></a>
# **showService**
> ServiceMessageResponse showService(service, stage)

Showservice

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    try {
      ServiceMessageResponse result = apiInstance.showService(service, stage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#showService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |

### Return type

[**ServiceMessageResponse**](ServiceMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="terminateAlarm"></a>
# **terminateAlarm**
> AlarmResponse terminateAlarm(service, stage, alarmUuid, alarmTerminate)

Terminatealarm

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    String alarmUuid = "alarmUuid_example"; // String | 
    AlarmTerminate alarmTerminate = new AlarmTerminate(); // AlarmTerminate | 
    try {
      AlarmResponse result = apiInstance.terminateAlarm(service, stage, alarmUuid, alarmTerminate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#terminateAlarm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **alarmUuid** | **String**|  | |
| **alarmTerminate** | [**AlarmTerminate**](AlarmTerminate.md)|  | |

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="triggerAlarm"></a>
# **triggerAlarm**
> AlarmResponse triggerAlarm(service, stage, alarmCreate)

Triggeralarm

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.MonitorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    MonitorApi apiInstance = new MonitorApi(defaultClient);
    String service = "service_example"; // String | 
    String stage = "stage_example"; // String | 
    AlarmCreate alarmCreate = new AlarmCreate(); // AlarmCreate | 
    try {
      AlarmResponse result = apiInstance.triggerAlarm(service, stage, alarmCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorApi#triggerAlarm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **stage** | **String**|  | |
| **alarmCreate** | [**AlarmCreate**](AlarmCreate.md)|  | |

### Return type

[**AlarmResponse**](AlarmResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

