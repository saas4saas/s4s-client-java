# SsPricingApi

All URIs are relative to *https://api.saas4saas.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerBillClose**](SsPricingApi.md#customerBillClose) | **GET** /s4s-pricing/customer/{customer-id}/bill/{customer-bill-id}/close | 
[**customerBillGet**](SsPricingApi.md#customerBillGet) | **GET** /s4s-pricing/customer/{customer-id}/bill/{customer-bill-id} | 
[**customerBillInitGet**](SsPricingApi.md#customerBillInitGet) | **GET** /s4s-pricing/customer/{customer-id}/bill/init | 
[**customerBillInitPost**](SsPricingApi.md#customerBillInitPost) | **GET** /s4s-pricing/customer/{customer-id}/bill/initPost | 
[**customerBillOrGet**](SsPricingApi.md#customerBillOrGet) | **GET** /s4s-pricing/customer/{customer-id}/bill/or | 
[**customerBillValues**](SsPricingApi.md#customerBillValues) | **GET** /s4s-pricing/customer/{customer-id}/bill/values | 
[**customerHistoryPlanValues**](SsPricingApi.md#customerHistoryPlanValues) | **GET** /s4s-pricing/customer/{customer-id}/history/plan/values | 
[**customerPlanAdd**](SsPricingApi.md#customerPlanAdd) | **POST** /s4s-pricing/customer/{customer-id}/plan | 
[**customerPlanAddCheck**](SsPricingApi.md#customerPlanAddCheck) | **POST** /s4s-pricing/customer/{customer-id}/plan/addCheck | 
[**customerPlanClose**](SsPricingApi.md#customerPlanClose) | **GET** /s4s-pricing/customer/{customer-id}/plan/{customer-plan-id}/close | 
[**customerPlanFamily**](SsPricingApi.md#customerPlanFamily) | **GET** /s4s-pricing/customer/{customer-id}/plan/family | 
[**customerPlanGet**](SsPricingApi.md#customerPlanGet) | **GET** /s4s-pricing/customer/{customer-id}/plan/{customer-plan-id} | 
[**customerPlanGetAll**](SsPricingApi.md#customerPlanGetAll) | **GET** /s4s-pricing/customer/{customer-id}/plan | 
[**customerPlanPay**](SsPricingApi.md#customerPlanPay) | **GET** /s4s-pricing/customer/{customer-id}/plan/pay | 
[**customerPlanPlan**](SsPricingApi.md#customerPlanPlan) | **GET** /s4s-pricing/customer/{customer-id}/plan/plan | 
[**customerPlanValues**](SsPricingApi.md#customerPlanValues) | **GET** /s4s-pricing/customer/{customer-id}/plan/values | 
[**pricing**](SsPricingApi.md#pricing) | **GET** /s4s-pricing/pricing | 
[**pricing2**](SsPricingApi.md#pricing2) | **GET** /s4s-pricing/pricing2 | 
[**pricingConfigGet**](SsPricingApi.md#pricingConfigGet) | **GET** /s4s-pricing/pricingConfig | 
[**pricingConfigPut**](SsPricingApi.md#pricingConfigPut) | **PUT** /s4s-pricing/pricingConfig | 
[**pricingUiConf**](SsPricingApi.md#pricingUiConf) | **GET** /s4s-pricing/pricingUiConf | 
[**pricingUiConfigGet**](SsPricingApi.md#pricingUiConfigGet) | **GET** /s4s-pricing/pricingUiConfig | 
[**pricingUiConfigPut**](SsPricingApi.md#pricingUiConfigPut) | **PUT** /s4s-pricing/pricingUiConfig | 


<a name="customerBillClose"></a>
# **customerBillClose**
> CustomerBill customerBillClose(customerId, customerBillId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
String customerBillId = "customerBillId_example"; // String | 
try {
    CustomerBill result = apiInstance.customerBillClose(customerId, customerBillId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerBillClose");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **customerBillId** | **String**|  |

### Return type

[**CustomerBill**](CustomerBill.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerBillGet"></a>
# **customerBillGet**
> CustomerBill customerBillGet(customerId, customerBillId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
String customerBillId = "customerBillId_example"; // String | 
try {
    CustomerBill result = apiInstance.customerBillGet(customerId, customerBillId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerBillGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **customerBillId** | **String**|  |

### Return type

[**CustomerBill**](CustomerBill.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerBillInitGet"></a>
# **customerBillInitGet**
> CustomerBill customerBillInitGet(customerId, billId, customerPlanId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
String billId = "billId_example"; // String | 
String customerPlanId = "customerPlanId_example"; // String | 
try {
    CustomerBill result = apiInstance.customerBillInitGet(customerId, billId, customerPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerBillInitGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **billId** | **String**|  |
 **customerPlanId** | **String**|  |

### Return type

[**CustomerBill**](CustomerBill.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerBillInitPost"></a>
# **customerBillInitPost**
> CustomerBill customerBillInitPost(customerId, billId, customerPlanId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
String billId = "billId_example"; // String | 
String customerPlanId = "customerPlanId_example"; // String | 
try {
    CustomerBill result = apiInstance.customerBillInitPost(customerId, billId, customerPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerBillInitPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **billId** | **String**|  |
 **customerPlanId** | **String**|  |

### Return type

[**CustomerBill**](CustomerBill.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerBillOrGet"></a>
# **customerBillOrGet**
> CustomerBill customerBillOrGet(customerId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
try {
    CustomerBill result = apiInstance.customerBillOrGet(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerBillOrGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |

### Return type

[**CustomerBill**](CustomerBill.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerBillValues"></a>
# **customerBillValues**
> customerBillValues(customerId, page, numberPerPage)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
try {
    apiInstance.customerBillValues(customerId, page, numberPerPage);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerBillValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **page** | **Integer**|  |
 **numberPerPage** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerHistoryPlanValues"></a>
# **customerHistoryPlanValues**
> customerHistoryPlanValues(customerId, page, numberPerPage)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
try {
    apiInstance.customerHistoryPlanValues(customerId, page, numberPerPage);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerHistoryPlanValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **page** | **Integer**|  |
 **numberPerPage** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPlanAdd"></a>
# **customerPlanAdd**
> CustomerPlan customerPlanAdd(customerId, customerPlan)



Add a new Product to a Customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
CustomerPlan customerPlan = new CustomerPlan(); // CustomerPlan | 
try {
    CustomerPlan result = apiInstance.customerPlanAdd(customerId, customerPlan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerPlanAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **customerPlan** | [**CustomerPlan**](CustomerPlan.md)|  | [optional]

### Return type

[**CustomerPlan**](CustomerPlan.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPlanAddCheck"></a>
# **customerPlanAddCheck**
> CustomerPlan customerPlanAddCheck(customerId, customerPlan)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
CustomerPlan customerPlan = new CustomerPlan(); // CustomerPlan | 
try {
    CustomerPlan result = apiInstance.customerPlanAddCheck(customerId, customerPlan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerPlanAddCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **customerPlan** | [**CustomerPlan**](CustomerPlan.md)|  | [optional]

### Return type

[**CustomerPlan**](CustomerPlan.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPlanClose"></a>
# **customerPlanClose**
> String customerPlanClose(customerId, customerPlanId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
String customerPlanId = "customerPlanId_example"; // String | 
try {
    String result = apiInstance.customerPlanClose(customerId, customerPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerPlanClose");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **customerPlanId** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPlanFamily"></a>
# **customerPlanFamily**
> CustomerPlan customerPlanFamily(customerId, family)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
String family = "family_example"; // String | 
try {
    CustomerPlan result = apiInstance.customerPlanFamily(customerId, family);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerPlanFamily");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **family** | **String**|  |

### Return type

[**CustomerPlan**](CustomerPlan.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPlanGet"></a>
# **customerPlanGet**
> CustomerPlan customerPlanGet(customerId, customerPlanId)



Get a certain 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
String customerPlanId = "customerPlanId_example"; // String | 
try {
    CustomerPlan result = apiInstance.customerPlanGet(customerId, customerPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerPlanGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **customerPlanId** | **String**|  |

### Return type

[**CustomerPlan**](CustomerPlan.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPlanGetAll"></a>
# **customerPlanGetAll**
> List&lt;String&gt; customerPlanGetAll(customerId)



Get all Products Customers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
try {
    List<String> result = apiInstance.customerPlanGetAll(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerPlanGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |

### Return type

**List&lt;String&gt;**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPlanPay"></a>
# **customerPlanPay**
> String customerPlanPay(customerId, customerPlanId, customerBillId, whenPay)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
String customerPlanId = "customerPlanId_example"; // String | 
String customerBillId = "customerBillId_example"; // String | 
String whenPay = "whenPay_example"; // String | 
try {
    String result = apiInstance.customerPlanPay(customerId, customerPlanId, customerBillId, whenPay);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerPlanPay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **customerPlanId** | **String**|  |
 **customerBillId** | **String**|  |
 **whenPay** | **String**|  | [enum: EndPlan, EndPackPeriod, PreMatureEndPlanPeriod, StartPlan, EndPlanPeriod, EachMonth, StartPackPeriod, StartPlanPeriod, EachWeek, EachDay]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPlanPlan"></a>
# **customerPlanPlan**
> Plan customerPlanPlan(customerId, planId)



Get all the actual customerPlanId for the planId

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
String planId = "planId_example"; // String | 
try {
    Plan result = apiInstance.customerPlanPlan(customerId, planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerPlanPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **planId** | **String**|  |

### Return type

[**Plan**](Plan.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPlanValues"></a>
# **customerPlanValues**
> customerPlanValues(customerId, page, numberPerPage)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String customerId = "customerId_example"; // String | 
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
try {
    apiInstance.customerPlanValues(customerId, page, numberPerPage);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#customerPlanValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **page** | **Integer**|  |
 **numberPerPage** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pricing"></a>
# **pricing**
> PricingTableFull pricing(currency, onlyPanId)



Get the actual pricing configuration, usefull for dynamic create a pricing table

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String currency = "currency_example"; // String | 
String onlyPanId = "onlyPanId_example"; // String | 
try {
    PricingTableFull result = apiInstance.pricing(currency, onlyPanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#pricing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  |
 **onlyPanId** | **String**|  |

### Return type

[**PricingTableFull**](PricingTableFull.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pricing2"></a>
# **pricing2**
> PricingTable2Full pricing2(currency, onlyPanId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
String currency = "currency_example"; // String | 
String onlyPanId = "onlyPanId_example"; // String | 
try {
    PricingTable2Full result = apiInstance.pricing2(currency, onlyPanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#pricing2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  |
 **onlyPanId** | **String**|  |

### Return type

[**PricingTable2Full**](PricingTable2Full.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pricingConfigGet"></a>
# **pricingConfigGet**
> PricingConf pricingConfigGet()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
try {
    PricingConf result = apiInstance.pricingConfigGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#pricingConfigGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PricingConf**](PricingConf.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pricingConfigPut"></a>
# **pricingConfigPut**
> String pricingConfigPut(a)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
PricingConf a = new PricingConf(); // PricingConf | 
try {
    String result = apiInstance.pricingConfigPut(a);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#pricingConfigPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | [**PricingConf**](PricingConf.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pricingUiConf"></a>
# **pricingUiConf**
> PricingUiConf pricingUiConf()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
try {
    PricingUiConf result = apiInstance.pricingUiConf();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#pricingUiConf");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PricingUiConf**](PricingUiConf.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pricingUiConfigGet"></a>
# **pricingUiConfigGet**
> PricingUiConf pricingUiConfigGet()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
try {
    PricingUiConf result = apiInstance.pricingUiConfigGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#pricingUiConfigGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PricingUiConf**](PricingUiConf.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pricingUiConfigPut"></a>
# **pricingUiConfigPut**
> String pricingUiConfigPut(a)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPricingApi;

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

SsPricingApi apiInstance = new SsPricingApi();
PricingUiConf a = new PricingUiConf(); // PricingUiConf | 
try {
    String result = apiInstance.pricingUiConfigPut(a);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPricingApi#pricingUiConfigPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | [**PricingUiConf**](PricingUiConf.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

