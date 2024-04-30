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
 * PtsV2PaymentsPost201ResponseLinksSelf
 */

public class PtsV2PaymentsPost201ResponseLinksSelf {
  @SerializedName("href")
  private String href = null;

  @SerializedName("method")
  private String method = null;

  public PtsV2PaymentsPost201ResponseLinksSelf href(String href) {
    this.href = href;
    return this;
  }

   /**
   * This is the endpoint of the resource that was created by the successful request.
   * @return href
  **/
  @ApiModelProperty(value = "This is the endpoint of the resource that was created by the successful request.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PtsV2PaymentsPost201ResponseLinksSelf method(String method) {
    this.method = method;
    return this;
  }

   /**
   * &#x60;method&#x60; refers to the HTTP method that you can send to the &#x60;self&#x60; endpoint to retrieve details of the resource.
   * @return method
  **/
  @ApiModelProperty(value = "`method` refers to the HTTP method that you can send to the `self` endpoint to retrieve details of the resource.")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseLinksSelf ptsV2PaymentsPost201ResponseLinksSelf = (PtsV2PaymentsPost201ResponseLinksSelf) o;
    return Objects.equals(this.href, ptsV2PaymentsPost201ResponseLinksSelf.href) &&
        Objects.equals(this.method, ptsV2PaymentsPost201ResponseLinksSelf.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseLinksSelf {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

