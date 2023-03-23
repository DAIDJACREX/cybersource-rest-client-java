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
import Model.Ptsv1pushfundstransferOrderInformationAmountDetails;
import Model.Ptsv1pushfundstransferOrderInformationSurcharge;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv1pushfundstransferOrderInformation
 */

public class Ptsv1pushfundstransferOrderInformation {
  @SerializedName("amountDetails")
  private Ptsv1pushfundstransferOrderInformationAmountDetails amountDetails = null;

  @SerializedName("isCryptocurrencyPurchase")
  private String isCryptocurrencyPurchase = null;

  @SerializedName("surcharge")
  private Ptsv1pushfundstransferOrderInformationSurcharge surcharge = null;

  public Ptsv1pushfundstransferOrderInformation amountDetails(Ptsv1pushfundstransferOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Ptsv1pushfundstransferOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Ptsv1pushfundstransferOrderInformation isCryptocurrencyPurchase(String isCryptocurrencyPurchase) {
    this.isCryptocurrencyPurchase = isCryptocurrencyPurchase;
    return this;
  }

   /**
   * This indicates that the funds transfer is for a crypto currency transaction. Optional Y/y, true N/n, false 
   * @return isCryptocurrencyPurchase
  **/
  @ApiModelProperty(value = "This indicates that the funds transfer is for a crypto currency transaction. Optional Y/y, true N/n, false ")
  public String getIsCryptocurrencyPurchase() {
    return isCryptocurrencyPurchase;
  }

  public void setIsCryptocurrencyPurchase(String isCryptocurrencyPurchase) {
    this.isCryptocurrencyPurchase = isCryptocurrencyPurchase;
  }

  public Ptsv1pushfundstransferOrderInformation surcharge(Ptsv1pushfundstransferOrderInformationSurcharge surcharge) {
    this.surcharge = surcharge;
    return this;
  }

   /**
   * Get surcharge
   * @return surcharge
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferOrderInformationSurcharge getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(Ptsv1pushfundstransferOrderInformationSurcharge surcharge) {
    this.surcharge = surcharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv1pushfundstransferOrderInformation ptsv1pushfundstransferOrderInformation = (Ptsv1pushfundstransferOrderInformation) o;
    return Objects.equals(this.amountDetails, ptsv1pushfundstransferOrderInformation.amountDetails) &&
        Objects.equals(this.isCryptocurrencyPurchase, ptsv1pushfundstransferOrderInformation.isCryptocurrencyPurchase) &&
        Objects.equals(this.surcharge, ptsv1pushfundstransferOrderInformation.surcharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, isCryptocurrencyPurchase, surcharge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    isCryptocurrencyPurchase: ").append(toIndentedString(isCryptocurrencyPurchase)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
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

