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
import Model.InlineResponse200Keys;
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
 * Successful searchKeysResponse
 */
@ApiModel(description = "Successful searchKeysResponse")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-30T13:38:58.602+05:30")
public class InlineResponse200 {
  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("sort")
  private String sort = null;

  @SerializedName("keys")
  private List<InlineResponse200Keys> keys = null;

  public InlineResponse200 submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(example = "2016-08-11T22:47:57Z", value = "Time of request in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public InlineResponse200 totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Specifies the total number of items found based on the request
   * @return totalCount
  **/
  @ApiModelProperty(value = "Specifies the total number of items found based on the request")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public InlineResponse200 offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Specifies the record offset from the records are returned part of the response
   * @return offset
  **/
  @ApiModelProperty(value = "Specifies the record offset from the records are returned part of the response")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public InlineResponse200 limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Specifies the maximum number of records requested part of the response
   * @return limit
  **/
  @ApiModelProperty(value = "Specifies the maximum number of records requested part of the response")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public InlineResponse200 sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Specifies a comma separated list of field names based on which the result is sorted.
   * @return sort
  **/
  @ApiModelProperty(value = "Specifies a comma separated list of field names based on which the result is sorted.")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public InlineResponse200 keys(List<InlineResponse200Keys> keys) {
    this.keys = keys;
    return this;
  }

  public InlineResponse200 addKeysItem(InlineResponse200Keys keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<InlineResponse200Keys>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200Keys> getKeys() {
    return keys;
  }

  public void setKeys(List<InlineResponse200Keys> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.submitTimeUtc, inlineResponse200.submitTimeUtc) &&
        Objects.equals(this.totalCount, inlineResponse200.totalCount) &&
        Objects.equals(this.offset, inlineResponse200.offset) &&
        Objects.equals(this.limit, inlineResponse200.limit) &&
        Objects.equals(this.sort, inlineResponse200.sort) &&
        Objects.equals(this.keys, inlineResponse200.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, totalCount, offset, limit, sort, keys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

