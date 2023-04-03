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
import Model.InlineResponse4005;
import Model.InlineResponse5001;
import Model.UpdatePGPKeysRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KeyManagementPgpApi
 */
@Ignore
public class KeyManagementPgpApiTest {

    private final KeyManagementPgpApi api = new KeyManagementPgpApi();

    
    /**
     * Activate or De-activate PGP Key
     *
     * Activate or De-activate PGP Key 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePGPTest() throws ApiException {
        String keyId = null;
        UpdatePGPKeysRequest updatePGPKeysRequest = null;
        Object response = api.updatePGP(keyId, updatePGPKeysRequest);

        // TODO: test validations
    }
    
}
