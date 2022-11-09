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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransientTokenDataApi
 */
@Ignore
public class TransientTokenDataApiTest {

    private final TransientTokenDataApi api = new TransientTokenDataApi();

    
    /**
     * Get Transient Token Data
     *
     * Retrieve the data captured by Unfied Checkout. This API is used to retrieve the detailed data represented by the Transient Token. This API will not return PCI payment data (PAN). Include the Request ID in the GET request to retrieve the transaction details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionForTransientTokenTest() throws ApiException {
        String transientToken = null;
        api.getTransactionForTransientToken(transientToken);

        // TODO: test validations
    }
    
}
