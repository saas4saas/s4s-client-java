# SsUserNotificationApi

All URIs are relative to *https://api.saas4saas.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**operatorConf**](SsUserNotificationApi.md#operatorConf) | **GET** /s4s-user-notification/operator/conf/{notification-key} | 
[**operatorSend**](SsUserNotificationApi.md#operatorSend) | **GET** /s4s-user-notification/operator/send/{notification-key} | 
[**operatorSendEmail**](SsUserNotificationApi.md#operatorSendEmail) | **POST** /s4s-user-notification/operator/sendEmail | 
[**userSend**](SsUserNotificationApi.md#userSend) | **GET** /s4s-user-notification/user/send/{notification-key} | 
[**userSendEmail**](SsUserNotificationApi.md#userSendEmail) | **POST** /s4s-user-notification/user/sendEmail | 


<a name="operatorConf"></a>
# **operatorConf**
> OperatorConfiguration operatorConf(notificationKey)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserNotificationApi;

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

SsUserNotificationApi apiInstance = new SsUserNotificationApi();
String notificationKey = "notificationKey_example"; // String | 
try {
    OperatorConfiguration result = apiInstance.operatorConf(notificationKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserNotificationApi#operatorConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationKey** | **String**|  |

### Return type

[**OperatorConfiguration**](OperatorConfiguration.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="operatorSend"></a>
# **operatorSend**
> String operatorSend(notificationKey)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserNotificationApi;

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

SsUserNotificationApi apiInstance = new SsUserNotificationApi();
String notificationKey = "notificationKey_example"; // String | 
try {
    String result = apiInstance.operatorSend(notificationKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserNotificationApi#operatorSend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationKey** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="operatorSendEmail"></a>
# **operatorSendEmail**
> String operatorSendEmail(notificationKey, email)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserNotificationApi;

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

SsUserNotificationApi apiInstance = new SsUserNotificationApi();
String notificationKey = "notificationKey_example"; // String | 
Email email = new Email(); // Email | 
try {
    String result = apiInstance.operatorSendEmail(notificationKey, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserNotificationApi#operatorSendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationKey** | **String**|  |
 **email** | [**Email**](Email.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userSend"></a>
# **userSend**
> String userSend(userId, notificationKey)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserNotificationApi;

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

SsUserNotificationApi apiInstance = new SsUserNotificationApi();
String userId = "userId_example"; // String | 
String notificationKey = "notificationKey_example"; // String | 
try {
    String result = apiInstance.userSend(userId, notificationKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserNotificationApi#userSend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **notificationKey** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userSendEmail"></a>
# **userSendEmail**
> String userSendEmail(userId, email)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsUserNotificationApi;

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

SsUserNotificationApi apiInstance = new SsUserNotificationApi();
String userId = "userId_example"; // String | 
Email email = new Email(); // Email | 
try {
    String result = apiInstance.userSendEmail(userId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsUserNotificationApi#userSendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **email** | [**Email**](Email.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

