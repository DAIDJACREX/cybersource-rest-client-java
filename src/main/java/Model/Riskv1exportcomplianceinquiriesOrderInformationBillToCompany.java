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
 * Riskv1exportcomplianceinquiriesOrderInformationBillToCompany
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-18T15:21:09.334+05:30")
public class Riskv1exportcomplianceinquiriesOrderInformationBillToCompany {
  @SerializedName("name")
  private String name = null;

  public Riskv1exportcomplianceinquiriesOrderInformationBillToCompany name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Company name of person buying the product. Important: This field or billTo.firstName and billTo.lastName must be present. Else, your request will fail. 
   * @return name
  **/
  @ApiModelProperty(value = "Company name of person buying the product. Important: This field or billTo.firstName and billTo.lastName must be present. Else, your request will fail. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1exportcomplianceinquiriesOrderInformationBillToCompany riskv1exportcomplianceinquiriesOrderInformationBillToCompany = (Riskv1exportcomplianceinquiriesOrderInformationBillToCompany) o;
    return Objects.equals(this.name, riskv1exportcomplianceinquiriesOrderInformationBillToCompany.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1exportcomplianceinquiriesOrderInformationBillToCompany {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

