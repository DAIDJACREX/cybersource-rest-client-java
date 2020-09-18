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
import Model.TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-14T15:19:00.879+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders {
  @SerializedName("fingerprint")
  private TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint fingerprint = null;

  public TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders fingerprint(TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Get fingerprint
   * @return fingerprint
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(TssV2TransactionsPost201ResponseEmbeddedRiskInformationProvidersFingerprint fingerprint) {
    this.fingerprint = fingerprint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders tssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders = (TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders) o;
    return Objects.equals(this.fingerprint, tssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders.fingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerprint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedRiskInformationProviders {\n");
    
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
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

