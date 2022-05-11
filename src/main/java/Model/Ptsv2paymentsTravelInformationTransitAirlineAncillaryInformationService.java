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
 * Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService {
  @SerializedName("categoryCode")
  private String categoryCode = null;

  @SerializedName("subCategoryCode")
  private String subCategoryCode = null;

  public Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * Category code for the ancillary service that is provided. Obtain the codes from the International Air Transport Association (IATA). **Note** &#x60;#&#x60; is either 0, 1, 2, or 3. **Important** This field is required in the U.S. in order for you to qualify for either the custom payment service (CPS) or the electronic interchange reimbursement fee (EIRF)program. Format: English characters only. Optional request field for ancillary services. 
   * @return categoryCode
  **/
  @ApiModelProperty(value = "Category code for the ancillary service that is provided. Obtain the codes from the International Air Transport Association (IATA). **Note** `#` is either 0, 1, 2, or 3. **Important** This field is required in the U.S. in order for you to qualify for either the custom payment service (CPS) or the electronic interchange reimbursement fee (EIRF)program. Format: English characters only. Optional request field for ancillary services. ")
  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService subCategoryCode(String subCategoryCode) {
    this.subCategoryCode = subCategoryCode;
    return this;
  }

   /**
   * Subcategory code for the ancillary service category. Obtain the codes from the International Air Transport Association (IATA). **Note** &#x60;#&#x60; is either 0, 1, 2, or 3. Format  English characters only. Optional request field for ancillary services. 
   * @return subCategoryCode
  **/
  @ApiModelProperty(value = "Subcategory code for the ancillary service category. Obtain the codes from the International Air Transport Association (IATA). **Note** `#` is either 0, 1, 2, or 3. Format  English characters only. Optional request field for ancillary services. ")
  public String getSubCategoryCode() {
    return subCategoryCode;
  }

  public void setSubCategoryCode(String subCategoryCode) {
    this.subCategoryCode = subCategoryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService = (Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService) o;
    return Objects.equals(this.categoryCode, ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService.categoryCode) &&
        Objects.equals(this.subCategoryCode, ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService.subCategoryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCode, subCategoryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService {\n");
    
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    subCategoryCode: ").append(toIndentedString(subCategoryCode)).append("\n");
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

