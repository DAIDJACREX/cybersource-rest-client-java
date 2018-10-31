/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * V2paymentsidrefundsPointOfSaleInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2paymentsidrefundsPointOfSaleInformation {
  @SerializedName("emv")
  private V2paymentsidcapturesPointOfSaleInformationEmv emv = null;

  public V2paymentsidrefundsPointOfSaleInformation emv(V2paymentsidcapturesPointOfSaleInformationEmv emv) {
    this.emv = emv;
    return this;
  }

   /**
   * Get emv
   * @return emv
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidcapturesPointOfSaleInformationEmv getEmv() {
    return emv;
  }

  public void setEmv(V2paymentsidcapturesPointOfSaleInformationEmv emv) {
    this.emv = emv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2paymentsidrefundsPointOfSaleInformation v2paymentsidrefundsPointOfSaleInformation = (V2paymentsidrefundsPointOfSaleInformation) o;
    return Objects.equals(this.emv, v2paymentsidrefundsPointOfSaleInformation.emv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2paymentsidrefundsPointOfSaleInformation {\n");
    
    sb.append("    emv: ").append(toIndentedString(emv)).append("\n");
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

