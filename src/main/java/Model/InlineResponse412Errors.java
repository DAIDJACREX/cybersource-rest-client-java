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
 * InlineResponse412Errors
 */

public class InlineResponse412Errors {
  @SerializedName("type")
  private String type = null;

  @SerializedName("message")
  private String message = null;

   /**
   * The type of error.  Possible Values:   - conflict 
   * @return type
  **/
  @ApiModelProperty(value = "The type of error.  Possible Values:   - conflict ")
  public String getType() {
    return type;
  }

   /**
   * The detailed message related to the type.
   * @return message
  **/
  @ApiModelProperty(value = "The detailed message related to the type.")
  public String getMessage() {
    return message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse412Errors inlineResponse412Errors = (InlineResponse412Errors) o;
    return Objects.equals(this.type, inlineResponse412Errors.type) &&
        Objects.equals(this.message, inlineResponse412Errors.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse412Errors {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

