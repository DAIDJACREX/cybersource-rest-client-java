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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsHealthCareInformationAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class Ptsv2paymentsHealthCareInformationAmountDetails {
  @SerializedName("amountType")
  private String amountType = null;

  @SerializedName("amount")
  private String amount = null;

  public Ptsv2paymentsHealthCareInformationAmountDetails amountType(String amountType) {
    this.amountType = amountType;
    return this;
  }

   /**
   * Total amount that has been spent on healthcare in a transaction. Valid Values for **Visa**: - &#x60;healthcare&#x60; - Total Amount Healthcare - &#x60;healthcare-transit&#x60; - Amount Transit - &#x60;vision&#x60; - Amount Vision/Optical - &#x60;prescription&#x60; - Amount Prescription/RX - &#x60;clinic&#x60; - Amount Clinic/Other Qualified Medical - &#x60;dental&#x60; - Amount Dental   &#x60;Note:&#x60; -  Prescription, Clinic and dental amounts must be preceded with the total healthcare amount and cannot occur individually.  Vision and Transit must be sent individually and cannot be combined with total healthcare amount or any other amounts. Total Healthcare amount can be sent individually.  Valid Values for **MasterCard**: - &#x60;prescription&#x60; - Amount Prescription/RX - &#x60;eligible-total&#x60; - Total Amount Healthcare   &#x60;Note:&#x60; -  Prescription must be preceded with the total healthcare amount and cannot occur individually. Total Healthcare amount can be sent individually. 
   * @return amountType
  **/
  @ApiModelProperty(value = "Total amount that has been spent on healthcare in a transaction. Valid Values for **Visa**: - `healthcare` - Total Amount Healthcare - `healthcare-transit` - Amount Transit - `vision` - Amount Vision/Optical - `prescription` - Amount Prescription/RX - `clinic` - Amount Clinic/Other Qualified Medical - `dental` - Amount Dental   `Note:` -  Prescription, Clinic and dental amounts must be preceded with the total healthcare amount and cannot occur individually.  Vision and Transit must be sent individually and cannot be combined with total healthcare amount or any other amounts. Total Healthcare amount can be sent individually.  Valid Values for **MasterCard**: - `prescription` - Amount Prescription/RX - `eligible-total` - Total Amount Healthcare   `Note:` -  Prescription must be preceded with the total healthcare amount and cannot occur individually. Total Healthcare amount can be sent individually. ")
  public String getAmountType() {
    return amountType;
  }

  public void setAmountType(String amountType) {
    this.amountType = amountType;
  }

  public Ptsv2paymentsHealthCareInformationAmountDetails amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Total Amount that has been spent on the corresponding amountType. This is 13 byte field including sign. If the amount is positive, then it is a debit for the customer. If the amount is negative, then it is a credit for the customer. 
   * @return amount
  **/
  @ApiModelProperty(value = "Total Amount that has been spent on the corresponding amountType. This is 13 byte field including sign. If the amount is positive, then it is a debit for the customer. If the amount is negative, then it is a credit for the customer. ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsHealthCareInformationAmountDetails ptsv2paymentsHealthCareInformationAmountDetails = (Ptsv2paymentsHealthCareInformationAmountDetails) o;
    return Objects.equals(this.amountType, ptsv2paymentsHealthCareInformationAmountDetails.amountType) &&
        Objects.equals(this.amount, ptsv2paymentsHealthCareInformationAmountDetails.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountType, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsHealthCareInformationAmountDetails {\n");
    
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

