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


import Model.InvoiceSettingsRequest;
import Model.InvoicingV2InvoiceSettingsGet200Response;
import Model.InvoicingV2InvoicesAllGet400Response;
import Model.InvoicingV2InvoicesAllGet502Response;

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

public class InvoiceSettingsApi {
    private static Logger logger = LogManager.getLogger(InvoiceSettingsApi.class);
    
    private ApiClient apiClient;

    public InvoiceSettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InvoiceSettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getInvoiceSettings
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getInvoiceSettingsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = null;
        if ("GET".equalsIgnoreCase("POST")) {
            localVarPostBody = "{}";
        }
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "getInvoiceSettings,getInvoiceSettingsAsync,getInvoiceSettingsWithHttpInfo,getInvoiceSettingsCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/invoicing/v2/invoiceSettings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/hal+json", "application/json;charset=utf-8", "application/hal+json;charset=utf-8"
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
    private okhttp3.Call getInvoiceSettingsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        okhttp3.Call call = getInvoiceSettingsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Invoice Settings
     * Allows you to retrieve the invoice settings for the payment page.
     * @return InvoicingV2InvoiceSettingsGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InvoicingV2InvoiceSettingsGet200Response getInvoiceSettings() throws ApiException {
        logger.info("CALL TO METHOD 'getInvoiceSettings' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<InvoicingV2InvoiceSettingsGet200Response> resp = getInvoiceSettingsWithHttpInfo();
        logger.info("CALL TO METHOD 'getInvoiceSettings' ENDED");
        return resp.getData();
    }

    /**
     * Get Invoice Settings
     * Allows you to retrieve the invoice settings for the payment page.
     * @return ApiResponse&lt;InvoicingV2InvoiceSettingsGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InvoicingV2InvoiceSettingsGet200Response> getInvoiceSettingsWithHttpInfo() throws ApiException {
        okhttp3.Call call = getInvoiceSettingsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<InvoicingV2InvoiceSettingsGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Invoice Settings (asynchronously)
     * Allows you to retrieve the invoice settings for the payment page.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getInvoiceSettingsAsync(final ApiCallback<InvoicingV2InvoiceSettingsGet200Response> callback) throws ApiException {

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

        okhttp3.Call call = getInvoiceSettingsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InvoicingV2InvoiceSettingsGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateInvoiceSettings
     * @param invoiceSettingsRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updateInvoiceSettingsCall(InvoiceSettingsRequest invoiceSettingsRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(invoiceSettingsRequest, InvoiceSettingsRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "updateInvoiceSettings,updateInvoiceSettingsAsync,updateInvoiceSettingsWithHttpInfo,updateInvoiceSettingsCall")) {
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, localVarPostBody);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/invoicing/v2/invoiceSettings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/hal+json", "application/json;charset=utf-8", "application/hal+json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateInvoiceSettingsValidateBeforeCall(InvoiceSettingsRequest invoiceSettingsRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'invoiceSettingsRequest' is set
        if (invoiceSettingsRequest == null) {
            logger.error("Missing the required parameter 'invoiceSettingsRequest' when calling updateInvoiceSettings(Async)");
            throw new ApiException("Missing the required parameter 'invoiceSettingsRequest' when calling updateInvoiceSettings(Async)");
        }
        
        
        okhttp3.Call call = updateInvoiceSettingsCall(invoiceSettingsRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Invoice Settings
     * Allows you to customize the payment page, the checkout experience, email communication and payer authentication. You can customize the invoice to match your brand with your business name, logo and brand colors, and a VAT Tax number. You can choose to capture the payers shipping details, phone number and email during the checkout process. You can add a custom message to all invoice emails and enable or disable payer authentication for invoice payments.
     * @param invoiceSettingsRequest  (required)
     * @return InvoicingV2InvoiceSettingsGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InvoicingV2InvoiceSettingsGet200Response updateInvoiceSettings(InvoiceSettingsRequest invoiceSettingsRequest) throws ApiException {
        logger.info("CALL TO METHOD 'updateInvoiceSettings' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<InvoicingV2InvoiceSettingsGet200Response> resp = updateInvoiceSettingsWithHttpInfo(invoiceSettingsRequest);
        logger.info("CALL TO METHOD 'updateInvoiceSettings' ENDED");
        return resp.getData();
    }

    /**
     * Update Invoice Settings
     * Allows you to customize the payment page, the checkout experience, email communication and payer authentication. You can customize the invoice to match your brand with your business name, logo and brand colors, and a VAT Tax number. You can choose to capture the payers shipping details, phone number and email during the checkout process. You can add a custom message to all invoice emails and enable or disable payer authentication for invoice payments.
     * @param invoiceSettingsRequest  (required)
     * @return ApiResponse&lt;InvoicingV2InvoiceSettingsGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InvoicingV2InvoiceSettingsGet200Response> updateInvoiceSettingsWithHttpInfo(InvoiceSettingsRequest invoiceSettingsRequest) throws ApiException {
        okhttp3.Call call = updateInvoiceSettingsValidateBeforeCall(invoiceSettingsRequest, null, null);
        Type localVarReturnType = new TypeToken<InvoicingV2InvoiceSettingsGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Invoice Settings (asynchronously)
     * Allows you to customize the payment page, the checkout experience, email communication and payer authentication. You can customize the invoice to match your brand with your business name, logo and brand colors, and a VAT Tax number. You can choose to capture the payers shipping details, phone number and email during the checkout process. You can add a custom message to all invoice emails and enable or disable payer authentication for invoice payments.
     * @param invoiceSettingsRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updateInvoiceSettingsAsync(InvoiceSettingsRequest invoiceSettingsRequest, final ApiCallback<InvoicingV2InvoiceSettingsGet200Response> callback) throws ApiException {

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

        okhttp3.Call call = updateInvoiceSettingsValidateBeforeCall(invoiceSettingsRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InvoicingV2InvoiceSettingsGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
