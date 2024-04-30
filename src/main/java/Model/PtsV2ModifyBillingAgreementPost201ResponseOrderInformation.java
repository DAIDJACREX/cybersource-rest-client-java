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
import Model.PtsV2ModifyBillingAgreementPost201ResponseOrderInformationBillTo;
import Model.PtsV2ModifyBillingAgreementPost201ResponseOrderInformationShipTo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2ModifyBillingAgreementPost201ResponseOrderInformation
 */

public class PtsV2ModifyBillingAgreementPost201ResponseOrderInformation {
  @SerializedName("billTo")
  private PtsV2ModifyBillingAgreementPost201ResponseOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private PtsV2ModifyBillingAgreementPost201ResponseOrderInformationShipTo shipTo = null;

  public PtsV2ModifyBillingAgreementPost201ResponseOrderInformation billTo(PtsV2ModifyBillingAgreementPost201ResponseOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public PtsV2ModifyBillingAgreementPost201ResponseOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(PtsV2ModifyBillingAgreementPost201ResponseOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public PtsV2ModifyBillingAgreementPost201ResponseOrderInformation shipTo(PtsV2ModifyBillingAgreementPost201ResponseOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public PtsV2ModifyBillingAgreementPost201ResponseOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(PtsV2ModifyBillingAgreementPost201ResponseOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2ModifyBillingAgreementPost201ResponseOrderInformation ptsV2ModifyBillingAgreementPost201ResponseOrderInformation = (PtsV2ModifyBillingAgreementPost201ResponseOrderInformation) o;
    return Objects.equals(this.billTo, ptsV2ModifyBillingAgreementPost201ResponseOrderInformation.billTo) &&
        Objects.equals(this.shipTo, ptsV2ModifyBillingAgreementPost201ResponseOrderInformation.shipTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billTo, shipTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2ModifyBillingAgreementPost201ResponseOrderInformation {\n");
    
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
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
