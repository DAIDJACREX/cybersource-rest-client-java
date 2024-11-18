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


import Model.CreateSearchRequest;
import Model.PtsV2CreateOrderPost400Response;
import Model.PtsV2PaymentsPost502Response;
import Model.TssV2TransactionsPost201Response;

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

public class SearchTransactionsApi {
    private static Logger logger = LogManager.getLogger(SearchTransactionsApi.class);
    
    private ApiClient apiClient;

    public SearchTransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchTransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createSearch
     * @param createSearchRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createSearchCall(CreateSearchRequest createSearchRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(createSearchRequest, CreateSearchRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment(), apiClient.merchantConfig.getDefaultDeveloperId());
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "createSearch,createSearchAsync,createSearchWithHttpInfo,createSearchCall")) {
            String payload = apiClient.getJSON().serialize(localVarPostBody);
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, payload);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/tss/v2/searches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
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
    private okhttp3.Call createSearchValidateBeforeCall(CreateSearchRequest createSearchRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createSearchRequest' is set
        if (createSearchRequest == null) {
            logger.error("Missing the required parameter 'createSearchRequest' when calling createSearch(Async)");
            throw new ApiException("Missing the required parameter 'createSearchRequest' when calling createSearch(Async)");
        }
        
        
        okhttp3.Call call = createSearchCall(createSearchRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a Search Request
     * Create a search request. 
     * @param createSearchRequest  (required)
     * @return TssV2TransactionsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TssV2TransactionsPost201Response createSearch(CreateSearchRequest createSearchRequest) throws ApiException {
        logger.info("CALL TO METHOD 'createSearch' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<TssV2TransactionsPost201Response> resp = createSearchWithHttpInfo(createSearchRequest);
        logger.info("CALL TO METHOD 'createSearch' ENDED");
        return resp.getData();
    }

    /**
     * Create a Search Request
     * Create a search request. 
     * @param createSearchRequest  (required)
     * @return ApiResponse&lt;TssV2TransactionsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TssV2TransactionsPost201Response> createSearchWithHttpInfo(CreateSearchRequest createSearchRequest) throws ApiException {
        okhttp3.Call call = createSearchValidateBeforeCall(createSearchRequest, null, null);
        Type localVarReturnType = new TypeToken<TssV2TransactionsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Search Request (asynchronously)
     * Create a search request. 
     * @param createSearchRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createSearchAsync(CreateSearchRequest createSearchRequest, final ApiCallback<TssV2TransactionsPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = createSearchValidateBeforeCall(createSearchRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TssV2TransactionsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSearch
     * @param searchId Search ID. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getSearchCall(String searchId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = null;
        if ("GET".equalsIgnoreCase("POST")) {
            localVarPostBody = "{}";
        }
        
        boolean isMLESupportedByCybsForApi = false;
        if (MLEUtility.checkIsMLEForAPI(apiClient.merchantConfig, isMLESupportedByCybsForApi, "getSearch,getSearchAsync,getSearchWithHttpInfo,getSearchCall")) {
            String payload = apiClient.getJSON().serialize(localVarPostBody);
            try {
                localVarPostBody = MLEUtility.encryptRequestPayload(apiClient.merchantConfig, payload);
            } catch (MLEException e) {
                logger.error("Failed to encrypt request body {}", e.getMessage(), e);
                throw new ApiException("Failed to encrypt request body : " + e.getMessage());
            }
        }
        
        // create path and map variables
        String localVarPath = "/tss/v2/searches/{searchId}"
            .replaceAll("\\{" + "searchId" + "\\}", apiClient.escapeString(searchId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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
    private okhttp3.Call getSearchValidateBeforeCall(String searchId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'searchId' is set
        if (searchId == null) {
            logger.error("Missing the required parameter 'searchId' when calling getSearch(Async)");
            throw new ApiException("Missing the required parameter 'searchId' when calling getSearch(Async)");
        }
        
        
        okhttp3.Call call = getSearchCall(searchId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Search Results
     * Include the Search ID in the GET request to retrieve the search results.
     * @param searchId Search ID. (required)
     * @return TssV2TransactionsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TssV2TransactionsPost201Response getSearch(String searchId) throws ApiException {
        logger.info("CALL TO METHOD 'getSearch' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<TssV2TransactionsPost201Response> resp = getSearchWithHttpInfo(searchId);
        logger.info("CALL TO METHOD 'getSearch' ENDED");
        return resp.getData();
    }

    /**
     * Get Search Results
     * Include the Search ID in the GET request to retrieve the search results.
     * @param searchId Search ID. (required)
     * @return ApiResponse&lt;TssV2TransactionsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TssV2TransactionsPost201Response> getSearchWithHttpInfo(String searchId) throws ApiException {
        okhttp3.Call call = getSearchValidateBeforeCall(searchId, null, null);
        Type localVarReturnType = new TypeToken<TssV2TransactionsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Search Results (asynchronously)
     * Include the Search ID in the GET request to retrieve the search results.
     * @param searchId Search ID. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getSearchAsync(String searchId, final ApiCallback<TssV2TransactionsPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = getSearchValidateBeforeCall(searchId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TssV2TransactionsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
