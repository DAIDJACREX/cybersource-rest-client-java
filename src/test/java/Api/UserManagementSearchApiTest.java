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

import Model.PtsV2PaymentsRefundPost400Response;
import Model.SearchRequest;
import Model.UmsV1UsersGet200Response;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserManagementSearchApi
 */
@Ignore
public class UserManagementSearchApiTest {

    private final UserManagementSearchApi api = new UserManagementSearchApi();

    
    /**
     * Search User Information
     *
     * This endpoint is to get all the user information depending on the filter criteria passed in request body.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchUsersTest() throws Exception {
        SearchRequest searchRequest = null;
        UmsV1UsersGet200Response response = api.searchUsers(searchRequest);

        // TODO: test validations
    }
    
}
