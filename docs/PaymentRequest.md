
# PaymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationTimespan** | **Long** |  |  [optional]
**paidTimespan** | **Long** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**whatPays** | **Map&lt;String, Long&gt;** |  |  [optional]
**price** | [**Price**](Price.md) |  |  [optional]
**billId** | **String** |  |  [optional]
**customerId** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**stripeChargeId** | **String** |  |  [optional]
**currency** | **String** |  |  [optional]
**value** | **Long** |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
STATUS2WAITPAYMENT | &quot;status2WaitPayment&quot;
STATUS3CANCELED | &quot;status3Canceled&quot;
STATUS4PAID | &quot;status4Paid&quot;
STATUS1FAILED | &quot;status1Failed&quot;
STATUS3PAID | &quot;status3Paid&quot;



