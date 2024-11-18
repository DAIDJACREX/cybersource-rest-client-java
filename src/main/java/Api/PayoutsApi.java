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


import Model.OctCreatePaymentRequest;
import Model.PtsV2PaymentsPost502Response;
import Model.PtsV2PayoutsPost201Response;
import Model.PtsV2PayoutsPost400Response;

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

public class PayoutsApi {
    private static Logger logger = LogManager.getLogger(PayoutsApi.class);
    
    private ApiClient apiClient;

    public PayoutsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PayoutsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for octCreatePayment
     * @param octCreatePaymentRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call octCreatePaymentCall(OctCreatePaymentRequest octCreatePaymentRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(octCreatePaymentRequest, OctCreatePaymentRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "octCreatePayment,octCreatePaymentAsync,octCreatePaymentWithHttpInfo,octCreatePaymentCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/pts/v2/payouts";

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
    private okhttp3.Call octCreatePaymentValidateBeforeCall(OctCreatePaymentRequest octCreatePaymentRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'octCreatePaymentRequest' is set
        if (octCreatePaymentRequest == null) {
            logger.error("Missing the required parameter 'octCreatePaymentRequest' when calling octCreatePayment(Async)");
            throw new ApiException("Missing the required parameter 'octCreatePaymentRequest' when calling octCreatePayment(Async)");
        }
        
        
        okhttp3.Call call = octCreatePaymentCall(octCreatePaymentRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Process a Payout
     * Send funds from a selected funding source to a designated credit/debit card account or a prepaid card using an Original Credit Transaction (OCT). 
     * @param octCreatePaymentRequest  (required)
     * @return PtsV2PayoutsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PayoutsPost201Response octCreatePayment(OctCreatePaymentRequest octCreatePaymentRequest) throws ApiException {
        logger.info("CALL TO METHOD 'octCreatePayment' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<PtsV2PayoutsPost201Response> resp = octCreatePaymentWithHttpInfo(octCreatePaymentRequest);
        logger.info("CALL TO METHOD 'octCreatePayment' ENDED");
        return resp.getData();
    }

    /**
     * Process a Payout
     * Send funds from a selected funding source to a designated credit/debit card account or a prepaid card using an Original Credit Transaction (OCT). 
     * @param octCreatePaymentRequest  (required)
     * @return ApiResponse&lt;PtsV2PayoutsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PayoutsPost201Response> octCreatePaymentWithHttpInfo(OctCreatePaymentRequest octCreatePaymentRequest) throws ApiException {
        okhttp3.Call call = octCreatePaymentValidateBeforeCall(octCreatePaymentRequest, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PayoutsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Process a Payout (asynchronously)
     * Send funds from a selected funding source to a designated credit/debit card account or a prepaid card using an Original Credit Transaction (OCT). 
     * @param octCreatePaymentRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call octCreatePaymentAsync(OctCreatePaymentRequest octCreatePaymentRequest, final ApiCallback<PtsV2PayoutsPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = octCreatePaymentValidateBeforeCall(octCreatePaymentRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PayoutsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
