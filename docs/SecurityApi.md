# SecurityApi

All URIs are relative to *https://api.prod.ehelply.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEncryptionKey**](SecurityApi.md#createEncryptionKey) | **POST** /sam/security/encryption/categories/{category}/keys | Createencryptionkey |
| [**createKey**](SecurityApi.md#createKey) | **POST** /sam/security/keys | Createkey |
| [**deleteKey**](SecurityApi.md#deleteKey) | **DELETE** /sam/security/keys/{key_uuid} | Deletekey |
| [**generateToken**](SecurityApi.md#generateToken) | **POST** /sam/security/tokens | Generatetoken |
| [**getEncryptionKey**](SecurityApi.md#getEncryptionKey) | **GET** /sam/security/encryption/categories/{category}/keys | Getencryptionkey |
| [**getKey**](SecurityApi.md#getKey) | **GET** /sam/security/keys/{key_uuid} | Getkey |
| [**searchKeys**](SecurityApi.md#searchKeys) | **GET** /sam/security/keys | Searchkeys |
| [**verifyKey**](SecurityApi.md#verifyKey) | **POST** /sam/security/keys/verify | Verifykey |


<a name="createEncryptionKey"></a>
# **createEncryptionKey**
> SecurityEncryptionKeyResponse createEncryptionKey(category, ehelplySecuritySecretKey)

Createencryptionkey

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String category = "category_example"; // String | 
    String ehelplySecuritySecretKey = "ehelplySecuritySecretKey_example"; // String | 
    try {
      SecurityEncryptionKeyResponse result = apiInstance.createEncryptionKey(category, ehelplySecuritySecretKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#createEncryptionKey");
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
| **category** | **String**|  | |
| **ehelplySecuritySecretKey** | **String**|  | [optional] |

### Return type

[**SecurityEncryptionKeyResponse**](SecurityEncryptionKeyResponse.md)

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

<a name="createKey"></a>
# **createKey**
> ResponseCreatekey createKey(securityKeyCreate, accessLength, secretLength)

Createkey

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    SecurityKeyCreate securityKeyCreate = new SecurityKeyCreate(); // SecurityKeyCreate | 
    Integer accessLength = 64; // Integer | 
    Integer secretLength = 64; // Integer | 
    try {
      ResponseCreatekey result = apiInstance.createKey(securityKeyCreate, accessLength, secretLength);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#createKey");
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
| **securityKeyCreate** | [**SecurityKeyCreate**](SecurityKeyCreate.md)|  | |
| **accessLength** | **Integer**|  | [optional] [default to 64] |
| **secretLength** | **Integer**|  | [optional] [default to 64] |

### Return type

[**ResponseCreatekey**](ResponseCreatekey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Access token and secret token lengths must be greater than 48 characters and less than 1024 characters to guarantee adequate security.  |  -  |
| **403** | Unauthorized - Denied by eHelply |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="deleteKey"></a>
# **deleteKey**
> ResponseDeletekey deleteKey(keyUuid)

Deletekey

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String keyUuid = "keyUuid_example"; // String | 
    try {
      ResponseDeletekey result = apiInstance.deleteKey(keyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#deleteKey");
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
| **keyUuid** | **String**|  | |

### Return type

[**ResponseDeletekey**](ResponseDeletekey.md)

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

<a name="generateToken"></a>
# **generateToken**
> ResponseGeneratetoken generateToken(securityCreateToken)

Generatetoken

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    SecurityCreateToken securityCreateToken = new SecurityCreateToken(); // SecurityCreateToken | 
    try {
      ResponseGeneratetoken result = apiInstance.generateToken(securityCreateToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#generateToken");
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
| **securityCreateToken** | [**SecurityCreateToken**](SecurityCreateToken.md)|  | |

### Return type

[**ResponseGeneratetoken**](ResponseGeneratetoken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Unauthorized - Denied by eHelply |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

<a name="getEncryptionKey"></a>
# **getEncryptionKey**
> List&lt;SecurityEncryptionKeyGet&gt; getEncryptionKey(category, ehelplySecuritySecretKey)

Getencryptionkey

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String category = "category_example"; // String | 
    String ehelplySecuritySecretKey = "ehelplySecuritySecretKey_example"; // String | 
    try {
      List<SecurityEncryptionKeyGet> result = apiInstance.getEncryptionKey(category, ehelplySecuritySecretKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getEncryptionKey");
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
| **category** | **String**|  | |
| **ehelplySecuritySecretKey** | **String**|  | [optional] |

### Return type

[**List&lt;SecurityEncryptionKeyGet&gt;**](SecurityEncryptionKeyGet.md)

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

<a name="getKey"></a>
# **getKey**
> SecurityKeyGet getKey(keyUuid)

Getkey

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String keyUuid = "keyUuid_example"; // String | 
    try {
      SecurityKeyGet result = apiInstance.getKey(keyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getKey");
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
| **keyUuid** | **String**|  | |

### Return type

[**SecurityKeyGet**](SecurityKeyGet.md)

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
| **404** | Key does not exist |  -  |
| **422** | Validation Error |  -  |

<a name="searchKeys"></a>
# **searchKeys**
> List&lt;SecurityKeyGet&gt; searchKeys()

Searchkeys

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    try {
      List<SecurityKeyGet> result = apiInstance.searchKeys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#searchKeys");
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

[**List&lt;SecurityKeyGet&gt;**](SecurityKeyGet.md)

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

<a name="verifyKey"></a>
# **verifyKey**
> SecurityKeyGet verifyKey(securityKeyVerify)

Verifykey

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    SecurityKeyVerify securityKeyVerify = new SecurityKeyVerify(); // SecurityKeyVerify | 
    try {
      SecurityKeyGet result = apiInstance.verifyKey(securityKeyVerify);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#verifyKey");
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
| **securityKeyVerify** | [**SecurityKeyVerify**](SecurityKeyVerify.md)|  | |

### Return type

[**SecurityKeyGet**](SecurityKeyGet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Access token and secret token lengths must be greater than 48 characters and less than 1024 characters to guarantee adequate security.  |  -  |
| **403** | Key |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

