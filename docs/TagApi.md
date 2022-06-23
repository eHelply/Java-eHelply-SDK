# TagApi

All URIs are relative to *https://api.prod.ehelply.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTagPlacesTagsPost**](TagApi.md#createTagPlacesTagsPost) | **POST** /places/tags | Create Tag |
| [**deleteTagPlacesTagsTagUuidDelete**](TagApi.md#deleteTagPlacesTagsTagUuidDelete) | **DELETE** /places/tags/{tag_uuid} | Delete Tag |
| [**getTagPlacesTagsTagUuidGet**](TagApi.md#getTagPlacesTagsTagUuidGet) | **GET** /places/tags/{tag_uuid} | Get Tag |
| [**searchTagsPlacesTagsGet**](TagApi.md#searchTagsPlacesTagsGet) | **GET** /places/tags | Search Tags |
| [**updateTagPlacesTagsTagUuidPut**](TagApi.md#updateTagPlacesTagsTagUuidPut) | **PUT** /places/tags/{tag_uuid} | Update Tag |


<a name="createTagPlacesTagsPost"></a>
# **createTagPlacesTagsPost**
> TagDb createTagPlacesTagsPost(tagBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Create Tag

Creates a tag

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    TagApi apiInstance = new TagApi(defaultClient);
    TagBase tagBase = new TagBase(); // TagBase | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      TagDb result = apiInstance.createTagPlacesTagsPost(tagBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#createTagPlacesTagsPost");
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
| **tagBase** | [**TagBase**](TagBase.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**TagDb**](TagDb.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Route not found - Denied by eHelply |  -  |
| **422** | Validation Error |  -  |

<a name="deleteTagPlacesTagsTagUuidDelete"></a>
# **deleteTagPlacesTagsTagUuidDelete**
> Object deleteTagPlacesTagsTagUuidDelete(tagUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Delete Tag

Deletes the tag member with the given ID and returns True if successful

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    TagApi apiInstance = new TagApi(defaultClient);
    String tagUuid = "tagUuid_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Object result = apiInstance.deleteTagPlacesTagsTagUuidDelete(tagUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#deleteTagPlacesTagsTagUuidDelete");
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
| **tagUuid** | **String**|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Route not found - Denied by eHelply |  -  |
| **422** | Validation Error |  -  |

<a name="getTagPlacesTagsTagUuidGet"></a>
# **getTagPlacesTagsTagUuidGet**
> TagBase getTagPlacesTagsTagUuidGet(tagUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Get Tag

Gets the tag member information given the tag ID

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    TagApi apiInstance = new TagApi(defaultClient);
    String tagUuid = "tagUuid_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      TagBase result = apiInstance.getTagPlacesTagsTagUuidGet(tagUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getTagPlacesTagsTagUuidGet");
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
| **tagUuid** | **String**|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**TagBase**](TagBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Route not found - Denied by eHelply |  -  |
| **422** | Validation Error |  -  |

<a name="searchTagsPlacesTagsGet"></a>
# **searchTagsPlacesTagsGet**
> Page searchTagsPlacesTagsGet(projectUuid, name, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Search Tags

TODO Item return format: &#x60;&#x60;&#x60; {     uuid                                **type:** string     project_uuid                        **type:** string or None      name                                **type:** string or None      meta                                **type:** dict or None      created_at                          **type:** string or None      updated_at                          **type:** string or None      deleted_at                          **type:** string or None  } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    TagApi apiInstance = new TagApi(defaultClient);
    String projectUuid = "projectUuid_example"; // String | 
    String name = "name_example"; // String | 
    Integer page = 1; // Integer | 
    Integer pageSize = 25; // Integer | 
    String sortOn = "sortOn_example"; // String | 
    Boolean sortDesc = false; // Boolean | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Page result = apiInstance.searchTagsPlacesTagsGet(projectUuid, name, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#searchTagsPlacesTagsGet");
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
| **projectUuid** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 25] |
| **sortOn** | **String**|  | [optional] |
| **sortDesc** | **Boolean**|  | [optional] [default to false] |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

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
| **404** | Route not found - Denied by eHelply |  -  |
| **422** | Validation Error |  -  |

<a name="updateTagPlacesTagsTagUuidPut"></a>
# **updateTagPlacesTagsTagUuidPut**
> TagBase updateTagPlacesTagsTagUuidPut(tagUuid, tagBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Update Tag

Update tag with given info, only updating the fields supplied. Tag Uuid must be sent however.

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    TagApi apiInstance = new TagApi(defaultClient);
    String tagUuid = "tagUuid_example"; // String | 
    TagBase tagBase = new TagBase(); // TagBase | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      TagBase result = apiInstance.updateTagPlacesTagsTagUuidPut(tagUuid, tagBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#updateTagPlacesTagsTagUuidPut");
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
| **tagUuid** | **String**|  | |
| **tagBase** | [**TagBase**](TagBase.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**TagBase**](TagBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Route not found - Denied by eHelply |  -  |
| **422** | Validation Error |  -  |

