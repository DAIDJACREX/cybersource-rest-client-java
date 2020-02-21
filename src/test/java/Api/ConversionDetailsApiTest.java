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
import Model.ReportingV3ConversionDetailsGet200Response;
import Model.Reportingv3ReportDownloadsGet400Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConversionDetailsApi
 */
@Ignore
public class ConversionDetailsApiTest {

    private final ConversionDetailsApi api = new ConversionDetailsApi();

    
    /**
     * Get Conversion Detail Transactions
     *
     * Get conversion detail of transactions for a merchant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConversionDetailTest() throws ApiException {
        DateTime startTime = null;
        DateTime endTime = null;
        String organizationId = null;
        ReportingV3ConversionDetailsGet200Response response = api.getConversionDetail(startTime, endTime, organizationId);

        // TODO: test validations
    }
    
}
