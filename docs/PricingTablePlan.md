
# PricingTablePlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**costMain** | [**PricingTablePlanCost**](PricingTablePlanCost.md) |  |  [optional]
**description** | **String** |  |  [optional]
**requirePaymentMethod** | **Boolean** |  |  [optional]
**id** | **String** |  |  [optional]
**packId** | **String** |  |  [optional]
**typ** | [**TypEnum**](#TypEnum) |  |  [optional]
**costList** | [**List&lt;PricingTablePlanCost&gt;**](PricingTablePlanCost.md) |  |  [optional]
**subscribeUrl** | **String** |  |  [optional]


<a name="TypEnum"></a>
## Enum: TypEnum
Name | Value
---- | -----
ONETIMEPAY | &quot;OneTimePay&quot;
SUBSCRIPTION | &quot;Subscription&quot;



