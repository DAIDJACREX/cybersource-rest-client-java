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


package Model;

import java.util.Objects;
import Model.InvoicingV2InvoicesAllGet200ResponseLinks1;
import Model.InvoicingV2InvoicesPost201ResponseInvoiceInformation;
import Model.InvoicingV2InvoicesPost201ResponseOrderInformation;
import Model.Invoicingv2invoicesCustomerInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InvoicingV2InvoicesPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T23:41:38.291+05:30")
public class InvoicingV2InvoicesPost201Response {
  @SerializedName("_links")
  private InvoicingV2InvoicesAllGet200ResponseLinks1 links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("customerInformation")
  private Invoicingv2invoicesCustomerInformation customerInformation = null;

  @SerializedName("invoiceInformation")
  private InvoicingV2InvoicesPost201ResponseInvoiceInformation invoiceInformation = null;

  @SerializedName("orderInformation")
  private InvoicingV2InvoicesPost201ResponseOrderInformation orderInformation = null;

  public InvoicingV2InvoicesPost201Response links(InvoicingV2InvoicesAllGet200ResponseLinks1 links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesAllGet200ResponseLinks1 getLinks() {
    return links;
  }

  public void setLinks(InvoicingV2InvoicesAllGet200ResponseLinks1 links) {
    this.links = links;
  }

  public InvoicingV2InvoicesPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InvoicingV2InvoicesPost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public InvoicingV2InvoicesPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the invoice.  Possible values: - DRAFT - CREATED - SENT - PARTIAL - PAID - CANCELED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the invoice.  Possible values: - DRAFT - CREATED - SENT - PARTIAL - PAID - CANCELED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InvoicingV2InvoicesPost201Response customerInformation(Invoicingv2invoicesCustomerInformation customerInformation) {
    this.customerInformation = customerInformation;
    return this;
  }

   /**
   * Get customerInformation
   * @return customerInformation
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoicesCustomerInformation getCustomerInformation() {
    return customerInformation;
  }

  public void setCustomerInformation(Invoicingv2invoicesCustomerInformation customerInformation) {
    this.customerInformation = customerInformation;
  }

  public InvoicingV2InvoicesPost201Response invoiceInformation(InvoicingV2InvoicesPost201ResponseInvoiceInformation invoiceInformation) {
    this.invoiceInformation = invoiceInformation;
    return this;
  }

   /**
   * Get invoiceInformation
   * @return invoiceInformation
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesPost201ResponseInvoiceInformation getInvoiceInformation() {
    return invoiceInformation;
  }

  public void setInvoiceInformation(InvoicingV2InvoicesPost201ResponseInvoiceInformation invoiceInformation) {
    this.invoiceInformation = invoiceInformation;
  }

  public InvoicingV2InvoicesPost201Response orderInformation(InvoicingV2InvoicesPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesPost201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(InvoicingV2InvoicesPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesPost201Response invoicingV2InvoicesPost201Response = (InvoicingV2InvoicesPost201Response) o;
    return Objects.equals(this.links, invoicingV2InvoicesPost201Response.links) &&
        Objects.equals(this.id, invoicingV2InvoicesPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, invoicingV2InvoicesPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, invoicingV2InvoicesPost201Response.status) &&
        Objects.equals(this.customerInformation, invoicingV2InvoicesPost201Response.customerInformation) &&
        Objects.equals(this.invoiceInformation, invoicingV2InvoicesPost201Response.invoiceInformation) &&
        Objects.equals(this.orderInformation, invoicingV2InvoicesPost201Response.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, customerInformation, invoiceInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerInformation: ").append(toIndentedString(customerInformation)).append("\n");
    sb.append("    invoiceInformation: ").append(toIndentedString(invoiceInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

