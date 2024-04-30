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
import Model.ECheckConfigCommonInternalOnly;
import Model.ECheckConfigCommonProcessors;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ECheckConfigCommon
 */

public class ECheckConfigCommon {
  @SerializedName("processors")
  private Map<String, ECheckConfigCommonProcessors> processors = null;

  @SerializedName("internalOnly")
  private ECheckConfigCommonInternalOnly internalOnly = null;

  @SerializedName("accountHolderName")
  private String accountHolderName = null;

  @SerializedName("accountType")
  private String accountType = null;

  @SerializedName("accountRoutingNumber")
  private String accountRoutingNumber = null;

  @SerializedName("accountNumber")
  private String accountNumber = null;

  public ECheckConfigCommon processors(Map<String, ECheckConfigCommonProcessors> processors) {
    this.processors = processors;
    return this;
  }

  public ECheckConfigCommon putProcessorsItem(String key, ECheckConfigCommonProcessors processorsItem) {
    if (this.processors == null) {
      this.processors = new HashMap<String, ECheckConfigCommonProcessors>();
    }
    this.processors.put(key, processorsItem);
    return this;
  }

   /**
   * Get processors
   * @return processors
  **/
  @ApiModelProperty(value = "")
  public Map<String, ECheckConfigCommonProcessors> getProcessors() {
    return processors;
  }

  public void setProcessors(Map<String, ECheckConfigCommonProcessors> processors) {
    this.processors = processors;
  }

  public ECheckConfigCommon internalOnly(ECheckConfigCommonInternalOnly internalOnly) {
    this.internalOnly = internalOnly;
    return this;
  }

   /**
   * Get internalOnly
   * @return internalOnly
  **/
  @ApiModelProperty(value = "")
  public ECheckConfigCommonInternalOnly getInternalOnly() {
    return internalOnly;
  }

  public void setInternalOnly(ECheckConfigCommonInternalOnly internalOnly) {
    this.internalOnly = internalOnly;
  }

  public ECheckConfigCommon accountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
    return this;
  }

   /**
   * Mandatory  Name on Merchant&#39;s Bank Account Only ASCII (Hex 20 to Hex 7E) 
   * @return accountHolderName
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Name on Merchant's Bank Account Only ASCII (Hex 20 to Hex 7E) ")
  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  public ECheckConfigCommon accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Mandatory  Type of account for Merchant&#39;s Bank Account Possible values: - checking - savings - corporatechecking - corporatesavings 
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Type of account for Merchant's Bank Account Possible values: - checking - savings - corporatechecking - corporatesavings ")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public ECheckConfigCommon accountRoutingNumber(String accountRoutingNumber) {
    this.accountRoutingNumber = accountRoutingNumber;
    return this;
  }

   /**
   * Mandatory  Routing number for Merchant&#39;s Bank Account US Account Routing Number 
   * @return accountRoutingNumber
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Routing number for Merchant's Bank Account US Account Routing Number ")
  public String getAccountRoutingNumber() {
    return accountRoutingNumber;
  }

  public void setAccountRoutingNumber(String accountRoutingNumber) {
    this.accountRoutingNumber = accountRoutingNumber;
  }

  public ECheckConfigCommon accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Mandatory  Account number for Merchant&#39;s Bank Account 
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Account number for Merchant's Bank Account ")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ECheckConfigCommon echeckConfigCommon = (ECheckConfigCommon) o;
    return Objects.equals(this.processors, echeckConfigCommon.processors) &&
        Objects.equals(this.internalOnly, echeckConfigCommon.internalOnly) &&
        Objects.equals(this.accountHolderName, echeckConfigCommon.accountHolderName) &&
        Objects.equals(this.accountType, echeckConfigCommon.accountType) &&
        Objects.equals(this.accountRoutingNumber, echeckConfigCommon.accountRoutingNumber) &&
        Objects.equals(this.accountNumber, echeckConfigCommon.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processors, internalOnly, accountHolderName, accountType, accountRoutingNumber, accountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECheckConfigCommon {\n");
    
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    internalOnly: ").append(toIndentedString(internalOnly)).append("\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountRoutingNumber: ").append(toIndentedString(accountRoutingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

