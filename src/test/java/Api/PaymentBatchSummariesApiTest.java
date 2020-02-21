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

import Invokers.ApiException;
import org.joda.time.DateTime;
import Model.ReportingV3PaymentBatchSummariesGet200Response;
import Model.Reportingv3ReportDownloadsGet400Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentBatchSummariesApi
 */
@Ignore
public class PaymentBatchSummariesApiTest {

    private final PaymentBatchSummariesApi api = new PaymentBatchSummariesApi();

    
    /**
     * Get Payment Batch Summary Data
     *
     * Scope can be either account/merchant or reseller.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentBatchSummaryTest() throws ApiException {
        DateTime startTime = null;
        DateTime endTime = null;
        String organizationId = null;
        String rollUp = null;
        String breakdown = null;
        Integer startDayOfWeek = null;
        ReportingV3PaymentBatchSummariesGet200Response response = api.getPaymentBatchSummary(startTime, endTime, organizationId, rollUp, breakdown, startDayOfWeek);

        // TODO: test validations
    }
    
}
