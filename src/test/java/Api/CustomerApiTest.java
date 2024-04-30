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

import Model.InlineResponse400;
import Model.InlineResponse403;
import Model.InlineResponse409;
import Model.InlineResponse410;
import Model.InlineResponse412;
import Model.InlineResponse424;
import Model.InlineResponse500;
import Model.PatchCustomerRequest;
import Model.PostCustomerRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerApi
 */
@Ignore
public class CustomerApiTest {

    private final CustomerApi api = new CustomerApi();

    
    /**
     * Delete a Customer
     *
     * |  |  |  | | --- | --- | --- | |**Customers**&lt;br&gt;A Customer represents your tokenized customer information.&lt;br&gt;You should associate the Customer Id with the customer account on your systems.&lt;br&gt;A Customer can have one or more [Payment Instruments](#token-management_customer-payment-instrument_create-a-customer-payment-instrumentl) or [Shipping Addresses](#token-management_customer-shipping-address_create-a-customer-shipping-address) with one allocated as the Customers default.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Deleting a Customer**&lt;br&gt;Your system can use this API to delete a complete Customer.&lt;br&gt;When a Customer is deleted all associated Payment Instruments &amp; Shipping Addresses are deleted.&lt;br&gt;Any Instrument Identifiers representing the card number will also be deleted if they are not associated with any other Payment Instruments.&lt;br&gt;Note: Individual [Payment Instruments](#token-management_customer-payment-instrument_delete-a-customer-payment-instrument) or [Shipping Addresses](#token-management_customer-shipping-address_delete-a-customer-shipping-address) can be deleted via their own dedicated API resources. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerTest() throws Exception {
        String customerId = null;
        String profileId = null;
        api.deleteCustomer(customerId, profileId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Customer
     *
     * |  |  |  | | --- | --- | --- | |**Customers**&lt;br&gt;A Customer represents your tokenized customer information.&lt;br&gt;You should associate the Customer Id with the customer account on your systems.&lt;br&gt;A Customer can have one or more [Payment Instruments](#token-management_customer-payment-instrument_create-a-customer-payment-instrumentl) or [Shipping Addresses](#token-management_customer-shipping-address_create-a-customer-shipping-address) with one allocated as the Customers default.&lt;br&gt;&lt;br&gt;**Retrieving a Customer**&lt;br&gt;When your customer signs into their account, your system can use this API to retrieve the Customers default Payment Instrument and Shipping Address.&lt;br&gt;**Note: the actual card data will be masked.**&lt;br&gt;If your customer wants to see other available Payment Instruments, your system can [retrieve all Payment Instruments](#token-management_customer-payment-instrument_list-payment-instruments-for-a-customer) associated with the Customer.&lt;br&gt;The same applies to [Shipping Addresses](#token-management_customer-shipping-address_list-shipping-addresses-for-a-customer).|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Payment Network Tokens**&lt;br&gt;Network tokens perform better than regular card numbers and they are not necessarily invalidated when a cardholder loses their card, or it expires.&lt;br&gt;A Payment Network Token will be automatically created and used in future payments if you are enabled for the service.&lt;br&gt;A Payment Network Token can also be [provisioned for an existing Instrument Identifier](#token-management_instrument-identifier_enroll-an-instrument-identifier-for-payment-network-token).&lt;br&gt;For more information about Payment Network Tokens see the Developer Guide.&lt;br&gt;&lt;br&gt;**Payments with Customers**&lt;br&gt;To perform a payment with the Customers default details specify the [Customer Id in the payments request](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-using-tokens_authorization-with-customer-token-id_liveconsole-tab-request-body).&lt;br&gt;To perform a payment with a particular Payment Instrument or Shipping Address &lt;br&gt;specify the [Payment Instrument or Shipping Address Ids in the payments request](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-using-tokens_authorization-with-customer-payment-instrument-and-shipping-address-token-id_liveconsole-tab-request-body). 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCustomerTest() throws Exception {
        String customerId = null;
        String profileId = null;
        PostCustomerRequest response = api.getCustomer(customerId, profileId);

        // TODO: test validations
    }
    
    /**
     * Update a Customer
     *
     * |  |  |  | | --- | --- | --- | |**Customers**&lt;br&gt;A Customer represents your tokenized customer information.&lt;br&gt;You should associate the Customer Id with the customer account on your systems.&lt;br&gt;A Customer can have one or more [Payment Instruments](#token-management_customer-payment-instrument_create-a-customer-payment-instrumentl) or [Shipping Addresses](#token-management_customer-shipping-address_create-a-customer-shipping-address) with one allocated as the Customers default.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Updating a Customer**&lt;br&gt;Your system can use this API to update a Customers details including selecting a  [default Payment Instrument](#token-management_customer_update-a-customer_samplerequests-dropdown_update-customers-default-payment-instrument_liveconsole-tab-request-body) or [default Shipping Address](#token-management_customer_update-a-customer_samplerequests-dropdown_update-customers-default-shipping-address_liveconsole-tab-request-body) for use in payments.&lt;br&gt;Note: Updating a Customers [Payment Instrument](#token-management_customer-payment-instrument_update-a-customer-payment-instrument) or [Shipping Address](#token-management_customer-shipping-address_update-a-customer-shipping-address) details is performed using their own dedicated API resources. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchCustomerTest() throws Exception {
        String customerId = null;
        PatchCustomerRequest patchCustomerRequest = null;
        String profileId = null;
        String ifMatch = null;
        PatchCustomerRequest response = api.patchCustomer(customerId, patchCustomerRequest, profileId, ifMatch);

        // TODO: test validations
    }
    
    /**
     * Create a Customer
     *
     * |  |  |  | | --- | --- | --- | |**Customers**&lt;br&gt;A Customer represents your tokenized customer information.&lt;br&gt;You should associate the Customer Id with the customer account on your systems.&lt;br&gt;A Customer can have one or more [Payment Instruments](#token-management_customer-payment-instrument_create-a-customer-payment-instrumentl) or [Shipping Addresses](#token-management_customer-shipping-address_create-a-customer-shipping-address) with one allocated as the Customers default.&lt;br&gt;&lt;br&gt;**Creating a Customer**&lt;br&gt;It is recommended you [create a Customer via a Payment Authorization](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-with-token-create_authorization-with-customer-token-creation_liveconsole-tab-request-body), this can be for a zero amount.&lt;br&gt;The Customer will be created with a Payment Instrument and Shipping Address.&lt;br&gt;You can also [add additional Payment Instruments to a Customer via a Payment Authorization](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-with-token-create_authorization-create-default-payment-instrument-shipping-address-for-existing-customer_liveconsole-tab-request-body).&lt;br&gt;In Europe: You should perform Payer Authentication alongside the Authorization.|&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;|**Payment Network Tokens**&lt;br&gt;Network tokens perform better than regular card numbers and they are not necessarily invalidated when a cardholder loses their card, or it expires.&lt;br&gt;A Payment Network Token will be automatically created and used in future payments if you are enabled for the service.&lt;br&gt;A Payment Network Token can also be [provisioned for an existing Instrument Identifier](#token-management_instrument-identifier_enroll-an-instrument-identifier-for-payment-network-token).&lt;br&gt;For more information about Payment Network Tokens see the Developer Guide.&lt;br&gt;&lt;br&gt;**Payments with Customers**&lt;br&gt;To perform a payment with the Customers default details specify the [Customer Id in the payments request](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-using-tokens_authorization-with-customer-token-id_liveconsole-tab-request-body).&lt;br&gt;To perform a payment with a particular Payment Instrument or Shipping Address &lt;br&gt;specify the [Payment Instrument or Shipping Address Ids in the payments request](#payments_payments_process-a-payment_samplerequests-dropdown_authorization-using-tokens_authorization-with-customer-payment-instrument-and-shipping-address-token-id_liveconsole-tab-request-body). 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postCustomerTest() throws Exception {
        PostCustomerRequest postCustomerRequest = null;
        String profileId = null;
        PostCustomerRequest response = api.postCustomer(postCustomerRequest, profileId);

        // TODO: test validations
    }
    
}
