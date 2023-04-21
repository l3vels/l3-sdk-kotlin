# com.l3vels.sdk - Kotlin client library for L3vels Api

L3vels API for Game developers

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 0.3
- Package version: 
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen
For more information, please visit [https://l3vels.com](https://l3vels.com)

## Requires

* Kotlin 1.7.21
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api-dev.l3vels.xyz*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetApi* | [**countByGame**](docs/AssetApi.md#countbygame) | **GET** /v1/asset/count/{project_id} | Count assets
*AssetApi* | [**getAssetById**](docs/AssetApi.md#getassetbyid) | **GET** /v1/asset/{project_id}/{id} | Retrieve asset by ID
*AssetApi* | [**getAssets**](docs/AssetApi.md#getassets) | **GET** /v1/asset | Retrieve assets
*AssetApi* | [**updateAsset**](docs/AssetApi.md#updateasset) | **PATCH** /v1/asset/{id} | Update asset
*CollectionApi* | [**countCollectionsByGameId**](docs/CollectionApi.md#countcollectionsbygameid) | **GET** /v1/collection/count/{project_id} | Count collections
*CollectionApi* | [**getCollectionById**](docs/CollectionApi.md#getcollectionbyid) | **GET** /v1/collection/{project_id}/{id} | Retrieve collection by ID
*CollectionApi* | [**getCollections**](docs/CollectionApi.md#getcollections) | **GET** /v1/collection | Retrieve collections
*ContractApi* | [**contractControllerCollectionSize**](docs/ContractApi.md#contractcontrollercollectionsize) | **GET** /v1/contract/collection-size | Collection size
*ContractApi* | [**contractControllerContractUri**](docs/ContractApi.md#contractcontrollercontracturi) | **GET** /v1/contract/contract-uri | Get Contract URI
*ContractApi* | [**contractControllerSetContractUri**](docs/ContractApi.md#contractcontrollersetcontracturi) | **PUT** /v1/contract/contract-uri | Update Contract URI
*ContractApi* | [**contractControllerSetSaleStatus**](docs/ContractApi.md#contractcontrollersetsalestatus) | **PUT** /v1/contract/sale-status | Update Sale status
*GameApi* | [**projectControllerProjectById**](docs/GameApi.md#projectcontrollerprojectbyid) | **GET** /v1/game/{id} | Retrieve Game
*MintApi* | [**mintControllerAirdrop**](docs/MintApi.md#mintcontrollerairdrop) | **POST** /v1/mint/airdrop | Airdrop asset to player
*MintApi* | [**mintControllerAward**](docs/MintApi.md#mintcontrolleraward) | **POST** /v1/mint/award | Award asset to player
*MintApi* | [**mintControllerMint**](docs/MintApi.md#mintcontrollermint) | **POST** /v1/mint | Mint asset
*MintApi* | [**mintControllerMintBatch**](docs/MintApi.md#mintcontrollermintbatch) | **POST** /v1/mint/batch | Batch mint assets
*MintApi* | [**mintControllerPlayerMint**](docs/MintApi.md#mintcontrollerplayermint) | **POST** /v1/mint/player | Mint asset by player
*MintApi* | [**mintControllerPlayerMintBatch**](docs/MintApi.md#mintcontrollerplayermintbatch) | **POST** /v1/mint/batch-player | Batch mint assets by player
*PlayerApi* | [**playerAssetControllerPlayerAssetById**](docs/PlayerApi.md#playerassetcontrollerplayerassetbyid) | **GET** /v1/player-asset/{project_id}/{id} | Retrieve player asset by ID
*PlayerApi* | [**playerAssetControllerPlayerAssets**](docs/PlayerApi.md#playerassetcontrollerplayerassets) | **GET** /v1/player-asset | Retrieve player assets
*PlayerApi* | [**playerControllerCreatePlayer**](docs/PlayerApi.md#playercontrollercreateplayer) | **POST** /v1/player | Create new player
*PlayerApi* | [**playerControllerDeletePlayer**](docs/PlayerApi.md#playercontrollerdeleteplayer) | **DELETE** /v1/player | Delete a Player
*PlayerApi* | [**playerControllerGetPlayers**](docs/PlayerApi.md#playercontrollergetplayers) | **GET** /v1/player | Retrieve players
*PlayerApi* | [**playerControllerPlayerById**](docs/PlayerApi.md#playercontrollerplayerbyid) | **GET** /v1/player/{project_id}/{id} | Retrieve player by ID
*PlayerApi* | [**playerControllerPlayersCountByGameId**](docs/PlayerApi.md#playercontrollerplayerscountbygameid) | **GET** /v1/player/count/{project_id} | Count players
*PlayerApi* | [**playerControllerUpdatePlayer**](docs/PlayerApi.md#playercontrollerupdateplayer) | **PUT** /v1/player | Update an existing Player
*TransactionApi* | [**transactionControllerTransactionById**](docs/TransactionApi.md#transactioncontrollertransactionbyid) | **GET** /v1/transaction/{project_id}/{id} | Retrieve Transaction by ID
*TransactionApi* | [**transactionControllerTransactions**](docs/TransactionApi.md#transactioncontrollertransactions) | **GET** /v1/transaction | Retrieve transactions
*TransactionApi* | [**transactionControllerWebhook**](docs/TransactionApi.md#transactioncontrollerwebhook) | **POST** /v1/transaction/webhook | 
*UtilitiesApi* | [**utilityControllerHealth**](docs/UtilitiesApi.md#utilitycontrollerhealth) | **GET** /v1/utilities/health | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.l3vels.sdk.model.Asset](docs/Asset.md)
 - [com.l3vels.sdk.model.AssetsResponseDto](docs/AssetsResponseDto.md)
 - [com.l3vels.sdk.model.Collection](docs/Collection.md)
 - [com.l3vels.sdk.model.CreatePlayerDto](docs/CreatePlayerDto.md)
 - [com.l3vels.sdk.model.MintBatchDto](docs/MintBatchDto.md)
 - [com.l3vels.sdk.model.MintDto](docs/MintDto.md)
 - [com.l3vels.sdk.model.MintDtoAsset](docs/MintDtoAsset.md)
 - [com.l3vels.sdk.model.Player](docs/Player.md)
 - [com.l3vels.sdk.model.PlayerAsset](docs/PlayerAsset.md)
 - [com.l3vels.sdk.model.Project](docs/Project.md)
 - [com.l3vels.sdk.model.SetContractUriDto](docs/SetContractUriDto.md)
 - [com.l3vels.sdk.model.SetSaleStatusDto](docs/SetSaleStatusDto.md)
 - [com.l3vels.sdk.model.TokenDto](docs/TokenDto.md)
 - [com.l3vels.sdk.model.Transaction](docs/Transaction.md)
 - [com.l3vels.sdk.model.UpdateAssetDto](docs/UpdateAssetDto.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="X-API-KEY"></a>
### X-API-KEY

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header



## Author

support@l3vels.xyz
