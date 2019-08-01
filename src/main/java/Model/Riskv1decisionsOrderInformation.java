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
import Model.Riskv1decisionsOrderInformationAmountDetails;
import Model.Riskv1decisionsOrderInformationBillTo;
import Model.Riskv1decisionsOrderInformationLineItems;
import Model.Riskv1decisionsOrderInformationShipTo;
import Model.Riskv1decisionsOrderInformationShippingDetails;
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
 * Contains detailed order-level information.
 */
@ApiModel(description = "Contains detailed order-level information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T12:55:52.826+05:30")
public class Riskv1decisionsOrderInformation {
  @SerializedName("amountDetails")
  private Riskv1decisionsOrderInformationAmountDetails amountDetails = null;

  @SerializedName("shippingDetails")
  private Riskv1decisionsOrderInformationShippingDetails shippingDetails = null;

  @SerializedName("shipTo")
  private Riskv1decisionsOrderInformationShipTo shipTo = null;

  @SerializedName("returnsAccepted")
  private Boolean returnsAccepted = null;

  @SerializedName("lineItems")
  private List<Riskv1decisionsOrderInformationLineItems> lineItems = null;

  @SerializedName("billTo")
  private Riskv1decisionsOrderInformationBillTo billTo = null;

  public Riskv1decisionsOrderInformation amountDetails(Riskv1decisionsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Riskv1decisionsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Riskv1decisionsOrderInformation shippingDetails(Riskv1decisionsOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

   /**
   * Get shippingDetails
   * @return shippingDetails
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsOrderInformationShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(Riskv1decisionsOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }

  public Riskv1decisionsOrderInformation shipTo(Riskv1decisionsOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Riskv1decisionsOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public Riskv1decisionsOrderInformation returnsAccepted(Boolean returnsAccepted) {
    this.returnsAccepted = returnsAccepted;
    return this;
  }

   /**
   * Boolean that indicates whether returns are accepted for this order. This field can contain one of the following values: - true: Returns are accepted for this order. - false: Returns are not accepted for this order. 
   * @return returnsAccepted
  **/
  @ApiModelProperty(value = "Boolean that indicates whether returns are accepted for this order. This field can contain one of the following values: - true: Returns are accepted for this order. - false: Returns are not accepted for this order. ")
  public Boolean getReturnsAccepted() {
    return returnsAccepted;
  }

  public void setReturnsAccepted(Boolean returnsAccepted) {
    this.returnsAccepted = returnsAccepted;
  }

  public Riskv1decisionsOrderInformation lineItems(List<Riskv1decisionsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Riskv1decisionsOrderInformation addLineItemsItem(Riskv1decisionsOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Riskv1decisionsOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * This array contains detailed information about individual products in the order.
   * @return lineItems
  **/
  @ApiModelProperty(value = "This array contains detailed information about individual products in the order.")
  public List<Riskv1decisionsOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Riskv1decisionsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public Riskv1decisionsOrderInformation billTo(Riskv1decisionsOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Riskv1decisionsOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsOrderInformation riskv1decisionsOrderInformation = (Riskv1decisionsOrderInformation) o;
    return Objects.equals(this.amountDetails, riskv1decisionsOrderInformation.amountDetails) &&
        Objects.equals(this.shippingDetails, riskv1decisionsOrderInformation.shippingDetails) &&
        Objects.equals(this.shipTo, riskv1decisionsOrderInformation.shipTo) &&
        Objects.equals(this.returnsAccepted, riskv1decisionsOrderInformation.returnsAccepted) &&
        Objects.equals(this.lineItems, riskv1decisionsOrderInformation.lineItems) &&
        Objects.equals(this.billTo, riskv1decisionsOrderInformation.billTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, shippingDetails, shipTo, returnsAccepted, lineItems, billTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    shippingDetails: ").append(toIndentedString(shippingDetails)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    returnsAccepted: ").append(toIndentedString(returnsAccepted)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
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

