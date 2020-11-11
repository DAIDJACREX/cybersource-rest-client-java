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
import Model.PatchCustomerPaymentInstrumentRequest;
import Model.PaymentInstrumentListForCustomer;
import Model.PostCustomerPaymentInstrumentRequest;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrument;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerPaymentInstrumentApi
 */
@Ignore
public class CustomerPaymentInstrumentApiTest {

    private final CustomerPaymentInstrumentApi api = new CustomerPaymentInstrumentApi();

    
    /**
     * Delete a Customer Payment Instrument
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerPaymentInstrumentTest() throws ApiException {
        String customerTokenId = null;
        String paymentInstrumentTokenId = null;
        String profileId = null;
        api.deleteCustomerPaymentInstrument(customerTokenId, paymentInstrumentTokenId, profileId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Customer Payment Instrument
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerPaymentInstrumentTest() throws ApiException {
        String customerTokenId = null;
        String paymentInstrumentTokenId = null;
        String profileId = null;
        Tmsv2customersEmbeddedDefaultPaymentInstrument response = api.getCustomerPaymentInstrument(customerTokenId, paymentInstrumentTokenId, profileId);

        // TODO: test validations
    }
    
    /**
     * List Payment Instruments for a Customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerPaymentInstrumentsListTest() throws ApiException {
        String customerTokenId = null;
        String profileId = null;
        Long offset = null;
        Long limit = null;
        PaymentInstrumentListForCustomer response = api.getCustomerPaymentInstrumentsList(customerTokenId, profileId, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Update a Customer Payment Instrument
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchCustomersPaymentInstrumentTest() throws ApiException {
        String customerTokenId = null;
        String paymentInstrumentTokenId = null;
        PatchCustomerPaymentInstrumentRequest patchCustomerPaymentInstrumentRequest = null;
        String profileId = null;
        String ifMatch = null;
        Tmsv2customersEmbeddedDefaultPaymentInstrument response = api.patchCustomersPaymentInstrument(customerTokenId, paymentInstrumentTokenId, patchCustomerPaymentInstrumentRequest, profileId, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Create a Customer Payment Instrument
     *
     * Include an existing TMS Customer &amp; Instrument Identifier token id in the request. * A Customer token can be created by calling: **POST *_/tms/v2/customers*** * An Instrument Identifier token can be created by calling: **POST *_/tms/v1/instrumentidentifiers*** 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCustomerPaymentInstrumentTest() throws ApiException {
        String customerTokenId = null;
        PostCustomerPaymentInstrumentRequest postCustomerPaymentInstrumentRequest = null;
        String profileId = null;
        Tmsv2customersEmbeddedDefaultPaymentInstrument response = api.postCustomerPaymentInstrument(customerTokenId, postCustomerPaymentInstrumentRequest, profileId);

        // TODO: test validations
    }
    
}