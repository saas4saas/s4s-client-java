# SsPaymentApi

All URIs are relative to *https://api.saas4saas.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conf**](SsPaymentApi.md#conf) | **GET** /s4s-payment/conf | 
[**customerInfoCurrency**](SsPaymentApi.md#customerInfoCurrency) | **GET** /s4s-payment/customer/{customer-id}/info/currency | 
[**customerInfoGet**](SsPaymentApi.md#customerInfoGet) | **GET** /s4s-payment/customer/{customer-id}/info | 
[**customerInfoHasPaymentInfo**](SsPaymentApi.md#customerInfoHasPaymentInfo) | **GET** /s4s-payment/customer/{customer-id}/info/hasPaymentInfo | 
[**customerInfoStripeCustomer**](SsPaymentApi.md#customerInfoStripeCustomer) | **POST** /s4s-payment/customer/{customer-id}/info/stripeCustomer | 
[**customerPaymentAdd**](SsPaymentApi.md#customerPaymentAdd) | **POST** /s4s-payment/customer/{customer-id}/payment | 
[**customerPaymentCancelPatch**](SsPaymentApi.md#customerPaymentCancelPatch) | **PATCH** /s4s-payment/customer/{customer-id}/payment/{payment-id}/cancel | 
[**customerPaymentGet**](SsPaymentApi.md#customerPaymentGet) | **GET** /s4s-payment/customer/{customer-id}/payment | 
[**customerPaymentPayPatch**](SsPaymentApi.md#customerPaymentPayPatch) | **PATCH** /s4s-payment/customer/{customer-id}/payment/{payment-id}/pay | 
[**customerPaymentValues**](SsPaymentApi.md#customerPaymentValues) | **GET** /s4s-payment/customer/{customer-id}/payment/values | 
[**paymentConfigGet**](SsPaymentApi.md#paymentConfigGet) | **GET** /s4s-payment/paymentConfig | 
[**paymentConfigPut**](SsPaymentApi.md#paymentConfigPut) | **PUT** /s4s-payment/paymentConfig | 
[**paymentGetAll**](SsPaymentApi.md#paymentGetAll) | **GET** /s4s-payment/payment | 


<a name="conf"></a>
# **conf**
> PaymentConf conf()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
try {
    PaymentConf result = apiInstance.conf();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#conf");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaymentConf**](PaymentConf.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerInfoCurrency"></a>
# **customerInfoCurrency**
> String customerInfoCurrency(customerId, currency)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
String customerId = "customerId_example"; // String | 
String currency = "currency_example"; // String | 
try {
    String result = apiInstance.customerInfoCurrency(customerId, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#customerInfoCurrency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **currency** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerInfoGet"></a>
# **customerInfoGet**
> CustomerInfo customerInfoGet(customerId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
String customerId = "customerId_example"; // String | 
try {
    CustomerInfo result = apiInstance.customerInfoGet(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#customerInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |

### Return type

[**CustomerInfo**](CustomerInfo.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerInfoHasPaymentInfo"></a>
# **customerInfoHasPaymentInfo**
> Boolean customerInfoHasPaymentInfo(customerId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
String customerId = "customerId_example"; // String | 
try {
    Boolean result = apiInstance.customerInfoHasPaymentInfo(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#customerInfoHasPaymentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |

### Return type

**Boolean**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerInfoStripeCustomer"></a>
# **customerInfoStripeCustomer**
> String customerInfoStripeCustomer(customerId, stripeCustomer)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
String customerId = "customerId_example"; // String | 
StripeCustomer stripeCustomer = new StripeCustomer(); // StripeCustomer | 
try {
    String result = apiInstance.customerInfoStripeCustomer(customerId, stripeCustomer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#customerInfoStripeCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **stripeCustomer** | [**StripeCustomer**](StripeCustomer.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPaymentAdd"></a>
# **customerPaymentAdd**
> PaymentRequest customerPaymentAdd(customerId, paymentRequest)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
String customerId = "customerId_example"; // String | 
PaymentRequest paymentRequest = new PaymentRequest(); // PaymentRequest | 
try {
    PaymentRequest result = apiInstance.customerPaymentAdd(customerId, paymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#customerPaymentAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **paymentRequest** | [**PaymentRequest**](PaymentRequest.md)|  | [optional]

### Return type

[**PaymentRequest**](PaymentRequest.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPaymentCancelPatch"></a>
# **customerPaymentCancelPatch**
> String customerPaymentCancelPatch(customerId, paymentId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
String customerId = "customerId_example"; // String | 
String paymentId = "paymentId_example"; // String | 
try {
    String result = apiInstance.customerPaymentCancelPatch(customerId, paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#customerPaymentCancelPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **paymentId** | **String**|  |

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPaymentGet"></a>
# **customerPaymentGet**
> PaymentRequest customerPaymentGet(customerId, paymentId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
String customerId = "customerId_example"; // String | 
String paymentId = "paymentId_example"; // String | 
try {
    PaymentRequest result = apiInstance.customerPaymentGet(customerId, paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#customerPaymentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **paymentId** | **String**|  |

### Return type

[**PaymentRequest**](PaymentRequest.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPaymentPayPatch"></a>
# **customerPaymentPayPatch**
> PaymentRequest customerPaymentPayPatch(customerId, paymentId)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
String customerId = "customerId_example"; // String | 
String paymentId = "paymentId_example"; // String | 
try {
    PaymentRequest result = apiInstance.customerPaymentPayPatch(customerId, paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#customerPaymentPayPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**|  |
 **paymentId** | **String**|  |

### Return type

[**PaymentRequest**](PaymentRequest.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerPaymentValues"></a>
# **customerPaymentValues**
> customerPaymentValues(customerId, page, numberPerPage)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
String customerId = "customerId_example"; // String | 
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
try {
    apiInstance.customerPaymentValues(customerId, page, numberPerPage);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#customerPaymentValues");
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

<a name="paymentConfigGet"></a>
# **paymentConfigGet**
> PaymentConf paymentConfigGet()





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
try {
    PaymentConf result = apiInstance.paymentConfigGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#paymentConfigGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaymentConf**](PaymentConf.md)

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymentConfigPut"></a>
# **paymentConfigPut**
> String paymentConfigPut(a)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
PaymentConf a = new PaymentConf(); // PaymentConf | 
try {
    String result = apiInstance.paymentConfigPut(a);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#paymentConfigPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | [**PaymentConf**](PaymentConf.md)|  | [optional]

### Return type

**String**

### Authorization

[tenantid](../README.md#tenantid), [token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymentGetAll"></a>
# **paymentGetAll**
> paymentGetAll(page, numberPerPage)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsPaymentApi;

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

SsPaymentApi apiInstance = new SsPaymentApi();
Integer page = 56; // Integer | 
Integer numberPerPage = 56; // Integer | 
try {
    apiInstance.paymentGetAll(page, numberPerPage);
} catch (ApiException e) {
    System.err.println("Exception when calling SsPaymentApi#paymentGetAll");
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

