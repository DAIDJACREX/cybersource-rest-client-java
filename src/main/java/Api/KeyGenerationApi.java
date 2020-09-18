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


import Model.FlexV1KeysPost200Response;
import Model.GeneratePublicKeyRequest;
import Model.InlineResponseDefault;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyGenerationApi {
    private ApiClient apiClient;

    public KeyGenerationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KeyGenerationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for generatePublicKey
     * @param format Indicator to enable the receipt of the Keys response in Flex 11+ format (JWT) or legacy (parameter not required) (required)
     * @param generatePublicKeyRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call generatePublicKeyCall(String format, GeneratePublicKeyRequest generatePublicKeyRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = generatePublicKeyRequest;
        
        // create path and map variables
        String localVarPath = "/flex/v1/keys";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call generatePublicKeyValidateBeforeCall(String format, GeneratePublicKeyRequest generatePublicKeyRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling generatePublicKey(Async)");
        }
        
        // verify the required parameter 'generatePublicKeyRequest' is set
        if (generatePublicKeyRequest == null) {
            throw new ApiException("Missing the required parameter 'generatePublicKeyRequest' when calling generatePublicKey(Async)");
        }
        
        
        okhttp3.Call call = generatePublicKeyCall(format, generatePublicKeyRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Generate Key
     * Generate a one-time use public key and key ID to encrypt the card number in the follow-on Tokenize Card request. The key used to encrypt the card number on the cardholder’s device or browser is valid for 15 minutes and must be used to verify the signature in the response message. CyberSource recommends creating a new key for each order. Generating a key is an authenticated request initiated from your servers, prior to requesting to tokenize the card data from your customer’s device or browser.
     * @param format Indicator to enable the receipt of the Keys response in Flex 11+ format (JWT) or legacy (parameter not required) (required)
     * @param generatePublicKeyRequest  (required)
     * @return FlexV1KeysPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FlexV1KeysPost200Response generatePublicKey(String format, GeneratePublicKeyRequest generatePublicKeyRequest) throws ApiException {
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<FlexV1KeysPost200Response> resp = generatePublicKeyWithHttpInfo(format, generatePublicKeyRequest);
        return resp.getData();
    }

    /**
     * Generate Key
     * Generate a one-time use public key and key ID to encrypt the card number in the follow-on Tokenize Card request. The key used to encrypt the card number on the cardholder’s device or browser is valid for 15 minutes and must be used to verify the signature in the response message. CyberSource recommends creating a new key for each order. Generating a key is an authenticated request initiated from your servers, prior to requesting to tokenize the card data from your customer’s device or browser.
     * @param format Indicator to enable the receipt of the Keys response in Flex 11+ format (JWT) or legacy (parameter not required) (required)
     * @param generatePublicKeyRequest  (required)
     * @return ApiResponse&lt;FlexV1KeysPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FlexV1KeysPost200Response> generatePublicKeyWithHttpInfo(String format, GeneratePublicKeyRequest generatePublicKeyRequest) throws ApiException {
        okhttp3.Call call = generatePublicKeyValidateBeforeCall(format, generatePublicKeyRequest, null, null);
        Type localVarReturnType = new TypeToken<FlexV1KeysPost200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate Key (asynchronously)
     * Generate a one-time use public key and key ID to encrypt the card number in the follow-on Tokenize Card request. The key used to encrypt the card number on the cardholder’s device or browser is valid for 15 minutes and must be used to verify the signature in the response message. CyberSource recommends creating a new key for each order. Generating a key is an authenticated request initiated from your servers, prior to requesting to tokenize the card data from your customer’s device or browser.
     * @param format Indicator to enable the receipt of the Keys response in Flex 11+ format (JWT) or legacy (parameter not required) (required)
     * @param generatePublicKeyRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call generatePublicKeyAsync(String format, GeneratePublicKeyRequest generatePublicKeyRequest, final ApiCallback<FlexV1KeysPost200Response> callback) throws ApiException {

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

        okhttp3.Call call = generatePublicKeyValidateBeforeCall(format, generatePublicKeyRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FlexV1KeysPost200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
