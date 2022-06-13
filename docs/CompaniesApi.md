# CompaniesApi

All URIs are relative to *https://api.prod.ehelply.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompanyPlacesCompaniesPost**](CompaniesApi.md#createCompanyPlacesCompaniesPost) | **POST** /places/companies | Create Company |
| [**deletePlacePlacesCompaniesCompanyUuidDelete**](CompaniesApi.md#deletePlacePlacesCompaniesCompanyUuidDelete) | **DELETE** /places/companies/{company_uuid} | Delete Place |
| [**getCompanyPlacesCompaniesCompanyUuidGet**](CompaniesApi.md#getCompanyPlacesCompaniesCompanyUuidGet) | **GET** /places/companies/{company_uuid} | Get Company |
| [**searchCompaniesPlacesCompaniesGet**](CompaniesApi.md#searchCompaniesPlacesCompaniesGet) | **GET** /places/companies | Search Companies |
| [**updateCompanyPlacesCompaniesCompanyUuidPut**](CompaniesApi.md#updateCompanyPlacesCompaniesCompanyUuidPut) | **PUT** /places/companies/{company_uuid} | Update Company |


<a name="createCompanyPlacesCompaniesPost"></a>
# **createCompanyPlacesCompaniesPost**
> CompanyResponse createCompanyPlacesCompaniesPost(companyBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Create Company

Creates a company

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompaniesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    CompaniesApi apiInstance = new CompaniesApi(defaultClient);
    CompanyBase companyBase = new CompanyBase(); // CompanyBase | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      CompanyResponse result = apiInstance.createCompanyPlacesCompaniesPost(companyBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createCompanyPlacesCompaniesPost");
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
| **companyBase** | [**CompanyBase**](CompanyBase.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**CompanyResponse**](CompanyResponse.md)

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

<a name="deletePlacePlacesCompaniesCompanyUuidDelete"></a>
# **deletePlacePlacesCompaniesCompanyUuidDelete**
> Object deletePlacePlacesCompaniesCompanyUuidDelete(companyUuid, softDelete, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Delete Place

Deletes the company with the given ID and returns True if successful

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompaniesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    CompaniesApi apiInstance = new CompaniesApi(defaultClient);
    String companyUuid = "companyUuid_example"; // String | 
    Boolean softDelete = true; // Boolean | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Object result = apiInstance.deletePlacePlacesCompaniesCompanyUuidDelete(companyUuid, softDelete, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#deletePlacePlacesCompaniesCompanyUuidDelete");
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
| **companyUuid** | **String**|  | |
| **softDelete** | **Boolean**|  | [optional] [default to true] |
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

<a name="getCompanyPlacesCompaniesCompanyUuidGet"></a>
# **getCompanyPlacesCompaniesCompanyUuidGet**
> CompanyResponse getCompanyPlacesCompaniesCompanyUuidGet(companyUuid, withMeta, withCatalog, withReviews, withSchedule, withBlog, withTags, withCategories, withPlaces, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Get Company

Gets the company information given the Place ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompaniesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    CompaniesApi apiInstance = new CompaniesApi(defaultClient);
    String companyUuid = "companyUuid_example"; // String | 
    Boolean withMeta = false; // Boolean | 
    Boolean withCatalog = false; // Boolean | 
    Boolean withReviews = false; // Boolean | 
    Boolean withSchedule = false; // Boolean | 
    Boolean withBlog = false; // Boolean | 
    Boolean withTags = false; // Boolean | 
    Boolean withCategories = false; // Boolean | 
    Boolean withPlaces = false; // Boolean | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      CompanyResponse result = apiInstance.getCompanyPlacesCompaniesCompanyUuidGet(companyUuid, withMeta, withCatalog, withReviews, withSchedule, withBlog, withTags, withCategories, withPlaces, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getCompanyPlacesCompaniesCompanyUuidGet");
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
| **companyUuid** | **String**|  | |
| **withMeta** | **Boolean**|  | [optional] [default to false] |
| **withCatalog** | **Boolean**|  | [optional] [default to false] |
| **withReviews** | **Boolean**|  | [optional] [default to false] |
| **withSchedule** | **Boolean**|  | [optional] [default to false] |
| **withBlog** | **Boolean**|  | [optional] [default to false] |
| **withTags** | **Boolean**|  | [optional] [default to false] |
| **withCategories** | **Boolean**|  | [optional] [default to false] |
| **withPlaces** | **Boolean**|  | [optional] [default to false] |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**CompanyResponse**](CompanyResponse.md)

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

<a name="searchCompaniesPlacesCompaniesGet"></a>
# **searchCompaniesPlacesCompaniesGet**
> Page searchCompaniesPlacesCompaniesGet(projectUuid, name, email, isPublic, isDeleted, withPlaces, withMeta, withCatalog, withReviews, withSchedule, withBlog, withTags, withCategories, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Search Companies

Search all companies and returns paginated results with Companies being stored in items field. Can search by &#x60;project_uuid, name, email&#x60; string fields or the &#x60;is_public and is_deleted&#x60; boolean fields. To search with these fields use query params with string values. For sorting fill out \&quot;sort_desc\&quot; field with either true/false and the \&quot;sort_on\&quot; query parameter with column you want to sort on (ex: name). Max pagination items per page is 50. Item return format: &#x60;&#x60;&#x60; {     uuid                                **type:** string     project_uuid                        **type:** string or None      meta_uuid                           **type:** string or None      catalog_data                        **type:** dict or None      review_group_data                   **type:** dict or None      schedule_data                       **type:** dict or None      blog_data                           **type:** dict or None      tags                                **type:** [TagBase] or None      categories                          **type:** [CategoryBase] or None      places                              **type:** PlaceBase or None      created_at                          **type:** string or None      updated_at                          **type:** string or None      deleted_at                          **type:** string or None  } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompaniesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    CompaniesApi apiInstance = new CompaniesApi(defaultClient);
    String projectUuid = "projectUuid_example"; // String | 
    String name = "name_example"; // String | 
    String email = "email_example"; // String | 
    Boolean isPublic = true; // Boolean | 
    Boolean isDeleted = false; // Boolean | 
    Boolean withPlaces = false; // Boolean | 
    Boolean withMeta = false; // Boolean | 
    Boolean withCatalog = false; // Boolean | 
    Boolean withReviews = false; // Boolean | 
    Boolean withSchedule = false; // Boolean | 
    Boolean withBlog = false; // Boolean | 
    Boolean withTags = false; // Boolean | 
    Boolean withCategories = false; // Boolean | 
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
      Page result = apiInstance.searchCompaniesPlacesCompaniesGet(projectUuid, name, email, isPublic, isDeleted, withPlaces, withMeta, withCatalog, withReviews, withSchedule, withBlog, withTags, withCategories, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#searchCompaniesPlacesCompaniesGet");
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
| **email** | **String**|  | [optional] |
| **isPublic** | **Boolean**|  | [optional] [default to true] |
| **isDeleted** | **Boolean**|  | [optional] [default to false] |
| **withPlaces** | **Boolean**|  | [optional] [default to false] |
| **withMeta** | **Boolean**|  | [optional] [default to false] |
| **withCatalog** | **Boolean**|  | [optional] [default to false] |
| **withReviews** | **Boolean**|  | [optional] [default to false] |
| **withSchedule** | **Boolean**|  | [optional] [default to false] |
| **withBlog** | **Boolean**|  | [optional] [default to false] |
| **withTags** | **Boolean**|  | [optional] [default to false] |
| **withCategories** | **Boolean**|  | [optional] [default to false] |
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

<a name="updateCompanyPlacesCompaniesCompanyUuidPut"></a>
# **updateCompanyPlacesCompaniesCompanyUuidPut**
> CompanyResponse updateCompanyPlacesCompaniesCompanyUuidPut(companyUuid, companyBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Update Company

Update company with given info, only updating the fields supplied. Company Uuid must be sent however.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompaniesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    CompaniesApi apiInstance = new CompaniesApi(defaultClient);
    String companyUuid = "companyUuid_example"; // String | 
    CompanyBase companyBase = new CompanyBase(); // CompanyBase | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      CompanyResponse result = apiInstance.updateCompanyPlacesCompaniesCompanyUuidPut(companyUuid, companyBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#updateCompanyPlacesCompaniesCompanyUuidPut");
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
| **companyUuid** | **String**|  | |
| **companyBase** | [**CompanyBase**](CompanyBase.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**CompanyResponse**](CompanyResponse.md)

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

