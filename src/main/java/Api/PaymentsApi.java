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


import Model.CreatePaymentRequest;
import Model.IncrementAuthRequest;
import Model.PtsV2IncrementalAuthorizationPatch201Response;
import Model.PtsV2IncrementalAuthorizationPatch400Response;
import Model.PtsV2PaymentsPost201Response;
import Model.PtsV2PaymentsPost201Response1;
import Model.PtsV2PaymentsPost400Response;
import Model.PtsV2PaymentsPost502Response;
import Model.RefreshPaymentStatusRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaymentsApi {
    private static Logger logger = LogManager.getLogger(PaymentsApi.class);
    
    private ApiClient apiClient;

    public PaymentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createPayment
     * @param createPaymentRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createPaymentCall(CreatePaymentRequest createPaymentRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createPaymentRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/payments";

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
    private okhttp3.Call createPaymentValidateBeforeCall(CreatePaymentRequest createPaymentRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createPaymentRequest' is set
        if (createPaymentRequest == null) {
        	logger.error("Missing the required parameter 'createPaymentRequest' when calling createPayment(Async)");
            throw new ApiException("Missing the required parameter 'createPaymentRequest' when calling createPayment(Async)");
        }
        
        
        okhttp3.Call call = createPaymentCall(createPaymentRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Process a Payment
     * A payment authorizes the amount for the transaction. There are a number of supported payment feature, such as E-commerce and Card Present - Credit Card/Debit Card, Echeck, e-Wallets, Level II/III Data, etc..  A payment response includes the status of the request. It also includes processor-specific information when the request is successful and errors if unsuccessful. See the [Payments Developer Guides Page](https://developer.cybersource.com/docs/cybs/en-us/payments/developer/ctv/rest/payments/payments-intro.html).  Authorization can be requested with Capture, Decision Manager, Payer Authentication(3ds), and Token Creation. 
     * @param createPaymentRequest  (required)
     * @return PtsV2PaymentsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsPost201Response createPayment(CreatePaymentRequest createPaymentRequest) throws ApiException {
    	logger.info("CALL TO METHOD 'createPayment' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<PtsV2PaymentsPost201Response> resp = createPaymentWithHttpInfo(createPaymentRequest);
        logger.info("CALL TO METHOD 'createPayment' ENDED");
        return resp.getData();
    }

    /**
     * Process a Payment
     * A payment authorizes the amount for the transaction. There are a number of supported payment feature, such as E-commerce and Card Present - Credit Card/Debit Card, Echeck, e-Wallets, Level II/III Data, etc..  A payment response includes the status of the request. It also includes processor-specific information when the request is successful and errors if unsuccessful. See the [Payments Developer Guides Page](https://developer.cybersource.com/docs/cybs/en-us/payments/developer/ctv/rest/payments/payments-intro.html).  Authorization can be requested with Capture, Decision Manager, Payer Authentication(3ds), and Token Creation. 
     * @param createPaymentRequest  (required)
     * @return ApiResponse&lt;PtsV2PaymentsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsPost201Response> createPaymentWithHttpInfo(CreatePaymentRequest createPaymentRequest) throws ApiException {
        okhttp3.Call call = createPaymentValidateBeforeCall(createPaymentRequest, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Process a Payment (asynchronously)
     * A payment authorizes the amount for the transaction. There are a number of supported payment feature, such as E-commerce and Card Present - Credit Card/Debit Card, Echeck, e-Wallets, Level II/III Data, etc..  A payment response includes the status of the request. It also includes processor-specific information when the request is successful and errors if unsuccessful. See the [Payments Developer Guides Page](https://developer.cybersource.com/docs/cybs/en-us/payments/developer/ctv/rest/payments/payments-intro.html).  Authorization can be requested with Capture, Decision Manager, Payer Authentication(3ds), and Token Creation. 
     * @param createPaymentRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createPaymentAsync(CreatePaymentRequest createPaymentRequest, final ApiCallback<PtsV2PaymentsPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = createPaymentValidateBeforeCall(createPaymentRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incrementAuth
     * @param id The ID returned from the original authorization request. (required)
     * @param incrementAuthRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call incrementAuthCall(String id, IncrementAuthRequest incrementAuthRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = incrementAuthRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/payments/{id}"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call incrementAuthValidateBeforeCall(String id, IncrementAuthRequest incrementAuthRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
        	logger.error("Missing the required parameter 'id' when calling incrementAuth(Async)");
            throw new ApiException("Missing the required parameter 'id' when calling incrementAuth(Async)");
        }
        
        // verify the required parameter 'incrementAuthRequest' is set
        if (incrementAuthRequest == null) {
        	logger.error("Missing the required parameter 'incrementAuthRequest' when calling incrementAuth(Async)");
            throw new ApiException("Missing the required parameter 'incrementAuthRequest' when calling incrementAuth(Async)");
        }
        
        
        okhttp3.Call call = incrementAuthCall(id, incrementAuthRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Increment an Authorization
     * Use this service to authorize additional charges in a lodging or autorental transaction. Include the ID returned from the original authorization in the PATCH request to add additional charges to that authorization. 
     * @param id The ID returned from the original authorization request. (required)
     * @param incrementAuthRequest  (required)
     * @return PtsV2IncrementalAuthorizationPatch201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2IncrementalAuthorizationPatch201Response incrementAuth(String id, IncrementAuthRequest incrementAuthRequest) throws ApiException {
    	logger.info("CALL TO METHOD 'incrementAuth' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<PtsV2IncrementalAuthorizationPatch201Response> resp = incrementAuthWithHttpInfo(id, incrementAuthRequest);
        logger.info("CALL TO METHOD 'incrementAuth' ENDED");
        return resp.getData();
    }

    /**
     * Increment an Authorization
     * Use this service to authorize additional charges in a lodging or autorental transaction. Include the ID returned from the original authorization in the PATCH request to add additional charges to that authorization. 
     * @param id The ID returned from the original authorization request. (required)
     * @param incrementAuthRequest  (required)
     * @return ApiResponse&lt;PtsV2IncrementalAuthorizationPatch201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2IncrementalAuthorizationPatch201Response> incrementAuthWithHttpInfo(String id, IncrementAuthRequest incrementAuthRequest) throws ApiException {
        okhttp3.Call call = incrementAuthValidateBeforeCall(id, incrementAuthRequest, null, null);
        Type localVarReturnType = new TypeToken<PtsV2IncrementalAuthorizationPatch201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Increment an Authorization (asynchronously)
     * Use this service to authorize additional charges in a lodging or autorental transaction. Include the ID returned from the original authorization in the PATCH request to add additional charges to that authorization. 
     * @param id The ID returned from the original authorization request. (required)
     * @param incrementAuthRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call incrementAuthAsync(String id, IncrementAuthRequest incrementAuthRequest, final ApiCallback<PtsV2IncrementalAuthorizationPatch201Response> callback) throws ApiException {

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

        okhttp3.Call call = incrementAuthValidateBeforeCall(id, incrementAuthRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2IncrementalAuthorizationPatch201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for refreshPaymentStatus
     * @param id The payment id whose status needs to be checked and updated. (required)
     * @param refreshPaymentStatusRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call refreshPaymentStatusCall(String id, RefreshPaymentStatusRequest refreshPaymentStatusRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = refreshPaymentStatusRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/refresh-payment-status/{id}"
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
    private okhttp3.Call refreshPaymentStatusValidateBeforeCall(String id, RefreshPaymentStatusRequest refreshPaymentStatusRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
        	logger.error("Missing the required parameter 'id' when calling refreshPaymentStatus(Async)");
            throw new ApiException("Missing the required parameter 'id' when calling refreshPaymentStatus(Async)");
        }
        
        // verify the required parameter 'refreshPaymentStatusRequest' is set
        if (refreshPaymentStatusRequest == null) {
        	logger.error("Missing the required parameter 'refreshPaymentStatusRequest' when calling refreshPaymentStatus(Async)");
            throw new ApiException("Missing the required parameter 'refreshPaymentStatusRequest' when calling refreshPaymentStatus(Async)");
        }
        
        
        okhttp3.Call call = refreshPaymentStatusCall(id, refreshPaymentStatusRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Check a Payment Status
     * Checks and updates the payment status 
     * @param id The payment id whose status needs to be checked and updated. (required)
     * @param refreshPaymentStatusRequest  (required)
     * @return PtsV2PaymentsPost201Response1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsPost201Response1 refreshPaymentStatus(String id, RefreshPaymentStatusRequest refreshPaymentStatusRequest) throws ApiException {
    	logger.info("CALL TO METHOD 'refreshPaymentStatus' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<PtsV2PaymentsPost201Response1> resp = refreshPaymentStatusWithHttpInfo(id, refreshPaymentStatusRequest);
        logger.info("CALL TO METHOD 'refreshPaymentStatus' ENDED");
        return resp.getData();
    }

    /**
     * Check a Payment Status
     * Checks and updates the payment status 
     * @param id The payment id whose status needs to be checked and updated. (required)
     * @param refreshPaymentStatusRequest  (required)
     * @return ApiResponse&lt;PtsV2PaymentsPost201Response1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsPost201Response1> refreshPaymentStatusWithHttpInfo(String id, RefreshPaymentStatusRequest refreshPaymentStatusRequest) throws ApiException {
        okhttp3.Call call = refreshPaymentStatusValidateBeforeCall(id, refreshPaymentStatusRequest, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsPost201Response1>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Check a Payment Status (asynchronously)
     * Checks and updates the payment status 
     * @param id The payment id whose status needs to be checked and updated. (required)
     * @param refreshPaymentStatusRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call refreshPaymentStatusAsync(String id, RefreshPaymentStatusRequest refreshPaymentStatusRequest, final ApiCallback<PtsV2PaymentsPost201Response1> callback) throws ApiException {

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

        okhttp3.Call call = refreshPaymentStatusValidateBeforeCall(id, refreshPaymentStatusRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsPost201Response1>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
