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
import Model.InlineResponse400;
import Model.InlineResponse403;
import Model.InlineResponse410;
import Model.InlineResponse424;
import Model.InlineResponse500;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokenApi
 */
@Ignore
public class TokenApiTest {

    private final TokenApi api = new TokenApi();

    
    /**
     * Generate Payment Credentials for a TMS Token
     *
     * |  |  |  |     | --- | --- | --- |     |**Token**&lt;br&gt;A Token can represent your tokenized Customer, Payment Instrument or Instrument Identifier information.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Payment Credentials**&lt;br&gt;Contains payment information such as the network token, generated cryptogram for Visa &amp; MasterCard or dynamic CVV for Amex in a JSON Web Encryption (JWE) response.&lt;br&gt;Your system can use this API to retrieve the Payment Credentials for an existing Customer, Payment Instrument or Instrument Identifier. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTokenPaymentCredentialsTest() throws ApiException {
        String tokenId = null;
        String profileId = null;
        String response = api.postTokenPaymentCredentials(tokenId, profileId);

        // TODO: test validations
    }
    
}
