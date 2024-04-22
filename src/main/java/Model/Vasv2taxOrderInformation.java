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
import java.util.Arrays;
import Model.RiskV1DecisionsPost201ResponseOrderInformationAmountDetails;
import Model.Vasv2taxOrderInformationBillTo;
import Model.Vasv2taxOrderInformationInvoiceDetails;
import Model.Vasv2taxOrderInformationLineItems;
import Model.Vasv2taxOrderInformationOrderAcceptance;
import Model.Vasv2taxOrderInformationOrderOrigin;
import Model.Vasv2taxOrderInformationShipTo;
import Model.Vasv2taxOrderInformationShippingDetails;
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
 * Vasv2taxOrderInformation
 */

public class Vasv2taxOrderInformation {
  @SerializedName("amountDetails")
  private RiskV1DecisionsPost201ResponseOrderInformationAmountDetails amountDetails = null;

  @SerializedName("billTo")
  private Vasv2taxOrderInformationBillTo billTo = null;

  @SerializedName("shippingDetails")
  private Vasv2taxOrderInformationShippingDetails shippingDetails = null;

  @SerializedName("shipTo")
  private Vasv2taxOrderInformationShipTo shipTo = null;

  @SerializedName("lineItems")
  private List<Vasv2taxOrderInformationLineItems> lineItems = null;

  @SerializedName("invoiceDetails")
  private Vasv2taxOrderInformationInvoiceDetails invoiceDetails = null;

  @SerializedName("orderAcceptance")
  private Vasv2taxOrderInformationOrderAcceptance orderAcceptance = null;

  @SerializedName("orderOrigin")
  private Vasv2taxOrderInformationOrderOrigin orderOrigin = null;

  public Vasv2taxOrderInformation amountDetails(RiskV1DecisionsPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public RiskV1DecisionsPost201ResponseOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(RiskV1DecisionsPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Vasv2taxOrderInformation billTo(Vasv2taxOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Vasv2taxOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public Vasv2taxOrderInformation shippingDetails(Vasv2taxOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

   /**
   * Get shippingDetails
   * @return shippingDetails
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxOrderInformationShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(Vasv2taxOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }

  public Vasv2taxOrderInformation shipTo(Vasv2taxOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Vasv2taxOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public Vasv2taxOrderInformation lineItems(List<Vasv2taxOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Vasv2taxOrderInformation addLineItemsItem(Vasv2taxOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Vasv2taxOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<Vasv2taxOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Vasv2taxOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public Vasv2taxOrderInformation invoiceDetails(Vasv2taxOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxOrderInformationInvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(Vasv2taxOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }

  public Vasv2taxOrderInformation orderAcceptance(Vasv2taxOrderInformationOrderAcceptance orderAcceptance) {
    this.orderAcceptance = orderAcceptance;
    return this;
  }

   /**
   * Get orderAcceptance
   * @return orderAcceptance
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxOrderInformationOrderAcceptance getOrderAcceptance() {
    return orderAcceptance;
  }

  public void setOrderAcceptance(Vasv2taxOrderInformationOrderAcceptance orderAcceptance) {
    this.orderAcceptance = orderAcceptance;
  }

  public Vasv2taxOrderInformation orderOrigin(Vasv2taxOrderInformationOrderOrigin orderOrigin) {
    this.orderOrigin = orderOrigin;
    return this;
  }

   /**
   * Get orderOrigin
   * @return orderOrigin
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxOrderInformationOrderOrigin getOrderOrigin() {
    return orderOrigin;
  }

  public void setOrderOrigin(Vasv2taxOrderInformationOrderOrigin orderOrigin) {
    this.orderOrigin = orderOrigin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vasv2taxOrderInformation vasv2taxOrderInformation = (Vasv2taxOrderInformation) o;
    return Objects.equals(this.amountDetails, vasv2taxOrderInformation.amountDetails) &&
        Objects.equals(this.billTo, vasv2taxOrderInformation.billTo) &&
        Objects.equals(this.shippingDetails, vasv2taxOrderInformation.shippingDetails) &&
        Objects.equals(this.shipTo, vasv2taxOrderInformation.shipTo) &&
        Objects.equals(this.lineItems, vasv2taxOrderInformation.lineItems) &&
        Objects.equals(this.invoiceDetails, vasv2taxOrderInformation.invoiceDetails) &&
        Objects.equals(this.orderAcceptance, vasv2taxOrderInformation.orderAcceptance) &&
        Objects.equals(this.orderOrigin, vasv2taxOrderInformation.orderOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, billTo, shippingDetails, shipTo, lineItems, invoiceDetails, orderAcceptance, orderOrigin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vasv2taxOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shippingDetails: ").append(toIndentedString(shippingDetails)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
    sb.append("    orderAcceptance: ").append(toIndentedString(orderAcceptance)).append("\n");
    sb.append("    orderOrigin: ").append(toIndentedString(orderOrigin)).append("\n");
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

