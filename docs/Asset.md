
# Asset

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier for the asset entity. | 
**tokenId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The token id of the asset. | 
**name** | **kotlin.String** | The name of the asset. | 
**parentId** | **kotlin.String** | ID of the parent asset. | 
**properties** | [**kotlin.Any**](.md) | Custom properties of the asset. | 
**attributes** | [**kotlin.Any**](.md) | Custom attributes of the asset. | 
**description** | **kotlin.String** | The description of the asset. | 
**status** | **kotlin.String** | The status of the asset. | 
**price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The price of the asset. | 
**supply** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The supply of the asset. | 
**mintedAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The minted amount of the asset. | 
**assetType** | **kotlin.String** | The asset type. Can be main or nested. | 
**assetUrl** | **kotlin.String** | The asset URL. | 
**medias** | **kotlin.collections.List&lt;kotlin.String&gt;** | Additional images associated with the asset, such as screenshots or promotional images. | 
**mainMedia** | **kotlin.String** | The main or featured image associated with the asset. You can set it from the Dashboard as main image. | 
**accountId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The unique identifier of the account that the Collection belongs to. | 
**projectId** | **kotlin.String** | The unique identifier of the project that the asset is associated with. This allows developers to organize their assets by project and helps with tracking and reporting. | 
**collectionId** | **kotlin.String** | The unique identifier of the collection that the asset is associated with. This allows developers to organize their collections by project and helps with tracking and reporting. | 
**createdOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the collection was created. | 
**modifiedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the collection was last modified. | 
**createdBy** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The Id of the user who created the collection. | 
**modifiedBy** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The Id of the user who last modified the collection. | 



