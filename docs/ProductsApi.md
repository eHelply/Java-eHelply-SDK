# ProductsApi

All URIs are relative to *https://api.prod.ehelply.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProduct**](ProductsApi.md#createProduct) | **POST** /products/products | Createproduct |
| [**deleteProduct**](ProductsApi.md#deleteProduct) | **DELETE** /products/products/{product_uuid} | Deleteproduct |
| [**getProduct**](ProductsApi.md#getProduct) | **GET** /products/products/{product_uuid} | Getproduct |
| [**searchProductCatalog**](ProductsApi.md#searchProductCatalog) | **GET** /products/products/{product_uuid}/catalogs | Searchproductcatalog |
| [**searchProducts**](ProductsApi.md#searchProducts) | **GET** /products/products | Searchproducts |
| [**updateProduct**](ProductsApi.md#updateProduct) | **PUT** /products/products/{product_uuid} | Updateproduct |


<a name="createProduct"></a>
# **createProduct**
> ProductReturn createProduct(productBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Createproduct

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    ProductBase productBase = new ProductBase(); // ProductBase | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      ProductReturn result = apiInstance.createProduct(productBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#createProduct");
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
| **productBase** | [**ProductBase**](ProductBase.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**ProductReturn**](ProductReturn.md)

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

<a name="deleteProduct"></a>
# **deleteProduct**
> Boolean deleteProduct(productUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Deleteproduct

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productUuid = "productUuid_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Boolean result = apiInstance.deleteProduct(productUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#deleteProduct");
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
| **productUuid** | **String**|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

**Boolean**

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

<a name="getProduct"></a>
# **getProduct**
> ProductReturn getProduct(productUuid, withAddons, withMeta, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Getproduct

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productUuid = "productUuid_example"; // String | 
    Boolean withAddons = false; // Boolean | 
    Boolean withMeta = false; // Boolean | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      ProductReturn result = apiInstance.getProduct(productUuid, withAddons, withMeta, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProduct");
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
| **productUuid** | **String**|  | |
| **withAddons** | **Boolean**|  | [optional] [default to false] |
| **withMeta** | **Boolean**|  | [optional] [default to false] |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**ProductReturn**](ProductReturn.md)

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

<a name="searchProductCatalog"></a>
# **searchProductCatalog**
> Page searchProductCatalog(productUuid, withMeta, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Searchproductcatalog

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productUuid = "productUuid_example"; // String | 
    Boolean withMeta = false; // Boolean | 
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
      Page result = apiInstance.searchProductCatalog(productUuid, withMeta, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#searchProductCatalog");
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
| **productUuid** | **String**|  | |
| **withMeta** | **Boolean**|  | [optional] [default to false] |
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
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="searchProducts"></a>
# **searchProducts**
> Page searchProducts(withMeta, name, addons, priceMax, priceMin, quantityAvailable, isDeleted, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Searchproducts

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    Boolean withMeta = false; // Boolean | 
    String name = "name_example"; // String | 
    List<String> addons = Arrays.asList(); // List<String> | 
    Integer priceMax = 56; // Integer | 
    Integer priceMin = 56; // Integer | 
    Boolean quantityAvailable = false; // Boolean | 
    Boolean isDeleted = false; // Boolean | 
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
      Page result = apiInstance.searchProducts(withMeta, name, addons, priceMax, priceMin, quantityAvailable, isDeleted, page, pageSize, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#searchProducts");
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
| **withMeta** | **Boolean**|  | [optional] [default to false] |
| **name** | **String**|  | [optional] |
| **addons** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **priceMax** | **Integer**|  | [optional] |
| **priceMin** | **Integer**|  | [optional] |
| **quantityAvailable** | **Boolean**|  | [optional] [default to false] |
| **isDeleted** | **Boolean**|  | [optional] [default to false] |
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
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="updateProduct"></a>
# **updateProduct**
> ProductReturn updateProduct(productUuid, productBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Updateproduct

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productUuid = "productUuid_example"; // String | 
    ProductBase productBase = new ProductBase(); // ProductBase | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      ProductReturn result = apiInstance.updateProduct(productUuid, productBase, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#updateProduct");
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
| **productUuid** | **String**|  | |
| **productBase** | [**ProductBase**](ProductBase.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**ProductReturn**](ProductReturn.md)

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

