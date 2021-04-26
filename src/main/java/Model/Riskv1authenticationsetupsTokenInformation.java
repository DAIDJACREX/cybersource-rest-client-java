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
 * Riskv1authenticationsetupsTokenInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class Riskv1authenticationsetupsTokenInformation {
  @SerializedName("transientToken")
  private String transientToken = null;

  public Riskv1authenticationsetupsTokenInformation transientToken(String transientToken) {
    this.transientToken = transientToken;
    return this;
  }

   /**
   * A temporary ID that represents the customer&#39;s payment data (which is securely stored in Visa Data Centers). Flex Microform generates this ID and sets it to expire within 15 minutes from when the ID is generated or until the first payment authorization is carried out (whichever occurs first).  Valid value for the ID is a 64-character, alphanumeric string.  Example: 1D08M4YB968R1F7YVL4TBBKYVNRIR02VZFH9CBYSQIJJXORPI1NK5C98D7F6EB53 
   * @return transientToken
  **/
  @ApiModelProperty(value = "A temporary ID that represents the customer's payment data (which is securely stored in Visa Data Centers). Flex Microform generates this ID and sets it to expire within 15 minutes from when the ID is generated or until the first payment authorization is carried out (whichever occurs first).  Valid value for the ID is a 64-character, alphanumeric string.  Example: 1D08M4YB968R1F7YVL4TBBKYVNRIR02VZFH9CBYSQIJJXORPI1NK5C98D7F6EB53 ")
  public String getTransientToken() {
    return transientToken;
  }

  public void setTransientToken(String transientToken) {
    this.transientToken = transientToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsetupsTokenInformation riskv1authenticationsetupsTokenInformation = (Riskv1authenticationsetupsTokenInformation) o;
    return Objects.equals(this.transientToken, riskv1authenticationsetupsTokenInformation.transientToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transientToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsetupsTokenInformation {\n");
    
    sb.append("    transientToken: ").append(toIndentedString(transientToken)).append("\n");
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

