
# CreatePlayerDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the player. | 
**projectId** | **kotlin.String** | Game/project ID to create the player for. Example: Create player Jack for game Fortnite. | 
**uniqueId** | **kotlin.String** | You can send your generated unique ID for player if it&#39;s handy for game. If field is empty, we will generate unique ID. |  [optional]
**username** | **kotlin.String** | The username of the player. |  [optional]
**email** | **kotlin.String** | The email of the player. |  [optional]
**avatar** | **kotlin.String** | The image URL of the player avatar. |  [optional]
**isCreateWallet** | **kotlin.Boolean** | Should create wallet for player or not. |  [optional]
**customProps** | **kotlin.collections.List&lt;kotlin.String&gt;** | Custom props for player. |  [optional]



