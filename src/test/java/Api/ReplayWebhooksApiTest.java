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

import Model.ReplayWebhooksRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReplayWebhooksApi
 */
@Ignore
public class ReplayWebhooksApiTest {

    private final ReplayWebhooksApi api = new ReplayWebhooksApi();

    
    /**
     * Replay Previous Webhooks
     *
     * Initiate a webhook replay request to replay transactions that happened in the past.  Cannot execute more than 1 replay request at a time. While one request is processing, you will not be allowed to execute another replay.  The difference between Start and End time cannot exceed a 24 hour window, and 1 month is the farthest date back that is eligible for replay. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void replayPreviousWebhooksTest() throws Exception {
        String webhookId = null;
        ReplayWebhooksRequest replayWebhooksRequest = null;
        api.replayPreviousWebhooks(webhookId, replayWebhooksRequest);

        // TODO: test validations
    }
    
}
