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

import Model.CheckPayerAuthEnrollmentRequest;
import Model.PayerAuthSetupRequest;
import Model.PtsV2PaymentsPost502Response;
import Model.RiskV1AuthenticationResultsPost201Response;
import Model.RiskV1AuthenticationSetupsPost201Response;
import Model.RiskV1AuthenticationsPost201Response;
import Model.RiskV1AuthenticationsPost400Response;
import Model.RiskV1AuthenticationsPost400Response1;
import Model.ValidateRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayerAuthenticationApi
 */
@Ignore
public class PayerAuthenticationApiTest {

    private final PayerAuthenticationApi api = new PayerAuthenticationApi();

    
    /**
     * Check Payer Auth Enrollment
     *
     * This call verifies that the card is enrolled in a card authentication program.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void checkPayerAuthEnrollmentTest() throws Exception {
        CheckPayerAuthEnrollmentRequest checkPayerAuthEnrollmentRequest = null;
        RiskV1AuthenticationsPost201Response response = api.checkPayerAuthEnrollment(checkPayerAuthEnrollmentRequest);

        // TODO: test validations
    }
    
    /**
     * Setup Payer Auth
     *
     * A new service for Merchants to get reference_id for Digital Wallets to use in place of BIN number in Cardinal. Set up file while authenticating with Cardinal. This service should be called by Merchant when payment instrument chosen or changes. This service has to be called before enrollment check.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void payerAuthSetupTest() throws Exception {
        PayerAuthSetupRequest payerAuthSetupRequest = null;
        RiskV1AuthenticationSetupsPost201Response response = api.payerAuthSetup(payerAuthSetupRequest);

        // TODO: test validations
    }
    
    /**
     * Validate Authentication Results
     *
     * This call retrieves and validates the authentication results from issuer and allows the merchant to proceed with processing the payment. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void validateAuthenticationResultsTest() throws Exception {
        ValidateRequest validateRequest = null;
        RiskV1AuthenticationResultsPost201Response response = api.validateAuthenticationResults(validateRequest);

        // TODO: test validations
    }
    
}
