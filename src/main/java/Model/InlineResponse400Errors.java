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
import Model.InlineResponse400Details;
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
 * InlineResponse400Errors
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class InlineResponse400Errors {
  @SerializedName("type")
  private String type = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<InlineResponse400Details> details = null;

   /**
   * The type of error.
   * @return type
  **/
  @ApiModelProperty(value = "The type of error.")
  public String getType() {
    return type;
  }

   /**
   * The detailed message related to the type stated above.
   * @return message
  **/
  @ApiModelProperty(value = "The detailed message related to the type stated above.")
  public String getMessage() {
    return message;
  }

  public InlineResponse400Errors details(List<InlineResponse400Details> details) {
    this.details = details;
    return this;
  }

  public InlineResponse400Errors addDetailsItem(InlineResponse400Details detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<InlineResponse400Details>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse400Details> getDetails() {
    return details;
  }

  public void setDetails(List<InlineResponse400Details> details) {
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
    InlineResponse400Errors inlineResponse400Errors = (InlineResponse400Errors) o;
    return Objects.equals(this.type, inlineResponse400Errors.type) &&
        Objects.equals(this.message, inlineResponse400Errors.message) &&
        Objects.equals(this.details, inlineResponse400Errors.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400Errors {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

