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


import Model.CreateWebhookRequest;
import Model.InlineResponse2003;
import Model.InlineResponse2013;
import Model.InlineResponse2014;
import Model.SaveSymEgressKey;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.tracking.SdkTracker;

public class CreateNewWebhooksApi {
    private static Logger logger = LogManager.getLogger(CreateNewWebhooksApi.class);
    
    private ApiClient apiClient;

    public CreateNewWebhooksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CreateNewWebhooksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createWebhookSubscription
     * @param createWebhookRequest The webhook payload (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createWebhookSubscriptionCall(CreateWebhookRequest createWebhookRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(createWebhookRequest, CreateWebhookRequest.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment());
        
        // create path and map variables
        String localVarPath = "/notification-subscriptions/v1/webhooks";

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
    private okhttp3.Call createWebhookSubscriptionValidateBeforeCall(CreateWebhookRequest createWebhookRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        okhttp3.Call call = createWebhookSubscriptionCall(createWebhookRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a Webhook
     * Create a new webhook subscription. Before creating a webhook, ensure that a security key has been created at the top of this developer center section. You will not need to pass us back the key during the creation of the webhook, but you will receive an error if you did not already create a key or store one on file. 
     * <p>DISCLAIMER : Cybersource may allow Customer to access, use, and/or test a Cybersource product or service that may still be in development or has not been market-tested ("Beta Product") solely for the purpose of evaluating the functionality or marketability of the Beta Product (a "Beta Evaluation"). Notwithstanding any language to the contrary, the following terms shall apply with respect to Customer's participation in any Beta Evaluation (and the Beta Product(s)) accessed thereunder): The Parties will enter into a separate form agreement detailing the scope of the Beta Evaluation, requirements, pricing, the length of the beta evaluation period ("Beta Product Form"). Beta Products are not, and may not become, Transaction Services and have not yet been publicly released and are offered for the sole purpose of internal testing and non-commercial evaluation. Customer's use of the Beta Product shall be solely for the purpose of conducting the Beta Evaluation. Customer accepts all risks arising out of the access and use of the Beta Products. Cybersource may, in its sole discretion, at any time, terminate or discontinue the Beta Evaluation. Customer acknowledges and agrees that any Beta Product may still be in development and that Beta Product is provided "AS IS" and may not perform at the level of a commercially available service, may not operate as expected and may be modified prior to release. CYBERSOURCE SHALL NOT BE RESPONSIBLE OR LIABLE UNDER ANY CONTRACT, TORT (INCLUDING NEGLIGENCE), OR OTHERWISE RELATING TO A BETA PRODUCT OR THE BETA EVALUATION (A) FOR LOSS OR INACCURACY OF DATA OR COST OF PROCUREMENT OF SUBSTITUTE GOODS, SERVICES OR TECHNOLOGY, (B) ANY CLAIM, LOSSES, DAMAGES, OR CAUSE OF ACTION ARISING IN CONNECTION WITH THE BETA PRODUCT; OR (C) FOR ANY INDIRECT, INCIDENTAL OR CONSEQUENTIAL DAMAGES INCLUDING, BUT NOT LIMITED TO, LOSS OF REVENUES AND LOSS OF PROFITS.</p>
     * @param createWebhookRequest The webhook payload (optional)
     * @return InlineResponse2014
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2014 createWebhookSubscription(CreateWebhookRequest createWebhookRequest) throws ApiException {
        logger.info("CALL TO METHOD 'createWebhookSubscription' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<InlineResponse2014> resp = createWebhookSubscriptionWithHttpInfo(createWebhookRequest);
        logger.info("CALL TO METHOD 'createWebhookSubscription' ENDED");
        return resp.getData();
    }

    /**
     * Create a Webhook
     * Create a new webhook subscription. Before creating a webhook, ensure that a security key has been created at the top of this developer center section. You will not need to pass us back the key during the creation of the webhook, but you will receive an error if you did not already create a key or store one on file. 
     * @param createWebhookRequest The webhook payload (optional)
     * @return ApiResponse&lt;InlineResponse2014&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2014> createWebhookSubscriptionWithHttpInfo(CreateWebhookRequest createWebhookRequest) throws ApiException {
        okhttp3.Call call = createWebhookSubscriptionValidateBeforeCall(createWebhookRequest, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2014>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Webhook (asynchronously)
     * Create a new webhook subscription. Before creating a webhook, ensure that a security key has been created at the top of this developer center section. You will not need to pass us back the key during the creation of the webhook, but you will receive an error if you did not already create a key or store one on file. 
     * @param createWebhookRequest The webhook payload (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createWebhookSubscriptionAsync(CreateWebhookRequest createWebhookRequest, final ApiCallback<InlineResponse2014> callback) throws ApiException {

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

        okhttp3.Call call = createWebhookSubscriptionValidateBeforeCall(createWebhookRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2014>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for findProductsToSubscribe
     * @param organizationId The Organization Identifier. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call findProductsToSubscribeCall(String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = null;
        if ("GET".equalsIgnoreCase("POST")) {
            localVarPostBody = "{}";
        }
        
        // create path and map variables
        String localVarPath = "/notification-subscriptions/v1/products/{organizationId}"
            .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call findProductsToSubscribeValidateBeforeCall(String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            logger.error("Missing the required parameter 'organizationId' when calling findProductsToSubscribe(Async)");
            throw new ApiException("Missing the required parameter 'organizationId' when calling findProductsToSubscribe(Async)");
        }
        
        
        okhttp3.Call call = findProductsToSubscribeCall(organizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Find Products You Can Subscribe To
     * Retrieve a list of products and event types that your account is eligible for. These products and events are the ones that you may subscribe to in the next step of creating webhooks.
     * <p>DISCLAIMER : Cybersource may allow Customer to access, use, and/or test a Cybersource product or service that may still be in development or has not been market-tested ("Beta Product") solely for the purpose of evaluating the functionality or marketability of the Beta Product (a "Beta Evaluation"). Notwithstanding any language to the contrary, the following terms shall apply with respect to Customer's participation in any Beta Evaluation (and the Beta Product(s)) accessed thereunder): The Parties will enter into a separate form agreement detailing the scope of the Beta Evaluation, requirements, pricing, the length of the beta evaluation period ("Beta Product Form"). Beta Products are not, and may not become, Transaction Services and have not yet been publicly released and are offered for the sole purpose of internal testing and non-commercial evaluation. Customer's use of the Beta Product shall be solely for the purpose of conducting the Beta Evaluation. Customer accepts all risks arising out of the access and use of the Beta Products. Cybersource may, in its sole discretion, at any time, terminate or discontinue the Beta Evaluation. Customer acknowledges and agrees that any Beta Product may still be in development and that Beta Product is provided "AS IS" and may not perform at the level of a commercially available service, may not operate as expected and may be modified prior to release. CYBERSOURCE SHALL NOT BE RESPONSIBLE OR LIABLE UNDER ANY CONTRACT, TORT (INCLUDING NEGLIGENCE), OR OTHERWISE RELATING TO A BETA PRODUCT OR THE BETA EVALUATION (A) FOR LOSS OR INACCURACY OF DATA OR COST OF PROCUREMENT OF SUBSTITUTE GOODS, SERVICES OR TECHNOLOGY, (B) ANY CLAIM, LOSSES, DAMAGES, OR CAUSE OF ACTION ARISING IN CONNECTION WITH THE BETA PRODUCT; OR (C) FOR ANY INDIRECT, INCIDENTAL OR CONSEQUENTIAL DAMAGES INCLUDING, BUT NOT LIMITED TO, LOSS OF REVENUES AND LOSS OF PROFITS.</p>
     * @param organizationId The Organization Identifier. (required)
     * @return List&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<InlineResponse2003> findProductsToSubscribe(String organizationId) throws ApiException {
        logger.info("CALL TO METHOD 'findProductsToSubscribe' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<List<InlineResponse2003>> resp = findProductsToSubscribeWithHttpInfo(organizationId);
        logger.info("CALL TO METHOD 'findProductsToSubscribe' ENDED");
        return resp.getData();
    }

    /**
     * Find Products You Can Subscribe To
     * Retrieve a list of products and event types that your account is eligible for. These products and events are the ones that you may subscribe to in the next step of creating webhooks.
     * @param organizationId The Organization Identifier. (required)
     * @return ApiResponse&lt;List&lt;InlineResponse2003&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<InlineResponse2003>> findProductsToSubscribeWithHttpInfo(String organizationId) throws ApiException {
        okhttp3.Call call = findProductsToSubscribeValidateBeforeCall(organizationId, null, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse2003>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find Products You Can Subscribe To (asynchronously)
     * Retrieve a list of products and event types that your account is eligible for. These products and events are the ones that you may subscribe to in the next step of creating webhooks.
     * @param organizationId The Organization Identifier. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call findProductsToSubscribeAsync(String organizationId, final ApiCallback<List<InlineResponse2003>> callback) throws ApiException {

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

        okhttp3.Call call = findProductsToSubscribeValidateBeforeCall(organizationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InlineResponse2003>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for saveSymEgressKey
     * @param vCSenderOrganizationId Sender organization id (required)
     * @param vCPermissions Encoded user permissions returned by the CGK, for the entity user who initiated the boarding (required)
     * @param vCCorrelationId A globally unique id associated with your request (optional)
     * @param saveSymEgressKey Provide egress Symmetric key information to save (create or store or refresh) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call saveSymEgressKeyCall(String vCSenderOrganizationId, String vCPermissions, String vCCorrelationId, SaveSymEgressKey saveSymEgressKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        SdkTracker sdkTracker = new SdkTracker();
        Object localVarPostBody = sdkTracker.insertDeveloperIdTracker(saveSymEgressKey, SaveSymEgressKey.class.getSimpleName(), apiClient.merchantConfig.getRunEnvironment());
        
        // create path and map variables
        String localVarPath = "/kms/egress/v2/keys-sym";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (vCCorrelationId != null)
        localVarHeaderParams.put("v-c-correlation-id", apiClient.parameterToString(vCCorrelationId));
        if (vCSenderOrganizationId != null)
        localVarHeaderParams.put("v-c-sender-organization-id", apiClient.parameterToString(vCSenderOrganizationId));
        if (vCPermissions != null)
        localVarHeaderParams.put("v-c-permissions", apiClient.parameterToString(vCPermissions));

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
    private okhttp3.Call saveSymEgressKeyValidateBeforeCall(String vCSenderOrganizationId, String vCPermissions, String vCCorrelationId, SaveSymEgressKey saveSymEgressKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'vCSenderOrganizationId' is set
        if (vCSenderOrganizationId == null) {
            logger.error("Missing the required parameter 'vCSenderOrganizationId' when calling saveSymEgressKey(Async)");
            throw new ApiException("Missing the required parameter 'vCSenderOrganizationId' when calling saveSymEgressKey(Async)");
        }
        
        // verify the required parameter 'vCPermissions' is set
        if (vCPermissions == null) {
            logger.error("Missing the required parameter 'vCPermissions' when calling saveSymEgressKey(Async)");
            throw new ApiException("Missing the required parameter 'vCPermissions' when calling saveSymEgressKey(Async)");
        }
        
        
        okhttp3.Call call = saveSymEgressKeyCall(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Webhook Security Keys
     * Create security keys that CyberSource will use internally to connect to your servers and validate messages using a digital signature.  Select the CREATE example for CyberSource to generate the key on our server and maintain it for you as well. Remeber to save the key in the API response, so that you can use it to validate messages later. 
     * <p>DISCLAIMER : Cybersource may allow Customer to access, use, and/or test a Cybersource product or service that may still be in development or has not been market-tested ("Beta Product") solely for the purpose of evaluating the functionality or marketability of the Beta Product (a "Beta Evaluation"). Notwithstanding any language to the contrary, the following terms shall apply with respect to Customer's participation in any Beta Evaluation (and the Beta Product(s)) accessed thereunder): The Parties will enter into a separate form agreement detailing the scope of the Beta Evaluation, requirements, pricing, the length of the beta evaluation period ("Beta Product Form"). Beta Products are not, and may not become, Transaction Services and have not yet been publicly released and are offered for the sole purpose of internal testing and non-commercial evaluation. Customer's use of the Beta Product shall be solely for the purpose of conducting the Beta Evaluation. Customer accepts all risks arising out of the access and use of the Beta Products. Cybersource may, in its sole discretion, at any time, terminate or discontinue the Beta Evaluation. Customer acknowledges and agrees that any Beta Product may still be in development and that Beta Product is provided "AS IS" and may not perform at the level of a commercially available service, may not operate as expected and may be modified prior to release. CYBERSOURCE SHALL NOT BE RESPONSIBLE OR LIABLE UNDER ANY CONTRACT, TORT (INCLUDING NEGLIGENCE), OR OTHERWISE RELATING TO A BETA PRODUCT OR THE BETA EVALUATION (A) FOR LOSS OR INACCURACY OF DATA OR COST OF PROCUREMENT OF SUBSTITUTE GOODS, SERVICES OR TECHNOLOGY, (B) ANY CLAIM, LOSSES, DAMAGES, OR CAUSE OF ACTION ARISING IN CONNECTION WITH THE BETA PRODUCT; OR (C) FOR ANY INDIRECT, INCIDENTAL OR CONSEQUENTIAL DAMAGES INCLUDING, BUT NOT LIMITED TO, LOSS OF REVENUES AND LOSS OF PROFITS.</p>
     * @param vCSenderOrganizationId Sender organization id (required)
     * @param vCPermissions Encoded user permissions returned by the CGK, for the entity user who initiated the boarding (required)
     * @param vCCorrelationId A globally unique id associated with your request (optional)
     * @param saveSymEgressKey Provide egress Symmetric key information to save (create or store or refresh) (optional)
     * @return InlineResponse2013
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2013 saveSymEgressKey(String vCSenderOrganizationId, String vCPermissions, String vCCorrelationId, SaveSymEgressKey saveSymEgressKey) throws ApiException {
        logger.info("CALL TO METHOD 'saveSymEgressKey' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<InlineResponse2013> resp = saveSymEgressKeyWithHttpInfo(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey);
        logger.info("CALL TO METHOD 'saveSymEgressKey' ENDED");
        return resp.getData();
    }

    /**
     * Create Webhook Security Keys
     * Create security keys that CyberSource will use internally to connect to your servers and validate messages using a digital signature.  Select the CREATE example for CyberSource to generate the key on our server and maintain it for you as well. Remeber to save the key in the API response, so that you can use it to validate messages later. 
     * @param vCSenderOrganizationId Sender organization id (required)
     * @param vCPermissions Encoded user permissions returned by the CGK, for the entity user who initiated the boarding (required)
     * @param vCCorrelationId A globally unique id associated with your request (optional)
     * @param saveSymEgressKey Provide egress Symmetric key information to save (create or store or refresh) (optional)
     * @return ApiResponse&lt;InlineResponse2013&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2013> saveSymEgressKeyWithHttpInfo(String vCSenderOrganizationId, String vCPermissions, String vCCorrelationId, SaveSymEgressKey saveSymEgressKey) throws ApiException {
        okhttp3.Call call = saveSymEgressKeyValidateBeforeCall(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2013>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Webhook Security Keys (asynchronously)
     * Create security keys that CyberSource will use internally to connect to your servers and validate messages using a digital signature.  Select the CREATE example for CyberSource to generate the key on our server and maintain it for you as well. Remeber to save the key in the API response, so that you can use it to validate messages later. 
     * @param vCSenderOrganizationId Sender organization id (required)
     * @param vCPermissions Encoded user permissions returned by the CGK, for the entity user who initiated the boarding (required)
     * @param vCCorrelationId A globally unique id associated with your request (optional)
     * @param saveSymEgressKey Provide egress Symmetric key information to save (create or store or refresh) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call saveSymEgressKeyAsync(String vCSenderOrganizationId, String vCPermissions, String vCCorrelationId, SaveSymEgressKey saveSymEgressKey, final ApiCallback<InlineResponse2013> callback) throws ApiException {

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

        okhttp3.Call call = saveSymEgressKeyValidateBeforeCall(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2013>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
