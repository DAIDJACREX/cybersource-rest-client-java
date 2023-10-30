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


import Model.InlineResponse2002;
import Model.InlineResponse2011;
import Model.InlineResponse4007;
import Model.InlineResponse4041;
import Model.InlineResponse4221;
import Model.InlineResponse5003;
import Model.PostRegistrationBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.tracking.SdkTracker;

public class MerchantBoardingApi {
    private static Logger logger = LogManager.getLogger(MerchantBoardingApi.class);
    
    private ApiClient apiClient;

    public MerchantBoardingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MerchantBoardingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getRegistration
     * @param registrationId Identifies the boarding registration to be updated (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getRegistrationCall(String registrationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = null;
        if ("GET".equalsIgnoreCase("POST")) {
            localVarPostBody = "{}";
        }
        
        // create path and map variables
        String localVarPath = "/boarding/v1/registrations/{registrationId}"
            .replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private okhttp3.Call getRegistrationValidateBeforeCall(String registrationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'registrationId' is set
        if (registrationId == null) {
            logger.error("Missing the required parameter 'registrationId' when calling getRegistration(Async)");
            throw new ApiException("Missing the required parameter 'registrationId' when calling getRegistration(Async)");
        }
        
        
        okhttp3.Call call = getRegistrationCall(registrationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets all the information on a boarding registration
     * This end point will get all information of a boarding registration 
     * @param registrationId Identifies the boarding registration to be updated (required)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * <br> Cybersource may allow Customer to access, use, and/or test a Cybersource product or service that may still be in development or has not been market-tested (“Beta Product”) solely for the purpose of evaluating the functionality or marketability of the Beta Product (a “Beta Evaluation”). Notwithstanding any language to the contrary, the following terms shall apply with respect to Customer’s participation in any Beta Evaluation (and the Beta Product(s)) accessed thereunder): The Parties will enter into a separate form agreement detailing the scope of the Beta Evaluation, requirements, pricing, the length of the beta evaluation period (“Beta Product Form”). Beta Products are not, and may not become, Transaction Services and have not yet been publicly released and are offered for the sole purpose of internal testing and non-commercial evaluation. Customer’s use of the Beta Product shall be solely for the purpose of conducting the Beta Evaluation. Customer accepts all risks arising out of the access and use of the Beta Products. Cybersource may, in its sole discretion, at any time, terminate or discontinue the Beta Evaluation. Customer acknowledges and agrees that any Beta Product may still be in development and that Beta Product is provided “AS IS” and may not perform at the level of a commercially available service, may not operate as expected and may be modified prior to release. CYBERSOURCE SHALL NOT BE RESPONSIBLE OR LIABLE UNDER ANY CONTRACT, TORT (INCLUDING NEGLIGENCE), OR OTHERWISE RELATING TO A BETA PRODUCT OR THE BETA EVALUATION (A) FOR LOSS OR INACCURACY OF DATA OR COST OF PROCUREMENT OF SUBSTITUTE GOODS, SERVICES OR TECHNOLOGY, (B) ANY CLAIM, LOSSES, DAMAGES, OR CAUSE OF ACTION ARISING IN CONNECTION WITH THE BETA PRODUCT; OR (C) FOR ANY INDIRECT, INCIDENTAL OR CONSEQUENTIAL DAMAGES INCLUDING, BUT NOT LIMITED TO, LOSS OF REVENUES AND LOSS OF PROFITS.
     */
    public InlineResponse2002 getRegistration(String registrationId) throws ApiException {
        logger.info("CALL TO METHOD 'getRegistration' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<InlineResponse2002> resp = getRegistrationWithHttpInfo(registrationId);
        logger.info("CALL TO METHOD 'getRegistration' ENDED");
        return resp.getData();
    }

    /**
     * Gets all the information on a boarding registration
     * This end point will get all information of a boarding registration 
     * @param registrationId Identifies the boarding registration to be updated (required)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> getRegistrationWithHttpInfo(String registrationId) throws ApiException {
        okhttp3.Call call = getRegistrationValidateBeforeCall(registrationId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets all the information on a boarding registration (asynchronously)
     * This end point will get all information of a boarding registration 
     * @param registrationId Identifies the boarding registration to be updated (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getRegistrationAsync(String registrationId, final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        okhttp3.Call call = getRegistrationValidateBeforeCall(registrationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postRegistration
     * @param postRegistrationBody Boarding registration data (required)
     * @param vCIdempotencyId defines idempotency of the request (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call postRegistrationCall(PostRegistrationBody postRegistrationBody, String vCIdempotencyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(postRegistrationBody, PostRegistrationBody.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment());
        
        // create path and map variables
        String localVarPath = "/boarding/v1/registrations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (vCIdempotencyId != null)
        localVarHeaderParams.put("v-c-idempotency-id", apiClient.parameterToString(vCIdempotencyId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private okhttp3.Call postRegistrationValidateBeforeCall(PostRegistrationBody postRegistrationBody, String vCIdempotencyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'postRegistrationBody' is set
        if (postRegistrationBody == null) {
            logger.error("Missing the required parameter 'postRegistrationBody' when calling postRegistration(Async)");
            throw new ApiException("Missing the required parameter 'postRegistrationBody' when calling postRegistration(Async)");
        }
        
        
        okhttp3.Call call = postRegistrationCall(postRegistrationBody, vCIdempotencyId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a boarding registration
     * Create a registration to board merchant  If you have  Card Processing product enabled in your boarding request, select payment processor from Configuration -&gt; Sample Request. You may unselect attributes from the Request Builder tree which you do not need in the request. For VPC, CUP and EFTPOS processors, replace the processor name from VPC or CUP or EFTPOS to the actual processor name in the sample request. e.g. replace VPC with &amp;lt;your vpc processor&amp;gt; 
     * @param postRegistrationBody Boarding registration data (required)
     * @param vCIdempotencyId defines idempotency of the request (optional)
     * @return InlineResponse2011
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * <br> Cybersource may allow Customer to access, use, and/or test a Cybersource product or service that may still be in development or has not been market-tested (“Beta Product”) solely for the purpose of evaluating the functionality or marketability of the Beta Product (a “Beta Evaluation”). Notwithstanding any language to the contrary, the following terms shall apply with respect to Customer’s participation in any Beta Evaluation (and the Beta Product(s)) accessed thereunder): The Parties will enter into a separate form agreement detailing the scope of the Beta Evaluation, requirements, pricing, the length of the beta evaluation period (“Beta Product Form”). Beta Products are not, and may not become, Transaction Services and have not yet been publicly released and are offered for the sole purpose of internal testing and non-commercial evaluation. Customer’s use of the Beta Product shall be solely for the purpose of conducting the Beta Evaluation. Customer accepts all risks arising out of the access and use of the Beta Products. Cybersource may, in its sole discretion, at any time, terminate or discontinue the Beta Evaluation. Customer acknowledges and agrees that any Beta Product may still be in development and that Beta Product is provided “AS IS” and may not perform at the level of a commercially available service, may not operate as expected and may be modified prior to release. CYBERSOURCE SHALL NOT BE RESPONSIBLE OR LIABLE UNDER ANY CONTRACT, TORT (INCLUDING NEGLIGENCE), OR OTHERWISE RELATING TO A BETA PRODUCT OR THE BETA EVALUATION (A) FOR LOSS OR INACCURACY OF DATA OR COST OF PROCUREMENT OF SUBSTITUTE GOODS, SERVICES OR TECHNOLOGY, (B) ANY CLAIM, LOSSES, DAMAGES, OR CAUSE OF ACTION ARISING IN CONNECTION WITH THE BETA PRODUCT; OR (C) FOR ANY INDIRECT, INCIDENTAL OR CONSEQUENTIAL DAMAGES INCLUDING, BUT NOT LIMITED TO, LOSS OF REVENUES AND LOSS OF PROFITS.
     */
    public InlineResponse2011 postRegistration(PostRegistrationBody postRegistrationBody, String vCIdempotencyId) throws ApiException {
        logger.info("CALL TO METHOD 'postRegistration' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<InlineResponse2011> resp = postRegistrationWithHttpInfo(postRegistrationBody, vCIdempotencyId);
        logger.info("CALL TO METHOD 'postRegistration' ENDED");
        return resp.getData();
    }

    /**
     * Create a boarding registration
     * Create a registration to board merchant  If you have  Card Processing product enabled in your boarding request, select payment processor from Configuration -&gt; Sample Request. You may unselect attributes from the Request Builder tree which you do not need in the request. For VPC, CUP and EFTPOS processors, replace the processor name from VPC or CUP or EFTPOS to the actual processor name in the sample request. e.g. replace VPC with &amp;lt;your vpc processor&amp;gt; 
     * @param postRegistrationBody Boarding registration data (required)
     * @param vCIdempotencyId defines idempotency of the request (optional)
     * @return ApiResponse&lt;InlineResponse2011&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2011> postRegistrationWithHttpInfo(PostRegistrationBody postRegistrationBody, String vCIdempotencyId) throws ApiException {
        okhttp3.Call call = postRegistrationValidateBeforeCall(postRegistrationBody, vCIdempotencyId, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2011>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a boarding registration (asynchronously)
     * Create a registration to board merchant  If you have  Card Processing product enabled in your boarding request, select payment processor from Configuration -&gt; Sample Request. You may unselect attributes from the Request Builder tree which you do not need in the request. For VPC, CUP and EFTPOS processors, replace the processor name from VPC or CUP or EFTPOS to the actual processor name in the sample request. e.g. replace VPC with &amp;lt;your vpc processor&amp;gt; 
     * @param postRegistrationBody Boarding registration data (required)
     * @param vCIdempotencyId defines idempotency of the request (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call postRegistrationAsync(PostRegistrationBody postRegistrationBody, String vCIdempotencyId, final ApiCallback<InlineResponse2011> callback) throws ApiException {

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

        okhttp3.Call call = postRegistrationValidateBeforeCall(postRegistrationBody, vCIdempotencyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2011>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
