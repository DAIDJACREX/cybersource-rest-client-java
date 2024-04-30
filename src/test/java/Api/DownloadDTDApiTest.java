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

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DownloadDtdApi
 */
@Ignore
public class DownloadDtdApiTest {

    private final DownloadDtdApi api = new DownloadDtdApi();

    
    /**
     * Download DTD for Report
     *
     * Used to download DTDs for reports on no-auth.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDTDV2Test() throws Exception {
        String reportDefinitionNameVersion = null;
        api.getDTDV2(reportDefinitionNameVersion);

        // TODO: test validations
    }
    
}
