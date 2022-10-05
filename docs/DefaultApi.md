# DefaultApi

All URIs are relative to *https://api.prod.ehelply.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFile**](DefaultApi.md#createFile) | **POST** /files/files | Createfile |
| [**deleteFile**](DefaultApi.md#deleteFile) | **DELETE** /files/files/{file_uuid} | Deletefile |
| [**getFile**](DefaultApi.md#getFile) | **GET** /files/files/{file_uuid} | Getfile |
| [**updateFile**](DefaultApi.md#updateFile) | **PUT** /files/files/{file_uuid} | Updatefile |


<a name="createFile"></a>
# **createFile**
> CreateFile200Response createFile(_file, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Createfile

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      CreateFile200Response result = apiInstance.createFile(_file, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createFile");
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
| **_file** | **File**|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**CreateFile200Response**](CreateFile200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Cannot create SuperStack internal file |  -  |
| **403** | Unauthorized - Denied by eHelply |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="deleteFile"></a>
# **deleteFile**
> DeleteFile200Response deleteFile(fileUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Deletefile

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String fileUuid = "fileUuid_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      DeleteFile200Response result = apiInstance.deleteFile(fileUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteFile");
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
| **fileUuid** | **String**|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**DeleteFile200Response**](DeleteFile200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Cannot delete SuperStack internal file |  -  |
| **403** | Unauthorized - Denied by eHelply |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getFile"></a>
# **getFile**
> File getFile(fileUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Getfile

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String fileUuid = "fileUuid_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      File result = apiInstance.getFile(fileUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getFile");
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
| **fileUuid** | **String**|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Cannot get SuperStack internal file |  -  |
| **403** | Unauthorized - Denied by eHelply |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="updateFile"></a>
# **updateFile**
> UpdateFile200Response updateFile(fileUuid, _file, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Updatefile

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String fileUuid = "fileUuid_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      UpdateFile200Response result = apiInstance.updateFile(fileUuid, _file, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateFile");
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
| **fileUuid** | **String**|  | |
| **_file** | **File**|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**UpdateFile200Response**](UpdateFile200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Cannot update SuperStack internal file |  -  |
| **403** | Unauthorized - Denied by eHelply |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

