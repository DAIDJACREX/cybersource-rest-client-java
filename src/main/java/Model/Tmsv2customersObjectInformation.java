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
 * Tmsv2customersObjectInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class Tmsv2customersObjectInformation {
  @SerializedName("title")
  private String title = null;

  @SerializedName("comment")
  private String comment = null;

  public Tmsv2customersObjectInformation title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Name or title of the customer. 
   * @return title
  **/
  @ApiModelProperty(value = "Name or title of the customer. ")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Tmsv2customersObjectInformation comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comments that you can make about the customer. 
   * @return comment
  **/
  @ApiModelProperty(value = "Comments that you can make about the customer. ")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersObjectInformation tmsv2customersObjectInformation = (Tmsv2customersObjectInformation) o;
    return Objects.equals(this.title, tmsv2customersObjectInformation.title) &&
        Objects.equals(this.comment, tmsv2customersObjectInformation.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersObjectInformation {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

