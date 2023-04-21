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
 * @param id The unique identifier for the Player entity.
 * @param uniqueId The unique ID of the Player that can be provided by customers or generated by us.
 * @param name The name of the player
 * @param username Username of the player
 * @param email Email of the player
 * @param avatar Avatar URL of the player
 * @param customProps Custom props for player
 * @param lastSeen The date when player was active last time
 * @param accountId The unique identifier of the account that the Player belongs to.
 * @param projectId The unique identifier of the project that the Player is associated with. This allows developers to organize their players by project and helps with tracking and reporting. Example: Player Jack is associated with project Fortnite.
 * @param createdOn The date when the player was created.
 * @param modifiedOn The date when the player was last modified.
 * @param createdBy The Id of the user who created the player.
 * @param modifiedBy The Id of the user who last modified the player.
 * @param isCreateWallet Boolean value indicating whether the player has wallet or not
 */


data class Player (

    /* The unique identifier for the Player entity. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The unique ID of the Player that can be provided by customers or generated by us. */
    @Json(name = "unique_id")
    val uniqueId: kotlin.String,

    /* The name of the player */
    @Json(name = "name")
    val name: kotlin.String,

    /* Username of the player */
    @Json(name = "username")
    val username: kotlin.String,

    /* Email of the player */
    @Json(name = "email")
    val email: kotlin.String,

    /* Avatar URL of the player */
    @Json(name = "avatar")
    val avatar: kotlin.String,

    /* Custom props for player */
    @Json(name = "custom_props")
    val customProps: kotlin.Any,

    /* The date when player was active last time */
    @Json(name = "last_seen")
    val lastSeen: java.time.OffsetDateTime,

    /* The unique identifier of the account that the Player belongs to. */
    @Json(name = "account_id")
    val accountId: java.math.BigDecimal,

    /* The unique identifier of the project that the Player is associated with. This allows developers to organize their players by project and helps with tracking and reporting. Example: Player Jack is associated with project Fortnite. */
    @Json(name = "project_id")
    val projectId: kotlin.String,

    /* The date when the player was created. */
    @Json(name = "created_on")
    val createdOn: java.time.OffsetDateTime,

    /* The date when the player was last modified. */
    @Json(name = "modified_on")
    val modifiedOn: java.time.OffsetDateTime,

    /* The Id of the user who created the player. */
    @Json(name = "created_by")
    val createdBy: java.math.BigDecimal,

    /* The Id of the user who last modified the player. */
    @Json(name = "modified_by")
    val modifiedBy: java.math.BigDecimal,

    /* Boolean value indicating whether the player has wallet or not */
    @Json(name = "is_create_wallet")
    val isCreateWallet: kotlin.Boolean

)
