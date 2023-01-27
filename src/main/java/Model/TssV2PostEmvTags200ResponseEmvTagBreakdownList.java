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
 * TssV2PostEmvTags200ResponseEmvTagBreakdownList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class TssV2PostEmvTags200ResponseEmvTagBreakdownList {
  @SerializedName("tag")
  private String tag = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("description")
  private String description = null;

  public TssV2PostEmvTags200ResponseEmvTagBreakdownList tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Hexadecimal code of tag. 
   * @return tag
  **/
  @ApiModelProperty(value = "Hexadecimal code of tag. ")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public TssV2PostEmvTags200ResponseEmvTagBreakdownList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of tag. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of tag. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2PostEmvTags200ResponseEmvTagBreakdownList length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Tag length in bytes. 
   * @return length
  **/
  @ApiModelProperty(value = "Tag length in bytes. ")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public TssV2PostEmvTags200ResponseEmvTagBreakdownList value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Hexadecimal value contained in the tag, masked data is represented by an &#39;X&#39;. 
   * @return value
  **/
  @ApiModelProperty(value = "Hexadecimal value contained in the tag, masked data is represented by an 'X'. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TssV2PostEmvTags200ResponseEmvTagBreakdownList description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of tag. 
   * @return description
  **/
  @ApiModelProperty(value = "Description of tag. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2PostEmvTags200ResponseEmvTagBreakdownList tssV2PostEmvTags200ResponseEmvTagBreakdownList = (TssV2PostEmvTags200ResponseEmvTagBreakdownList) o;
    return Objects.equals(this.tag, tssV2PostEmvTags200ResponseEmvTagBreakdownList.tag) &&
        Objects.equals(this.name, tssV2PostEmvTags200ResponseEmvTagBreakdownList.name) &&
        Objects.equals(this.length, tssV2PostEmvTags200ResponseEmvTagBreakdownList.length) &&
        Objects.equals(this.value, tssV2PostEmvTags200ResponseEmvTagBreakdownList.value) &&
        Objects.equals(this.description, tssV2PostEmvTags200ResponseEmvTagBreakdownList.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, name, length, value, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2PostEmvTags200ResponseEmvTagBreakdownList {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

