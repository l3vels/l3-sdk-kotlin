# CollectionApi

All URIs are relative to *https://api-dev.l3vels.xyz*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countCollectionsByGameId**](CollectionApi.md#countCollectionsByGameId) | **GET** /v1/collection/count/{project_id} | Count collections
[**getCollectionById**](CollectionApi.md#getCollectionById) | **GET** /v1/collection/{project_id}/{id} | Retrieve collection by ID
[**getCollections**](CollectionApi.md#getCollections) | **GET** /v1/collection | Retrieve collections


<a name="countCollectionsByGameId"></a>
# **countCollectionsByGameId**
> java.math.BigDecimal countCollectionsByGameId(authorization, projectId)

Count collections

Count total collections in game.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = CollectionApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val projectId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Game/project ID to count collections in
try {
    val result : java.math.BigDecimal = apiInstance.countCollectionsByGameId(authorization, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionApi#countCollectionsByGameId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionApi#countCollectionsByGameId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **projectId** | **kotlin.String**| Game/project ID to count collections in |

### Return type

[**java.math.BigDecimal**](java.math.BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCollectionById"></a>
# **getCollectionById**
> Collection getCollectionById(authorization, id, projectId)

Retrieve collection by ID

This API method retrieves a specific collection based on the unique identifier provided in the request.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = CollectionApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val id : kotlin.String = 229fd9e0-b51f-4b20-9203-9db60995e6b1 // kotlin.String | Collection ID to find
val projectId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Game/project ID to find collection in
try {
    val result : Collection = apiInstance.getCollectionById(authorization, id, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionApi#getCollectionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionApi#getCollectionById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **id** | **kotlin.String**| Collection ID to find |
 **projectId** | **kotlin.String**| Game/project ID to find collection in |

### Return type

[**Collection**](Collection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCollections"></a>
# **getCollections**
> kotlin.collections.List&lt;Collection&gt; getCollections(authorization, projectId, sort, order, searchText, limit, page)

Retrieve collections

This API method retrieves a list of collections that match the specified filter criteria. Developers can use this method to retrieve collections by name, category, status, or other properties.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = CollectionApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val projectId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Game/project ID to find collections in your game. Example: Fortnite, Minecraft, etc.
val sort : kotlin.String = name // kotlin.String | Collection field to sort by. You can sort by name, created_on and etc.
val order : kotlin.String = ASC // kotlin.String | Sort order (ASC for ascending or DESC for descending)
val searchText : kotlin.String = Weapons // kotlin.String | Search collections by name
val limit : java.math.BigDecimal = 10 // java.math.BigDecimal | Number of collections to return per page
val page : java.math.BigDecimal = 1 // java.math.BigDecimal | Page number
try {
    val result : kotlin.collections.List<Collection> = apiInstance.getCollections(authorization, projectId, sort, order, searchText, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CollectionApi#getCollections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollectionApi#getCollections")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **projectId** | **kotlin.String**| Game/project ID to find collections in your game. Example: Fortnite, Minecraft, etc. |
 **sort** | **kotlin.String**| Collection field to sort by. You can sort by name, created_on and etc. | [optional]
 **order** | **kotlin.String**| Sort order (ASC for ascending or DESC for descending) | [optional]
 **searchText** | **kotlin.String**| Search collections by name | [optional]
 **limit** | **java.math.BigDecimal**| Number of collections to return per page | [optional]
 **page** | **java.math.BigDecimal**| Page number | [optional]

### Return type

[**kotlin.collections.List&lt;Collection&gt;**](Collection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

