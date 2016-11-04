
# Plan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**variableCost** | [**Map&lt;String, VariableCost&gt;**](VariableCost.md) |  |  [optional]
**name** | **String** |  |  [optional]
**oneTimePay** | [**OneTimePay**](OneTimePay.md) |  |  [optional]
**hasVariableCost** | **Boolean** |  |  [optional]
**description** | **String** |  |  [optional]
**subscription** | [**Subscription**](Subscription.md) |  |  [optional]
**beforePlanId** | **String** |  |  [optional]
**onExpiratyNextPlanId** | **String** |  |  [optional]
**upgradeLevel** | **Integer** |  |  [optional]
**requirePaymentMethod** | **Boolean** |  |  [optional]
**id** | **String** |  |  [optional]
**packId** | **String** |  |  [optional]
**typ** | [**TypEnum**](#TypEnum) |  |  [optional]
**uiOrder** | **Integer** |  |  [optional]
**family** | **String** |  |  [optional]
**uiVisible** | **Boolean** |  |  [optional]
**withfamily** | **Boolean** |  |  [optional]
**variableCostWhenPay** | [**VariableCostWhenPayEnum**](#VariableCostWhenPayEnum) |  |  [optional]
**oneTimePlan** | **Boolean** |  |  [optional]


<a name="TypEnum"></a>
## Enum: TypEnum
Name | Value
---- | -----
ONETIMEPAY | &quot;OneTimePay&quot;
SUBSCRIPTION | &quot;Subscription&quot;


<a name="VariableCostWhenPayEnum"></a>
## Enum: VariableCostWhenPayEnum
Name | Value
---- | -----
EACHENDPERIOD | &quot;EachEndPeriod&quot;
EACHMONTH | &quot;EachMonth&quot;
EACHWEEK | &quot;EachWeek&quot;
EACHDAY | &quot;EachDay&quot;



