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
import java.util.ArrayList;
import java.util.List;

/**
 * Ptsv2paymentsidvoidsProcessingInformation
 */

public class Ptsv2paymentsidvoidsProcessingInformation {
  @SerializedName("actionList")
  private List<String> actionList = null;

  public Ptsv2paymentsidvoidsProcessingInformation actionList(List<String> actionList) {
    this.actionList = actionList;
    return this;
  }

  public Ptsv2paymentsidvoidsProcessingInformation addActionListItem(String actionListItem) {
    if (this.actionList == null) {
      this.actionList = new ArrayList<String>();
    }
    this.actionList.add(actionListItem);
    return this;
  }

   /**
   * Array of actions (one or more) to be included in the void to invoke bundled services along with void. Possible values: - &#x60;AP_CANCEL&#x60;: Use this when Alternative Payment Void service is requested. 
   * @return actionList
  **/
  @ApiModelProperty(value = "Array of actions (one or more) to be included in the void to invoke bundled services along with void. Possible values: - `AP_CANCEL`: Use this when Alternative Payment Void service is requested. ")
  public List<String> getActionList() {
    return actionList;
  }

  public void setActionList(List<String> actionList) {
    this.actionList = actionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidvoidsProcessingInformation ptsv2paymentsidvoidsProcessingInformation = (Ptsv2paymentsidvoidsProcessingInformation) o;
    return Objects.equals(this.actionList, ptsv2paymentsidvoidsProcessingInformation.actionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidvoidsProcessingInformation {\n");
    
    sb.append("    actionList: ").append(toIndentedString(actionList)).append("\n");
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

