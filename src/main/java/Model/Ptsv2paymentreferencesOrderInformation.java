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
import Model.PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails;
import Model.Ptsv2paymentreferencesOrderInformationAmountDetails;
import Model.Ptsv2paymentreferencesOrderInformationBillTo;
import Model.Ptsv2paymentreferencesOrderInformationInvoiceDetails;
import Model.Ptsv2paymentreferencesOrderInformationLineItems;
import Model.Ptsv2paymentreferencesOrderInformationShipTo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ptsv2paymentreferencesOrderInformation
 */

public class Ptsv2paymentreferencesOrderInformation {
  @SerializedName("billTo")
  private Ptsv2paymentreferencesOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private Ptsv2paymentreferencesOrderInformationShipTo shipTo = null;

  @SerializedName("amountDetails")
  private Ptsv2paymentreferencesOrderInformationAmountDetails amountDetails = null;

  @SerializedName("lineItems")
  private List<Ptsv2paymentreferencesOrderInformationLineItems> lineItems = null;

  @SerializedName("invoiceDetails")
  private Ptsv2paymentreferencesOrderInformationInvoiceDetails invoiceDetails = null;

  @SerializedName("shippingDetails")
  private PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails shippingDetails = null;

  public Ptsv2paymentreferencesOrderInformation billTo(Ptsv2paymentreferencesOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Ptsv2paymentreferencesOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public Ptsv2paymentreferencesOrderInformation shipTo(Ptsv2paymentreferencesOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Ptsv2paymentreferencesOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public Ptsv2paymentreferencesOrderInformation amountDetails(Ptsv2paymentreferencesOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Ptsv2paymentreferencesOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Ptsv2paymentreferencesOrderInformation lineItems(List<Ptsv2paymentreferencesOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Ptsv2paymentreferencesOrderInformation addLineItemsItem(Ptsv2paymentreferencesOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Ptsv2paymentreferencesOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentreferencesOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Ptsv2paymentreferencesOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public Ptsv2paymentreferencesOrderInformation invoiceDetails(Ptsv2paymentreferencesOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentreferencesOrderInformationInvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(Ptsv2paymentreferencesOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }

  public Ptsv2paymentreferencesOrderInformation shippingDetails(PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

   /**
   * Get shippingDetails
   * @return shippingDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentreferencesOrderInformation ptsv2paymentreferencesOrderInformation = (Ptsv2paymentreferencesOrderInformation) o;
    return Objects.equals(this.billTo, ptsv2paymentreferencesOrderInformation.billTo) &&
        Objects.equals(this.shipTo, ptsv2paymentreferencesOrderInformation.shipTo) &&
        Objects.equals(this.amountDetails, ptsv2paymentreferencesOrderInformation.amountDetails) &&
        Objects.equals(this.lineItems, ptsv2paymentreferencesOrderInformation.lineItems) &&
        Objects.equals(this.invoiceDetails, ptsv2paymentreferencesOrderInformation.invoiceDetails) &&
        Objects.equals(this.shippingDetails, ptsv2paymentreferencesOrderInformation.shippingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billTo, shipTo, amountDetails, lineItems, invoiceDetails, shippingDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentreferencesOrderInformation {\n");
    
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
    sb.append("    shippingDetails: ").append(toIndentedString(shippingDetails)).append("\n");
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

