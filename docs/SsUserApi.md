# SsUserApi

All URIs are relative to *https://api.saas4saas.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountAdd**](SsUserApi.md#accountAdd) | **POST** /s4s-user/account | 
[**accountAutoLogin**](SsUserApi.md#accountAutoLogin) | **GET** /s4s-user/account/autoLogin | 
[**accountChangePasswordPatch**](SsUserApi.md#accountChangePasswordPatch) | **PATCH** /s4s-user/account/changePassword | 
[**accountGetAll**](SsUserApi.md#accountGetAll) | **GET** /s4s-user/account | 
[**accountIdGet**](SsUserApi.md#accountIdGet) | **GET** /s4s-user/account/{account-id} | 
[**accountIdKeysAdd**](SsUserApi.md#accountIdKeysAdd) | **POST** /s4s-user/account/{account-id}/keys | 
[**accountIdKeysDel**](SsUserApi.md#accountIdKeysDel) | **DELETE** /s4s-user/account/{account-id}/keys/{user-id} | 
[**accountIdKeysGetAll**](SsUserApi.md#accountIdKeysGetAll) | **GET** /s4s-user/account/{account-id}/keys | 
[**accountIdPrivateDataPut**](SsUserApi.md#accountIdPrivateDataPut) | **PUT** /s4s-user/account/{account-id}/privateData | 
[**accountIdPut**](SsUserApi.md#accountIdPut) | **PUT** /s4s-user/account/{account-id} | 
[**accountIdStatusPut**](SsUserApi.md#accountIdStatusPut) | **PUT** /s4s-user/account/{account-id}/status | 
[**accountIdUserAdd**](SsUserApi.md#accountIdUserAdd) | **POST** /s4s-user/account/{account-id}/user | 
[**accountIdUserChangePwdToken**](SsUserApi.md#accountIdUserChangePwdToken) | **GET** /s4s-user/account/{account-id}/user/{user-id}/changePwdToken | 
[**accountIdUserGet**](SsUserApi.md#accountIdUserGet) | **GET** /s4s-user/account/{account-id}/user/{user-id} | 
[**accountIdUserLogin**](SsUserApi.md#accountIdUserLogin) | **GET** /s4s-user/account/{account-id}/user/{user-id}/login | 
[**accountIdUserPut**](SsUserApi.md#accountIdUserPut) | **PUT** /s4s-user/account/{account-id}/user/{user-id} | 
[**accountIdUserResendEmailConfirmation**](SsUserApi.md#accountIdUserResendEmailConfirmation) | **GET** /s4s-user/account/{account-id}/user/{user-id}/resendEmailConfirmation | 
[**accountLogin**](SsUserApi.md#accountLogin) | **POST** /s4s-user/account/login | 
[**accountLoginOrAdd**](SsUserApi.md#accountLoginOrAdd) | **POST** /s4s-user/account/loginOr | 
[**accountRecover**](SsUserApi.md#accountRecover) | **POST** /s4s-user/account/recover | 
[**accountUserChangePwdToken**](SsUserApi.md#accountUserChangePwdToken) | **GET** /s4s-user/account/user/{user-id}/changePwdToken | 
[**accountUserGet**](SsUserApi.md#accountUserGet) | **GET** /s4s-user/account/user/{user-id} | 
[**accountUserLogin**](SsUserApi.md#accountUserLogin) | **GET** /s4s-user/account/user/{user-id}/login | 
[**accountUserPut**](SsUserApi.md#accountUserPut) | **PUT** /s4s-user/account/user/{user-id} | 
[**accountUserResendEmailConfirmation**](SsUserApi.md#accountUserResendEmailConfirmation) | **GET** /s4s-user/account/user/{user-id}/resendEmailConfirmation | 
[**accountUsernameChangePwdToken**](SsUserApi.md#accountUsernameChangePwdToken) | **GET** /s4s-user/account/username/changePwdToken | 
[**accountUsernameGet**](SsUserApi.md#accountUsernameGet) | **GET** /s4s-user/account/username | 
[**accountUsernameLogin**](SsUserApi.md#accountUsernameLogin) | **GET** /s4s-user/account/username/login | 
[**accountUsernamePut**](SsUserApi.md#accountUsernamePut) | **PUT** /s4s-user/account/username | 
[**accountUsernameResendEmailConfirmation**](SsUserApi.md#accountUsernameResendEmailConfirmation) | **GET** /s4s-user/account/username/resendEmailConfirmation | 
[**authenticate**](SsUserApi.md#authenticate) | **GET** /s4s-user/authenticate | 
[**config**](SsUserApi.md#config) | **GET** /s4s-user/config | 
[**googleLogin**](SsUserApi.md#googleLogin) | **POST** /s4s-user/googleLogin | 
[**htmlConf**](SsUserApi.md#htmlConf) | **GET** /s4s-user/htmlConf | 
[**selfAccountGet**](SsUserApi.md#selfAccountGet) | **GET** /s4s-user/selfAccount | 
[**selfAccountKeysAdd**](SsUserApi.md#selfAccountKeysAdd) | **POST** /s4s-user/selfAccount/keys | 
[**selfAccountKeysDel**](SsUserApi.md#selfAccountKeysDel) | **DELETE** /s4s-user/selfAccount/keys/{user-id} | 
[**selfAccountKeysGetAll**](SsUserApi.md#selfAccountKeysGetAll) | **GET** /s4s-user/selfAccount/keys | 
[**selfAccountPrivateDataPut**](SsUserApi.md#selfAccountPrivateDataPut) | **PUT** /s4s-user/selfAccount/privateData | 
[**selfAccountPut**](SsUserApi.md#selfAccountPut) | **PUT** /s4s-user/selfAccount | 
[**selfAccountStatusPut**](SsUserApi.md#selfAccountStatusPut) | **PUT** /s4s-user/selfAccount/status | 
[**selfAccountUserAdd**](SsUserApi.md#selfAccountUserAdd) | **POST** /s4s-user/selfAccount/user | 
[**selfAccountUserChangePwdToken**](SsUserApi.md#selfAccountUserChangePwdToken) | **GET** /s4s-user/selfAccount/user/{user-id}/changePwdToken | 
[**selfAccountUserGet**](SsUserApi.md#selfAccountUserGet) | **GET** /s4s-user/selfAccount/user/{user-id} | 
[**selfAccountUserLogin**](SsUserApi.md#selfAccountUserLogin) | **GET** /s4s-user/selfAccount/user/{user-id}/login | 
[**selfAccountUserPut**](SsUserApi.md#selfAccountUserPut) | **PUT** /s4s-user/selfAccount/user/{user-id} | 
[**selfAccountUserResendEmailConfirmation**](SsUserApi.md#selfAccountUserResendEmailConfirmation) | **GET** /s4s-user/selfAccount/user/{user-id}/resendEmailConfirmation | 
[**selfUserChangePwdToken**](SsUserApi.md#selfUserChangePwdToken) | **GET** /s4s-user/selfUser/changePwdToken | 
[**selfUserGet**](SsUserApi.md#selfUserGet) | **GET** /s4s-user/selfUser | 
[**selfUserLogin**](SsUserApi.md#selfUserLogin) | **GET** /s4s-user/selfUser/login | 
[**selfUserPut**](SsUserApi.md#selfUserPut) | **PUT** /s4s-user/selfUser | 
[**selfUserResendEmailConfirmation**](SsUserApi.md#selfUserResendEmailConfirmation) | **GET** /s4s-user/selfUser/resendEmailConfirmation | 
[**userConfigGet**](SsUserApi.md#userConfigGet) | **GET** /s4s-user/userConfig | 
[**userConfigPut**](SsUserApi.md#userConfigPut) | **PUT** /s4s-user/userConfig | 
[**userUiConfigGet**](SsUserApi.md#userUiConfigGet) | **GET** /s4s-user/userUiConfig | 
[**userUiConfigPut**](SsUserApi.md#userUiConfigPut) | **PUT** /s4s-user/userUiConfig | 


<a name="accountAdd"></a>
# **accountAdd**
> Account accountAdd(newAccount)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
Account newAccount = new Account(); // Account | 
try {
    Account result = apiInstance.accountAdd(newAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newAccount** | [**Account**](Account.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountAutoLogin"></a>
# **accountAutoLogin**
> Session accountAutoLogin(rememberMeToken)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String rememberMeToken = "rememberMeToken_example"; // String | 
try {
    Session result = apiInstance.accountAutoLogin(rememberMeToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountAutoLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rememberMeToken** | **String**|  |

### Return type

[**Session**](Session.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountChangePasswordPatch"></a>
# **accountChangePasswordPatch**
> String accountChangePasswordPatch(changePwdToken, recover)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String changePwdToken = "changePwdToken_example"; // String | 
EmailRecover recover = new EmailRecover(); // EmailRecover | 
try {
    String result = apiInstance.accountChangePasswordPatch(changePwdToken, recover);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountChangePasswordPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changePwdToken** | **String**|  |
 **recover** | [**EmailRecover**](EmailRecover.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountGetAll"></a>
# **accountGetAll**
> accountGetAll(page, numberPerPage, loadDefaultUser)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
Boolean loadDefaultUser = true; // Boolean | 
try {
    apiInstance.accountGetAll(page, numberPerPage, loadDefaultUser);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  |
 **numberPerPage** | **Integer**|  |
 **loadDefaultUser** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdGet"></a>
# **accountIdGet**
> Account accountIdGet(accountId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
try {
    Account result = apiInstance.accountIdGet(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |

### Return type

[**Account**](Account.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdKeysAdd"></a>
# **accountIdKeysAdd**
> UserApi accountIdKeysAdd(accountId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
try {
    UserApi result = apiInstance.accountIdKeysAdd(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdKeysAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |

### Return type

[**UserApi**](UserApi.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdKeysDel"></a>
# **accountIdKeysDel**
> String accountIdKeysDel(accountId, userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
String userId = "userId_example"; // String | 
try {
    String result = apiInstance.accountIdKeysDel(accountId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdKeysDel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **userId** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdKeysGetAll"></a>
# **accountIdKeysGetAll**
> accountIdKeysGetAll(accountId, page, numberPerPage)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
try {
    apiInstance.accountIdKeysGetAll(accountId, page, numberPerPage);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdKeysGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **page** | **Integer**|  |
 **numberPerPage** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdPrivateDataPut"></a>
# **accountIdPrivateDataPut**
> String accountIdPrivateDataPut(accountId, privateData)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
Object privateData = null; // Object | 
try {
    String result = apiInstance.accountIdPrivateDataPut(accountId, privateData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdPrivateDataPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **privateData** | **Object**|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdPut"></a>
# **accountIdPut**
> Account accountIdPut(accountId, newAccount)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
Account newAccount = new Account(); // Account | 
try {
    Account result = apiInstance.accountIdPut(accountId, newAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **newAccount** | [**Account**](Account.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdStatusPut"></a>
# **accountIdStatusPut**
> String accountIdStatusPut(accountId, status)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
String status = "status_example"; // String | 
try {
    String result = apiInstance.accountIdStatusPut(accountId, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdStatusPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **status** | **String**|  | [enum: WaitingAprove, Approved]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdUserAdd"></a>
# **accountIdUserAdd**
> User accountIdUserAdd(accountId, user)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
User user = new User(); // User | 
try {
    User result = apiInstance.accountIdUserAdd(accountId, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdUserAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdUserChangePwdToken"></a>
# **accountIdUserChangePwdToken**
> String accountIdUserChangePwdToken(accountId, userId, currentPwd)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
String userId = "userId_example"; // String | 
String currentPwd = "currentPwd_example"; // String | 
try {
    String result = apiInstance.accountIdUserChangePwdToken(accountId, userId, currentPwd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdUserChangePwdToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **userId** | **String**|  |
 **currentPwd** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdUserGet"></a>
# **accountIdUserGet**
> User accountIdUserGet(accountId, userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
String userId = "userId_example"; // String | 
try {
    User result = apiInstance.accountIdUserGet(accountId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdUserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **userId** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdUserLogin"></a>
# **accountIdUserLogin**
> Session accountIdUserLogin(accountId, userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
String userId = "userId_example"; // String | 
try {
    Session result = apiInstance.accountIdUserLogin(accountId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdUserLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **userId** | **String**|  |

### Return type

[**Session**](Session.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdUserPut"></a>
# **accountIdUserPut**
> User accountIdUserPut(accountId, userId, user)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
String userId = "userId_example"; // String | 
User user = new User(); // User | 
try {
    User result = apiInstance.accountIdUserPut(accountId, userId, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdUserPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **userId** | **String**|  |
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountIdUserResendEmailConfirmation"></a>
# **accountIdUserResendEmailConfirmation**
> String accountIdUserResendEmailConfirmation(accountId, userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String accountId = "accountId_example"; // String | 
String userId = "userId_example"; // String | 
try {
    String result = apiInstance.accountIdUserResendEmailConfirmation(accountId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountIdUserResendEmailConfirmation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **userId** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountLogin"></a>
# **accountLogin**
> Session accountLogin(login)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
Login login = new Login(); // Login | 
try {
    Session result = apiInstance.accountLogin(login);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | [**Login**](Login.md)|  | [optional]

### Return type

[**Session**](Session.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountLoginOrAdd"></a>
# **accountLoginOrAdd**
> Session accountLoginOrAdd(account)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
Account account = new Account(); // Account | 
try {
    Session result = apiInstance.accountLoginOrAdd(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountLoginOrAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**Account**](Account.md)|  | [optional]

### Return type

[**Session**](Session.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountRecover"></a>
# **accountRecover**
> String accountRecover(recover)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
EmailRecover recover = new EmailRecover(); // EmailRecover | 
try {
    String result = apiInstance.accountRecover(recover);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountRecover");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recover** | [**EmailRecover**](EmailRecover.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUserChangePwdToken"></a>
# **accountUserChangePwdToken**
> String accountUserChangePwdToken(userId, currentPwd)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
String currentPwd = "currentPwd_example"; // String | 
try {
    String result = apiInstance.accountUserChangePwdToken(userId, currentPwd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountUserChangePwdToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **currentPwd** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUserGet"></a>
# **accountUserGet**
> User accountUserGet(userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
try {
    User result = apiInstance.accountUserGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountUserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUserLogin"></a>
# **accountUserLogin**
> Session accountUserLogin(userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
try {
    Session result = apiInstance.accountUserLogin(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountUserLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**Session**](Session.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUserPut"></a>
# **accountUserPut**
> User accountUserPut(userId, user)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
User user = new User(); // User | 
try {
    User result = apiInstance.accountUserPut(userId, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountUserPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUserResendEmailConfirmation"></a>
# **accountUserResendEmailConfirmation**
> String accountUserResendEmailConfirmation(userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
try {
    String result = apiInstance.accountUserResendEmailConfirmation(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountUserResendEmailConfirmation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUsernameChangePwdToken"></a>
# **accountUsernameChangePwdToken**
> String accountUsernameChangePwdToken(usr, currentPwd)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String usr = "usr_example"; // String | 
String currentPwd = "currentPwd_example"; // String | 
try {
    String result = apiInstance.accountUsernameChangePwdToken(usr, currentPwd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountUsernameChangePwdToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usr** | **String**|  |
 **currentPwd** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUsernameGet"></a>
# **accountUsernameGet**
> User accountUsernameGet(usr)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String usr = "usr_example"; // String | 
try {
    User result = apiInstance.accountUsernameGet(usr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountUsernameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usr** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUsernameLogin"></a>
# **accountUsernameLogin**
> Session accountUsernameLogin(usr)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String usr = "usr_example"; // String | 
try {
    Session result = apiInstance.accountUsernameLogin(usr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountUsernameLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usr** | **String**|  |

### Return type

[**Session**](Session.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUsernamePut"></a>
# **accountUsernamePut**
> User accountUsernamePut(usr, user)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String usr = "usr_example"; // String | 
User user = new User(); // User | 
try {
    User result = apiInstance.accountUsernamePut(usr, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountUsernamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usr** | **String**|  |
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountUsernameResendEmailConfirmation"></a>
# **accountUsernameResendEmailConfirmation**
> String accountUsernameResendEmailConfirmation(usr)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String usr = "usr_example"; // String | 
try {
    String result = apiInstance.accountUsernameResendEmailConfirmation(usr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#accountUsernameResendEmailConfirmation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usr** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authenticate"></a>
# **authenticate**
> UtUser authenticate(authtoken)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String authtoken = "authtoken_example"; // String | 
try {
    UtUser result = apiInstance.authenticate(authtoken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#authenticate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authtoken** | **String**|  |

### Return type

[**UtUser**](UtUser.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="config"></a>
# **config**
> UserConfig config()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
try {
    UserConfig result = apiInstance.config();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#config");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserConfig**](UserConfig.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="googleLogin"></a>
# **googleLogin**
> Session googleLogin(google)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
GoogleAuth google = new GoogleAuth(); // GoogleAuth | 
try {
    Session result = apiInstance.googleLogin(google);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#googleLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **google** | [**GoogleAuth**](GoogleAuth.md)|  | [optional]

### Return type

[**Session**](Session.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="htmlConf"></a>
# **htmlConf**
> UserUiConf htmlConf()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
try {
    UserUiConf result = apiInstance.htmlConf();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#htmlConf");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserUiConf**](UserUiConf.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountGet"></a>
# **selfAccountGet**
> Account selfAccountGet()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
try {
    Account result = apiInstance.selfAccountGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Account**](Account.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountKeysAdd"></a>
# **selfAccountKeysAdd**
> UserApi selfAccountKeysAdd()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
try {
    UserApi result = apiInstance.selfAccountKeysAdd();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountKeysAdd");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserApi**](UserApi.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountKeysDel"></a>
# **selfAccountKeysDel**
> String selfAccountKeysDel(userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
try {
    String result = apiInstance.selfAccountKeysDel(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountKeysDel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountKeysGetAll"></a>
# **selfAccountKeysGetAll**
> selfAccountKeysGetAll(page, numberPerPage)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
try {
    apiInstance.selfAccountKeysGetAll(page, numberPerPage);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountKeysGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  |
 **numberPerPage** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountPrivateDataPut"></a>
# **selfAccountPrivateDataPut**
> String selfAccountPrivateDataPut(privateData)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
Object privateData = null; // Object | 
try {
    String result = apiInstance.selfAccountPrivateDataPut(privateData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountPrivateDataPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privateData** | **Object**|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountPut"></a>
# **selfAccountPut**
> Account selfAccountPut(newAccount)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
Account newAccount = new Account(); // Account | 
try {
    Account result = apiInstance.selfAccountPut(newAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newAccount** | [**Account**](Account.md)|  | [optional]

### Return type

[**Account**](Account.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountStatusPut"></a>
# **selfAccountStatusPut**
> String selfAccountStatusPut(status)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String status = "status_example"; // String | 
try {
    String result = apiInstance.selfAccountStatusPut(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountStatusPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**|  | [enum: WaitingAprove, Approved]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountUserAdd"></a>
# **selfAccountUserAdd**
> User selfAccountUserAdd(user)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
User user = new User(); // User | 
try {
    User result = apiInstance.selfAccountUserAdd(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountUserAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountUserChangePwdToken"></a>
# **selfAccountUserChangePwdToken**
> String selfAccountUserChangePwdToken(userId, currentPwd)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
String currentPwd = "currentPwd_example"; // String | 
try {
    String result = apiInstance.selfAccountUserChangePwdToken(userId, currentPwd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountUserChangePwdToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **currentPwd** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountUserGet"></a>
# **selfAccountUserGet**
> User selfAccountUserGet(userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
try {
    User result = apiInstance.selfAccountUserGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountUserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountUserLogin"></a>
# **selfAccountUserLogin**
> Session selfAccountUserLogin(userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
try {
    Session result = apiInstance.selfAccountUserLogin(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountUserLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**Session**](Session.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountUserPut"></a>
# **selfAccountUserPut**
> User selfAccountUserPut(userId, user)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
User user = new User(); // User | 
try {
    User result = apiInstance.selfAccountUserPut(userId, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountUserPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfAccountUserResendEmailConfirmation"></a>
# **selfAccountUserResendEmailConfirmation**
> String selfAccountUserResendEmailConfirmation(userId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String userId = "userId_example"; // String | 
try {
    String result = apiInstance.selfAccountUserResendEmailConfirmation(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfAccountUserResendEmailConfirmation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfUserChangePwdToken"></a>
# **selfUserChangePwdToken**
> String selfUserChangePwdToken(currentPwd)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
String currentPwd = "currentPwd_example"; // String | 
try {
    String result = apiInstance.selfUserChangePwdToken(currentPwd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfUserChangePwdToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currentPwd** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfUserGet"></a>
# **selfUserGet**
> User selfUserGet()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
try {
    User result = apiInstance.selfUserGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfUserGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfUserLogin"></a>
# **selfUserLogin**
> Session selfUserLogin()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
try {
    Session result = apiInstance.selfUserLogin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfUserLogin");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Session**](Session.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfUserPut"></a>
# **selfUserPut**
> User selfUserPut(user)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
User user = new User(); // User | 
try {
    User result = apiInstance.selfUserPut(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfUserPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="selfUserResendEmailConfirmation"></a>
# **selfUserResendEmailConfirmation**
> String selfUserResendEmailConfirmation()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
try {
    String result = apiInstance.selfUserResendEmailConfirmation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#selfUserResendEmailConfirmation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userConfigGet"></a>
# **userConfigGet**
> UserConfig userConfigGet()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
try {
    UserConfig result = apiInstance.userConfigGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#userConfigGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserConfig**](UserConfig.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userConfigPut"></a>
# **userConfigPut**
> String userConfigPut(a)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
UserConfig a = new UserConfig(); // UserConfig | 
try {
    String result = apiInstance.userConfigPut(a);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#userConfigPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | [**UserConfig**](UserConfig.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUiConfigGet"></a>
# **userUiConfigGet**
> UserUiConf userUiConfigGet()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
try {
    UserUiConf result = apiInstance.userUiConfigGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#userUiConfigGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserUiConf**](UserUiConf.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userUiConfigPut"></a>
# **userUiConfigPut**
> String userUiConfigPut(a)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tenantid
ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
tenantid.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tenantid.setApiKeyPrefix("Token");

// Configure API key authorization: token
ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("token");
token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//token.setApiKeyPrefix("Token");

SsUserApi apiInstance = new SsUserApi();
UserUiConf a = new UserUiConf(); // UserUiConf | 
try {
    String result = apiInstance.userUiConfigPut(a);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserApi#userUiConfigPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | [**UserUiConf**](UserUiConf.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

