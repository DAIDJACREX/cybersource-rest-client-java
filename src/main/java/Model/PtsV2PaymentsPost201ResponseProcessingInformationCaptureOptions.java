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
 * PtsV2PaymentsPost201ResponseProcessingInformationCaptureOptions
 */

public class PtsV2PaymentsPost201ResponseProcessingInformationCaptureOptions {
  @SerializedName("finalCapture")
  private String finalCapture = null;

  public PtsV2PaymentsPost201ResponseProcessingInformationCaptureOptions finalCapture(String finalCapture) {
    this.finalCapture = finalCapture;
    return this;
  }

   /**
   * Indicates whether you can make additional captures against the authorized payment. Set to true if you do not intend to capture additional payments against the authorization. Set to false if you intend to capture additional payments Possible Values: - &#x60;true&#x60; - &#x60;false&#x60; 
   * @return finalCapture
  **/
  @ApiModelProperty(value = "Indicates whether you can make additional captures against the authorized payment. Set to true if you do not intend to capture additional payments against the authorization. Set to false if you intend to capture additional payments Possible Values: - `true` - `false` ")
  public String getFinalCapture() {
    return finalCapture;
  }

  public void setFinalCapture(String finalCapture) {
    this.finalCapture = finalCapture;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseProcessingInformationCaptureOptions ptsV2PaymentsPost201ResponseProcessingInformationCaptureOptions = (PtsV2PaymentsPost201ResponseProcessingInformationCaptureOptions) o;
    return Objects.equals(this.finalCapture, ptsV2PaymentsPost201ResponseProcessingInformationCaptureOptions.finalCapture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalCapture);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseProcessingInformationCaptureOptions {\n");
    
    sb.append("    finalCapture: ").append(toIndentedString(finalCapture)).append("\n");
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

