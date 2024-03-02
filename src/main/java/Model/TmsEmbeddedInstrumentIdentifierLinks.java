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
import Model.TmsEmbeddedInstrumentIdentifierLinksPaymentInstruments;
import Model.TmsEmbeddedInstrumentIdentifierLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsEmbeddedInstrumentIdentifierLinks
 */

public class TmsEmbeddedInstrumentIdentifierLinks {
  @SerializedName("self")
  private TmsEmbeddedInstrumentIdentifierLinksSelf self = null;

  @SerializedName("paymentInstruments")
  private TmsEmbeddedInstrumentIdentifierLinksPaymentInstruments paymentInstruments = null;

  public TmsEmbeddedInstrumentIdentifierLinks self(TmsEmbeddedInstrumentIdentifierLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public TmsEmbeddedInstrumentIdentifierLinksSelf getSelf() {
    return self;
  }

  public void setSelf(TmsEmbeddedInstrumentIdentifierLinksSelf self) {
    this.self = self;
  }

  public TmsEmbeddedInstrumentIdentifierLinks paymentInstruments(TmsEmbeddedInstrumentIdentifierLinksPaymentInstruments paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
    return this;
  }

   /**
   * Get paymentInstruments
   * @return paymentInstruments
  **/
  @ApiModelProperty(value = "")
  public TmsEmbeddedInstrumentIdentifierLinksPaymentInstruments getPaymentInstruments() {
    return paymentInstruments;
  }

  public void setPaymentInstruments(TmsEmbeddedInstrumentIdentifierLinksPaymentInstruments paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmsEmbeddedInstrumentIdentifierLinks tmsEmbeddedInstrumentIdentifierLinks = (TmsEmbeddedInstrumentIdentifierLinks) o;
    return Objects.equals(this.self, tmsEmbeddedInstrumentIdentifierLinks.self) &&
        Objects.equals(this.paymentInstruments, tmsEmbeddedInstrumentIdentifierLinks.paymentInstruments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, paymentInstruments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsEmbeddedInstrumentIdentifierLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
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

