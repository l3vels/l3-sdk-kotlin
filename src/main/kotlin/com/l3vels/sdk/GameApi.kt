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

package com.l3vels.sdk

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import com.l3vels.sdk.model.Project

import com.squareup.moshi.Json

import com.l3vels.sdk.infrastructure.ApiClient
import com.l3vels.sdk.infrastructure.ApiResponse
import com.l3vels.sdk.infrastructure.ClientException
import com.l3vels.sdk.infrastructure.ClientError
import com.l3vels.sdk.infrastructure.ServerException
import com.l3vels.sdk.infrastructure.ServerError
import com.l3vels.sdk.infrastructure.MultiValueMap
import com.l3vels.sdk.infrastructure.PartConfig
import com.l3vels.sdk.infrastructure.RequestConfig
import com.l3vels.sdk.infrastructure.RequestMethod
import com.l3vels.sdk.infrastructure.ResponseType
import com.l3vels.sdk.infrastructure.Success
import com.l3vels.sdk.infrastructure.toMultiValue

class GameApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api-dev.l3vels.xyz")
        }
    }

    /**
     * Retrieve Game
     * Get game/project by ID created on the platform.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param id Game or Project Id
     * @return Project
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun projectControllerProjectById(authorization: kotlin.String, id: kotlin.String) : Project {
        val localVarResponse = projectControllerProjectByIdWithHttpInfo(authorization = authorization, id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Project
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Retrieve Game
     * Get game/project by ID created on the platform.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param id Game or Project Id
     * @return ApiResponse<Project?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun projectControllerProjectByIdWithHttpInfo(authorization: kotlin.String, id: kotlin.String) : ApiResponse<Project?> {
        val localVariableConfig = projectControllerProjectByIdRequestConfig(authorization = authorization, id = id)

        return request<Unit, Project>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation projectControllerProjectById
     *
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param id Game or Project Id
     * @return RequestConfig
     */
    fun projectControllerProjectByIdRequestConfig(authorization: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v1/game/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
