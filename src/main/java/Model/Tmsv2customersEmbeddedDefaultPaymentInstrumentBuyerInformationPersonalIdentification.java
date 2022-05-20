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
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("issuedBy")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy issuedBy = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The value of the identification type. 
   * @return id
  **/
  @ApiModelProperty(value = "The value of the identification type. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the identification.  Valid values:   - driver license 
   * @return type
  **/
  @ApiModelProperty(value = "The type of the identification.  Valid values:   - driver license ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification issuedBy(Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy issuedBy) {
    this.issuedBy = issuedBy;
    return this;
  }

   /**
   * Get issuedBy
   * @return issuedBy
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy getIssuedBy() {
    return issuedBy;
  }

  public void setIssuedBy(Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationIssuedBy issuedBy) {
    this.issuedBy = issuedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification = (Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification) o;
    return Objects.equals(this.id, tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification.id) &&
        Objects.equals(this.type, tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification.type) &&
        Objects.equals(this.issuedBy, tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification.issuedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, issuedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentBuyerInformationPersonalIdentification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
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

