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
 * Ptsv2refreshpaymentstatusidProcessingInformation
 */

public class Ptsv2refreshpaymentstatusidProcessingInformation {
  @SerializedName("actionList")
  private List<String> actionList = null;

  public Ptsv2refreshpaymentstatusidProcessingInformation actionList(List<String> actionList) {
    this.actionList = actionList;
    return this;
  }

  public Ptsv2refreshpaymentstatusidProcessingInformation addActionListItem(String actionListItem) {
    if (this.actionList == null) {
      this.actionList = new ArrayList<String>();
    }
    this.actionList.add(actionListItem);
    return this;
  }

   /**
   * Array of actions (one or more) to be included in the payment to invoke bundled services along with payment status.  Possible values are one or more of follows:   - &#x60;AP_STATUS&#x60;: Use this when Alternative Payment check status service is requested.   - &#x60;AP_SESSION_STATUS&#x60;: Use this when Alternative Payment check status service for Paypal, Klarna is requested.   - &#x60;AP_INITIATE_STATUS&#x60;: Use this when Alternative Payment check status service for KCP is requested. 
   * @return actionList
  **/
  @ApiModelProperty(value = "Array of actions (one or more) to be included in the payment to invoke bundled services along with payment status.  Possible values are one or more of follows:   - `AP_STATUS`: Use this when Alternative Payment check status service is requested.   - `AP_SESSION_STATUS`: Use this when Alternative Payment check status service for Paypal, Klarna is requested.   - `AP_INITIATE_STATUS`: Use this when Alternative Payment check status service for KCP is requested. ")
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
    Ptsv2refreshpaymentstatusidProcessingInformation ptsv2refreshpaymentstatusidProcessingInformation = (Ptsv2refreshpaymentstatusidProcessingInformation) o;
    return Objects.equals(this.actionList, ptsv2refreshpaymentstatusidProcessingInformation.actionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2refreshpaymentstatusidProcessingInformation {\n");
    
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

