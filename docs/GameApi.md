# GameApi

All URIs are relative to *https://api-dev.l3vels.xyz*

Method | HTTP request | Description
------------- | ------------- | -------------
[**projectControllerProjectById**](GameApi.md#projectControllerProjectById) | **GET** /v1/game/{id} | Retrieve Game


<a name="projectControllerProjectById"></a>
# **projectControllerProjectById**
> Project projectControllerProjectById(authorization, id)

Retrieve Game

Get game/project by ID created on the platform.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = GameApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val id : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Game or Project Id
try {
    val result : Project = apiInstance.projectControllerProjectById(authorization, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GameApi#projectControllerProjectById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GameApi#projectControllerProjectById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **id** | **kotlin.String**| Game or Project Id |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

