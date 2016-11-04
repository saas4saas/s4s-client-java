# SsProductApi

All URIs are relative to *https://api.saas4saas.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerEnjoyAdd**](SsProductApi.md#customerEnjoyAdd) | **POST** /s4s-product/customer/{customer-id}/enjoy | 
[**customerEnjoyClose**](SsProductApi.md#customerEnjoyClose) | **GET** /s4s-product/customer/{customer-id}/enjoy/{enjoy-id}/close | 
[**customerEnjoyGet**](SsProductApi.md#customerEnjoyGet) | **GET** /s4s-product/customer/{customer-id}/enjoy/{enjoy-id} | 
[**customerEnjoyGetAll**](SsProductApi.md#customerEnjoyGetAll) | **GET** /s4s-product/customer/{customer-id}/enjoy | 
[**customerEnjoySpend**](SsProductApi.md#customerEnjoySpend) | **GET** /s4s-product/customer/{customer-id}/enjoy/{customer-pack-id}/spend | 
[**customerEnjoyValues**](SsProductApi.md#customerEnjoyValues) | **GET** /s4s-product/customer/{customer-id}/enjoy/values | 
[**customerHistoryPackGet**](SsProductApi.md#customerHistoryPackGet) | **GET** /s4s-product/customer/{customer-id}/history/pack/{id} | 
[**customerHistoryPackGetAll**](SsProductApi.md#customerHistoryPackGetAll) | **GET** /s4s-product/customer/{customer-id}/history/pack | 
[**customerHistoryPackValues**](SsProductApi.md#customerHistoryPackValues) | **GET** /s4s-product/customer/{customer-id}/history/pack/values | 
[**customerHistorySubscriptionGet**](SsProductApi.md#customerHistorySubscriptionGet) | **GET** /s4s-product/customer/{customer-id}/history/subscription/{id} | 
[**customerHistorySubscriptionGetAll**](SsProductApi.md#customerHistorySubscriptionGetAll) | **GET** /s4s-product/customer/{customer-id}/history/subscription | 
[**customerHistorySubscriptionValues**](SsProductApi.md#customerHistorySubscriptionValues) | **GET** /s4s-product/customer/{customer-id}/history/subscription/values | 
[**customerResource**](SsProductApi.md#customerResource) | **GET** /s4s-product/customer/{customer-id}/resource | 
[**customerSubscriptionAdd**](SsProductApi.md#customerSubscriptionAdd) | **POST** /s4s-product/customer/{customer-id}/subscription | 
[**customerSubscriptionClose**](SsProductApi.md#customerSubscriptionClose) | **GET** /s4s-product/customer/{customer-id}/subscription/{subscription-id}/close | 
[**customerSubscriptionGet**](SsProductApi.md#customerSubscriptionGet) | **GET** /s4s-product/customer/{customer-id}/subscription/{subscription-id} | 
[**customerSubscriptionGetAll**](SsProductApi.md#customerSubscriptionGetAll) | **GET** /s4s-product/customer/{customer-id}/subscription | 
[**customerSubscriptionRenew**](SsProductApi.md#customerSubscriptionRenew) | **GET** /s4s-product/customer/{customer-id}/subscription/{subscription-id}/renew | 
[**customerSubscriptionSpend**](SsProductApi.md#customerSubscriptionSpend) | **GET** /s4s-product/customer/{customer-id}/subscription/{customer-subscription-id}/spend | 
[**customerSubscriptionValues**](SsProductApi.md#customerSubscriptionValues) | **GET** /s4s-product/customer/{customer-id}/subscription/values | 
[**productConfigGet**](SsProductApi.md#productConfigGet) | **GET** /s4s-product/productConfig | 
[**productConfigPut**](SsProductApi.md#productConfigPut) | **PUT** /s4s-product/productConfig | 


<a name="customerEnjoyAdd"></a>
# **customerEnjoyAdd**
> CustomerPack customerEnjoyAdd(customerId, expirationOffset, overrideEnjoyId, overrideSubscriptionId, newEnjoy)



Relationate a new product with the customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
Long expirationOffset = 789L; // Long | 
String overrideEnjoyId = "overrideEnjoyId_example"; // String | 
String overrideSubscriptionId = "overrideSubscriptionId_example"; // String | 
CustomerPack newEnjoy = new CustomerPack(); // CustomerPack | 
try {
    CustomerPack result = apiInstance.customerEnjoyAdd(customerId, expirationOffset, overrideEnjoyId, overrideSubscriptionId, newEnjoy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerEnjoyAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **expirationOffset** | **Long**|  |
 **overrideEnjoyId** | **String**|  |
 **overrideSubscriptionId** | **String**|  |
 **newEnjoy** | [**CustomerPack**](CustomerPack.md)|  | [optional]

### Return type

[**CustomerPack**](CustomerPack.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerEnjoyClose"></a>
# **customerEnjoyClose**
> CustomerPack customerEnjoyClose(customerId, enjoyId)



Will close the enjoyId product, an create the the a new equivalent EnjoyProduct. Only refreshing the limits if its need

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
String enjoyId = "enjoyId_example"; // String | 
try {
    CustomerPack result = apiInstance.customerEnjoyClose(customerId, enjoyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerEnjoyClose");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **enjoyId** | **String**|  |

### Return type

[**CustomerPack**](CustomerPack.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerEnjoyGet"></a>
# **customerEnjoyGet**
> CustomerPack customerEnjoyGet(customerId, enjoyId)



Get a certain product releated to customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
String enjoyId = "enjoyId_example"; // String | 
try {
    CustomerPack result = apiInstance.customerEnjoyGet(customerId, enjoyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerEnjoyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **enjoyId** | **String**|  |

### Return type

[**CustomerPack**](CustomerPack.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerEnjoyGetAll"></a>
# **customerEnjoyGetAll**
> List&lt;String&gt; customerEnjoyGetAll(customerId)



Get all the current products relationed with the customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
try {
    List<String> result = apiInstance.customerEnjoyGetAll(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerEnjoyGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |

### Return type

**List&lt;String&gt;**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerEnjoySpend"></a>
# **customerEnjoySpend**
> Map&lt;String, Long&gt; customerEnjoySpend(customerId, customerPackId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
String customerPackId = "customerPackId_example"; // String | 
try {
    Map<String, Long> result = apiInstance.customerEnjoySpend(customerId, customerPackId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerEnjoySpend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **customerPackId** | **String**|  |

### Return type

[**Map&lt;String, Long&gt;**](Map.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerEnjoyValues"></a>
# **customerEnjoyValues**
> customerEnjoyValues(customerId, page, numberPerPage, loadResourceStatusList)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
Boolean loadResourceStatusList = true; // Boolean | 
try {
    apiInstance.customerEnjoyValues(customerId, page, numberPerPage, loadResourceStatusList);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerEnjoyValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **page** | **Integer**|  |
 **numberPerPage** | **Integer**|  |
 **loadResourceStatusList** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerHistoryPackGet"></a>
# **customerHistoryPackGet**
> CustomerPack customerHistoryPackGet(customerId, id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
String id = "id_example"; // String | 
try {
    CustomerPack result = apiInstance.customerHistoryPackGet(customerId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerHistoryPackGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **id** | **String**|  |

### Return type

[**CustomerPack**](CustomerPack.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerHistoryPackGetAll"></a>
# **customerHistoryPackGetAll**
> List&lt;String&gt; customerHistoryPackGetAll(customerId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
try {
    List<String> result = apiInstance.customerHistoryPackGetAll(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerHistoryPackGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |

### Return type

**List&lt;String&gt;**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerHistoryPackValues"></a>
# **customerHistoryPackValues**
> customerHistoryPackValues(customerId, page, numberPerPage, loadResourceStatusList)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
Boolean loadResourceStatusList = true; // Boolean | 
try {
    apiInstance.customerHistoryPackValues(customerId, page, numberPerPage, loadResourceStatusList);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerHistoryPackValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **page** | **Integer**|  |
 **numberPerPage** | **Integer**|  |
 **loadResourceStatusList** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerHistorySubscriptionGet"></a>
# **customerHistorySubscriptionGet**
> CustomerPack customerHistorySubscriptionGet(customerId, id)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
String id = "id_example"; // String | 
try {
    CustomerPack result = apiInstance.customerHistorySubscriptionGet(customerId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerHistorySubscriptionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **id** | **String**|  |

### Return type

[**CustomerPack**](CustomerPack.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerHistorySubscriptionGetAll"></a>
# **customerHistorySubscriptionGetAll**
> List&lt;String&gt; customerHistorySubscriptionGetAll(customerId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
try {
    List<String> result = apiInstance.customerHistorySubscriptionGetAll(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerHistorySubscriptionGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |

### Return type

**List&lt;String&gt;**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerHistorySubscriptionValues"></a>
# **customerHistorySubscriptionValues**
> customerHistorySubscriptionValues(customerId, page, numberPerPage, loadResourceStatusList)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
Boolean loadResourceStatusList = true; // Boolean | 
try {
    apiInstance.customerHistorySubscriptionValues(customerId, page, numberPerPage, loadResourceStatusList);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerHistorySubscriptionValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **page** | **Integer**|  |
 **numberPerPage** | **Integer**|  |
 **loadResourceStatusList** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerResource"></a>
# **customerResource**
> customerResource(customerId, page, numberPerPage)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
try {
    apiInstance.customerResource(customerId, page, numberPerPage);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **page** | **Integer**|  |
 **numberPerPage** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerSubscriptionAdd"></a>
# **customerSubscriptionAdd**
> CustomerPackSubscription customerSubscriptionAdd(customerId, overrideSubscriptionId, overrideEnjoyId, newSubscription)



Add a new subscription to customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
String overrideSubscriptionId = "overrideSubscriptionId_example"; // String | 
String overrideEnjoyId = "overrideEnjoyId_example"; // String | 
CustomerPackSubscription newSubscription = new CustomerPackSubscription(); // CustomerPackSubscription | 
try {
    CustomerPackSubscription result = apiInstance.customerSubscriptionAdd(customerId, overrideSubscriptionId, overrideEnjoyId, newSubscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerSubscriptionAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **overrideSubscriptionId** | **String**|  |
 **overrideEnjoyId** | **String**|  |
 **newSubscription** | [**CustomerPackSubscription**](CustomerPackSubscription.md)|  | [optional]

### Return type

[**CustomerPackSubscription**](CustomerPackSubscription.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerSubscriptionClose"></a>
# **customerSubscriptionClose**
> String customerSubscriptionClose(customerId, subscriptionId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
String subscriptionId = "subscriptionId_example"; // String | 
try {
    String result = apiInstance.customerSubscriptionClose(customerId, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerSubscriptionClose");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **subscriptionId** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerSubscriptionGet"></a>
# **customerSubscriptionGet**
> CustomerPackSubscription customerSubscriptionGet(customerId, subscriptionId)



Get a subscription by its Ids

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
String subscriptionId = "subscriptionId_example"; // String | 
try {
    CustomerPackSubscription result = apiInstance.customerSubscriptionGet(customerId, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerSubscriptionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **subscriptionId** | **String**|  |

### Return type

[**CustomerPackSubscription**](CustomerPackSubscription.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerSubscriptionGetAll"></a>
# **customerSubscriptionGetAll**
> List&lt;String&gt; customerSubscriptionGetAll(customerId)



Get all the current subscriptions of a customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
try {
    List<String> result = apiInstance.customerSubscriptionGetAll(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerSubscriptionGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |

### Return type

**List&lt;String&gt;**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerSubscriptionRenew"></a>
# **customerSubscriptionRenew**
> String customerSubscriptionRenew(customerId, subscriptionId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
String subscriptionId = "subscriptionId_example"; // String | 
try {
    String result = apiInstance.customerSubscriptionRenew(customerId, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerSubscriptionRenew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **subscriptionId** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerSubscriptionSpend"></a>
# **customerSubscriptionSpend**
> Map&lt;String, Long&gt; customerSubscriptionSpend(customerId, customerSubscriptionId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
String customerSubscriptionId = "customerSubscriptionId_example"; // String | 
try {
    Map<String, Long> result = apiInstance.customerSubscriptionSpend(customerId, customerSubscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerSubscriptionSpend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
 **customerSubscriptionId** | **String**|  |

### Return type

[**Map&lt;String, Long&gt;**](Map.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerSubscriptionValues"></a>
# **customerSubscriptionValues**
> customerSubscriptionValues(customerId, page, numberPerPage, loadDefaultUser)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
String customerId = "customerId_example"; // String | The given id from the user service
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
Boolean loadDefaultUser = true; // Boolean | 
try {
    apiInstance.customerSubscriptionValues(customerId, page, numberPerPage, loadDefaultUser);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#customerSubscriptionValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The given id from the user service |
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

<a name="productConfigGet"></a>
# **productConfigGet**
> ProductConf productConfigGet()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
try {
    ProductConf result = apiInstance.productConfigGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#productConfigGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProductConf**](ProductConf.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productConfigPut"></a>
# **productConfigPut**
> String productConfigPut(a)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsProductApi;

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

SsProductApi apiInstance = new SsProductApi();
ProductConf a = new ProductConf(); // ProductConf | 
try {
    String result = apiInstance.productConfigPut(a);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsProductApi#productConfigPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | [**ProductConf**](ProductConf.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

