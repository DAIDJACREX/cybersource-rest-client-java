/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;


import Model.CreateP12KeysRequest;
import Model.DeleteBulkP12KeysRequest;
import Model.InlineResponse4005;
import Model.InlineResponse4006;
import Model.InlineResponse5002;
import Model.InlineResponse5021;
import Model.KmsV2KeysAsymDeletesPost200Response;
import Model.KmsV2KeysAsymGet200Response;
import Model.KmsV2KeysAsymPost201Response;
import Model.UpdateAsymKeysRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.tracking.SdkTracker;

public class AsymmetricKeyManagementApi {
    private static Logger logger = LogManager.getLogger(AsymmetricKeyManagementApi.class);
    
    private ApiClient apiClient;

    public AsymmetricKeyManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AsymmetricKeyManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createP12Keys
     * @param createP12KeysRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createP12KeysCall(CreateP12KeysRequest createP12KeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(createP12KeysRequest, CreateP12KeysRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment());
        
        // create path and map variables
        String localVarPath = "/kms/v2/keys-asym";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call createP12KeysValidateBeforeCall(CreateP12KeysRequest createP12KeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createP12KeysRequest' is set
        if (createP12KeysRequest == null) {
            logger.error("Missing the required parameter 'createP12KeysRequest' when calling createP12Keys(Async)");
            throw new ApiException("Missing the required parameter 'createP12KeysRequest' when calling createP12Keys(Async)");
        }
        
        
        okhttp3.Call call = createP12KeysCall(createP12KeysRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create one or more PKCS12 keys
     * &#39;Create one or more PKCS12 keys&#39; 
     * @param createP12KeysRequest  (required)
     * @return KmsV2KeysAsymPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KmsV2KeysAsymPost201Response createP12Keys(CreateP12KeysRequest createP12KeysRequest) throws ApiException {
        logger.info("CALL TO METHOD 'createP12Keys' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<KmsV2KeysAsymPost201Response> resp = createP12KeysWithHttpInfo(createP12KeysRequest);
        logger.info("CALL TO METHOD 'createP12Keys' ENDED");
        return resp.getData();
    }

    /**
     * Create one or more PKCS12 keys
     * &#39;Create one or more PKCS12 keys&#39; 
     * @param createP12KeysRequest  (required)
     * @return ApiResponse&lt;KmsV2KeysAsymPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KmsV2KeysAsymPost201Response> createP12KeysWithHttpInfo(CreateP12KeysRequest createP12KeysRequest) throws ApiException {
        okhttp3.Call call = createP12KeysValidateBeforeCall(createP12KeysRequest, null, null);
        Type localVarReturnType = new TypeToken<KmsV2KeysAsymPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create one or more PKCS12 keys (asynchronously)
     * &#39;Create one or more PKCS12 keys&#39; 
     * @param createP12KeysRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createP12KeysAsync(CreateP12KeysRequest createP12KeysRequest, final ApiCallback<KmsV2KeysAsymPost201Response> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
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

        okhttp3.Call call = createP12KeysValidateBeforeCall(createP12KeysRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KmsV2KeysAsymPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteBulkP12Keys
     * @param deleteBulkP12KeysRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteBulkP12KeysCall(DeleteBulkP12KeysRequest deleteBulkP12KeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(deleteBulkP12KeysRequest, DeleteBulkP12KeysRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment());
        
        // create path and map variables
        String localVarPath = "/kms/v2/keys-asym/deletes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteBulkP12KeysValidateBeforeCall(DeleteBulkP12KeysRequest deleteBulkP12KeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deleteBulkP12KeysRequest' is set
        if (deleteBulkP12KeysRequest == null) {
            logger.error("Missing the required parameter 'deleteBulkP12KeysRequest' when calling deleteBulkP12Keys(Async)");
            throw new ApiException("Missing the required parameter 'deleteBulkP12KeysRequest' when calling deleteBulkP12Keys(Async)");
        }
        
        
        okhttp3.Call call = deleteBulkP12KeysCall(deleteBulkP12KeysRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete one or more PKCS12 keys
     * &#39;Delete one or more PKCS12 keys&#39; 
     * @param deleteBulkP12KeysRequest  (required)
     * @return KmsV2KeysAsymDeletesPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KmsV2KeysAsymDeletesPost200Response deleteBulkP12Keys(DeleteBulkP12KeysRequest deleteBulkP12KeysRequest) throws ApiException {
        logger.info("CALL TO METHOD 'deleteBulkP12Keys' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<KmsV2KeysAsymDeletesPost200Response> resp = deleteBulkP12KeysWithHttpInfo(deleteBulkP12KeysRequest);
        logger.info("CALL TO METHOD 'deleteBulkP12Keys' ENDED");
        return resp.getData();
    }

    /**
     * Delete one or more PKCS12 keys
     * &#39;Delete one or more PKCS12 keys&#39; 
     * @param deleteBulkP12KeysRequest  (required)
     * @return ApiResponse&lt;KmsV2KeysAsymDeletesPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KmsV2KeysAsymDeletesPost200Response> deleteBulkP12KeysWithHttpInfo(DeleteBulkP12KeysRequest deleteBulkP12KeysRequest) throws ApiException {
        okhttp3.Call call = deleteBulkP12KeysValidateBeforeCall(deleteBulkP12KeysRequest, null, null);
        Type localVarReturnType = new TypeToken<KmsV2KeysAsymDeletesPost200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete one or more PKCS12 keys (asynchronously)
     * &#39;Delete one or more PKCS12 keys&#39; 
     * @param deleteBulkP12KeysRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteBulkP12KeysAsync(DeleteBulkP12KeysRequest deleteBulkP12KeysRequest, final ApiCallback<KmsV2KeysAsymDeletesPost200Response> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
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

        okhttp3.Call call = deleteBulkP12KeysValidateBeforeCall(deleteBulkP12KeysRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KmsV2KeysAsymDeletesPost200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getP12KeyDetails
     * @param keyId Key ID.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getP12KeyDetailsCall(String keyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = null;
        if ("GET".equalsIgnoreCase("POST")) {
            localVarPostBody = "{}";
        }
        
        // create path and map variables
        String localVarPath = "/kms/v2/keys-asym/{keyId}"
            .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getP12KeyDetailsValidateBeforeCall(String keyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'keyId' is set
        if (keyId == null) {
            logger.error("Missing the required parameter 'keyId' when calling getP12KeyDetails(Async)");
            throw new ApiException("Missing the required parameter 'keyId' when calling getP12KeyDetails(Async)");
        }
        
        
        okhttp3.Call call = getP12KeyDetailsCall(keyId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieves PKCS12 key details
     * Retrieves keys details by providing the key id.
     * @param keyId Key ID.  (required)
     * @return KmsV2KeysAsymGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KmsV2KeysAsymGet200Response getP12KeyDetails(String keyId) throws ApiException {
        logger.info("CALL TO METHOD 'getP12KeyDetails' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<KmsV2KeysAsymGet200Response> resp = getP12KeyDetailsWithHttpInfo(keyId);
        logger.info("CALL TO METHOD 'getP12KeyDetails' ENDED");
        return resp.getData();
    }

    /**
     * Retrieves PKCS12 key details
     * Retrieves keys details by providing the key id.
     * @param keyId Key ID.  (required)
     * @return ApiResponse&lt;KmsV2KeysAsymGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KmsV2KeysAsymGet200Response> getP12KeyDetailsWithHttpInfo(String keyId) throws ApiException {
        okhttp3.Call call = getP12KeyDetailsValidateBeforeCall(keyId, null, null);
        Type localVarReturnType = new TypeToken<KmsV2KeysAsymGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves PKCS12 key details (asynchronously)
     * Retrieves keys details by providing the key id.
     * @param keyId Key ID.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getP12KeyDetailsAsync(String keyId, final ApiCallback<KmsV2KeysAsymGet200Response> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
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

        okhttp3.Call call = getP12KeyDetailsValidateBeforeCall(keyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KmsV2KeysAsymGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateAsymKey
     * @param keyId Key ID.  (required)
     * @param updateAsymKeysRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updateAsymKeyCall(String keyId, UpdateAsymKeysRequest updateAsymKeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(updateAsymKeysRequest, UpdateAsymKeysRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment());
        
        // create path and map variables
        String localVarPath = "/kms/v2/keys-asym/{keyId}"
            .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateAsymKeyValidateBeforeCall(String keyId, UpdateAsymKeysRequest updateAsymKeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'keyId' is set
        if (keyId == null) {
            logger.error("Missing the required parameter 'keyId' when calling updateAsymKey(Async)");
            throw new ApiException("Missing the required parameter 'keyId' when calling updateAsymKey(Async)");
        }
        
        // verify the required parameter 'updateAsymKeysRequest' is set
        if (updateAsymKeysRequest == null) {
            logger.error("Missing the required parameter 'updateAsymKeysRequest' when calling updateAsymKey(Async)");
            throw new ApiException("Missing the required parameter 'updateAsymKeysRequest' when calling updateAsymKey(Async)");
        }
        
        
        okhttp3.Call call = updateAsymKeyCall(keyId, updateAsymKeysRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Activate or De-activate Asymmetric Key
     * Activate or De-activate Asymmetric Key 
     * @param keyId Key ID.  (required)
     * @param updateAsymKeysRequest  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object updateAsymKey(String keyId, UpdateAsymKeysRequest updateAsymKeysRequest) throws ApiException {
        logger.info("CALL TO METHOD 'updateAsymKey' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<Object> resp = updateAsymKeyWithHttpInfo(keyId, updateAsymKeysRequest);
        logger.info("CALL TO METHOD 'updateAsymKey' ENDED");
        return resp.getData();
    }

    /**
     * Activate or De-activate Asymmetric Key
     * Activate or De-activate Asymmetric Key 
     * @param keyId Key ID.  (required)
     * @param updateAsymKeysRequest  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> updateAsymKeyWithHttpInfo(String keyId, UpdateAsymKeysRequest updateAsymKeysRequest) throws ApiException {
        okhttp3.Call call = updateAsymKeyValidateBeforeCall(keyId, updateAsymKeysRequest, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Activate or De-activate Asymmetric Key (asynchronously)
     * Activate or De-activate Asymmetric Key 
     * @param keyId Key ID.  (required)
     * @param updateAsymKeysRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updateAsymKeyAsync(String keyId, UpdateAsymKeysRequest updateAsymKeysRequest, final ApiCallback<Object> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
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

        okhttp3.Call call = updateAsymKeyValidateBeforeCall(keyId, updateAsymKeysRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
