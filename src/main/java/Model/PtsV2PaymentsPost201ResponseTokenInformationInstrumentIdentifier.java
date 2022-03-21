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
 * PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-16T15:14:23.160+05:30")
public class PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier {
  @SerializedName("id")
  private String id = null;

  @SerializedName("state")
  private String state = null;

  public PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Instrument Identifier token that was created as part of a bundled TOKEN_CREATE action. 
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the Instrument Identifier token that was created as part of a bundled TOKEN_CREATE action. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Issuers state for the card number. Valid values: - ACTIVE - CLOSED : The account has been closed. 
   * @return state
  **/
  @ApiModelProperty(value = "Issuers state for the card number. Valid values: - ACTIVE - CLOSED : The account has been closed. ")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier ptsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier = (PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier) o;
    return Objects.equals(this.id, ptsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier.id) &&
        Objects.equals(this.state, ptsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseTokenInformationInstrumentIdentifier {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

