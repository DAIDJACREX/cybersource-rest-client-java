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
import Model.CreateSearchRequest;
import Model.PtsV2PaymentsPost502Response;
import Model.TssV2TransactionsPost201Response;
import Model.TssV2TransactionsPost400Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchTransactionsApi
 */
@Ignore
public class SearchTransactionsApiTest {

    private final SearchTransactionsApi api = new SearchTransactionsApi();

    
    /**
     * Create a search request
     *
     * Create a search request. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSearchTest() throws ApiException {
        CreateSearchRequest createSearchRequest = null;
        TssV2TransactionsPost201Response response = api.createSearch(createSearchRequest);

        // TODO: test validations
    }
    
    /**
     * Get Search results
     *
     * Include the Search ID in the GET request to retrieve the search results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSearchTest() throws ApiException {
        String searchId = null;
        TssV2TransactionsPost201Response response = api.getSearch(searchId);

        // TODO: test validations
    }
    
}
