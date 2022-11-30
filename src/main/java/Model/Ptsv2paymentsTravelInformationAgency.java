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
 * Ptsv2paymentsTravelInformationAgency
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-30T13:38:58.602+05:30")
public class Ptsv2paymentsTravelInformationAgency {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  public Ptsv2paymentsTravelInformationAgency code(String code) {
    this.code = code;
    return this;
  }

   /**
   * International Air Transport Association (IATA) code of travel agency that made the vehicle rental reservation. 
   * @return code
  **/
  @ApiModelProperty(value = "International Air Transport Association (IATA) code of travel agency that made the vehicle rental reservation. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Ptsv2paymentsTravelInformationAgency name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of travel agency that made the reservation. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of travel agency that made the reservation. ")
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
    Ptsv2paymentsTravelInformationAgency ptsv2paymentsTravelInformationAgency = (Ptsv2paymentsTravelInformationAgency) o;
    return Objects.equals(this.code, ptsv2paymentsTravelInformationAgency.code) &&
        Objects.equals(this.name, ptsv2paymentsTravelInformationAgency.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationAgency {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

