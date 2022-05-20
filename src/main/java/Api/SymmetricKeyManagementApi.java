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


import Model.CreateSharedSecretKeysRequest;
import Model.CreateSharedSecretKeysVerifiRequest;
import Model.DeleteBulkSymmetricKeysRequest;
import Model.InlineResponse4002;
import Model.KmsV2KeysSymDeletesPost200Response;
import Model.KmsV2KeysSymGet200Response;
import Model.KmsV2KeysSymPost201Response;
import Model.PtsV2PaymentsPost502Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SymmetricKeyManagementApi {
    private static Logger logger = LogManager.getLogger(SymmetricKeyManagementApi.class);
    
    private ApiClient apiClient;

    public SymmetricKeyManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SymmetricKeyManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createV2SharedSecretKeys
     * @param createSharedSecretKeysRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createV2SharedSecretKeysCall(CreateSharedSecretKeysRequest createSharedSecretKeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createSharedSecretKeysRequest;
        
        // create path and map variables
        String localVarPath = "/kms/v2/keys-sym";

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
    private okhttp3.Call createV2SharedSecretKeysValidateBeforeCall(CreateSharedSecretKeysRequest createSharedSecretKeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createSharedSecretKeysRequest' is set
        if (createSharedSecretKeysRequest == null) {
        	logger.error("Missing the required parameter 'createSharedSecretKeysRequest' when calling createV2SharedSecretKeys(Async)");
            throw new ApiException("Missing the required parameter 'createSharedSecretKeysRequest' when calling createV2SharedSecretKeys(Async)");
        }
        
        
        okhttp3.Call call = createV2SharedSecretKeysCall(createSharedSecretKeysRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Shared-Secret Keys
     * Create one or more Shared-Secret Keys 
     * @param createSharedSecretKeysRequest  (required)
     * @return KmsV2KeysSymPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KmsV2KeysSymPost201Response createV2SharedSecretKeys(CreateSharedSecretKeysRequest createSharedSecretKeysRequest) throws ApiException {
    	logger.info("CALL TO METHOD 'createV2SharedSecretKeys' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<KmsV2KeysSymPost201Response> resp = createV2SharedSecretKeysWithHttpInfo(createSharedSecretKeysRequest);
        logger.info("CALL TO METHOD 'createV2SharedSecretKeys' ENDED");
        return resp.getData();
    }

    /**
     * Create Shared-Secret Keys
     * Create one or more Shared-Secret Keys 
     * @param createSharedSecretKeysRequest  (required)
     * @return ApiResponse&lt;KmsV2KeysSymPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KmsV2KeysSymPost201Response> createV2SharedSecretKeysWithHttpInfo(CreateSharedSecretKeysRequest createSharedSecretKeysRequest) throws ApiException {
        okhttp3.Call call = createV2SharedSecretKeysValidateBeforeCall(createSharedSecretKeysRequest, null, null);
        Type localVarReturnType = new TypeToken<KmsV2KeysSymPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Shared-Secret Keys (asynchronously)
     * Create one or more Shared-Secret Keys 
     * @param createSharedSecretKeysRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createV2SharedSecretKeysAsync(CreateSharedSecretKeysRequest createSharedSecretKeysRequest, final ApiCallback<KmsV2KeysSymPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = createV2SharedSecretKeysValidateBeforeCall(createSharedSecretKeysRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KmsV2KeysSymPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createV2SharedSecretKeysVerifi
     * @param vIcDomain domain (required)
     * @param createSharedSecretKeysVerifiRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createV2SharedSecretKeysVerifiCall(String vIcDomain, CreateSharedSecretKeysVerifiRequest createSharedSecretKeysVerifiRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createSharedSecretKeysVerifiRequest;
        
        // create path and map variables
        String localVarPath = "/kms/v2/keys-sym/verifi";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (vIcDomain != null)
        localVarHeaderParams.put("v-ic-domain", apiClient.parameterToString(vIcDomain));

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
    private okhttp3.Call createV2SharedSecretKeysVerifiValidateBeforeCall(String vIcDomain, CreateSharedSecretKeysVerifiRequest createSharedSecretKeysVerifiRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'vIcDomain' is set
        if (vIcDomain == null) {
        	logger.error("Missing the required parameter 'vIcDomain' when calling createV2SharedSecretKeysVerifi(Async)");
            throw new ApiException("Missing the required parameter 'vIcDomain' when calling createV2SharedSecretKeysVerifi(Async)");
        }
        
        // verify the required parameter 'createSharedSecretKeysVerifiRequest' is set
        if (createSharedSecretKeysVerifiRequest == null) {
        	logger.error("Missing the required parameter 'createSharedSecretKeysVerifiRequest' when calling createV2SharedSecretKeysVerifi(Async)");
            throw new ApiException("Missing the required parameter 'createSharedSecretKeysVerifiRequest' when calling createV2SharedSecretKeysVerifi(Async)");
        }
        
        
        okhttp3.Call call = createV2SharedSecretKeysVerifiCall(vIcDomain, createSharedSecretKeysVerifiRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Shared-Secret Keys as per verifi spec
     * Create one or more Shared-Secret Keys as per Verifi spec with 32 chars, store digest algo during key generation. 
     * @param vIcDomain domain (required)
     * @param createSharedSecretKeysVerifiRequest  (required)
     * @return KmsV2KeysSymPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KmsV2KeysSymPost201Response createV2SharedSecretKeysVerifi(String vIcDomain, CreateSharedSecretKeysVerifiRequest createSharedSecretKeysVerifiRequest) throws ApiException {
    	logger.info("CALL TO METHOD 'createV2SharedSecretKeysVerifi' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<KmsV2KeysSymPost201Response> resp = createV2SharedSecretKeysVerifiWithHttpInfo(vIcDomain, createSharedSecretKeysVerifiRequest);
        logger.info("CALL TO METHOD 'createV2SharedSecretKeysVerifi' ENDED");
        return resp.getData();
    }

    /**
     * Create Shared-Secret Keys as per verifi spec
     * Create one or more Shared-Secret Keys as per Verifi spec with 32 chars, store digest algo during key generation. 
     * @param vIcDomain domain (required)
     * @param createSharedSecretKeysVerifiRequest  (required)
     * @return ApiResponse&lt;KmsV2KeysSymPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KmsV2KeysSymPost201Response> createV2SharedSecretKeysVerifiWithHttpInfo(String vIcDomain, CreateSharedSecretKeysVerifiRequest createSharedSecretKeysVerifiRequest) throws ApiException {
        okhttp3.Call call = createV2SharedSecretKeysVerifiValidateBeforeCall(vIcDomain, createSharedSecretKeysVerifiRequest, null, null);
        Type localVarReturnType = new TypeToken<KmsV2KeysSymPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Shared-Secret Keys as per verifi spec (asynchronously)
     * Create one or more Shared-Secret Keys as per Verifi spec with 32 chars, store digest algo during key generation. 
     * @param vIcDomain domain (required)
     * @param createSharedSecretKeysVerifiRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createV2SharedSecretKeysVerifiAsync(String vIcDomain, CreateSharedSecretKeysVerifiRequest createSharedSecretKeysVerifiRequest, final ApiCallback<KmsV2KeysSymPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = createV2SharedSecretKeysVerifiValidateBeforeCall(vIcDomain, createSharedSecretKeysVerifiRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KmsV2KeysSymPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteBulkSymmetricKeys
     * @param deleteBulkSymmetricKeysRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteBulkSymmetricKeysCall(DeleteBulkSymmetricKeysRequest deleteBulkSymmetricKeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deleteBulkSymmetricKeysRequest;
        
        // create path and map variables
        String localVarPath = "/kms/v2/keys-sym/deletes";

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
    private okhttp3.Call deleteBulkSymmetricKeysValidateBeforeCall(DeleteBulkSymmetricKeysRequest deleteBulkSymmetricKeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'deleteBulkSymmetricKeysRequest' is set
        if (deleteBulkSymmetricKeysRequest == null) {
        	logger.error("Missing the required parameter 'deleteBulkSymmetricKeysRequest' when calling deleteBulkSymmetricKeys(Async)");
            throw new ApiException("Missing the required parameter 'deleteBulkSymmetricKeysRequest' when calling deleteBulkSymmetricKeys(Async)");
        }
        
        
        okhttp3.Call call = deleteBulkSymmetricKeysCall(deleteBulkSymmetricKeysRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete one or more Symmetric keys
     * &#39;Delete one or more Symmetric keys&#39; 
     * @param deleteBulkSymmetricKeysRequest  (required)
     * @return KmsV2KeysSymDeletesPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KmsV2KeysSymDeletesPost200Response deleteBulkSymmetricKeys(DeleteBulkSymmetricKeysRequest deleteBulkSymmetricKeysRequest) throws ApiException {
    	logger.info("CALL TO METHOD 'deleteBulkSymmetricKeys' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<KmsV2KeysSymDeletesPost200Response> resp = deleteBulkSymmetricKeysWithHttpInfo(deleteBulkSymmetricKeysRequest);
        logger.info("CALL TO METHOD 'deleteBulkSymmetricKeys' ENDED");
        return resp.getData();
    }

    /**
     * Delete one or more Symmetric keys
     * &#39;Delete one or more Symmetric keys&#39; 
     * @param deleteBulkSymmetricKeysRequest  (required)
     * @return ApiResponse&lt;KmsV2KeysSymDeletesPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KmsV2KeysSymDeletesPost200Response> deleteBulkSymmetricKeysWithHttpInfo(DeleteBulkSymmetricKeysRequest deleteBulkSymmetricKeysRequest) throws ApiException {
        okhttp3.Call call = deleteBulkSymmetricKeysValidateBeforeCall(deleteBulkSymmetricKeysRequest, null, null);
        Type localVarReturnType = new TypeToken<KmsV2KeysSymDeletesPost200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete one or more Symmetric keys (asynchronously)
     * &#39;Delete one or more Symmetric keys&#39; 
     * @param deleteBulkSymmetricKeysRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteBulkSymmetricKeysAsync(DeleteBulkSymmetricKeysRequest deleteBulkSymmetricKeysRequest, final ApiCallback<KmsV2KeysSymDeletesPost200Response> callback) throws ApiException {

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

        okhttp3.Call call = deleteBulkSymmetricKeysValidateBeforeCall(deleteBulkSymmetricKeysRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KmsV2KeysSymDeletesPost200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getKeyDetails
     * @param keyId Key ID.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getKeyDetailsCall(String keyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        if ("GET".equalsIgnoreCase("POST")) {
            localVarPostBody = "{}";
        }
        
        // create path and map variables
        String localVarPath = "/kms/v2/keys-sym/{keyId}"
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
    private okhttp3.Call getKeyDetailsValidateBeforeCall(String keyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'keyId' is set
        if (keyId == null) {
        	logger.error("Missing the required parameter 'keyId' when calling getKeyDetails(Async)");
            throw new ApiException("Missing the required parameter 'keyId' when calling getKeyDetails(Async)");
        }
        
        
        okhttp3.Call call = getKeyDetailsCall(keyId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieves shared secret key details
     * Retrieves keys details by providing the key id.
     * @param keyId Key ID.  (required)
     * @return KmsV2KeysSymGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KmsV2KeysSymGet200Response getKeyDetails(String keyId) throws ApiException {
    	logger.info("CALL TO METHOD 'getKeyDetails' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<KmsV2KeysSymGet200Response> resp = getKeyDetailsWithHttpInfo(keyId);
        logger.info("CALL TO METHOD 'getKeyDetails' ENDED");
        return resp.getData();
    }

    /**
     * Retrieves shared secret key details
     * Retrieves keys details by providing the key id.
     * @param keyId Key ID.  (required)
     * @return ApiResponse&lt;KmsV2KeysSymGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KmsV2KeysSymGet200Response> getKeyDetailsWithHttpInfo(String keyId) throws ApiException {
        okhttp3.Call call = getKeyDetailsValidateBeforeCall(keyId, null, null);
        Type localVarReturnType = new TypeToken<KmsV2KeysSymGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves shared secret key details (asynchronously)
     * Retrieves keys details by providing the key id.
     * @param keyId Key ID.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getKeyDetailsAsync(String keyId, final ApiCallback<KmsV2KeysSymGet200Response> callback) throws ApiException {

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

        okhttp3.Call call = getKeyDetailsValidateBeforeCall(keyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KmsV2KeysSymGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
