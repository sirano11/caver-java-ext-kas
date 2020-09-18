/*
 * Token History API
 * # Introduction  Token History API는 KLAY, FT (KIP-7, Labeled ERC-20), NFT (KIP-17, Labeled ERC-721) 토큰 정보, 이들 토큰을 주고받은 기록을 조회하는 기능을 제공합니다. 여러분은 특정 EOA가 KLAY를 주고받은 기록을 확인하거나 EOA가 가지고 있는 NFT 정보를 불러오는 등 Token History API를 다양하게 활용할 수 있습니다.   Token History API 사용에 관한 자세한 내용은 [튜토리얼](https://klaytn.com)을 확인하십시오.   이 문서 혹은 KAS에 관한 문의는 [개발자 포럼](https://forum.klaytn.com/)을 방문해 도움을 받으십시오  
 *
 * OpenAPI spec version: 0.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api.tokenhistory.v2.api;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.api.tokenhistory.v2.model.Nft;
import io.swagger.client.api.tokenhistory.v2.model.PageableNfts;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenApi {
    private ApiClient apiClient;

    public TokenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getNftById
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param nftAddress 조회할 NFT 컨트랙트 주소  (required)
     * @param tokenId 조회할 NFT ID (16진수) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNftByIdCall(String xChainId, String nftAddress, String tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/contract/nft/{nft-address}/token/{token-id}"
            .replaceAll("\\{" + "nft-address" + "\\}", apiClient.escapeString(nftAddress.toString()))
            .replaceAll("\\{" + "token-id" + "\\}", apiClient.escapeString(tokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChainId != null)
        localVarHeaderParams.put("x-chain-id", apiClient.parameterToString(xChainId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getNftByIdValidateBeforeCall(String xChainId, String nftAddress, String tokenId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling getNftById(Async)");
        }
        // verify the required parameter 'nftAddress' is set
        if (nftAddress == null) {
            throw new ApiException("Missing the required parameter 'nftAddress' when calling getNftById(Async)");
        }
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling getNftById(Async)");
        }
        
        com.squareup.okhttp.Call call = getNftByIdCall(xChainId, nftAddress, tokenId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 특정 NFT 토큰 정보 조회
     * 특정 NFT의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param nftAddress 조회할 NFT 컨트랙트 주소  (required)
     * @param tokenId 조회할 NFT ID (16진수) (required)
     * @return Nft
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Nft getNftById(String xChainId, String nftAddress, String tokenId) throws ApiException {
        ApiResponse<Nft> resp = getNftByIdWithHttpInfo(xChainId, nftAddress, tokenId);
        return resp.getData();
    }

    /**
     * 특정 NFT 토큰 정보 조회
     * 특정 NFT의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param nftAddress 조회할 NFT 컨트랙트 주소  (required)
     * @param tokenId 조회할 NFT ID (16진수) (required)
     * @return ApiResponse&lt;Nft&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Nft> getNftByIdWithHttpInfo(String xChainId, String nftAddress, String tokenId) throws ApiException {
        com.squareup.okhttp.Call call = getNftByIdValidateBeforeCall(xChainId, nftAddress, tokenId, null, null);
        Type localVarReturnType = new TypeToken<Nft>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 특정 NFT 토큰 정보 조회 (asynchronously)
     * 특정 NFT의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param nftAddress 조회할 NFT 컨트랙트 주소  (required)
     * @param tokenId 조회할 NFT ID (16진수) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNftByIdAsync(String xChainId, String nftAddress, String tokenId, final ApiCallback<Nft> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNftByIdValidateBeforeCall(xChainId, nftAddress, tokenId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Nft>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNftsByContractAddress
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param nftAddress  (required)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNftsByContractAddressCall(String xChainId, String nftAddress, Long size, String cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/contract/nft/{nft-address}/token"
            .replaceAll("\\{" + "nft-address" + "\\}", apiClient.escapeString(nftAddress.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChainId != null)
        localVarHeaderParams.put("x-chain-id", apiClient.parameterToString(xChainId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getNftsByContractAddressValidateBeforeCall(String xChainId, String nftAddress, Long size, String cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling getNftsByContractAddress(Async)");
        }
        // verify the required parameter 'nftAddress' is set
        if (nftAddress == null) {
            throw new ApiException("Missing the required parameter 'nftAddress' when calling getNftsByContractAddress(Async)");
        }
        
        com.squareup.okhttp.Call call = getNftsByContractAddressCall(xChainId, nftAddress, size, cursor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 특정 NFT 컨트랙트의 모든 토큰 정보 조회
     * NFT 컨트랙트를 지정하면, 이 NFT 컨트랙트에서 발행된 모든 NFT의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param nftAddress  (required)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @return PageableNfts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageableNfts getNftsByContractAddress(String xChainId, String nftAddress, Long size, String cursor) throws ApiException {
        ApiResponse<PageableNfts> resp = getNftsByContractAddressWithHttpInfo(xChainId, nftAddress, size, cursor);
        return resp.getData();
    }

    /**
     * 특정 NFT 컨트랙트의 모든 토큰 정보 조회
     * NFT 컨트랙트를 지정하면, 이 NFT 컨트랙트에서 발행된 모든 NFT의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param nftAddress  (required)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @return ApiResponse&lt;PageableNfts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageableNfts> getNftsByContractAddressWithHttpInfo(String xChainId, String nftAddress, Long size, String cursor) throws ApiException {
        com.squareup.okhttp.Call call = getNftsByContractAddressValidateBeforeCall(xChainId, nftAddress, size, cursor, null, null);
        Type localVarReturnType = new TypeToken<PageableNfts>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 특정 NFT 컨트랙트의 모든 토큰 정보 조회 (asynchronously)
     * NFT 컨트랙트를 지정하면, 이 NFT 컨트랙트에서 발행된 모든 NFT의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param nftAddress  (required)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNftsByContractAddressAsync(String xChainId, String nftAddress, Long size, String cursor, final ApiCallback<PageableNfts> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNftsByContractAddressValidateBeforeCall(xChainId, nftAddress, size, cursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageableNfts>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNftsByOwnerAddress
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param nftAddress 조회할 컨트랙트 주소 (required)
     * @param ownerAddress 조회할 EOA 주소 (required)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNftsByOwnerAddressCall(String xChainId, String nftAddress, String ownerAddress, Long size, String cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/contract/nft/{nft-address}/owner/{owner-address}"
            .replaceAll("\\{" + "nft-address" + "\\}", apiClient.escapeString(nftAddress.toString()))
            .replaceAll("\\{" + "owner-address" + "\\}", apiClient.escapeString(ownerAddress.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChainId != null)
        localVarHeaderParams.put("x-chain-id", apiClient.parameterToString(xChainId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getNftsByOwnerAddressValidateBeforeCall(String xChainId, String nftAddress, String ownerAddress, Long size, String cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling getNftsByOwnerAddress(Async)");
        }
        // verify the required parameter 'nftAddress' is set
        if (nftAddress == null) {
            throw new ApiException("Missing the required parameter 'nftAddress' when calling getNftsByOwnerAddress(Async)");
        }
        // verify the required parameter 'ownerAddress' is set
        if (ownerAddress == null) {
            throw new ApiException("Missing the required parameter 'ownerAddress' when calling getNftsByOwnerAddress(Async)");
        }
        
        com.squareup.okhttp.Call call = getNftsByOwnerAddressCall(xChainId, nftAddress, ownerAddress, size, cursor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 특정 EOA가 가진 모든 토큰 정보 조회
     * NFT 컨트랙트와 EOA를 지정하면, 이 NFT 컨트랙트에서 발행된 NFT 중 EOA가 가지고 있는 NFT의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param nftAddress 조회할 컨트랙트 주소 (required)
     * @param ownerAddress 조회할 EOA 주소 (required)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @return PageableNfts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageableNfts getNftsByOwnerAddress(String xChainId, String nftAddress, String ownerAddress, Long size, String cursor) throws ApiException {
        ApiResponse<PageableNfts> resp = getNftsByOwnerAddressWithHttpInfo(xChainId, nftAddress, ownerAddress, size, cursor);
        return resp.getData();
    }

    /**
     * 특정 EOA가 가진 모든 토큰 정보 조회
     * NFT 컨트랙트와 EOA를 지정하면, 이 NFT 컨트랙트에서 발행된 NFT 중 EOA가 가지고 있는 NFT의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param nftAddress 조회할 컨트랙트 주소 (required)
     * @param ownerAddress 조회할 EOA 주소 (required)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @return ApiResponse&lt;PageableNfts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageableNfts> getNftsByOwnerAddressWithHttpInfo(String xChainId, String nftAddress, String ownerAddress, Long size, String cursor) throws ApiException {
        com.squareup.okhttp.Call call = getNftsByOwnerAddressValidateBeforeCall(xChainId, nftAddress, ownerAddress, size, cursor, null, null);
        Type localVarReturnType = new TypeToken<PageableNfts>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 특정 EOA가 가진 모든 토큰 정보 조회 (asynchronously)
     * NFT 컨트랙트와 EOA를 지정하면, 이 NFT 컨트랙트에서 발행된 NFT 중 EOA가 가지고 있는 NFT의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param nftAddress 조회할 컨트랙트 주소 (required)
     * @param ownerAddress 조회할 EOA 주소 (required)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNftsByOwnerAddressAsync(String xChainId, String nftAddress, String ownerAddress, Long size, String cursor, final ApiCallback<PageableNfts> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNftsByOwnerAddressValidateBeforeCall(xChainId, nftAddress, ownerAddress, size, cursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageableNfts>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
