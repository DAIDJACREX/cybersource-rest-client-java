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
import Model.ECheckConfigFeaturesAccountValidationService;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ECheckConfigFeatures
 */

public class ECheckConfigFeatures {
  @SerializedName("accountValidationService")
  private ECheckConfigFeaturesAccountValidationService accountValidationService = null;

  public ECheckConfigFeatures accountValidationService(ECheckConfigFeaturesAccountValidationService accountValidationService) {
    this.accountValidationService = accountValidationService;
    return this;
  }

   /**
   * Get accountValidationService
   * @return accountValidationService
  **/
  @ApiModelProperty(value = "")
  public ECheckConfigFeaturesAccountValidationService getAccountValidationService() {
    return accountValidationService;
  }

  public void setAccountValidationService(ECheckConfigFeaturesAccountValidationService accountValidationService) {
    this.accountValidationService = accountValidationService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ECheckConfigFeatures echeckConfigFeatures = (ECheckConfigFeatures) o;
    return Objects.equals(this.accountValidationService, echeckConfigFeatures.accountValidationService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountValidationService);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECheckConfigFeatures {\n");
    
    sb.append("    accountValidationService: ").append(toIndentedString(accountValidationService)).append("\n");
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

