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
import Model.AddNegativeListRequest;
import Model.CaseManagementActionsRequest;
import Model.CaseManagementCommentsRequest;
import Model.CreateBundledDecisionManagerCaseRequest;
import Model.FraudMarkingActionRequest;
import Model.InlineResponse200;
import Model.InlineResponse201;
import Model.InlineResponse4001;
import Model.InlineResponse4031;
import Model.InlineResponse422;
import Model.InlineResponse5001;
import Model.InlineResponse502;
import Model.InlineResponse503;
import Model.PtsV2PaymentsPost502Response;
import Model.RiskV1DecisionsPost201Response;
import Model.RiskV1DecisionsPost400Response;
import Model.RiskV1DecisionsPost400Response1;
import Model.RiskV1UpdatePost201Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DecisionManagerApi
 */
@Ignore
public class DecisionManagerApiTest {

    private final DecisionManagerApi api = new DecisionManagerApi();

    
    /**
     * Take action on a DM post-transactional case
     *
     * Take action on a DM post-transactional case
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void actionDecisionManagerCaseTest() throws ApiException {
        String id = null;
        CaseManagementActionsRequest caseManagementActionsRequest = null;
        InlineResponse200 response = api.actionDecisionManagerCase(id, caseManagementActionsRequest);

        // TODO: test validations
    }
    
    /**
     * List Management
     *
     * This call adds/deletes/converts the request information in the negative list.  Provide the list to be updated as the path parameter. This value can be &#39;postiive&#39;, &#39;negative&#39; or &#39;review&#39;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addNegativeTest() throws ApiException {
        String type = null;
        AddNegativeListRequest addNegativeListRequest = null;
        RiskV1UpdatePost201Response response = api.addNegative(type, addNegativeListRequest);

        // TODO: test validations
    }
    
    /**
     * Add a comment to a DM post-transactional case
     *
     * Add a comment to a DM post-transactional case
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void commentDecisionManagerCaseTest() throws ApiException {
        String id = null;
        CaseManagementCommentsRequest caseManagementCommentsRequest = null;
        InlineResponse201 response = api.commentDecisionManagerCase(id, caseManagementCommentsRequest);

        // TODO: test validations
    }
    
    /**
     * Create Decision Manager
     *
     * Decision Manager can help you automate and streamline your fraud operations. Decision Manager will return a decision based on the request values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBundledDecisionManagerCaseTest() throws ApiException {
        CreateBundledDecisionManagerCaseRequest createBundledDecisionManagerCaseRequest = null;
        RiskV1DecisionsPost201Response response = api.createBundledDecisionManagerCase(createBundledDecisionManagerCaseRequest);

        // TODO: test validations
    }
    
    /**
     * Fraud Marking
     *
     * This can be used to - 1. Add known fraudulent data to the fraud history 2. Remove data added to history with Transaction Marking Tool or by uploading chargeback files 3. Remove chargeback data from history that was automatically added. For detailed information, contact your Cybersource representative  Place the request ID of the transaction you want to mark as suspect (or remove from history) as the path parameter in this request. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fraudUpdateTest() throws ApiException {
        String id = null;
        FraudMarkingActionRequest fraudMarkingActionRequest = null;
        RiskV1UpdatePost201Response response = api.fraudUpdate(id, fraudMarkingActionRequest);

        // TODO: test validations
    }
    
}
