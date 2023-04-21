# PlayerApi

All URIs are relative to *https://api-dev.l3vels.xyz*

Method | HTTP request | Description
------------- | ------------- | -------------
[**playerAssetControllerPlayerAssetById**](PlayerApi.md#playerAssetControllerPlayerAssetById) | **GET** /v1/player-asset/{project_id}/{id} | Retrieve player asset by ID
[**playerAssetControllerPlayerAssets**](PlayerApi.md#playerAssetControllerPlayerAssets) | **GET** /v1/player-asset | Retrieve player assets
[**playerControllerCreatePlayer**](PlayerApi.md#playerControllerCreatePlayer) | **POST** /v1/player | Create new player
[**playerControllerDeletePlayer**](PlayerApi.md#playerControllerDeletePlayer) | **DELETE** /v1/player | Delete a Player
[**playerControllerGetPlayers**](PlayerApi.md#playerControllerGetPlayers) | **GET** /v1/player | Retrieve players
[**playerControllerPlayerById**](PlayerApi.md#playerControllerPlayerById) | **GET** /v1/player/{project_id}/{id} | Retrieve player by ID
[**playerControllerPlayersCountByGameId**](PlayerApi.md#playerControllerPlayersCountByGameId) | **GET** /v1/player/count/{project_id} | Count players
[**playerControllerUpdatePlayer**](PlayerApi.md#playerControllerUpdatePlayer) | **PUT** /v1/player | Update an existing Player


<a name="playerAssetControllerPlayerAssetById"></a>
# **playerAssetControllerPlayerAssetById**
> PlayerAsset playerAssetControllerPlayerAssetById(authorization, id, projectId)

Retrieve player asset by ID

Retrieve player asset by ID. Player asset represents a single asset that a player owns. It has amount field that represents how many of this asset player owns.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = PlayerApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val id : kotlin.String = id_example // kotlin.String | 
val projectId : kotlin.String = projectId_example // kotlin.String | 
try {
    val result : PlayerAsset = apiInstance.playerAssetControllerPlayerAssetById(authorization, id, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerApi#playerAssetControllerPlayerAssetById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerApi#playerAssetControllerPlayerAssetById")
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

[**PlayerAsset**](PlayerAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerAssetControllerPlayerAssets"></a>
# **playerAssetControllerPlayerAssets**
> kotlin.collections.List&lt;PlayerAsset&gt; playerAssetControllerPlayerAssets(authorization, projectId, assetId, playerId, sort, order, limit, page)

Retrieve player assets

This API method retrieves a list of Player assets that match the specified filter criteria. Developers can use this method to retrieve Player assets by player, game/project or other properties.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = PlayerApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val projectId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc.
val assetId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc.
val playerId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc.
val sort : kotlin.String = name // kotlin.String | Player asset field to sort by. You can sort by name, created_on and etc.
val order : kotlin.String = ASC // kotlin.String | Sort order (ASC for ascending or DESC for descending)
val limit : java.math.BigDecimal = 10 // java.math.BigDecimal | Number of player assets to return per page
val page : java.math.BigDecimal = 1 // java.math.BigDecimal | Page number
try {
    val result : kotlin.collections.List<PlayerAsset> = apiInstance.playerAssetControllerPlayerAssets(authorization, projectId, assetId, playerId, sort, order, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerApi#playerAssetControllerPlayerAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerApi#playerAssetControllerPlayerAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **projectId** | **kotlin.String**| Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc. |
 **assetId** | **kotlin.String**| Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc. | [optional]
 **playerId** | **kotlin.String**| Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc. | [optional]
 **sort** | **kotlin.String**| Player asset field to sort by. You can sort by name, created_on and etc. | [optional]
 **order** | **kotlin.String**| Sort order (ASC for ascending or DESC for descending) | [optional]
 **limit** | **java.math.BigDecimal**| Number of player assets to return per page | [optional]
 **page** | **java.math.BigDecimal**| Page number | [optional]

### Return type

[**kotlin.collections.List&lt;PlayerAsset&gt;**](PlayerAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerControllerCreatePlayer"></a>
# **playerControllerCreatePlayer**
> Player playerControllerCreatePlayer(authorization, createPlayerDto)

Create new player

Create new player for game/project. Example: Create new player Jack in game Call of Duty.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = PlayerApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val createPlayerDto : CreatePlayerDto =  // CreatePlayerDto | 
try {
    val result : Player = apiInstance.playerControllerCreatePlayer(authorization, createPlayerDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerApi#playerControllerCreatePlayer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerApi#playerControllerCreatePlayer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **createPlayerDto** | [**CreatePlayerDto**](CreatePlayerDto.md)|  |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playerControllerDeletePlayer"></a>
# **playerControllerDeletePlayer**
> playerControllerDeletePlayer(authorization)

Delete a Player

This API method allows developers to delete a Player by providing the ID of the Player. Once deleted, the Player and all associated assets will be removed from the system.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = PlayerApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
try {
    apiInstance.playerControllerDeletePlayer(authorization)
} catch (e: ClientException) {
    println("4xx response calling PlayerApi#playerControllerDeletePlayer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerApi#playerControllerDeletePlayer")
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

<a name="playerControllerGetPlayers"></a>
# **playerControllerGetPlayers**
> kotlin.collections.List&lt;Player&gt; playerControllerGetPlayers(authorization, projectId, sort, order, searchText, limit, page)

Retrieve players

Retrieve a list of players that match the specified filter criteria. Developers can use this method to retrieve players by name, category, status, or other properties. Example: Retrieve players from game Call of Duty.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = PlayerApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val projectId : kotlin.String = a44b646a-ae14-4e05-ae09-b12d5e7269bf // kotlin.String | Game/project ID to find player in your game. Example: Fortnite, Minecraft, etc.
val sort : kotlin.String = name // kotlin.String | Player field to sort by. You can sort by name, created_on and etc.
val order : kotlin.String = ASC // kotlin.String | Sort order (ASC for ascending or DESC for descending)
val searchText : kotlin.String = Jack // kotlin.String | Search player by name
val limit : java.math.BigDecimal = 10 // java.math.BigDecimal | Number of players to return per page
val page : java.math.BigDecimal = 1 // java.math.BigDecimal | Page number
try {
    val result : kotlin.collections.List<Player> = apiInstance.playerControllerGetPlayers(authorization, projectId, sort, order, searchText, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerApi#playerControllerGetPlayers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerApi#playerControllerGetPlayers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **projectId** | **kotlin.String**| Game/project ID to find player in your game. Example: Fortnite, Minecraft, etc. |
 **sort** | **kotlin.String**| Player field to sort by. You can sort by name, created_on and etc. | [optional]
 **order** | **kotlin.String**| Sort order (ASC for ascending or DESC for descending) | [optional]
 **searchText** | **kotlin.String**| Search player by name | [optional]
 **limit** | **java.math.BigDecimal**| Number of players to return per page | [optional]
 **page** | **java.math.BigDecimal**| Page number | [optional]

### Return type

[**kotlin.collections.List&lt;Player&gt;**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerControllerPlayerById"></a>
# **playerControllerPlayerById**
> Player playerControllerPlayerById(authorization, id, projectId)

Retrieve player by ID

Retrieves a specific player by ID associated with game/project. Example: retrieve player Jack from game Call of Duty.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = PlayerApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val id : kotlin.String = 9abd57ce-b11c-4828-ab6a-19f568a8081a // kotlin.String | Player ID that you created in your game/project. Example: Jack, George, etc.
val projectId : kotlin.String = 556a2843-b302-4b9d-916c-cefcb5d66053 // kotlin.String | Game/project ID to find asset in. Example: Call of Duty, Fortnite, etc.
try {
    val result : Player = apiInstance.playerControllerPlayerById(authorization, id, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerApi#playerControllerPlayerById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerApi#playerControllerPlayerById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **id** | **kotlin.String**| Player ID that you created in your game/project. Example: Jack, George, etc. |
 **projectId** | **kotlin.String**| Game/project ID to find asset in. Example: Call of Duty, Fortnite, etc. |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerControllerPlayersCountByGameId"></a>
# **playerControllerPlayersCountByGameId**
> java.math.BigDecimal playerControllerPlayersCountByGameId(authorization, projectId)

Count players

Count players in game. Example: count players in game Call of Duty.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = PlayerApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
val projectId : kotlin.String = 1 // kotlin.String | Game Id
try {
    val result : java.math.BigDecimal = apiInstance.playerControllerPlayersCountByGameId(authorization, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerApi#playerControllerPlayersCountByGameId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerApi#playerControllerPlayersCountByGameId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |
 **projectId** | **kotlin.String**| Game Id |

### Return type

[**java.math.BigDecimal**](java.math.BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerControllerUpdatePlayer"></a>
# **playerControllerUpdatePlayer**
> Player playerControllerUpdatePlayer(authorization)

Update an existing Player

This API method allows developers to update an existing Player by providing the ID of the Player and the updated properties and associated assets.

### Example
```kotlin
// Import classes:
//import com.l3vels.sdk.infrastructure.*
//import com.l3vels.sdk.model.*

val apiInstance = PlayerApi()
val authorization : kotlin.String = authorization_example // kotlin.String | API key is associated with multiple projects. Please include it in to use developers API.
try {
    val result : Player = apiInstance.playerControllerUpdatePlayer(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayerApi#playerControllerUpdatePlayer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayerApi#playerControllerUpdatePlayer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| API key is associated with multiple projects. Please include it in to use developers API. |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

