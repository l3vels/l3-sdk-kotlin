# AssetApi

All URIs are relative to *https://api-dev.l3vels.xyz*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countByGame**](AssetApi.md#countByGame) | **GET** /v1/asset/count/{project_id} | Count assets
[**getAssetById**](AssetApi.md#getAssetById) | **GET** /v1/asset/{project_id}/{id} | Retrieve asset by ID
[**getAssets**](AssetApi.md#getAssets) | **GET** /v1/asset | Retrieve assets
[**updateAsset**](AssetApi.md#updateAsset) | **PATCH** /v1/asset/{id} | Update asset


<a name="countByGame"></a>
# **countByGame**
> java.math.BigDecimal countByGame(authorization, projectId)

Count assets

Counts total assets in game.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = AssetApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val projectId : kotlin.String = projectId_example // kotlin.String | 
try {
    val result : java.math.BigDecimal = apiInstance.countByGame(authorization, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetApi#countByGame")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetApi#countByGame")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **projectId** | **kotlin.String**|  |

### Return type

[**java.math.BigDecimal**](java.math.BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetById"></a>
# **getAssetById**
> Asset getAssetById(authorization, id, projectId)

Retrieve asset by ID

Retrieve asset by ID in specific game/project. Example: Find asset AK-47 in game Call of Duty

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = AssetApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val id : kotlin.String = 9abd57ce-b11c-4828-ab6a-19f568a8081a // kotlin.String | Asset ID to find
val projectId : kotlin.String = 556a2843-b302-4b9d-916c-cefcb5d66053 // kotlin.String | Game/project ID to find asset in
try {
    val result : Asset = apiInstance.getAssetById(authorization, id, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetApi#getAssetById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetApi#getAssetById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **id** | **kotlin.String**| Asset ID to find |
 **projectId** | **kotlin.String**| Game/project ID to find asset in |

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssets"></a>
# **getAssets**
> AssetsResponseDto getAssets(authorization, projectId, collectionId, sort, order, searchText, limit, page)

Retrieve assets

This API method retrieves a list of assets that match the specified filter criteria. Developers can use this method to retrieve assets by name, description or other properties

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = AssetApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val projectId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Game/project ID to find assets in your game. Example: Fortnite, Minecraft, etc.
val collectionId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Filter assets by collection. Example: Get assets only from Weapons collection.
val sort : kotlin.String = name // kotlin.String | Asset field to sort by. You can sort by name, created_on and etc.
val order : kotlin.String = ASC // kotlin.String | Sort order (ASC for ascending or DESC for descending)
val searchText : kotlin.String = Hammer // kotlin.String | Search assets by name
val limit : java.math.BigDecimal = 10 // java.math.BigDecimal | Number of assets to return per page
val page : java.math.BigDecimal = 1 // java.math.BigDecimal | Page number
try {
    val result : AssetsResponseDto = apiInstance.getAssets(authorization, projectId, collectionId, sort, order, searchText, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetApi#getAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetApi#getAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **projectId** | **kotlin.String**| Game/project ID to find assets in your game. Example: Fortnite, Minecraft, etc. |
 **collectionId** | **kotlin.String**| Filter assets by collection. Example: Get assets only from Weapons collection. | [optional]
 **sort** | **kotlin.String**| Asset field to sort by. You can sort by name, created_on and etc. | [optional]
 **order** | **kotlin.String**| Sort order (ASC for ascending or DESC for descending) | [optional] [enum: ASC, DESC]
 **searchText** | **kotlin.String**| Search assets by name | [optional]
 **limit** | **java.math.BigDecimal**| Number of assets to return per page | [optional]
 **page** | **java.math.BigDecimal**| Page number | [optional]

### Return type

[**AssetsResponseDto**](AssetsResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAsset"></a>
# **updateAsset**
> Asset updateAsset(authorization, id, updateAssetDto)

Update asset

Update asset by ID in specific collection. Example: Update asset AK-47 in collection Weapons

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = AssetApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val id : kotlin.String = 353c69f6-76a6-4baa-b68b-852c1c531953 // kotlin.String | Asset ID to update
val updateAssetDto : UpdateAssetDto =  // UpdateAssetDto | 
try {
    val result : Asset = apiInstance.updateAsset(authorization, id, updateAssetDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetApi#updateAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetApi#updateAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **id** | **kotlin.String**| Asset ID to update |
 **updateAssetDto** | [**UpdateAssetDto**](UpdateAssetDto.md)|  |

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

