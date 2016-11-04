# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.SsPaymentApi;

import java.io.File;
import java.util.*;

public class SsPaymentApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.saas4saas.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SsPaymentApi* | [**conf**](docs/SsPaymentApi.md#conf) | **GET** /s4s-payment/conf | 
*SsPaymentApi* | [**customerInfoCurrency**](docs/SsPaymentApi.md#customerInfoCurrency) | **GET** /s4s-payment/customer/{customer-id}/info/currency | 
*SsPaymentApi* | [**customerInfoGet**](docs/SsPaymentApi.md#customerInfoGet) | **GET** /s4s-payment/customer/{customer-id}/info | 
*SsPaymentApi* | [**customerInfoHasPaymentInfo**](docs/SsPaymentApi.md#customerInfoHasPaymentInfo) | **GET** /s4s-payment/customer/{customer-id}/info/hasPaymentInfo | 
*SsPaymentApi* | [**customerInfoStripeCustomer**](docs/SsPaymentApi.md#customerInfoStripeCustomer) | **POST** /s4s-payment/customer/{customer-id}/info/stripeCustomer | 
*SsPaymentApi* | [**customerPaymentAdd**](docs/SsPaymentApi.md#customerPaymentAdd) | **POST** /s4s-payment/customer/{customer-id}/payment | 
*SsPaymentApi* | [**customerPaymentCancelPatch**](docs/SsPaymentApi.md#customerPaymentCancelPatch) | **PATCH** /s4s-payment/customer/{customer-id}/payment/{payment-id}/cancel | 
*SsPaymentApi* | [**customerPaymentGet**](docs/SsPaymentApi.md#customerPaymentGet) | **GET** /s4s-payment/customer/{customer-id}/payment | 
*SsPaymentApi* | [**customerPaymentPayPatch**](docs/SsPaymentApi.md#customerPaymentPayPatch) | **PATCH** /s4s-payment/customer/{customer-id}/payment/{payment-id}/pay | 
*SsPaymentApi* | [**customerPaymentValues**](docs/SsPaymentApi.md#customerPaymentValues) | **GET** /s4s-payment/customer/{customer-id}/payment/values | 
*SsPaymentApi* | [**paymentConfigGet**](docs/SsPaymentApi.md#paymentConfigGet) | **GET** /s4s-payment/paymentConfig | 
*SsPaymentApi* | [**paymentConfigPut**](docs/SsPaymentApi.md#paymentConfigPut) | **PUT** /s4s-payment/paymentConfig | 
*SsPaymentApi* | [**paymentGetAll**](docs/SsPaymentApi.md#paymentGetAll) | **GET** /s4s-payment/payment | 
*SsPricingApi* | [**customerBillClose**](docs/SsPricingApi.md#customerBillClose) | **GET** /s4s-pricing/customer/{customer-id}/bill/{customer-bill-id}/close | 
*SsPricingApi* | [**customerBillGet**](docs/SsPricingApi.md#customerBillGet) | **GET** /s4s-pricing/customer/{customer-id}/bill/{customer-bill-id} | 
*SsPricingApi* | [**customerBillInitGet**](docs/SsPricingApi.md#customerBillInitGet) | **GET** /s4s-pricing/customer/{customer-id}/bill/init | 
*SsPricingApi* | [**customerBillInitPost**](docs/SsPricingApi.md#customerBillInitPost) | **GET** /s4s-pricing/customer/{customer-id}/bill/initPost | 
*SsPricingApi* | [**customerBillOrGet**](docs/SsPricingApi.md#customerBillOrGet) | **GET** /s4s-pricing/customer/{customer-id}/bill/or | 
*SsPricingApi* | [**customerBillValues**](docs/SsPricingApi.md#customerBillValues) | **GET** /s4s-pricing/customer/{customer-id}/bill/values | 
*SsPricingApi* | [**customerHistoryPlanValues**](docs/SsPricingApi.md#customerHistoryPlanValues) | **GET** /s4s-pricing/customer/{customer-id}/history/plan/values | 
*SsPricingApi* | [**customerPlanAdd**](docs/SsPricingApi.md#customerPlanAdd) | **POST** /s4s-pricing/customer/{customer-id}/plan | 
*SsPricingApi* | [**customerPlanAddCheck**](docs/SsPricingApi.md#customerPlanAddCheck) | **POST** /s4s-pricing/customer/{customer-id}/plan/addCheck | 
*SsPricingApi* | [**customerPlanClose**](docs/SsPricingApi.md#customerPlanClose) | **GET** /s4s-pricing/customer/{customer-id}/plan/{customer-plan-id}/close | 
*SsPricingApi* | [**customerPlanFamily**](docs/SsPricingApi.md#customerPlanFamily) | **GET** /s4s-pricing/customer/{customer-id}/plan/family | 
*SsPricingApi* | [**customerPlanGet**](docs/SsPricingApi.md#customerPlanGet) | **GET** /s4s-pricing/customer/{customer-id}/plan/{customer-plan-id} | 
*SsPricingApi* | [**customerPlanGetAll**](docs/SsPricingApi.md#customerPlanGetAll) | **GET** /s4s-pricing/customer/{customer-id}/plan | 
*SsPricingApi* | [**customerPlanPay**](docs/SsPricingApi.md#customerPlanPay) | **GET** /s4s-pricing/customer/{customer-id}/plan/pay | 
*SsPricingApi* | [**customerPlanPlan**](docs/SsPricingApi.md#customerPlanPlan) | **GET** /s4s-pricing/customer/{customer-id}/plan/plan | 
*SsPricingApi* | [**customerPlanValues**](docs/SsPricingApi.md#customerPlanValues) | **GET** /s4s-pricing/customer/{customer-id}/plan/values | 
*SsPricingApi* | [**pricing**](docs/SsPricingApi.md#pricing) | **GET** /s4s-pricing/pricing | 
*SsPricingApi* | [**pricing2**](docs/SsPricingApi.md#pricing2) | **GET** /s4s-pricing/pricing2 | 
*SsPricingApi* | [**pricingConfigGet**](docs/SsPricingApi.md#pricingConfigGet) | **GET** /s4s-pricing/pricingConfig | 
*SsPricingApi* | [**pricingConfigPut**](docs/SsPricingApi.md#pricingConfigPut) | **PUT** /s4s-pricing/pricingConfig | 
*SsPricingApi* | [**pricingUiConf**](docs/SsPricingApi.md#pricingUiConf) | **GET** /s4s-pricing/pricingUiConf | 
*SsPricingApi* | [**pricingUiConfigGet**](docs/SsPricingApi.md#pricingUiConfigGet) | **GET** /s4s-pricing/pricingUiConfig | 
*SsPricingApi* | [**pricingUiConfigPut**](docs/SsPricingApi.md#pricingUiConfigPut) | **PUT** /s4s-pricing/pricingUiConfig | 
*SsProductApi* | [**customerEnjoyAdd**](docs/SsProductApi.md#customerEnjoyAdd) | **POST** /s4s-product/customer/{customer-id}/enjoy | 
*SsProductApi* | [**customerEnjoyClose**](docs/SsProductApi.md#customerEnjoyClose) | **GET** /s4s-product/customer/{customer-id}/enjoy/{enjoy-id}/close | 
*SsProductApi* | [**customerEnjoyGet**](docs/SsProductApi.md#customerEnjoyGet) | **GET** /s4s-product/customer/{customer-id}/enjoy/{enjoy-id} | 
*SsProductApi* | [**customerEnjoyGetAll**](docs/SsProductApi.md#customerEnjoyGetAll) | **GET** /s4s-product/customer/{customer-id}/enjoy | 
*SsProductApi* | [**customerEnjoySpend**](docs/SsProductApi.md#customerEnjoySpend) | **GET** /s4s-product/customer/{customer-id}/enjoy/{customer-pack-id}/spend | 
*SsProductApi* | [**customerEnjoyValues**](docs/SsProductApi.md#customerEnjoyValues) | **GET** /s4s-product/customer/{customer-id}/enjoy/values | 
*SsProductApi* | [**customerHistoryPackGet**](docs/SsProductApi.md#customerHistoryPackGet) | **GET** /s4s-product/customer/{customer-id}/history/pack/{id} | 
*SsProductApi* | [**customerHistoryPackGetAll**](docs/SsProductApi.md#customerHistoryPackGetAll) | **GET** /s4s-product/customer/{customer-id}/history/pack | 
*SsProductApi* | [**customerHistoryPackValues**](docs/SsProductApi.md#customerHistoryPackValues) | **GET** /s4s-product/customer/{customer-id}/history/pack/values | 
*SsProductApi* | [**customerHistorySubscriptionGet**](docs/SsProductApi.md#customerHistorySubscriptionGet) | **GET** /s4s-product/customer/{customer-id}/history/subscription/{id} | 
*SsProductApi* | [**customerHistorySubscriptionGetAll**](docs/SsProductApi.md#customerHistorySubscriptionGetAll) | **GET** /s4s-product/customer/{customer-id}/history/subscription | 
*SsProductApi* | [**customerHistorySubscriptionValues**](docs/SsProductApi.md#customerHistorySubscriptionValues) | **GET** /s4s-product/customer/{customer-id}/history/subscription/values | 
*SsProductApi* | [**customerResource**](docs/SsProductApi.md#customerResource) | **GET** /s4s-product/customer/{customer-id}/resource | 
*SsProductApi* | [**customerSubscriptionAdd**](docs/SsProductApi.md#customerSubscriptionAdd) | **POST** /s4s-product/customer/{customer-id}/subscription | 
*SsProductApi* | [**customerSubscriptionClose**](docs/SsProductApi.md#customerSubscriptionClose) | **GET** /s4s-product/customer/{customer-id}/subscription/{subscription-id}/close | 
*SsProductApi* | [**customerSubscriptionGet**](docs/SsProductApi.md#customerSubscriptionGet) | **GET** /s4s-product/customer/{customer-id}/subscription/{subscription-id} | 
*SsProductApi* | [**customerSubscriptionGetAll**](docs/SsProductApi.md#customerSubscriptionGetAll) | **GET** /s4s-product/customer/{customer-id}/subscription | 
*SsProductApi* | [**customerSubscriptionRenew**](docs/SsProductApi.md#customerSubscriptionRenew) | **GET** /s4s-product/customer/{customer-id}/subscription/{subscription-id}/renew | 
*SsProductApi* | [**customerSubscriptionSpend**](docs/SsProductApi.md#customerSubscriptionSpend) | **GET** /s4s-product/customer/{customer-id}/subscription/{customer-subscription-id}/spend | 
*SsProductApi* | [**customerSubscriptionValues**](docs/SsProductApi.md#customerSubscriptionValues) | **GET** /s4s-product/customer/{customer-id}/subscription/values | 
*SsProductApi* | [**productConfigGet**](docs/SsProductApi.md#productConfigGet) | **GET** /s4s-product/productConfig | 
*SsProductApi* | [**productConfigPut**](docs/SsProductApi.md#productConfigPut) | **PUT** /s4s-product/productConfig | 
*SsResourceApi* | [**customerResourceGet**](docs/SsResourceApi.md#customerResourceGet) | **GET** /s4s-resource/customer/{customer-id}/resource/{resourceid} | 
*SsResourceApi* | [**customerResourceLimitGet**](docs/SsResourceApi.md#customerResourceLimitGet) | **GET** /s4s-resource/customer/{customer-id}/resource/{resourceid}/limit | 
*SsResourceApi* | [**customerResourcePatch**](docs/SsResourceApi.md#customerResourcePatch) | **PATCH** /s4s-resource/customer/{customer-id}/resource/{resourceid} | 
*SsResourceApi* | [**customerResourceProductGet**](docs/SsResourceApi.md#customerResourceProductGet) | **GET** /s4s-resource/customer/{customer-id}/resource/{resourceid}/product/{customer-product-id} | 
*SsResourceApi* | [**customerResourceProductLimitGet**](docs/SsResourceApi.md#customerResourceProductLimitGet) | **GET** /s4s-resource/customer/{customer-id}/resource/{resourceid}/product/{customer-product-id}/limit | 
*SsUserApi* | [**accountAdd**](docs/SsUserApi.md#accountAdd) | **POST** /s4s-user/account | 
*SsUserApi* | [**accountAutoLogin**](docs/SsUserApi.md#accountAutoLogin) | **GET** /s4s-user/account/autoLogin | 
*SsUserApi* | [**accountChangePasswordPatch**](docs/SsUserApi.md#accountChangePasswordPatch) | **PATCH** /s4s-user/account/changePassword | 
*SsUserApi* | [**accountGetAll**](docs/SsUserApi.md#accountGetAll) | **GET** /s4s-user/account | 
*SsUserApi* | [**accountIdGet**](docs/SsUserApi.md#accountIdGet) | **GET** /s4s-user/account/{account-id} | 
*SsUserApi* | [**accountIdKeysAdd**](docs/SsUserApi.md#accountIdKeysAdd) | **POST** /s4s-user/account/{account-id}/keys | 
*SsUserApi* | [**accountIdKeysDel**](docs/SsUserApi.md#accountIdKeysDel) | **DELETE** /s4s-user/account/{account-id}/keys/{user-id} | 
*SsUserApi* | [**accountIdKeysGetAll**](docs/SsUserApi.md#accountIdKeysGetAll) | **GET** /s4s-user/account/{account-id}/keys | 
*SsUserApi* | [**accountIdPrivateDataPut**](docs/SsUserApi.md#accountIdPrivateDataPut) | **PUT** /s4s-user/account/{account-id}/privateData | 
*SsUserApi* | [**accountIdPut**](docs/SsUserApi.md#accountIdPut) | **PUT** /s4s-user/account/{account-id} | 
*SsUserApi* | [**accountIdStatusPut**](docs/SsUserApi.md#accountIdStatusPut) | **PUT** /s4s-user/account/{account-id}/status | 
*SsUserApi* | [**accountIdUserAdd**](docs/SsUserApi.md#accountIdUserAdd) | **POST** /s4s-user/account/{account-id}/user | 
*SsUserApi* | [**accountIdUserChangePwdToken**](docs/SsUserApi.md#accountIdUserChangePwdToken) | **GET** /s4s-user/account/{account-id}/user/{user-id}/changePwdToken | 
*SsUserApi* | [**accountIdUserGet**](docs/SsUserApi.md#accountIdUserGet) | **GET** /s4s-user/account/{account-id}/user/{user-id} | 
*SsUserApi* | [**accountIdUserLogin**](docs/SsUserApi.md#accountIdUserLogin) | **GET** /s4s-user/account/{account-id}/user/{user-id}/login | 
*SsUserApi* | [**accountIdUserPut**](docs/SsUserApi.md#accountIdUserPut) | **PUT** /s4s-user/account/{account-id}/user/{user-id} | 
*SsUserApi* | [**accountIdUserResendEmailConfirmation**](docs/SsUserApi.md#accountIdUserResendEmailConfirmation) | **GET** /s4s-user/account/{account-id}/user/{user-id}/resendEmailConfirmation | 
*SsUserApi* | [**accountLogin**](docs/SsUserApi.md#accountLogin) | **POST** /s4s-user/account/login | 
*SsUserApi* | [**accountLoginOrAdd**](docs/SsUserApi.md#accountLoginOrAdd) | **POST** /s4s-user/account/loginOr | 
*SsUserApi* | [**accountRecover**](docs/SsUserApi.md#accountRecover) | **POST** /s4s-user/account/recover | 
*SsUserApi* | [**accountUserChangePwdToken**](docs/SsUserApi.md#accountUserChangePwdToken) | **GET** /s4s-user/account/user/{user-id}/changePwdToken | 
*SsUserApi* | [**accountUserGet**](docs/SsUserApi.md#accountUserGet) | **GET** /s4s-user/account/user/{user-id} | 
*SsUserApi* | [**accountUserLogin**](docs/SsUserApi.md#accountUserLogin) | **GET** /s4s-user/account/user/{user-id}/login | 
*SsUserApi* | [**accountUserPut**](docs/SsUserApi.md#accountUserPut) | **PUT** /s4s-user/account/user/{user-id} | 
*SsUserApi* | [**accountUserResendEmailConfirmation**](docs/SsUserApi.md#accountUserResendEmailConfirmation) | **GET** /s4s-user/account/user/{user-id}/resendEmailConfirmation | 
*SsUserApi* | [**accountUsernameChangePwdToken**](docs/SsUserApi.md#accountUsernameChangePwdToken) | **GET** /s4s-user/account/username/changePwdToken | 
*SsUserApi* | [**accountUsernameGet**](docs/SsUserApi.md#accountUsernameGet) | **GET** /s4s-user/account/username | 
*SsUserApi* | [**accountUsernameLogin**](docs/SsUserApi.md#accountUsernameLogin) | **GET** /s4s-user/account/username/login | 
*SsUserApi* | [**accountUsernamePut**](docs/SsUserApi.md#accountUsernamePut) | **PUT** /s4s-user/account/username | 
*SsUserApi* | [**accountUsernameResendEmailConfirmation**](docs/SsUserApi.md#accountUsernameResendEmailConfirmation) | **GET** /s4s-user/account/username/resendEmailConfirmation | 
*SsUserApi* | [**authenticate**](docs/SsUserApi.md#authenticate) | **GET** /s4s-user/authenticate | 
*SsUserApi* | [**config**](docs/SsUserApi.md#config) | **GET** /s4s-user/config | 
*SsUserApi* | [**googleLogin**](docs/SsUserApi.md#googleLogin) | **POST** /s4s-user/googleLogin | 
*SsUserApi* | [**htmlConf**](docs/SsUserApi.md#htmlConf) | **GET** /s4s-user/htmlConf | 
*SsUserApi* | [**selfAccountGet**](docs/SsUserApi.md#selfAccountGet) | **GET** /s4s-user/selfAccount | 
*SsUserApi* | [**selfAccountKeysAdd**](docs/SsUserApi.md#selfAccountKeysAdd) | **POST** /s4s-user/selfAccount/keys | 
*SsUserApi* | [**selfAccountKeysDel**](docs/SsUserApi.md#selfAccountKeysDel) | **DELETE** /s4s-user/selfAccount/keys/{user-id} | 
*SsUserApi* | [**selfAccountKeysGetAll**](docs/SsUserApi.md#selfAccountKeysGetAll) | **GET** /s4s-user/selfAccount/keys | 
*SsUserApi* | [**selfAccountPrivateDataPut**](docs/SsUserApi.md#selfAccountPrivateDataPut) | **PUT** /s4s-user/selfAccount/privateData | 
*SsUserApi* | [**selfAccountPut**](docs/SsUserApi.md#selfAccountPut) | **PUT** /s4s-user/selfAccount | 
*SsUserApi* | [**selfAccountStatusPut**](docs/SsUserApi.md#selfAccountStatusPut) | **PUT** /s4s-user/selfAccount/status | 
*SsUserApi* | [**selfAccountUserAdd**](docs/SsUserApi.md#selfAccountUserAdd) | **POST** /s4s-user/selfAccount/user | 
*SsUserApi* | [**selfAccountUserChangePwdToken**](docs/SsUserApi.md#selfAccountUserChangePwdToken) | **GET** /s4s-user/selfAccount/user/{user-id}/changePwdToken | 
*SsUserApi* | [**selfAccountUserGet**](docs/SsUserApi.md#selfAccountUserGet) | **GET** /s4s-user/selfAccount/user/{user-id} | 
*SsUserApi* | [**selfAccountUserLogin**](docs/SsUserApi.md#selfAccountUserLogin) | **GET** /s4s-user/selfAccount/user/{user-id}/login | 
*SsUserApi* | [**selfAccountUserPut**](docs/SsUserApi.md#selfAccountUserPut) | **PUT** /s4s-user/selfAccount/user/{user-id} | 
*SsUserApi* | [**selfAccountUserResendEmailConfirmation**](docs/SsUserApi.md#selfAccountUserResendEmailConfirmation) | **GET** /s4s-user/selfAccount/user/{user-id}/resendEmailConfirmation | 
*SsUserApi* | [**selfUserChangePwdToken**](docs/SsUserApi.md#selfUserChangePwdToken) | **GET** /s4s-user/selfUser/changePwdToken | 
*SsUserApi* | [**selfUserGet**](docs/SsUserApi.md#selfUserGet) | **GET** /s4s-user/selfUser | 
*SsUserApi* | [**selfUserLogin**](docs/SsUserApi.md#selfUserLogin) | **GET** /s4s-user/selfUser/login | 
*SsUserApi* | [**selfUserPut**](docs/SsUserApi.md#selfUserPut) | **PUT** /s4s-user/selfUser | 
*SsUserApi* | [**selfUserResendEmailConfirmation**](docs/SsUserApi.md#selfUserResendEmailConfirmation) | **GET** /s4s-user/selfUser/resendEmailConfirmation | 
*SsUserApi* | [**userConfigGet**](docs/SsUserApi.md#userConfigGet) | **GET** /s4s-user/userConfig | 
*SsUserApi* | [**userConfigPut**](docs/SsUserApi.md#userConfigPut) | **PUT** /s4s-user/userConfig | 
*SsUserApi* | [**userUiConfigGet**](docs/SsUserApi.md#userUiConfigGet) | **GET** /s4s-user/userUiConfig | 
*SsUserApi* | [**userUiConfigPut**](docs/SsUserApi.md#userUiConfigPut) | **PUT** /s4s-user/userUiConfig | 
*SsUserNotificationApi* | [**operatorConf**](docs/SsUserNotificationApi.md#operatorConf) | **GET** /s4s-user-notification/operator/conf/{notification-key} | 
*SsUserNotificationApi* | [**operatorSend**](docs/SsUserNotificationApi.md#operatorSend) | **GET** /s4s-user-notification/operator/send/{notification-key} | 
*SsUserNotificationApi* | [**operatorSendEmail**](docs/SsUserNotificationApi.md#operatorSendEmail) | **POST** /s4s-user-notification/operator/sendEmail | 
*SsUserNotificationApi* | [**userSend**](docs/SsUserNotificationApi.md#userSend) | **GET** /s4s-user-notification/user/send/{notification-key} | 
*SsUserNotificationApi* | [**userSendEmail**](docs/SsUserNotificationApi.md#userSendEmail) | **POST** /s4s-user-notification/user/sendEmail | 


## Documentation for Models

 - [Account](docs/Account.md)
 - [CustomerBill](docs/CustomerBill.md)
 - [CustomerInfo](docs/CustomerInfo.md)
 - [CustomerPack](docs/CustomerPack.md)
 - [CustomerPackSubscription](docs/CustomerPackSubscription.md)
 - [CustomerPayment](docs/CustomerPayment.md)
 - [CustomerPlan](docs/CustomerPlan.md)
 - [CustomerPlanPeriod](docs/CustomerPlanPeriod.md)
 - [Email](docs/Email.md)
 - [EmailRecover](docs/EmailRecover.md)
 - [FinalInterval](docs/FinalInterval.md)
 - [GoogleAuth](docs/GoogleAuth.md)
 - [GoogleTokenId](docs/GoogleTokenId.md)
 - [Login](docs/Login.md)
 - [OneTimePay](docs/OneTimePay.md)
 - [OperatorConfiguration](docs/OperatorConfiguration.md)
 - [Pack](docs/Pack.md)
 - [PaymentConf](docs/PaymentConf.md)
 - [PaymentPaypal](docs/PaymentPaypal.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [Plan](docs/Plan.md)
 - [Price](docs/Price.md)
 - [PricingConf](docs/PricingConf.md)
 - [PricingPolicy](docs/PricingPolicy.md)
 - [PricingTable2Full](docs/PricingTable2Full.md)
 - [PricingTable2Plan](docs/PricingTable2Plan.md)
 - [PricingTableFull](docs/PricingTableFull.md)
 - [PricingTablePack](docs/PricingTablePack.md)
 - [PricingTablePlan](docs/PricingTablePlan.md)
 - [PricingTablePlanCost](docs/PricingTablePlanCost.md)
 - [PricingTableResource](docs/PricingTableResource.md)
 - [PricingUiConf](docs/PricingUiConf.md)
 - [PricingUiConfPack](docs/PricingUiConfPack.md)
 - [PricingUiConfPlan](docs/PricingUiConfPlan.md)
 - [PricingUiConfResource](docs/PricingUiConfResource.md)
 - [ProductConf](docs/ProductConf.md)
 - [QuantiyIntervalPrice](docs/QuantiyIntervalPrice.md)
 - [Resource](docs/Resource.md)
 - [ResourcePatch](docs/ResourcePatch.md)
 - [ResourcePatchResult](docs/ResourcePatchResult.md)
 - [ResourceStatus](docs/ResourceStatus.md)
 - [S4sError](docs/S4sError.md)
 - [Session](docs/Session.md)
 - [StripeAccessCode](docs/StripeAccessCode.md)
 - [StripeConf](docs/StripeConf.md)
 - [StripeCustomer](docs/StripeCustomer.md)
 - [Subscription](docs/Subscription.md)
 - [User](docs/User.md)
 - [UserApi](docs/UserApi.md)
 - [UserConfig](docs/UserConfig.md)
 - [UserContact](docs/UserContact.md)
 - [UserEntity](docs/UserEntity.md)
 - [UserUiConf](docs/UserUiConf.md)
 - [UtUser](docs/UtUser.md)
 - [VariableCost](docs/VariableCost.md)
 - [VariableCostIntervalCost](docs/VariableCostIntervalCost.md)
 - [VariableCostIntervalPerUnit](docs/VariableCostIntervalPerUnit.md)
 - [VariableCostPerUnit](docs/VariableCostPerUnit.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### tenantid

- **Type**: API key
- **API key parameter name**: tenantid
- **Location**: URL query string

### token

- **Type**: API key
- **API key parameter name**: token
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

rui.p.oliveira@impactinglabs.com

