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


import Model.GenerateFlexAPICaptureContextRequest;
import Model.InlineResponse4001;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.tracking.SdkTracker;

public class FlexApiApi {
    private static Logger logger = LogManager.getLogger(FlexApiApi.class);
    
    private ApiClient apiClient;

    public FlexApiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FlexApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for generateFlexAPICaptureContext
     * @param generateFlexAPICaptureContextRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call generateFlexAPICaptureContextCall(GenerateFlexAPICaptureContextRequest generateFlexAPICaptureContextRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(generateFlexAPICaptureContextRequest, GenerateFlexAPICaptureContextRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        // create path and map variables
        String localVarPath = "/flex/v2/sessions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/jwt"
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
    private okhttp3.Call generateFlexAPICaptureContextValidateBeforeCall(GenerateFlexAPICaptureContextRequest generateFlexAPICaptureContextRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'generateFlexAPICaptureContextRequest' is set
        if (generateFlexAPICaptureContextRequest == null) {
            logger.error("Missing the required parameter 'generateFlexAPICaptureContextRequest' when calling generateFlexAPICaptureContext(Async)");
            throw new ApiException("Missing the required parameter 'generateFlexAPICaptureContextRequest' when calling generateFlexAPICaptureContext(Async)");
        }
        
        
        okhttp3.Call call = generateFlexAPICaptureContextCall(generateFlexAPICaptureContextRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Establish a Payment Session with a Capture Context
     * To establish a payment session, include the API fields you plan to use in that session in the body of the request.  The system then returns a JSON Web Token (JWT) that includes the capture context.   To determine which fields to include in your capture context, identify the personal information that you wish to isolate from the payment session.  **Capture Context Fields**&lt;br&gt; When making a session request, any fields that you request to be added to the capture context are required by default.  However, you can choose to make a field optional by setting the required parameter to false. 
     * @param generateFlexAPICaptureContextRequest  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String generateFlexAPICaptureContext(GenerateFlexAPICaptureContextRequest generateFlexAPICaptureContextRequest) throws ApiException {
        logger.info("CALL TO METHOD 'generateFlexAPICaptureContext' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<String> resp = generateFlexAPICaptureContextWithHttpInfo(generateFlexAPICaptureContextRequest);
        logger.info("CALL TO METHOD 'generateFlexAPICaptureContext' ENDED");
        return resp.getData();
    }

    /**
     * Establish a Payment Session with a Capture Context
     * To establish a payment session, include the API fields you plan to use in that session in the body of the request.  The system then returns a JSON Web Token (JWT) that includes the capture context.   To determine which fields to include in your capture context, identify the personal information that you wish to isolate from the payment session.  **Capture Context Fields**&lt;br&gt; When making a session request, any fields that you request to be added to the capture context are required by default.  However, you can choose to make a field optional by setting the required parameter to false. 
     * @param generateFlexAPICaptureContextRequest  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> generateFlexAPICaptureContextWithHttpInfo(GenerateFlexAPICaptureContextRequest generateFlexAPICaptureContextRequest) throws ApiException {
        okhttp3.Call call = generateFlexAPICaptureContextValidateBeforeCall(generateFlexAPICaptureContextRequest, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Establish a Payment Session with a Capture Context (asynchronously)
     * To establish a payment session, include the API fields you plan to use in that session in the body of the request.  The system then returns a JSON Web Token (JWT) that includes the capture context.   To determine which fields to include in your capture context, identify the personal information that you wish to isolate from the payment session.  **Capture Context Fields**&lt;br&gt; When making a session request, any fields that you request to be added to the capture context are required by default.  However, you can choose to make a field optional by setting the required parameter to false. 
     * @param generateFlexAPICaptureContextRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call generateFlexAPICaptureContextAsync(GenerateFlexAPICaptureContextRequest generateFlexAPICaptureContextRequest, final ApiCallback<String> callback) throws ApiException {

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

        okhttp3.Call call = generateFlexAPICaptureContextValidateBeforeCall(generateFlexAPICaptureContextRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
