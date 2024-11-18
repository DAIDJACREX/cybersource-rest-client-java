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


import Model.PushFunds201Response;
import Model.PushFunds400Response;
import Model.PushFunds401Response;
import Model.PushFunds404Response;
import Model.PushFunds502Response;
import Model.PushFundsRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.tracking.SdkTracker;
import com.cybersource.authsdk.util.mle.MLEUtility;
import com.cybersource.authsdk.util.mle.MLEException;

public class PushFundsApi {
    private static Logger logger = LogManager.getLogger(PushFundsApi.class);
    
    private ApiClient apiClient;

    public PushFundsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PushFundsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createPushFundsTransfer
     * @param pushFundsRequest  (required)
     * @param contentType  (required)
     * @param xRequestid  (required)
     * @param vCMerchantId  (required)
     * @param vCPermissions  (required)
     * @param vCCorrelationId  (required)
     * @param vCOrganizationId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createPushFundsTransferCall(PushFundsRequest pushFundsRequest, String contentType, String xRequestid, String vCMerchantId, String vCPermissions, String vCCorrelationId, String vCOrganizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(pushFundsRequest, PushFundsRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "createPushFundsTransfer,createPushFundsTransferAsync,createPushFundsTransferWithHttpInfo,createPushFundsTransferCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/pts/v1/push-funds-transfer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));
        if (xRequestid != null)
        localVarHeaderParams.put("x-requestid", apiClient.parameterToString(xRequestid));
        if (vCMerchantId != null)
        localVarHeaderParams.put("v-c-merchant-id", apiClient.parameterToString(vCMerchantId));
        if (vCPermissions != null)
        localVarHeaderParams.put("v-c-permissions", apiClient.parameterToString(vCPermissions));
        if (vCCorrelationId != null)
        localVarHeaderParams.put("v-c-correlation-id", apiClient.parameterToString(vCCorrelationId));
        if (vCOrganizationId != null)
        localVarHeaderParams.put("v-c-organization-id", apiClient.parameterToString(vCOrganizationId));

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
    private okhttp3.Call createPushFundsTransferValidateBeforeCall(PushFundsRequest pushFundsRequest, String contentType, String xRequestid, String vCMerchantId, String vCPermissions, String vCCorrelationId, String vCOrganizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'pushFundsRequest' is set
        if (pushFundsRequest == null) {
            logger.error("Missing the required parameter 'pushFundsRequest' when calling createPushFundsTransfer(Async)");
            throw new ApiException("Missing the required parameter 'pushFundsRequest' when calling createPushFundsTransfer(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            logger.error("Missing the required parameter 'contentType' when calling createPushFundsTransfer(Async)");
            throw new ApiException("Missing the required parameter 'contentType' when calling createPushFundsTransfer(Async)");
        }
        
        // verify the required parameter 'xRequestid' is set
        if (xRequestid == null) {
            logger.error("Missing the required parameter 'xRequestid' when calling createPushFundsTransfer(Async)");
            throw new ApiException("Missing the required parameter 'xRequestid' when calling createPushFundsTransfer(Async)");
        }
        
        // verify the required parameter 'vCMerchantId' is set
        if (vCMerchantId == null) {
            logger.error("Missing the required parameter 'vCMerchantId' when calling createPushFundsTransfer(Async)");
            throw new ApiException("Missing the required parameter 'vCMerchantId' when calling createPushFundsTransfer(Async)");
        }
        
        // verify the required parameter 'vCPermissions' is set
        if (vCPermissions == null) {
            logger.error("Missing the required parameter 'vCPermissions' when calling createPushFundsTransfer(Async)");
            throw new ApiException("Missing the required parameter 'vCPermissions' when calling createPushFundsTransfer(Async)");
        }
        
        // verify the required parameter 'vCCorrelationId' is set
        if (vCCorrelationId == null) {
            logger.error("Missing the required parameter 'vCCorrelationId' when calling createPushFundsTransfer(Async)");
            throw new ApiException("Missing the required parameter 'vCCorrelationId' when calling createPushFundsTransfer(Async)");
        }
        
        // verify the required parameter 'vCOrganizationId' is set
        if (vCOrganizationId == null) {
            logger.error("Missing the required parameter 'vCOrganizationId' when calling createPushFundsTransfer(Async)");
            throw new ApiException("Missing the required parameter 'vCOrganizationId' when calling createPushFundsTransfer(Async)");
        }
        
        
        okhttp3.Call call = createPushFundsTransferCall(pushFundsRequest, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Process a Push Funds Transfer
     * Receive funds using an Original Credit Transaction (OCT). 
     * @param pushFundsRequest  (required)
     * @param contentType  (required)
     * @param xRequestid  (required)
     * @param vCMerchantId  (required)
     * @param vCPermissions  (required)
     * @param vCCorrelationId  (required)
     * @param vCOrganizationId  (required)
     * @return PushFunds201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PushFunds201Response createPushFundsTransfer(PushFundsRequest pushFundsRequest, String contentType, String xRequestid, String vCMerchantId, String vCPermissions, String vCCorrelationId, String vCOrganizationId) throws ApiException {
        logger.info("CALL TO METHOD 'createPushFundsTransfer' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<PushFunds201Response> resp = createPushFundsTransferWithHttpInfo(pushFundsRequest, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId);
        logger.info("CALL TO METHOD 'createPushFundsTransfer' ENDED");
        return resp.getData();
    }

    /**
     * Process a Push Funds Transfer
     * Receive funds using an Original Credit Transaction (OCT). 
     * @param pushFundsRequest  (required)
     * @param contentType  (required)
     * @param xRequestid  (required)
     * @param vCMerchantId  (required)
     * @param vCPermissions  (required)
     * @param vCCorrelationId  (required)
     * @param vCOrganizationId  (required)
     * @return ApiResponse&lt;PushFunds201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PushFunds201Response> createPushFundsTransferWithHttpInfo(PushFundsRequest pushFundsRequest, String contentType, String xRequestid, String vCMerchantId, String vCPermissions, String vCCorrelationId, String vCOrganizationId) throws ApiException {
        okhttp3.Call call = createPushFundsTransferValidateBeforeCall(pushFundsRequest, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId, null, null);
        Type localVarReturnType = new TypeToken<PushFunds201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Process a Push Funds Transfer (asynchronously)
     * Receive funds using an Original Credit Transaction (OCT). 
     * @param pushFundsRequest  (required)
     * @param contentType  (required)
     * @param xRequestid  (required)
     * @param vCMerchantId  (required)
     * @param vCPermissions  (required)
     * @param vCCorrelationId  (required)
     * @param vCOrganizationId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createPushFundsTransferAsync(PushFundsRequest pushFundsRequest, String contentType, String xRequestid, String vCMerchantId, String vCPermissions, String vCCorrelationId, String vCOrganizationId, final ApiCallback<PushFunds201Response> callback) throws ApiException {

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

        okhttp3.Call call = createPushFundsTransferValidateBeforeCall(pushFundsRequest, contentType, xRequestid, vCMerchantId, vCPermissions, vCCorrelationId, vCOrganizationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PushFunds201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
