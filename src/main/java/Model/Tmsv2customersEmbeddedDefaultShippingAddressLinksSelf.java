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
 * Tmsv2customersEmbeddedDefaultShippingAddressLinksSelf
 */

public class Tmsv2customersEmbeddedDefaultShippingAddressLinksSelf {
  @SerializedName("href")
  private String href = null;

   /**
   * Link to the Customers Shipping Address 
   * @return href
  **/
  @ApiModelProperty(example = "/tms/v2/customers/D9F340DD3DB9C276E053A2598D0A41A3/shipping-addresses/D9F3439F0448C901E053A2598D0AA1CC", value = "Link to the Customers Shipping Address ")
  public String getHref() {
    return href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultShippingAddressLinksSelf tmsv2customersEmbeddedDefaultShippingAddressLinksSelf = (Tmsv2customersEmbeddedDefaultShippingAddressLinksSelf) o;
    return Objects.equals(this.href, tmsv2customersEmbeddedDefaultShippingAddressLinksSelf.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultShippingAddressLinksSelf {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

