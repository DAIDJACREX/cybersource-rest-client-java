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
import Model.Ptsv2paymentsPaymentInformationSepaDirectDebit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsPaymentInformationSepa
 */

public class Ptsv2paymentsPaymentInformationSepa {
  @SerializedName("directDebit")
  private Ptsv2paymentsPaymentInformationSepaDirectDebit directDebit = null;

  public Ptsv2paymentsPaymentInformationSepa directDebit(Ptsv2paymentsPaymentInformationSepaDirectDebit directDebit) {
    this.directDebit = directDebit;
    return this;
  }

   /**
   * Get directDebit
   * @return directDebit
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationSepaDirectDebit getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(Ptsv2paymentsPaymentInformationSepaDirectDebit directDebit) {
    this.directDebit = directDebit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationSepa ptsv2paymentsPaymentInformationSepa = (Ptsv2paymentsPaymentInformationSepa) o;
    return Objects.equals(this.directDebit, ptsv2paymentsPaymentInformationSepa.directDebit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationSepa {\n");
    
    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
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

