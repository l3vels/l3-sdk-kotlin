# MintApi

All URIs are relative to *https://api-dev.l3vels.xyz*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mintControllerAirdrop**](MintApi.md#mintControllerAirdrop) | **POST** /v1/mint/airdrop | Airdrop asset to player
[**mintControllerAward**](MintApi.md#mintControllerAward) | **POST** /v1/mint/award | Award asset to player
[**mintControllerMint**](MintApi.md#mintControllerMint) | **POST** /v1/mint | Mint asset
[**mintControllerMintBatch**](MintApi.md#mintControllerMintBatch) | **POST** /v1/mint/batch | Batch mint assets
[**mintControllerPlayerMint**](MintApi.md#mintControllerPlayerMint) | **POST** /v1/mint/player | Mint asset by player
[**mintControllerPlayerMintBatch**](MintApi.md#mintControllerPlayerMintBatch) | **POST** /v1/mint/batch-player | Batch mint assets by player


<a name="mintControllerAirdrop"></a>
# **mintControllerAirdrop**
> mintControllerAirdrop(authorization, mintDto)

Airdrop asset to player

Airdrop asset to player

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = MintApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val mintDto : MintDto =  // MintDto | 
try {
    apiInstance.mintControllerAirdrop(authorization, mintDto)
} catch (e: ClientException) {
    println("4xx response calling MintApi#mintControllerAirdrop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MintApi#mintControllerAirdrop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **mintDto** | [**MintDto**](MintDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="mintControllerAward"></a>
# **mintControllerAward**
> mintControllerAward(authorization, mintDto)

Award asset to player

Award asset to player

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = MintApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val mintDto : MintDto =  // MintDto | 
try {
    apiInstance.mintControllerAward(authorization, mintDto)
} catch (e: ClientException) {
    println("4xx response calling MintApi#mintControllerAward")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MintApi#mintControllerAward")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **mintDto** | [**MintDto**](MintDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="mintControllerMint"></a>
# **mintControllerMint**
> mintControllerMint(authorization, mintDto)

Mint asset

Mint an asset by admin to player

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = MintApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val mintDto : MintDto =  // MintDto | 
try {
    apiInstance.mintControllerMint(authorization, mintDto)
} catch (e: ClientException) {
    println("4xx response calling MintApi#mintControllerMint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MintApi#mintControllerMint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **mintDto** | [**MintDto**](MintDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="mintControllerMintBatch"></a>
# **mintControllerMintBatch**
> mintControllerMintBatch(authorization, mintBatchDto)

Batch mint assets

Batch mint assets by admin to player

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = MintApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val mintBatchDto : MintBatchDto =  // MintBatchDto | 
try {
    apiInstance.mintControllerMintBatch(authorization, mintBatchDto)
} catch (e: ClientException) {
    println("4xx response calling MintApi#mintControllerMintBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MintApi#mintControllerMintBatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **mintBatchDto** | [**MintBatchDto**](MintBatchDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="mintControllerPlayerMint"></a>
# **mintControllerPlayerMint**
> mintControllerPlayerMint(authorization, mintDto)

Mint asset by player

Mint asset by player. Player must have enough balance to mint.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = MintApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val mintDto : MintDto =  // MintDto | 
try {
    apiInstance.mintControllerPlayerMint(authorization, mintDto)
} catch (e: ClientException) {
    println("4xx response calling MintApi#mintControllerPlayerMint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MintApi#mintControllerPlayerMint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **mintDto** | [**MintDto**](MintDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="mintControllerPlayerMintBatch"></a>
# **mintControllerPlayerMintBatch**
> mintControllerPlayerMintBatch(authorization, mintBatchDto)

Batch mint assets by player

Batch mint assets by player. Player must have enough balance to mint.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = MintApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val mintBatchDto : MintBatchDto =  // MintBatchDto | 
try {
    apiInstance.mintControllerPlayerMintBatch(authorization, mintBatchDto)
} catch (e: ClientException) {
    println("4xx response calling MintApi#mintControllerPlayerMintBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MintApi#mintControllerPlayerMintBatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **mintBatchDto** | [**MintBatchDto**](MintBatchDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

