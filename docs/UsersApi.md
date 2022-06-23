# UsersApi

All URIs are relative to *https://api.prod.ehelply.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirmSignup**](UsersApi.md#confirmSignup) | **POST** /sam/users/auth/signup/confirm | Confirmsignup |
| [**createParticipant**](UsersApi.md#createParticipant) | **POST** /sam/users/participants | Createparticipant |
| [**createUser**](UsersApi.md#createUser) | **POST** /sam/users | Createuser |
| [**deleteParticipant**](UsersApi.md#deleteParticipant) | **DELETE** /sam/users/participants/{participant_id} | Deleteparticipant |
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /sam/users/{user_id} | Deleteuser |
| [**getParticipant**](UsersApi.md#getParticipant) | **GET** /sam/users/participants/{participant_id} | Getparticipant |
| [**getUser**](UsersApi.md#getUser) | **GET** /sam/users/{user_id} | Getuser |
| [**login**](UsersApi.md#login) | **POST** /sam/users/auth/login | Login |
| [**refreshToken**](UsersApi.md#refreshToken) | **POST** /sam/users/auth/{app_client}/refresh-token | Refreshtoken |
| [**resetPassword**](UsersApi.md#resetPassword) | **POST** /sam/users/auth/password/reset | Resetpassword |
| [**resetPasswordConfirmation**](UsersApi.md#resetPasswordConfirmation) | **POST** /sam/users/auth/password/reset/confirm | Resetpasswordconfirmation |
| [**searchParticipants**](UsersApi.md#searchParticipants) | **GET** /sam/users/participants | Searchparticipants |
| [**signup**](UsersApi.md#signup) | **POST** /sam/users/auth/signup | Signup |
| [**updateParticipant**](UsersApi.md#updateParticipant) | **PUT** /sam/users/participants/{participant_id} | Updateparticipant |
| [**updateUser**](UsersApi.md#updateUser) | **PUT** /sam/users/{user_id} | Updateuser |
| [**userValidations**](UsersApi.md#userValidations) | **POST** /sam/users/validations/{field} | Uservalidations |


<a name="confirmSignup"></a>
# **confirmSignup**
> Object confirmSignup(userConfirmation)

Confirmsignup

Validates a user signup with a given confirmation

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UserConfirmation userConfirmation = new UserConfirmation(); // UserConfirmation | 
    try {
      Object result = apiInstance.confirmSignup(userConfirmation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#confirmSignup");
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
| **userConfirmation** | [**UserConfirmation**](UserConfirmation.md)|  | |

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

<a name="createParticipant"></a>
# **createParticipant**
> ParticipantUserReturn createParticipant(participantCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Createparticipant

Creates a participant given the participant info (meta and user_id)

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    ParticipantCreate participantCreate = new ParticipantCreate(); // ParticipantCreate | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      ParticipantUserReturn result = apiInstance.createParticipant(participantCreate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createParticipant");
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
| **participantCreate** | [**ParticipantCreate**](ParticipantCreate.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**ParticipantUserReturn**](ParticipantUserReturn.md)

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

<a name="createUser"></a>
# **createUser**
> UserResponse createUser(authorization)

Createuser

Usually ran after login and will do the following: - If no user exists (AKA signed in with social media) it will create a new user and default participant - If a user exists, sync Cognito data from Cognito to the user - Determine missing fields that SHOULD be filled

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    try {
      UserResponse result = apiInstance.createUser(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUser");
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
| **authorization** | **String**|  | [optional] |

### Return type

[**UserResponse**](UserResponse.md)

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

<a name="deleteParticipant"></a>
# **deleteParticipant**
> Boolean deleteParticipant(participantId, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Deleteparticipant

Delete participants related to the given participant_id, returns True if successful

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String participantId = "participantId_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Boolean result = apiInstance.deleteParticipant(participantId, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteParticipant");
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
| **participantId** | **String**|  | |
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

<a name="deleteUser"></a>
# **deleteUser**
> Boolean deleteUser(userId, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Deleteuser

Soft deletes the user with the provided user id, granted the deleter is the same person or an admin. Returns True if successful

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String userId = "userId_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Boolean result = apiInstance.deleteUser(userId, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteUser");
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
| **userId** | **String**|  | |
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

<a name="getParticipant"></a>
# **getParticipant**
> ParticipantUserReturn getParticipant(participantId, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Getparticipant

Gets a participant given their participant ID

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String participantId = "participantId_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      ParticipantUserReturn result = apiInstance.getParticipant(participantId, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getParticipant");
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
| **participantId** | **String**|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**ParticipantUserReturn**](ParticipantUserReturn.md)

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

<a name="getUser"></a>
# **getUser**
> UserResponse getUser(userId, idType, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Getuser

Gets the user object given user id (uuid) or cognito id (cognito)

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String userId = "userId_example"; // String | 
    String idType = "cognito OR uuid"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      UserResponse result = apiInstance.getUser(userId, idType, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUser");
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
| **userId** | **String**|  | |
| **idType** | **String**|  | [optional] |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**UserResponse**](UserResponse.md)

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

<a name="login"></a>
# **login**
> UserLoginReturn login(userLogin)

Login

Login endpoint, returns tokens. EMAIL NEEDS TO BE VERIFIED (can be done through the email the user received).

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UserLogin userLogin = new UserLogin(); // UserLogin | 
    try {
      UserLoginReturn result = apiInstance.login(userLogin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#login");
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
| **userLogin** | [**UserLogin**](UserLogin.md)|  | |

### Return type

[**UserLoginReturn**](UserLoginReturn.md)

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

<a name="refreshToken"></a>
# **refreshToken**
> UserTokenReturn refreshToken(appClient, body)

Refreshtoken

Refreshes tokens given a refresh token.

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String appClient = "appClient_example"; // String | 
    String body = "body_example"; // String | 
    try {
      UserTokenReturn result = apiInstance.refreshToken(appClient, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#refreshToken");
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
| **appClient** | **String**|  | |
| **body** | **String**|  | |

### Return type

[**UserTokenReturn**](UserTokenReturn.md)

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

<a name="resetPassword"></a>
# **resetPassword**
> Object resetPassword(userPasswordReset)

Resetpassword

Sends the user an email with a confirmation code so they can reset their password

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UserPasswordReset userPasswordReset = new UserPasswordReset(); // UserPasswordReset | 
    try {
      Object result = apiInstance.resetPassword(userPasswordReset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#resetPassword");
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
| **userPasswordReset** | [**UserPasswordReset**](UserPasswordReset.md)|  | |

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

<a name="resetPasswordConfirmation"></a>
# **resetPasswordConfirmation**
> Object resetPasswordConfirmation(userPasswordResetConfirmation)

Resetpasswordconfirmation

Resets the given user&#39;s password to the given password when the proper code is provided

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UserPasswordResetConfirmation userPasswordResetConfirmation = new UserPasswordResetConfirmation(); // UserPasswordResetConfirmation | 
    try {
      Object result = apiInstance.resetPasswordConfirmation(userPasswordResetConfirmation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#resetPasswordConfirmation");
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
| **userPasswordResetConfirmation** | [**UserPasswordResetConfirmation**](UserPasswordResetConfirmation.md)|  | |

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

<a name="searchParticipants"></a>
# **searchParticipants**
> Page searchParticipants(page, pageSize, search, searchOn, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Searchparticipants

Search participants using a user uuid, returns pagination information and list of &#x60;items&#x60; (ParticipantUserReturn from GET Participant). Can search on \&quot;user_uuid\&quot;, and sort on any field. To search enter search value into \&quot;search\&quot; query param and the field into \&quot;search on\&quot; (currently only \&quot;user\&quot;uuid\&quot;). For sorting fill out \&quot;sort_desc\&quot; field with either true/false and the \&quot;sort_on\&quot; query parameter with column you want to sort on (ex: date_created). Max pagination items per page is 50.

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer pageSize = 25; // Integer | 
    String search = "search_example"; // String | 
    String searchOn = "searchOn_example"; // String | 
    String sortOn = "sortOn_example"; // String | 
    Boolean sortDesc = false; // Boolean | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Page result = apiInstance.searchParticipants(page, pageSize, search, searchOn, sortOn, sortDesc, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#searchParticipants");
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
| **page** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 25] |
| **search** | **String**|  | [optional] |
| **searchOn** | **String**|  | [optional] |
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

<a name="signup"></a>
# **signup**
> UserSignupReturn signup(userSignup)

Signup

Signup to eHelply, creates a user and default participant behind the scenes. Does not verify email.

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UserSignup userSignup = new UserSignup(); // UserSignup | 
    try {
      UserSignupReturn result = apiInstance.signup(userSignup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#signup");
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
| **userSignup** | [**UserSignup**](UserSignup.md)|  | |

### Return type

[**UserSignupReturn**](UserSignupReturn.md)

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

<a name="updateParticipant"></a>
# **updateParticipant**
> ParticipantUserReturn updateParticipant(participantId, participantUpdate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Updateparticipant

Update participant data given

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String participantId = "participantId_example"; // String | 
    ParticipantUpdate participantUpdate = new ParticipantUpdate(); // ParticipantUpdate | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      ParticipantUserReturn result = apiInstance.updateParticipant(participantId, participantUpdate, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateParticipant");
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
| **participantId** | **String**|  | |
| **participantUpdate** | [**ParticipantUpdate**](ParticipantUpdate.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**ParticipantUserReturn**](ParticipantUserReturn.md)

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

<a name="updateUser"></a>
# **updateUser**
> UserResponse updateUser(userId, user, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Updateuser

Update the given user and sync the cognito data

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String userId = "userId_example"; // String | 
    User user = new User(); // User | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      UserResponse result = apiInstance.updateUser(userId, user, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUser");
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
| **userId** | **String**|  | |
| **user** | [**User**](User.md)|  | |
| **xAccessToken** | **String**|  | [optional] |
| **xSecretToken** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **ehelplyActiveParticipant** | **String**|  | [optional] |
| **ehelplyProject** | **String**|  | [optional] |
| **ehelplyData** | **String**|  | [optional] |

### Return type

[**UserResponse**](UserResponse.md)

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

<a name="userValidations"></a>
# **userValidations**
> Boolean userValidations(field, userValidations, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData)

Uservalidations

Validates a certain field.

### Example
```java
// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String field = "email"; // String | 
    UserValidations userValidations = new UserValidations(); // UserValidations | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Boolean result = apiInstance.userValidations(field, userValidations, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#userValidations");
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
| **field** | **String**|  | |
| **userValidations** | [**UserValidations**](UserValidations.md)|  | |
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Not found |  -  |
| **422** | Validation Error |  -  |

