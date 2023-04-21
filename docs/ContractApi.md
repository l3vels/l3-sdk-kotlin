# ContractApi

All URIs are relative to *https://api-dev.l3vels.xyz*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contractControllerCollectionSize**](ContractApi.md#contractControllerCollectionSize) | **GET** /v1/contract/collection-size | Collection size
[**contractControllerContractUri**](ContractApi.md#contractControllerContractUri) | **GET** /v1/contract/contract-uri | Get Contract URI
[**contractControllerSetContractUri**](ContractApi.md#contractControllerSetContractUri) | **PUT** /v1/contract/contract-uri | Update Contract URI
[**contractControllerSetSaleStatus**](ContractApi.md#contractControllerSetSaleStatus) | **PUT** /v1/contract/sale-status | Update Sale status


<a name="contractControllerCollectionSize"></a>
# **contractControllerCollectionSize**
> contractControllerCollectionSize(authorization, collectionId, projectId)

Collection size

Get size of collection

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = ContractApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val collectionId : kotlin.String = collectionId_example // kotlin.String | 
val projectId : kotlin.String = projectId_example // kotlin.String | 
try {
    apiInstance.contractControllerCollectionSize(authorization, collectionId, projectId)
} catch (e: ClientException) {
    println("4xx response calling ContractApi#contractControllerCollectionSize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractApi#contractControllerCollectionSize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **collectionId** | **kotlin.String**|  |
 **projectId** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="contractControllerContractUri"></a>
# **contractControllerContractUri**
> contractControllerContractUri(authorization, collectionId, projectId)

Get Contract URI

Gets contract uri of contract

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = ContractApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val collectionId : kotlin.String = collectionId_example // kotlin.String | 
val projectId : kotlin.String = projectId_example // kotlin.String | 
try {
    apiInstance.contractControllerContractUri(authorization, collectionId, projectId)
} catch (e: ClientException) {
    println("4xx response calling ContractApi#contractControllerContractUri")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractApi#contractControllerContractUri")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **collectionId** | **kotlin.String**|  |
 **projectId** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="contractControllerSetContractUri"></a>
# **contractControllerSetContractUri**
> contractControllerSetContractUri(authorization, setContractUriDto)

Update Contract URI

Update Contract URI

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = ContractApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val setContractUriDto : SetContractUriDto =  // SetContractUriDto | 
try {
    apiInstance.contractControllerSetContractUri(authorization, setContractUriDto)
} catch (e: ClientException) {
    println("4xx response calling ContractApi#contractControllerSetContractUri")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractApi#contractControllerSetContractUri")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **setContractUriDto** | [**SetContractUriDto**](SetContractUriDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="contractControllerSetSaleStatus"></a>
# **contractControllerSetSaleStatus**
> contractControllerSetSaleStatus(authorization, setSaleStatusDto)

Update Sale status

Update Sale status to PAUSED, PRE_SALE or PUBLIC

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = ContractApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val setSaleStatusDto : SetSaleStatusDto =  // SetSaleStatusDto | 
try {
    apiInstance.contractControllerSetSaleStatus(authorization, setSaleStatusDto)
} catch (e: ClientException) {
    println("4xx response calling ContractApi#contractControllerSetSaleStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractApi#contractControllerSetSaleStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **setSaleStatusDto** | [**SetSaleStatusDto**](SetSaleStatusDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

