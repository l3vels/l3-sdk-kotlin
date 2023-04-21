# UtilitiesApi

All URIs are relative to *https://api-dev.l3vels.xyz*

Method | HTTP request | Description
------------- | ------------- | -------------
[**utilityControllerHealth**](UtilitiesApi.md#utilityControllerHealth) | **GET** /v1/utilities/health | 


<a name="utilityControllerHealth"></a>
# **utilityControllerHealth**
> utilityControllerHealth()



### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = UtilitiesApi()
try {
    apiInstance.utilityControllerHealth()
} catch (e: ClientException) {
    println("4xx response calling UtilitiesApi#utilityControllerHealth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UtilitiesApi#utilityControllerHealth")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

