/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.l3vels.sdk.model


import com.squareup.moshi.Json

/**
 * 
 *
 * @param amount Amount to mint
 * @param tokenId Token ID to mint. You can provide this or asset_id
 * @param assetId Asset ID to mint. You can provide this or token_id
 */


data class TokenDto (

    /* Amount to mint */
    @Json(name = "amount")
    val amount: java.math.BigDecimal,

    /* Token ID to mint. You can provide this or asset_id */
    @Json(name = "token_id")
    val tokenId: java.math.BigDecimal? = null,

    /* Asset ID to mint. You can provide this or token_id */
    @Json(name = "asset_id")
    val assetId: kotlin.String? = null

)
