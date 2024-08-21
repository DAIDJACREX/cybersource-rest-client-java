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

import Model.GenerateUnifiedCheckoutCaptureContextRequest;
import Model.InlineResponse4006;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UnifiedCheckoutCaptureContextApi
 */
@Ignore
public class UnifiedCheckoutCaptureContextApiTest {

    private final UnifiedCheckoutCaptureContextApi api = new UnifiedCheckoutCaptureContextApi();

    
    /**
     * Generate Unified Checkout Capture Context
     *
     * Unified Checkout is a powerful product within the Digital Acceptance Suite. Unified Checkout is designed to assist merchants with the adoption and inclusion of digital payments within their payment acceptance page. With Unified Checkout Integration you can add digital payment methods to create familiar, convenient and seamless payment experiences that are designed to reduce checkout friction and increase conversions. Click to Pay Drop-in UI is built on the Unified Checkout platform. For more information about Unified Checkout, see the [Unified Checkout Developer Guides Page](https://developer.cybersource.com/docs/cybs/en-us/unified-checkout/developer/all/rest/unified-checkout/uc-intro.html). For examples on how to integrate Unified Checkout within your webpage please see our [GitHub Unified Checkout Samples](https://github.com/CyberSource/cybersource-unified-checkout-sample-java). Generate Unified Checkout Capture Context Generate a one-time use capture context used for the invocation of Unified Checkout. The Request wil contain all of the parameters for how Unified Checkout will operate within a client webpage. The resulting payload will be a JWT signed object that can be used to initiate Unified Checkout or Click to Pay Drop-in UI within a web page
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateUnifiedCheckoutCaptureContextTest() throws Exception {
        GenerateUnifiedCheckoutCaptureContextRequest generateUnifiedCheckoutCaptureContextRequest = null;
        String response = api.generateUnifiedCheckoutCaptureContext(generateUnifiedCheckoutCaptureContextRequest);

        // TODO: test validations
    }
    
}
