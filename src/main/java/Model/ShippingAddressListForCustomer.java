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
import Model.ShippingAddressListForCustomerEmbedded;
import Model.ShippingAddressListForCustomerLinks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A paginated container of Shipping Addresses. 
 */
@ApiModel(description = "A paginated container of Shipping Addresses. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class ShippingAddressListForCustomer {
  @SerializedName("_links")
  private ShippingAddressListForCustomerLinks links = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("_embedded")
  private ShippingAddressListForCustomerEmbedded embedded = null;

  public ShippingAddressListForCustomer links(ShippingAddressListForCustomerLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public ShippingAddressListForCustomerLinks getLinks() {
    return links;
  }

  public void setLinks(ShippingAddressListForCustomerLinks links) {
    this.links = links;
  }

   /**
   * The offset parameter supplied in the request.
   * @return offset
  **/
  @ApiModelProperty(example = "0", value = "The offset parameter supplied in the request.")
  public Integer getOffset() {
    return offset;
  }

   /**
   * The limit parameter supplied in the request.
   * @return limit
  **/
  @ApiModelProperty(example = "20", value = "The limit parameter supplied in the request.")
  public Integer getLimit() {
    return limit;
  }

   /**
   * The number of Shipping Addresses returned in the array.
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "The number of Shipping Addresses returned in the array.")
  public Integer getCount() {
    return count;
  }

   /**
   * The total number of Shipping Addresses associated with the Customer.
   * @return total
  **/
  @ApiModelProperty(example = "1", value = "The total number of Shipping Addresses associated with the Customer.")
  public Integer getTotal() {
    return total;
  }

  public ShippingAddressListForCustomer embedded(ShippingAddressListForCustomerEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public ShippingAddressListForCustomerEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(ShippingAddressListForCustomerEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingAddressListForCustomer shippingAddressListForCustomer = (ShippingAddressListForCustomer) o;
    return Objects.equals(this.links, shippingAddressListForCustomer.links) &&
        Objects.equals(this.offset, shippingAddressListForCustomer.offset) &&
        Objects.equals(this.limit, shippingAddressListForCustomer.limit) &&
        Objects.equals(this.count, shippingAddressListForCustomer.count) &&
        Objects.equals(this.total, shippingAddressListForCustomer.total) &&
        Objects.equals(this.embedded, shippingAddressListForCustomer.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, offset, limit, count, total, embedded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingAddressListForCustomer {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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

