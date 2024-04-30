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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreatePlanResponsePlanInformation
 */

public class CreatePlanResponsePlanInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("status")
  private String status = null;

  public CreatePlanResponsePlanInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Plan code 
   * @return code
  **/
  @ApiModelProperty(value = "Plan code ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CreatePlanResponsePlanInformation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Plan Status:  - &#x60;DRAFT&#x60;  - &#x60;ACTIVE&#x60; 
   * @return status
  **/
  @ApiModelProperty(value = "Plan Status:  - `DRAFT`  - `ACTIVE` ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePlanResponsePlanInformation createPlanResponsePlanInformation = (CreatePlanResponsePlanInformation) o;
    return Objects.equals(this.code, createPlanResponsePlanInformation.code) &&
        Objects.equals(this.status, createPlanResponsePlanInformation.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePlanResponsePlanInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

