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
import Model.PtsV2PaymentsPost201ResponseErrorInformationDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RiskV1AddressVerificationsPost201ResponseErrorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-16T15:14:23.160+05:30")
public class RiskV1AddressVerificationsPost201ResponseErrorInformation {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details = null;

  public RiskV1AddressVerificationsPost201ResponseErrorInformation reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the status. Value can be   - &#x60;APARTMENT_NUMBER_NOT_FOUND&#x60;   - &#x60;INSUFFICIENT_ADDRESS_INFORMATION&#x60;   - &#x60;HOUSE_OR_BOX_NUMBER_NOT_FOUND&#x60;   - &#x60;MULTIPLE_ADDRESS_MATCHES&#x60;   - &#x60;BOX_NUMBER_NOT_FOUND&#x60;   - &#x60;ROUTE_SERVICE_NOT_FOUND&#x60;   - &#x60;STREET_NAME_NOT_FOUND&#x60;   - &#x60;POSTAL_CODE_NOT_FOUND&#x60;   - &#x60;UNVERIFIABLE_ADDRESS&#x60;   - &#x60;MULTIPLE_ADDRESS_MATCHES_INTERNATIONAL&#x60;   - &#x60;ADDRESS_MATCH_NOT_FOUND&#x60;   - &#x60;UNSUPPORTED_CHARACTER_SET&#x60;   - &#x60;INVALID_MERCHANT_CONFIGURATION&#x60; 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of the status. Value can be   - `APARTMENT_NUMBER_NOT_FOUND`   - `INSUFFICIENT_ADDRESS_INFORMATION`   - `HOUSE_OR_BOX_NUMBER_NOT_FOUND`   - `MULTIPLE_ADDRESS_MATCHES`   - `BOX_NUMBER_NOT_FOUND`   - `ROUTE_SERVICE_NOT_FOUND`   - `STREET_NAME_NOT_FOUND`   - `POSTAL_CODE_NOT_FOUND`   - `UNVERIFIABLE_ADDRESS`   - `MULTIPLE_ADDRESS_MATCHES_INTERNATIONAL`   - `ADDRESS_MATCH_NOT_FOUND`   - `UNSUPPORTED_CHARACTER_SET`   - `INVALID_MERCHANT_CONFIGURATION` ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public RiskV1AddressVerificationsPost201ResponseErrorInformation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The detail message related to the status and reason listed above.
   * @return message
  **/
  @ApiModelProperty(value = "The detail message related to the status and reason listed above.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RiskV1AddressVerificationsPost201ResponseErrorInformation details(List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details) {
    this.details = details;
    return this;
  }

  public RiskV1AddressVerificationsPost201ResponseErrorInformation addDetailsItem(PtsV2PaymentsPost201ResponseErrorInformationDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<PtsV2PaymentsPost201ResponseErrorInformationDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<PtsV2PaymentsPost201ResponseErrorInformationDetails> getDetails() {
    return details;
  }

  public void setDetails(List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1AddressVerificationsPost201ResponseErrorInformation riskV1AddressVerificationsPost201ResponseErrorInformation = (RiskV1AddressVerificationsPost201ResponseErrorInformation) o;
    return Objects.equals(this.reason, riskV1AddressVerificationsPost201ResponseErrorInformation.reason) &&
        Objects.equals(this.message, riskV1AddressVerificationsPost201ResponseErrorInformation.message) &&
        Objects.equals(this.details, riskV1AddressVerificationsPost201ResponseErrorInformation.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AddressVerificationsPost201ResponseErrorInformation {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

