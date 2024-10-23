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
import Model.InlineResponse2012IntegrationInformation;
import Model.InlineResponse2012OrganizationInformation;
import Model.InlineResponse2012ProductInformationSetups;
import Model.InlineResponse2012RegistrationInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * InlineResponse2012
 */

public class InlineResponse2012 {
  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private DateTime submitTimeUtc = null;

  /**
   * The status of Registration request Possible Values:   - &#39;INITIALIZED&#39;   - &#39;RECEIVED&#39;   - &#39;PROCESSING&#39;   - &#39;SUCCESS&#39;   - &#39;FAILURE&#39;   - &#39;PARTIAL&#39; 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    INITIALIZED("INITIALIZED"),
    
    RECEIVED("RECEIVED"),
    
    PROCESSING("PROCESSING"),
    
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE"),
    
    PARTIAL("PARTIAL");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("registrationInformation")
  private InlineResponse2012RegistrationInformation registrationInformation = null;

  @SerializedName("integrationInformation")
  private InlineResponse2012IntegrationInformation integrationInformation = null;

  @SerializedName("organizationInformation")
  private InlineResponse2012OrganizationInformation organizationInformation = null;

  @SerializedName("productInformationSetups")
  private List<InlineResponse2012ProductInformationSetups> productInformationSetups = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private Map<String, List<Object>> details = null;

  public InlineResponse2012 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "12351234", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2012 submitTimeUtc(DateTime submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(example = "2019-06-11T22:47:57.000Z", value = "Time of request in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public DateTime getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(DateTime submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

   /**
   * The status of Registration request Possible Values:   - &#39;INITIALIZED&#39;   - &#39;RECEIVED&#39;   - &#39;PROCESSING&#39;   - &#39;SUCCESS&#39;   - &#39;FAILURE&#39;   - &#39;PARTIAL&#39; 
   * @return status
  **/
  @ApiModelProperty(value = "The status of Registration request Possible Values:   - 'INITIALIZED'   - 'RECEIVED'   - 'PROCESSING'   - 'SUCCESS'   - 'FAILURE'   - 'PARTIAL' ")
  public StatusEnum getStatus() {
    return status;
  }

  public InlineResponse2012 registrationInformation(InlineResponse2012RegistrationInformation registrationInformation) {
    this.registrationInformation = registrationInformation;
    return this;
  }

   /**
   * Get registrationInformation
   * @return registrationInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012RegistrationInformation getRegistrationInformation() {
    return registrationInformation;
  }

  public void setRegistrationInformation(InlineResponse2012RegistrationInformation registrationInformation) {
    this.registrationInformation = registrationInformation;
  }

  public InlineResponse2012 integrationInformation(InlineResponse2012IntegrationInformation integrationInformation) {
    this.integrationInformation = integrationInformation;
    return this;
  }

   /**
   * Get integrationInformation
   * @return integrationInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012IntegrationInformation getIntegrationInformation() {
    return integrationInformation;
  }

  public void setIntegrationInformation(InlineResponse2012IntegrationInformation integrationInformation) {
    this.integrationInformation = integrationInformation;
  }

  public InlineResponse2012 organizationInformation(InlineResponse2012OrganizationInformation organizationInformation) {
    this.organizationInformation = organizationInformation;
    return this;
  }

   /**
   * Get organizationInformation
   * @return organizationInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2012OrganizationInformation getOrganizationInformation() {
    return organizationInformation;
  }

  public void setOrganizationInformation(InlineResponse2012OrganizationInformation organizationInformation) {
    this.organizationInformation = organizationInformation;
  }

  public InlineResponse2012 productInformationSetups(List<InlineResponse2012ProductInformationSetups> productInformationSetups) {
    this.productInformationSetups = productInformationSetups;
    return this;
  }

  public InlineResponse2012 addProductInformationSetupsItem(InlineResponse2012ProductInformationSetups productInformationSetupsItem) {
    if (this.productInformationSetups == null) {
      this.productInformationSetups = new ArrayList<InlineResponse2012ProductInformationSetups>();
    }
    this.productInformationSetups.add(productInformationSetupsItem);
    return this;
  }

   /**
   * Get productInformationSetups
   * @return productInformationSetups
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2012ProductInformationSetups> getProductInformationSetups() {
    return productInformationSetups;
  }

  public void setProductInformationSetups(List<InlineResponse2012ProductInformationSetups> productInformationSetups) {
    this.productInformationSetups = productInformationSetups;
  }

  public InlineResponse2012 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "Request was processed succesfully.", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse2012 details(Map<String, List<Object>> details) {
    this.details = details;
    return this;
  }

  public InlineResponse2012 putDetailsItem(String key, List<Object> detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<String, List<Object>>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<Object>> getDetails() {
    return details;
  }

  public void setDetails(Map<String, List<Object>> details) {
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
    InlineResponse2012 inlineResponse2012 = (InlineResponse2012) o;
    return Objects.equals(this.id, inlineResponse2012.id) &&
        Objects.equals(this.submitTimeUtc, inlineResponse2012.submitTimeUtc) &&
        Objects.equals(this.status, inlineResponse2012.status) &&
        Objects.equals(this.registrationInformation, inlineResponse2012.registrationInformation) &&
        Objects.equals(this.integrationInformation, inlineResponse2012.integrationInformation) &&
        Objects.equals(this.organizationInformation, inlineResponse2012.organizationInformation) &&
        Objects.equals(this.productInformationSetups, inlineResponse2012.productInformationSetups) &&
        Objects.equals(this.message, inlineResponse2012.message) &&
        Objects.equals(this.details, inlineResponse2012.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submitTimeUtc, status, registrationInformation, integrationInformation, organizationInformation, productInformationSetups, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2012 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    registrationInformation: ").append(toIndentedString(registrationInformation)).append("\n");
    sb.append("    integrationInformation: ").append(toIndentedString(integrationInformation)).append("\n");
    sb.append("    organizationInformation: ").append(toIndentedString(organizationInformation)).append("\n");
    sb.append("    productInformationSetups: ").append(toIndentedString(productInformationSetups)).append("\n");
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

