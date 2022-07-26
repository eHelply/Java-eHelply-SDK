# ReviewsApi

All URIs are relative to *https://api.prod.ehelply.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReview**](ReviewsApi.md#createReview) | **POST** /products/reviews/types/{entity_type}/entities/{entity_uuid} | Create |
| [**deleteReview**](ReviewsApi.md#deleteReview) | **DELETE** /products/reviews/types/{entity_type}/entities/{entity_uuid}/reviews/{review_uuid} | Deletereview |
| [**getReview**](ReviewsApi.md#getReview) | **GET** /products/reviews/types/{entity_type}/entities/{entity_uuid}/reviews/{review_uuid} | Getreview |
| [**searchReviews**](ReviewsApi.md#searchReviews) | **GET** /products/reviews/types/{entity_type}/entities/{entity_uuid} | Searchreview |
| [**updateReview**](ReviewsApi.md#updateReview) | **PUT** /products/reviews/types/{entity_type}/entities/{entity_uuid}/reviews/{review_uuid} | Updatereview |


<a name="createReview"></a>
# **createReview**
> Object createReview(entityType, entityUuid, createReview, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Create

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    String entityType = "entityType_example"; // String | 
    String entityUuid = "entityUuid_example"; // String | 
    CreateReview createReview = new CreateReview(); // CreateReview | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Object result = apiInstance.createReview(entityType, entityUuid, createReview, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#createReview");
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
| **entityType** | **String**|  | |
| **entityUuid** | **String**|  | |
| **createReview** | [**CreateReview**](CreateReview.md)|  | |
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="deleteReview"></a>
# **deleteReview**
> Object deleteReview(entityType, entityUuid, reviewUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Deletereview

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    String entityType = "entityType_example"; // String | 
    String entityUuid = "entityUuid_example"; // String | 
    String reviewUuid = "reviewUuid_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Object result = apiInstance.deleteReview(entityType, entityUuid, reviewUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#deleteReview");
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
| **entityType** | **String**|  | |
| **entityUuid** | **String**|  | |
| **reviewUuid** | **String**|  | |
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
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getReview"></a>
# **getReview**
> Object getReview(entityType, entityUuid, reviewUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Getreview

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    String entityType = "entityType_example"; // String | 
    String entityUuid = "entityUuid_example"; // String | 
    String reviewUuid = "reviewUuid_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Object result = apiInstance.getReview(entityType, entityUuid, reviewUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#getReview");
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
| **entityType** | **String**|  | |
| **entityUuid** | **String**|  | |
| **reviewUuid** | **String**|  | |
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
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="searchReviews"></a>
# **searchReviews**
> Object searchReviews(entityType, entityUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Searchreview

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    String entityType = "entityType_example"; // String | 
    String entityUuid = "entityUuid_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Object result = apiInstance.searchReviews(entityType, entityUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#searchReviews");
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
| **entityType** | **String**|  | |
| **entityUuid** | **String**|  | |
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
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="updateReview"></a>
# **updateReview**
> Object updateReview(entityType, entityUuid, reviewUuid, updateReview, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Updatereview

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    String entityType = "entityType_example"; // String | 
    String entityUuid = "entityUuid_example"; // String | 
    String reviewUuid = "reviewUuid_example"; // String | 
    UpdateReview updateReview = new UpdateReview(); // UpdateReview | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Object result = apiInstance.updateReview(entityType, entityUuid, reviewUuid, updateReview, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#updateReview");
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
| **entityType** | **String**|  | |
| **entityUuid** | **String**|  | |
| **reviewUuid** | **String**|  | |
| **updateReview** | [**UpdateReview**](UpdateReview.md)|  | |
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

