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
import Model.ReportingV3RetrievalSummariesGet200Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RetrievalSummariesApi
 */
@Ignore
public class RetrievalSummariesApiTest {

    private final RetrievalSummariesApi api = new RetrievalSummariesApi();

    
    /**
     * Get Retrieval Summaries
     *
     * Retrieval Summary Report Description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRetrievalSummaryTest() throws ApiException {
        DateTime startTime = null;
        DateTime endTime = null;
        String organizationId = null;
        ReportingV3RetrievalSummariesGet200Response response = api.getRetrievalSummary(startTime, endTime, organizationId);

        // TODO: test validations
    }
    
}