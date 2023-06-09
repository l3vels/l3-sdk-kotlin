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

import com.l3vels.sdk.model.MintBatchDto
import com.l3vels.sdk.model.MintDto

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

class MintApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api-dev.l3vels.xyz")
        }
    }

    /**
     * Airdrop asset to player
     * Airdrop asset to player
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun mintControllerAirdrop(authorization: kotlin.String, mintDto: MintDto) : Unit {
        val localVarResponse = mintControllerAirdropWithHttpInfo(authorization = authorization, mintDto = mintDto)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Airdrop asset to player
     * Airdrop asset to player
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun mintControllerAirdropWithHttpInfo(authorization: kotlin.String, mintDto: MintDto) : ApiResponse<Unit?> {
        val localVariableConfig = mintControllerAirdropRequestConfig(authorization = authorization, mintDto = mintDto)

        return request<MintDto, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation mintControllerAirdrop
     *
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return RequestConfig
     */
    fun mintControllerAirdropRequestConfig(authorization: kotlin.String, mintDto: MintDto) : RequestConfig<MintDto> {
        val localVariableBody = mintDto
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v1/mint/airdrop",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Award asset to player
     * Award asset to player
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun mintControllerAward(authorization: kotlin.String, mintDto: MintDto) : Unit {
        val localVarResponse = mintControllerAwardWithHttpInfo(authorization = authorization, mintDto = mintDto)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Award asset to player
     * Award asset to player
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun mintControllerAwardWithHttpInfo(authorization: kotlin.String, mintDto: MintDto) : ApiResponse<Unit?> {
        val localVariableConfig = mintControllerAwardRequestConfig(authorization = authorization, mintDto = mintDto)

        return request<MintDto, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation mintControllerAward
     *
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return RequestConfig
     */
    fun mintControllerAwardRequestConfig(authorization: kotlin.String, mintDto: MintDto) : RequestConfig<MintDto> {
        val localVariableBody = mintDto
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v1/mint/award",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Mint asset
     * Mint an asset by admin to player
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun mintControllerMint(authorization: kotlin.String, mintDto: MintDto) : Unit {
        val localVarResponse = mintControllerMintWithHttpInfo(authorization = authorization, mintDto = mintDto)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Mint asset
     * Mint an asset by admin to player
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun mintControllerMintWithHttpInfo(authorization: kotlin.String, mintDto: MintDto) : ApiResponse<Unit?> {
        val localVariableConfig = mintControllerMintRequestConfig(authorization = authorization, mintDto = mintDto)

        return request<MintDto, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation mintControllerMint
     *
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return RequestConfig
     */
    fun mintControllerMintRequestConfig(authorization: kotlin.String, mintDto: MintDto) : RequestConfig<MintDto> {
        val localVariableBody = mintDto
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v1/mint",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Batch mint assets
     * Batch mint assets by admin to player
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintBatchDto 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun mintControllerMintBatch(authorization: kotlin.String, mintBatchDto: MintBatchDto) : Unit {
        val localVarResponse = mintControllerMintBatchWithHttpInfo(authorization = authorization, mintBatchDto = mintBatchDto)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Batch mint assets
     * Batch mint assets by admin to player
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintBatchDto 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun mintControllerMintBatchWithHttpInfo(authorization: kotlin.String, mintBatchDto: MintBatchDto) : ApiResponse<Unit?> {
        val localVariableConfig = mintControllerMintBatchRequestConfig(authorization = authorization, mintBatchDto = mintBatchDto)

        return request<MintBatchDto, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation mintControllerMintBatch
     *
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintBatchDto 
     * @return RequestConfig
     */
    fun mintControllerMintBatchRequestConfig(authorization: kotlin.String, mintBatchDto: MintBatchDto) : RequestConfig<MintBatchDto> {
        val localVariableBody = mintBatchDto
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v1/mint/batch",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Mint asset by player
     * Mint asset by player. Player must have enough balance to mint.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun mintControllerPlayerMint(authorization: kotlin.String, mintDto: MintDto) : Unit {
        val localVarResponse = mintControllerPlayerMintWithHttpInfo(authorization = authorization, mintDto = mintDto)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Mint asset by player
     * Mint asset by player. Player must have enough balance to mint.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun mintControllerPlayerMintWithHttpInfo(authorization: kotlin.String, mintDto: MintDto) : ApiResponse<Unit?> {
        val localVariableConfig = mintControllerPlayerMintRequestConfig(authorization = authorization, mintDto = mintDto)

        return request<MintDto, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation mintControllerPlayerMint
     *
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintDto 
     * @return RequestConfig
     */
    fun mintControllerPlayerMintRequestConfig(authorization: kotlin.String, mintDto: MintDto) : RequestConfig<MintDto> {
        val localVariableBody = mintDto
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v1/mint/player",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Batch mint assets by player
     * Batch mint assets by player. Player must have enough balance to mint.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintBatchDto 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun mintControllerPlayerMintBatch(authorization: kotlin.String, mintBatchDto: MintBatchDto) : Unit {
        val localVarResponse = mintControllerPlayerMintBatchWithHttpInfo(authorization = authorization, mintBatchDto = mintBatchDto)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Batch mint assets by player
     * Batch mint assets by player. Player must have enough balance to mint.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintBatchDto 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun mintControllerPlayerMintBatchWithHttpInfo(authorization: kotlin.String, mintBatchDto: MintBatchDto) : ApiResponse<Unit?> {
        val localVariableConfig = mintControllerPlayerMintBatchRequestConfig(authorization = authorization, mintBatchDto = mintBatchDto)

        return request<MintBatchDto, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation mintControllerPlayerMintBatch
     *
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API.
     * @param mintBatchDto 
     * @return RequestConfig
     */
    fun mintControllerPlayerMintBatchRequestConfig(authorization: kotlin.String, mintBatchDto: MintBatchDto) : RequestConfig<MintBatchDto> {
        val localVariableBody = mintBatchDto
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v1/mint/batch-player",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
