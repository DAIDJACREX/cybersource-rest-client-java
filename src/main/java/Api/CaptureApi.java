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


import Model.CapturePaymentRequest;
import Model.PtsV2PaymentsCapturesPost201Response;
import Model.PtsV2PaymentsCapturesPost400Response;
import Model.PtsV2PaymentsPost502Response;

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

public class CaptureApi {
    private static Logger logger = LogManager.getLogger(CaptureApi.class);
    
    private ApiClient apiClient;

    public CaptureApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CaptureApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for capturePayment
     * @param capturePaymentRequest  (required)
     * @param id The payment ID returned from a previous payment request. This ID links the capture to the payment.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call capturePaymentCall(CapturePaymentRequest capturePaymentRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(capturePaymentRequest, CapturePaymentRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "capturePayment,capturePaymentAsync,capturePaymentWithHttpInfo,capturePaymentCall")) {
            String payload = apiClient.getJSON().serialize(localVarPostBody);
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, payload);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/pts/v2/payments/{id}/captures"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private okhttp3.Call capturePaymentValidateBeforeCall(CapturePaymentRequest capturePaymentRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'capturePaymentRequest' is set
        if (capturePaymentRequest == null) {
            logger.error("Missing the required parameter 'capturePaymentRequest' when calling capturePayment(Async)");
            throw new ApiException("Missing the required parameter 'capturePaymentRequest' when calling capturePayment(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            logger.error("Missing the required parameter 'id' when calling capturePayment(Async)");
            throw new ApiException("Missing the required parameter 'id' when calling capturePayment(Async)");
        }
        
        
        okhttp3.Call call = capturePaymentCall(capturePaymentRequest, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Capture a Payment
     * Include the payment ID in the POST request to capture the payment amount.
     * @param capturePaymentRequest  (required)
     * @param id The payment ID returned from a previous payment request. This ID links the capture to the payment.  (required)
     * @return PtsV2PaymentsCapturesPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsCapturesPost201Response capturePayment(CapturePaymentRequest capturePaymentRequest, String id) throws ApiException {
        logger.info("CALL TO METHOD 'capturePayment' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<PtsV2PaymentsCapturesPost201Response> resp = capturePaymentWithHttpInfo(capturePaymentRequest, id);
        logger.info("CALL TO METHOD 'capturePayment' ENDED");
        return resp.getData();
    }

    /**
     * Capture a Payment
     * Include the payment ID in the POST request to capture the payment amount.
     * @param capturePaymentRequest  (required)
     * @param id The payment ID returned from a previous payment request. This ID links the capture to the payment.  (required)
     * @return ApiResponse&lt;PtsV2PaymentsCapturesPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsCapturesPost201Response> capturePaymentWithHttpInfo(CapturePaymentRequest capturePaymentRequest, String id) throws ApiException {
        okhttp3.Call call = capturePaymentValidateBeforeCall(capturePaymentRequest, id, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsCapturesPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Capture a Payment (asynchronously)
     * Include the payment ID in the POST request to capture the payment amount.
     * @param capturePaymentRequest  (required)
     * @param id The payment ID returned from a previous payment request. This ID links the capture to the payment.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call capturePaymentAsync(CapturePaymentRequest capturePaymentRequest, String id, final ApiCallback<PtsV2PaymentsCapturesPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = capturePaymentValidateBeforeCall(capturePaymentRequest, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsCapturesPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
