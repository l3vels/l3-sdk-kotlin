
# Collection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier for the collection entity. | 
**uniqueId** | **kotlin.String** | The unique identifier that can be provided by game studio. | 
**name** | **kotlin.String** | The name of the collection. | 
**description** | **kotlin.String** | A brief description of the collection. | 
**logoImage** | **kotlin.String** | An image representing the collection&#39;s logo. | 
**medias** | **kotlin.collections.List&lt;kotlin.String&gt;** | Additional images associated with the collection, such as screenshots or promotional images. | 
**mainMedia** | **kotlin.String** | The main or featured image associated with the game. You can set it from the dashboard as main image. | 
**url** | **kotlin.String** | A unique URL for the collection on the L3vels platform. | 
**webLink** | **kotlin.String** | A URL link to the collection&#39;s webpage. | 
**supply** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The supply represents the number of assets that are available within the Collection. | 
**customPropertyProps** | [**kotlin.Any**](.md) | Custom properties that are unique to the collection and defined by the developer to categorize and filter them. | 
**socialLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** | Additional social links associated with the collection | 
**customAssetProps** | [**kotlin.Any**](.md) | Custom assets fields associated with the collection. | 
**categories** | [**kotlin.Any**](.md) | The category or categories that the collection belongs to. | 
**status** | **kotlin.String** | The current status of the collection. Possible values are: Draft, Active | 
**accountId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The unique identifier of the account that the Collection belongs to. | 
**projectId** | **kotlin.String** | The unique identifier of the project that the collection is associated with. This allows developers to organize their collections by project and helps with tracking and reporting. | 
**createdOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the collection was created. | 
**modifiedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the collection was last modified. | 
**createdBy** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The Id of the user who created the collection. | 
**modifiedBy** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The Id of the user who last modified the collection. | 



