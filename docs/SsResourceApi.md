# SsResourceApi

All URIs are relative to *https://api.saas4saas.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerResourceGet**](SsResourceApi.md#customerResourceGet) | **GET** /s4s-resource/customer/{customer-id}/resource/{resourceid} | 
[**customerResourceLimitGet**](SsResourceApi.md#customerResourceLimitGet) | **GET** /s4s-resource/customer/{customer-id}/resource/{resourceid}/limit | 
[**customerResourcePatch**](SsResourceApi.md#customerResourcePatch) | **PATCH** /s4s-resource/customer/{customer-id}/resource/{resourceid} | 
[**customerResourceProductGet**](SsResourceApi.md#customerResourceProductGet) | **GET** /s4s-resource/customer/{customer-id}/resource/{resourceid}/product/{customer-product-id} | 
[**customerResourceProductLimitGet**](SsResourceApi.md#customerResourceProductLimitGet) | **GET** /s4s-resource/customer/{customer-id}/resource/{resourceid}/product/{customer-product-id}/limit | 


<a name="customerResourceGet"></a>
# **customerResourceGet**
> Long customerResourceGet(customerId, resourceid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsResourceApi;

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

SsResourceApi apiInstance = new SsResourceApi();
String customerId = "customerId_example"; // String | 
String resourceid = "resourceid_example"; // String | 
try {
    Long result = apiInstance.customerResourceGet(customerId, resourceid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsResourceApi#customerResourceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **resourceid** | **String**|  |

### Return type

**Long**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerResourceLimitGet"></a>
# **customerResourceLimitGet**
> Long customerResourceLimitGet(customerId, resourceid)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsResourceApi;

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

SsResourceApi apiInstance = new SsResourceApi();
String customerId = "customerId_example"; // String | 
String resourceid = "resourceid_example"; // String | 
try {
    Long result = apiInstance.customerResourceLimitGet(customerId, resourceid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsResourceApi#customerResourceLimitGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **resourceid** | **String**|  |

### Return type

**Long**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerResourcePatch"></a>
# **customerResourcePatch**
> ResourcePatchResult customerResourcePatch(customerId, resourceid, value)



Updates a resource of a customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsResourceApi;

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

SsResourceApi apiInstance = new SsResourceApi();
String customerId = "customerId_example"; // String | 
String resourceid = "resourceid_example"; // String | 
ResourcePatch value = new ResourcePatch(); // ResourcePatch | The Operation and value to update the resource
try {
    ResourcePatchResult result = apiInstance.customerResourcePatch(customerId, resourceid, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsResourceApi#customerResourcePatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **resourceid** | **String**|  |
 **value** | [**ResourcePatch**](ResourcePatch.md)| The Operation and value to update the resource | [optional]

### Return type

[**ResourcePatchResult**](ResourcePatchResult.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerResourceProductGet"></a>
# **customerResourceProductGet**
> Long customerResourceProductGet(customerId, resourceid, customerProductId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsResourceApi;

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

SsResourceApi apiInstance = new SsResourceApi();
String customerId = "customerId_example"; // String | 
String resourceid = "resourceid_example"; // String | 
String customerProductId = "customerProductId_example"; // String | 
try {
    Long result = apiInstance.customerResourceProductGet(customerId, resourceid, customerProductId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsResourceApi#customerResourceProductGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **resourceid** | **String**|  |
 **customerProductId** | **String**|  |

### Return type

**Long**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerResourceProductLimitGet"></a>
# **customerResourceProductLimitGet**
> Long customerResourceProductLimitGet(customerId, resourceid, customerProductId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsResourceApi;

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

SsResourceApi apiInstance = new SsResourceApi();
String customerId = "customerId_example"; // String | 
String resourceid = "resourceid_example"; // String | 
String customerProductId = "customerProductId_example"; // String | 
try {
    Long result = apiInstance.customerResourceProductLimitGet(customerId, resourceid, customerProductId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsResourceApi#customerResourceProductLimitGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **resourceid** | **String**|  |
 **customerProductId** | **String**|  |

### Return type

**Long**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

