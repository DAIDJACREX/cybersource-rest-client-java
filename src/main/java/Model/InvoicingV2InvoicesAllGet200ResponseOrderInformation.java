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
import Model.InvoicingV2InvoicesAllGet200ResponseOrderInformationAmountDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InvoicingV2InvoicesAllGet200ResponseOrderInformation
 */

public class InvoicingV2InvoicesAllGet200ResponseOrderInformation {
  @SerializedName("amountDetails")
  private InvoicingV2InvoicesAllGet200ResponseOrderInformationAmountDetails amountDetails = null;

  public InvoicingV2InvoicesAllGet200ResponseOrderInformation amountDetails(InvoicingV2InvoicesAllGet200ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesAllGet200ResponseOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(InvoicingV2InvoicesAllGet200ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesAllGet200ResponseOrderInformation invoicingV2InvoicesAllGet200ResponseOrderInformation = (InvoicingV2InvoicesAllGet200ResponseOrderInformation) o;
    return Objects.equals(this.amountDetails, invoicingV2InvoicesAllGet200ResponseOrderInformation.amountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesAllGet200ResponseOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
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

