# TransactionApi

All URIs are relative to *https://api-dev.l3vels.xyz*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionControllerTransactionById**](TransactionApi.md#transactionControllerTransactionById) | **GET** /v1/transaction/{project_id}/{id} | Retrieve Transaction by ID
[**transactionControllerTransactions**](TransactionApi.md#transactionControllerTransactions) | **GET** /v1/transaction | Retrieve transactions
[**transactionControllerWebhook**](TransactionApi.md#transactionControllerWebhook) | **POST** /v1/transaction/webhook | 


<a name="transactionControllerTransactionById"></a>
# **transactionControllerTransactionById**
> Transaction transactionControllerTransactionById(authorization, id, projectId)

Retrieve Transaction by ID

Retrieve transaction by ID

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = TransactionApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val id : kotlin.String = id_example // kotlin.String | 
val projectId : kotlin.String = projectId_example // kotlin.String | 
try {
    val result : Transaction = apiInstance.transactionControllerTransactionById(authorization, id, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionApi#transactionControllerTransactionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionApi#transactionControllerTransactionById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **id** | **kotlin.String**|  |
 **projectId** | **kotlin.String**|  |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transactionControllerTransactions"></a>
# **transactionControllerTransactions**
> Transaction transactionControllerTransactions(authorization, projectId, collectionId, playerId, sort, order, searchText, limit, page)

Retrieve transactions

Retrieve all transactions.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = TransactionApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val projectId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Game/project ID to find transactions in your game. Example: Fortnite, Minecraft, etc.
val collectionId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Filter transactions by collection. Example: Get transactions only from Weapons collection.
val playerId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Player ID to mint to. You can provide player ID or player address
val sort : kotlin.String = name // kotlin.String | Asset field to sort by. You can sort by name, created_on and etc.
val order : kotlin.String = ASC // kotlin.String | Sort order (ASC for ascending or DESC for descending)
val searchText : kotlin.String = Hammer // kotlin.String | Search transactions by name
val limit : java.math.BigDecimal = 10 // java.math.BigDecimal | Number of transactions to return per page
val page : java.math.BigDecimal = 1 // java.math.BigDecimal | Page number
try {
    val result : Transaction = apiInstance.transactionControllerTransactions(authorization, projectId, collectionId, playerId, sort, order, searchText, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionApi#transactionControllerTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionApi#transactionControllerTransactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **projectId** | **kotlin.String**| Game/project ID to find transactions in your game. Example: Fortnite, Minecraft, etc. |
 **collectionId** | **kotlin.String**| Filter transactions by collection. Example: Get transactions only from Weapons collection. | [optional]
 **playerId** | **kotlin.String**| Player ID to mint to. You can provide player ID or player address | [optional]
 **sort** | **kotlin.String**| Asset field to sort by. You can sort by name, created_on and etc. | [optional]
 **order** | **kotlin.String**| Sort order (ASC for ascending or DESC for descending) | [optional] [enum: ASC, DESC]
 **searchText** | **kotlin.String**| Search transactions by name | [optional]
 **limit** | **java.math.BigDecimal**| Number of transactions to return per page | [optional]
 **page** | **java.math.BigDecimal**| Page number | [optional]

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transactionControllerWebhook"></a>
# **transactionControllerWebhook**
> transactionControllerWebhook(authorization)



### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = TransactionApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
try {
    apiInstance.transactionControllerWebhook(authorization)
} catch (e: ClientException) {
    println("4xx response calling TransactionApi#transactionControllerWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionApi#transactionControllerWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

