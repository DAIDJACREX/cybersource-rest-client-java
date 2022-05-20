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
 * CreateSearchRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class CreateSearchRequest {
  @SerializedName("save")
  private Boolean save = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("sort")
  private String sort = null;

  public CreateSearchRequest save(Boolean save) {
    this.save = save;
    return this;
  }

   /**
   * Indicates whether or not you want to save this search request for future use. The options are:  * &#x60;true&#x60; * &#x60;false&#x60; (default value)  If set to &#x60;true&#x60;, this field returns &#x60;searchID&#x60; in the response. You can use this value to retrieve the details of the saved search. 
   * @return save
  **/
  @ApiModelProperty(value = "Indicates whether or not you want to save this search request for future use. The options are:  * `true` * `false` (default value)  If set to `true`, this field returns `searchID` in the response. You can use this value to retrieve the details of the saved search. ")
  public Boolean getSave() {
    return save;
  }

  public void setSave(Boolean save) {
    this.save = save;
  }

  public CreateSearchRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of this search. When &#x60;save&#x60; is set to &#x60;true&#x60;, this search is saved with this name. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of this search. When `save` is set to `true`, this search is saved with this name. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateSearchRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Merchant’s time zone in ISO standard, using the TZ database format. For example: &#x60;America/Chicago&#x60; 
   * @return timezone
  **/
  @ApiModelProperty(value = "Merchant’s time zone in ISO standard, using the TZ database format. For example: `America/Chicago` ")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CreateSearchRequest query(String query) {
    this.query = query;
    return this;
  }

   /**
   * String that contains the filters and variables for which you want to search. For information about supported field-filters and operators, see the [Query Filters]( https://developer.cybersource.com/api/developer-guides/dita-txn-search-details-rest-api-dev-guide-102718/txn-search-intro/txn-filtering.html) section of the Transaction Search Developer Guide. 
   * @return query
  **/
  @ApiModelProperty(value = "String that contains the filters and variables for which you want to search. For information about supported field-filters and operators, see the [Query Filters]( https://developer.cybersource.com/api/developer-guides/dita-txn-search-details-rest-api-dev-guide-102718/txn-search-intro/txn-filtering.html) section of the Transaction Search Developer Guide. ")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public CreateSearchRequest offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Controls the starting point within the collection of results, which defaults to 0. The first item in the collection is retrieved by setting a zero offset.  For example, if you have a collection of 15 items to be retrieved from a resource and you specify limit&#x3D;5, you can retrieve the entire set of results in 3 successive requests by varying the offset value like this:  &#x60;offset&#x3D;0&#x60; &#x60;offset&#x3D;5&#x60; &#x60;offset&#x3D;10&#x60;  **Note:** If an offset larger than the number of results is provided, this will result in no embedded object being returned. 
   * @return offset
  **/
  @ApiModelProperty(value = "Controls the starting point within the collection of results, which defaults to 0. The first item in the collection is retrieved by setting a zero offset.  For example, if you have a collection of 15 items to be retrieved from a resource and you specify limit=5, you can retrieve the entire set of results in 3 successive requests by varying the offset value like this:  `offset=0` `offset=5` `offset=10`  **Note:** If an offset larger than the number of results is provided, this will result in no embedded object being returned. ")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public CreateSearchRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Controls the maximum number of items that may be returned for a single request. The default is 20, the maximum is 2000. 
   * @return limit
  **/
  @ApiModelProperty(value = "Controls the maximum number of items that may be returned for a single request. The default is 20, the maximum is 2000. ")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public CreateSearchRequest sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * A comma separated list of the following form:  &#x60;submitTimeUtc:desc&#x60; 
   * @return sort
  **/
  @ApiModelProperty(value = "A comma separated list of the following form:  `submitTimeUtc:desc` ")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSearchRequest createSearchRequest = (CreateSearchRequest) o;
    return Objects.equals(this.save, createSearchRequest.save) &&
        Objects.equals(this.name, createSearchRequest.name) &&
        Objects.equals(this.timezone, createSearchRequest.timezone) &&
        Objects.equals(this.query, createSearchRequest.query) &&
        Objects.equals(this.offset, createSearchRequest.offset) &&
        Objects.equals(this.limit, createSearchRequest.limit) &&
        Objects.equals(this.sort, createSearchRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(save, name, timezone, query, offset, limit, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSearchRequest {\n");
    
    sb.append("    save: ").append(toIndentedString(save)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

