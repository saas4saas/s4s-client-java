
# CustomerBill

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerPlanId** | **String** |  |  [optional]
**creationTimespan** | **Long** |  |  [optional]
**lasUpdateTimespan** | **Long** |  |  [optional]
**customerId** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**totalInPayment** | **Map&lt;String, Long&gt;** |  |  [optional]
**planId** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
S3FORGIVEN | &quot;S3Forgiven&quot;
S4PAID | &quot;S4Paid&quot;
S1WAITINGPAYMENT | &quot;S1WaitingPayment&quot;
S2WAITINGPLANEXPIRATION | &quot;S2WaitingPlanExpiration&quot;



