# PlacesApi

All URIs are relative to *https://api.prod.ehelply.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**advancedSearchPlaces**](PlacesApi.md#advancedSearchPlaces) | **GET** /places/search/places/string | Advancedsearchplaces |
| [**createPlacePlacesPlacesPost**](PlacesApi.md#createPlacePlacesPlacesPost) | **POST** /places/places | Create Place |
| [**deletePlace**](PlacesApi.md#deletePlace) | **DELETE** /places/places/{place_uuid} | Deleteplace |
| [**forwardGeocodingPlacesGeocodingForwardGet**](PlacesApi.md#forwardGeocodingPlacesGeocodingForwardGet) | **GET** /places/geocoding/forward | Forward Geocoding |
| [**getPlace**](PlacesApi.md#getPlace) | **GET** /places/places/{place_uuid} | Getplace |
| [**reverseGeocodingPlacesGeocodingReverseGet**](PlacesApi.md#reverseGeocodingPlacesGeocodingReverseGet) | **GET** /places/geocoding/reverse | Reverse Geocoding |
| [**searchPlaces**](PlacesApi.md#searchPlaces) | **GET** /places/places | Searchplaces |
| [**updatePlace**](PlacesApi.md#updatePlace) | **PUT** /places/places/{place_uuid} | Updateplace |


<a name="advancedSearchPlaces"></a>
# **advancedSearchPlaces**
> Page advancedSearchPlaces(searchString, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Advancedsearchplaces

Search places by a search string

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.PlacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    PlacesApi apiInstance = new PlacesApi(defaultClient);
    String searchString = ""; // String | 
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
      Page result = apiInstance.advancedSearchPlaces(searchString, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesApi#advancedSearchPlaces");
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
| **searchString** | **String**|  | [optional] [default to ] |
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

<a name="createPlacePlacesPlacesPost"></a>
# **createPlacePlacesPlacesPost**
> PlaceResponse createPlacePlacesPlacesPost(placeBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Create Place

Creates a Place.

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.PlacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    PlacesApi apiInstance = new PlacesApi(defaultClient);
    PlaceBase placeBase = new PlaceBase(); // PlaceBase | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      PlaceResponse result = apiInstance.createPlacePlacesPlacesPost(placeBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesApi#createPlacePlacesPlacesPost");
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
| **placeBase** | [**PlaceBase**](PlaceBase.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**PlaceResponse**](PlaceResponse.md)

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

<a name="deletePlace"></a>
# **deletePlace**
> Object deletePlace(placeUuid, softDelete, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Deleteplace

Deletes the place with the given ID and returns True if successful

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.PlacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    PlacesApi apiInstance = new PlacesApi(defaultClient);
    String placeUuid = "placeUuid_example"; // String | 
    Boolean softDelete = true; // Boolean | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Object result = apiInstance.deletePlace(placeUuid, softDelete, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesApi#deletePlace");
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
| **placeUuid** | **String**|  | |
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

<a name="forwardGeocodingPlacesGeocodingForwardGet"></a>
# **forwardGeocodingPlacesGeocodingForwardGet**
> Object forwardGeocodingPlacesGeocodingForwardGet(searchingPlace, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Forward Geocoding

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.PlacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    PlacesApi apiInstance = new PlacesApi(defaultClient);
    String searchingPlace = "searchingPlace_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Object result = apiInstance.forwardGeocodingPlacesGeocodingForwardGet(searchingPlace, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesApi#forwardGeocodingPlacesGeocodingForwardGet");
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
| **searchingPlace** | **String**|  | |
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

<a name="getPlace"></a>
# **getPlace**
> PlaceResponse getPlace(placeUuid, withMeta, withCatalog, withReviews, withSchedule, withCollection, withBlog, withTags, withCategories, withCompany, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Getplace

Gets the place information given the Place ID

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.PlacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    PlacesApi apiInstance = new PlacesApi(defaultClient);
    String placeUuid = "placeUuid_example"; // String | 
    Boolean withMeta = false; // Boolean | 
    Boolean withCatalog = false; // Boolean | 
    Boolean withReviews = false; // Boolean | 
    Boolean withSchedule = false; // Boolean | 
    Boolean withCollection = false; // Boolean | 
    Boolean withBlog = false; // Boolean | 
    Boolean withTags = false; // Boolean | 
    Boolean withCategories = false; // Boolean | 
    Boolean withCompany = false; // Boolean | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      PlaceResponse result = apiInstance.getPlace(placeUuid, withMeta, withCatalog, withReviews, withSchedule, withCollection, withBlog, withTags, withCategories, withCompany, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesApi#getPlace");
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
| **placeUuid** | **String**|  | |
| **withMeta** | **Boolean**|  | [optional] [default to false] |
| **withCatalog** | **Boolean**|  | [optional] [default to false] |
| **withReviews** | **Boolean**|  | [optional] [default to false] |
| **withSchedule** | **Boolean**|  | [optional] [default to false] |
| **withCollection** | **Boolean**|  | [optional] [default to false] |
| **withBlog** | **Boolean**|  | [optional] [default to false] |
| **withTags** | **Boolean**|  | [optional] [default to false] |
| **withCategories** | **Boolean**|  | [optional] [default to false] |
| **withCompany** | **Boolean**|  | [optional] [default to false] |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**PlaceResponse**](PlaceResponse.md)

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

<a name="reverseGeocodingPlacesGeocodingReverseGet"></a>
# **reverseGeocodingPlacesGeocodingReverseGet**
> Object reverseGeocodingPlacesGeocodingReverseGet(_long, lat, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Reverse Geocoding

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.PlacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    PlacesApi apiInstance = new PlacesApi(defaultClient);
    BigDecimal _long = new BigDecimal(78); // BigDecimal | 
    BigDecimal lat = new BigDecimal(78); // BigDecimal | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Object result = apiInstance.reverseGeocodingPlacesGeocodingReverseGet(_long, lat, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesApi#reverseGeocodingPlacesGeocodingReverseGet");
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
| **_long** | **BigDecimal**|  | |
| **lat** | **BigDecimal**|  | |
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

<a name="searchPlaces"></a>
# **searchPlaces**
> Page searchPlaces(projectUuid, name, addressLine1, addressLine2, city, provinceState, country, postalZipCode, lat, lng, email, isPublic, isDeleted, withCompany, withMeta, withCatalog, withReviews, withSchedule, withCollection, withBlog, withTags, withCategories, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Searchplaces

Search all places and returns paginated results with Places being stored in items field. Can search by &#x60;project_uuid, name, address, address_line_2, city, province_state, country, postal_zip_code, lat, lng email&#x60; string fields or the &#x60;is_public and is_deleted&#x60; boolean fields. To search with these fields use query params with string values. For sorting fill out \&quot;sort_desc\&quot; field with either true/false and the \&quot;sort_on\&quot; query parameter with column you want to sort on (ex: name). Max pagination items per page is 50. Item return format: &#x60;&#x60;&#x60; {     uuid                                **type:** string     project_uuid                        **type:** string or None      meta_uuid                           **type:** string or None      catalog_data                        **type:** dict or None      review_group_data                   **type:** dict or None      schedule_data                       **type:** dict or None      collection_data                     **type:** dict or None      blog_data                           **type:** dict or None      tags                                **type:** [TagBase] or None      categories                          **type:** [CategoryBase] or None      company                             **type:** CompanyBase or None      created_at                          **type:** string or None      updated_at                          **type:** string or None      deleted_at                          **type:** string or None  } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.PlacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    PlacesApi apiInstance = new PlacesApi(defaultClient);
    String projectUuid = "projectUuid_example"; // String | 
    String name = "name_example"; // String | 
    String addressLine1 = "addressLine1_example"; // String | 
    String addressLine2 = "addressLine2_example"; // String | 
    String city = "city_example"; // String | 
    String provinceState = "provinceState_example"; // String | 
    String country = "country_example"; // String | 
    String postalZipCode = "postalZipCode_example"; // String | 
    String lat = "lat_example"; // String | 
    String lng = "lng_example"; // String | 
    String email = "email_example"; // String | 
    Boolean isPublic = true; // Boolean | 
    Boolean isDeleted = false; // Boolean | 
    Boolean withCompany = false; // Boolean | 
    Boolean withMeta = false; // Boolean | 
    Boolean withCatalog = false; // Boolean | 
    Boolean withReviews = false; // Boolean | 
    Boolean withSchedule = false; // Boolean | 
    Boolean withCollection = false; // Boolean | 
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
      Page result = apiInstance.searchPlaces(projectUuid, name, addressLine1, addressLine2, city, provinceState, country, postalZipCode, lat, lng, email, isPublic, isDeleted, withCompany, withMeta, withCatalog, withReviews, withSchedule, withCollection, withBlog, withTags, withCategories, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesApi#searchPlaces");
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
| **addressLine1** | **String**|  | [optional] |
| **addressLine2** | **String**|  | [optional] |
| **city** | **String**|  | [optional] |
| **provinceState** | **String**|  | [optional] |
| **country** | **String**|  | [optional] |
| **postalZipCode** | **String**|  | [optional] |
| **lat** | **String**|  | [optional] |
| **lng** | **String**|  | [optional] |
| **email** | **String**|  | [optional] |
| **isPublic** | **Boolean**|  | [optional] [default to true] |
| **isDeleted** | **Boolean**|  | [optional] [default to false] |
| **withCompany** | **Boolean**|  | [optional] [default to false] |
| **withMeta** | **Boolean**|  | [optional] [default to false] |
| **withCatalog** | **Boolean**|  | [optional] [default to false] |
| **withReviews** | **Boolean**|  | [optional] [default to false] |
| **withSchedule** | **Boolean**|  | [optional] [default to false] |
| **withCollection** | **Boolean**|  | [optional] [default to false] |
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

<a name="updatePlace"></a>
# **updatePlace**
> PlaceResponse updatePlace(placeUuid, placeBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Updateplace

Update Place with given info, only updating the fields supplied. Place Uuid must be sent however.

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.PlacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    PlacesApi apiInstance = new PlacesApi(defaultClient);
    String placeUuid = "placeUuid_example"; // String | 
    PlaceBase placeBase = new PlaceBase(); // PlaceBase | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      PlaceResponse result = apiInstance.updatePlace(placeUuid, placeBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacesApi#updatePlace");
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
| **placeUuid** | **String**|  | |
| **placeBase** | [**PlaceBase**](PlaceBase.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**PlaceResponse**](PlaceResponse.md)

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

