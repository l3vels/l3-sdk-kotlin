
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier for the transaction entity. | 
**status** | **kotlin.String** | Transaction status in Blockchain. Can be pending, success or fail | 
**from** | **kotlin.String** | Address of the sender of the transaction. | 
**to** | **kotlin.String** | Address of the receiver of the transaction. It can be contract address or player address if it is a transfer transaction. | 
**contractId** | **kotlin.String** | Contract ID the transaction is associated with. | 
**contractAddress** | **kotlin.String** | Contract address where the transaction happened. | 
**blockchain** | **kotlin.String** | Main blockchain identifier: Ethereum, Polygon, etc. | 
**chainName** | **kotlin.String** | Chain name identifier: Ethereum, Goerli, Sepolia, PolygonPoS, etc. | 
**chainId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Chain ID: 1 for Ethereum, 5 for Goerli, 80001 for Polygon Mumbai, etc. | 
**environment** | **kotlin.String** | Chain environment: Testnet, Mainnet, etc. | 
**transactionHash** | **kotlin.String** | Unique transaction hash in the blockchain. | 
**blockNumber** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Unique block number in the blockchain. | 
**type** | **kotlin.String** | Transaction type: Mint, Transfer, Award, Airdrop, etc. | 
**method** | **kotlin.String** | Function method name that was called in smart contract | 
**events** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of events that were emitted in the transaction | 
**projectId** | **kotlin.String** | The unique identifier of the project that the transaction is associated with. This allows developers to organize their transactions by project and helps with tracking and reporting. | 
**collectionId** | **kotlin.String** | The unique identifier of the collection that the transaction is associated with. This allows developers to organize their transactions by project and helps with tracking and reporting. | 
**accountId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The unique identifier of the account that the transaction belongs to. | 
**createdOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the collection was created. | 
**modifiedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the collection was last modified. | 
**createdBy** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The Id of the user who created the collection. | 
**modifiedBy** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The Id of the user who last modified the collection. | 



