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
import Model.InlineResponse4001Details;
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
 * InlineResponse4001
 */

public class InlineResponse4001 {
  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("details")
  private List<InlineResponse4001Details> details = null;

  @SerializedName("informationLink")
  private String informationLink = null;

  @SerializedName("message")
  private String message = null;

  /**
   * Gets or Sets reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    INVALID_APIKEY("INVALID_APIKEY"),
    
    INVALID_SHIPPING_INPUT_PARAMS("INVALID_SHIPPING_INPUT_PARAMS"),
    
    CAPTURE_CONTEXT_INVALID("CAPTURE_CONTEXT_INVALID"),
    
    CAPTURE_CONTEXT_EXPIRED("CAPTURE_CONTEXT_EXPIRED"),
    
    SDK_XHR_ERROR("SDK_XHR_ERROR"),
    
    UNIFIEDPAYMENTS_VALIDATION_PARAMS("UNIFIEDPAYMENTS_VALIDATION_PARAMS"),
    
    UNIFIEDPAYMENTS_VALIDATION_FIELDS("UNIFIEDPAYMENTS_VALIDATION_FIELDS"),
    
    UNIFIEDPAYMENT_PAYMENT_PARAMITERS("UNIFIEDPAYMENT_PAYMENT_PARAMITERS"),
    
    CREATE_TOKEN_TIMEOUT("CREATE_TOKEN_TIMEOUT"),
    
    CREATE_TOKEN_XHR_ERROR("CREATE_TOKEN_XHR_ERROR"),
    
    SHOW_LOAD_CONTAINER_SELECTOR("SHOW_LOAD_CONTAINER_SELECTOR"),
    
    SHOW_LOAD_INVALID_CONTAINER("SHOW_LOAD_INVALID_CONTAINER"),
    
    SHOW_TOKEN_TIMEOUT("SHOW_TOKEN_TIMEOUT"),
    
    SHOW_TOKEN_XHR_ERROR("SHOW_TOKEN_XHR_ERROR"),
    
    SHOW_PAYMENT_TIMEOUT("SHOW_PAYMENT_TIMEOUT");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("reason")
  private ReasonEnum reason = null;

  public InlineResponse4001 correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * Get correlationId
   * @return correlationId
  **/
  @ApiModelProperty(value = "")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public InlineResponse4001 details(List<InlineResponse4001Details> details) {
    this.details = details;
    return this;
  }

  public InlineResponse4001 addDetailsItem(InlineResponse4001Details detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<InlineResponse4001Details>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse4001Details> getDetails() {
    return details;
  }

  public void setDetails(List<InlineResponse4001Details> details) {
    this.details = details;
  }

  public InlineResponse4001 informationLink(String informationLink) {
    this.informationLink = informationLink;
    return this;
  }

   /**
   * Get informationLink
   * @return informationLink
  **/
  @ApiModelProperty(value = "")
  public String getInformationLink() {
    return informationLink;
  }

  public void setInformationLink(String informationLink) {
    this.informationLink = informationLink;
  }

  public InlineResponse4001 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse4001 reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4001 inlineResponse4001 = (InlineResponse4001) o;
    return Objects.equals(this.correlationId, inlineResponse4001.correlationId) &&
        Objects.equals(this.details, inlineResponse4001.details) &&
        Objects.equals(this.informationLink, inlineResponse4001.informationLink) &&
        Objects.equals(this.message, inlineResponse4001.message) &&
        Objects.equals(this.reason, inlineResponse4001.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, details, informationLink, message, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4001 {\n");
    
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    informationLink: ").append(toIndentedString(informationLink)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

