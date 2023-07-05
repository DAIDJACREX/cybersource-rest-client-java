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


import Model.InlineResponse4005;
import Model.InlineResponse5001;
import Model.UpdatePasswordKeysRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.tracking.SdkTracker;

public class KeyManagementPasswordApi {
    private static Logger logger = LogManager.getLogger(KeyManagementPasswordApi.class);
    
    private ApiClient apiClient;

    public KeyManagementPasswordApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KeyManagementPasswordApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for updatePassword
     * @param keyId Key ID.  (required)
     * @param updatePasswordKeysRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updatePasswordCall(String keyId, UpdatePasswordKeysRequest updatePasswordKeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(updatePasswordKeysRequest, UpdatePasswordKeysRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment());
        
        // create path and map variables
        String localVarPath = "/kms/v2/keys-password/{keyId}"
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
    private okhttp3.Call updatePasswordValidateBeforeCall(String keyId, UpdatePasswordKeysRequest updatePasswordKeysRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'keyId' is set
        if (keyId == null) {
            logger.error("Missing the required parameter 'keyId' when calling updatePassword(Async)");
            throw new ApiException("Missing the required parameter 'keyId' when calling updatePassword(Async)");
        }
        
        // verify the required parameter 'updatePasswordKeysRequest' is set
        if (updatePasswordKeysRequest == null) {
            logger.error("Missing the required parameter 'updatePasswordKeysRequest' when calling updatePassword(Async)");
            throw new ApiException("Missing the required parameter 'updatePasswordKeysRequest' when calling updatePassword(Async)");
        }
        
        
        okhttp3.Call call = updatePasswordCall(keyId, updatePasswordKeysRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Activate or De-activate Password
     * Activate or De-activate key of type password 
     * @param keyId Key ID.  (required)
     * @param updatePasswordKeysRequest  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object updatePassword(String keyId, UpdatePasswordKeysRequest updatePasswordKeysRequest) throws ApiException {
        logger.info("CALL TO METHOD 'updatePassword' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<Object> resp = updatePasswordWithHttpInfo(keyId, updatePasswordKeysRequest);
        logger.info("CALL TO METHOD 'updatePassword' ENDED");
        return resp.getData();
    }

    /**
     * Activate or De-activate Password
     * Activate or De-activate key of type password 
     * @param keyId Key ID.  (required)
     * @param updatePasswordKeysRequest  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> updatePasswordWithHttpInfo(String keyId, UpdatePasswordKeysRequest updatePasswordKeysRequest) throws ApiException {
        okhttp3.Call call = updatePasswordValidateBeforeCall(keyId, updatePasswordKeysRequest, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Activate or De-activate Password (asynchronously)
     * Activate or De-activate key of type password 
     * @param keyId Key ID.  (required)
     * @param updatePasswordKeysRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updatePasswordAsync(String keyId, UpdatePasswordKeysRequest updatePasswordKeysRequest, final ApiCallback<Object> callback) throws ApiException {

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

        okhttp3.Call call = updatePasswordValidateBeforeCall(keyId, updatePasswordKeysRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
