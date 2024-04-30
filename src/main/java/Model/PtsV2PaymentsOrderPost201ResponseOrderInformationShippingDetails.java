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
 * PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails
 */

public class PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails {
  @SerializedName("shippingMethod")
  private String shippingMethod = null;

  public PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Shipping method for the product. Possible values:   - &#x60;lowcost&#x60;: Lowest-cost service  - &#x60;sameday&#x60;: Courier or same-day service  - &#x60;oneday&#x60;: Next-day or overnight service  - &#x60;twoday&#x60;: Two-day service  - &#x60;threeday&#x60;: Three-day service  - &#x60;pickup&#x60;: Store pick-up  - &#x60;other&#x60;: Other shipping method  - &#x60;none&#x60;: No shipping method because product is a service or subscription 
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "Shipping method for the product. Possible values:   - `lowcost`: Lowest-cost service  - `sameday`: Courier or same-day service  - `oneday`: Next-day or overnight service  - `twoday`: Two-day service  - `threeday`: Three-day service  - `pickup`: Store pick-up  - `other`: Other shipping method  - `none`: No shipping method because product is a service or subscription ")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails ptsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails = (PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails) o;
    return Objects.equals(this.shippingMethod, ptsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails.shippingMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsOrderPost201ResponseOrderInformationShippingDetails {\n");
    
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
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
