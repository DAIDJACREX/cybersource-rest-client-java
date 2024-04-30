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
import Model.VTConfigCardNotPresentReceiptInformationEmailReceipt;
import Model.VTConfigCardNotPresentReceiptInformationHeader;
import Model.VTConfigCardNotPresentReceiptInformationOrderInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VTConfigCardNotPresentReceiptInformation
 */

public class VTConfigCardNotPresentReceiptInformation {
  @SerializedName("header")
  private VTConfigCardNotPresentReceiptInformationHeader header = null;

  @SerializedName("orderInformation")
  private VTConfigCardNotPresentReceiptInformationOrderInformation orderInformation = null;

  @SerializedName("emailReceipt")
  private VTConfigCardNotPresentReceiptInformationEmailReceipt emailReceipt = null;

  public VTConfigCardNotPresentReceiptInformation header(VTConfigCardNotPresentReceiptInformationHeader header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(value = "")
  public VTConfigCardNotPresentReceiptInformationHeader getHeader() {
    return header;
  }

  public void setHeader(VTConfigCardNotPresentReceiptInformationHeader header) {
    this.header = header;
  }

  public VTConfigCardNotPresentReceiptInformation orderInformation(VTConfigCardNotPresentReceiptInformationOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public VTConfigCardNotPresentReceiptInformationOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(VTConfigCardNotPresentReceiptInformationOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public VTConfigCardNotPresentReceiptInformation emailReceipt(VTConfigCardNotPresentReceiptInformationEmailReceipt emailReceipt) {
    this.emailReceipt = emailReceipt;
    return this;
  }

   /**
   * Get emailReceipt
   * @return emailReceipt
  **/
  @ApiModelProperty(value = "")
  public VTConfigCardNotPresentReceiptInformationEmailReceipt getEmailReceipt() {
    return emailReceipt;
  }

  public void setEmailReceipt(VTConfigCardNotPresentReceiptInformationEmailReceipt emailReceipt) {
    this.emailReceipt = emailReceipt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VTConfigCardNotPresentReceiptInformation vtConfigCardNotPresentReceiptInformation = (VTConfigCardNotPresentReceiptInformation) o;
    return Objects.equals(this.header, vtConfigCardNotPresentReceiptInformation.header) &&
        Objects.equals(this.orderInformation, vtConfigCardNotPresentReceiptInformation.orderInformation) &&
        Objects.equals(this.emailReceipt, vtConfigCardNotPresentReceiptInformation.emailReceipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, orderInformation, emailReceipt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VTConfigCardNotPresentReceiptInformation {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    emailReceipt: ").append(toIndentedString(emailReceipt)).append("\n");
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

