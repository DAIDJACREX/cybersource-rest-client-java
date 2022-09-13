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
import org.joda.time.DateTime;

/**
 * Notification Of Change
 */
@ApiModel(description = "Notification Of Change")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T23:41:38.291+05:30")
public class ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges {
  @SerializedName("merchantReferenceNumber")
  private String merchantReferenceNumber = null;

  @SerializedName("transactionReferenceNumber")
  private String transactionReferenceNumber = null;

  @SerializedName("time")
  private DateTime time = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("accountType")
  private String accountType = null;

  @SerializedName("routingNumber")
  private String routingNumber = null;

  @SerializedName("accountNumber")
  private String accountNumber = null;

  @SerializedName("consumerName")
  private String consumerName = null;

  public ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges merchantReferenceNumber(String merchantReferenceNumber) {
    this.merchantReferenceNumber = merchantReferenceNumber;
    return this;
  }

   /**
   * Merchant Reference Number
   * @return merchantReferenceNumber
  **/
  @ApiModelProperty(example = "TC30877-10", value = "Merchant Reference Number")
  public String getMerchantReferenceNumber() {
    return merchantReferenceNumber;
  }

  public void setMerchantReferenceNumber(String merchantReferenceNumber) {
    this.merchantReferenceNumber = merchantReferenceNumber;
  }

  public ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges transactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
    return this;
  }

   /**
   * Transaction Reference Number
   * @return transactionReferenceNumber
  **/
  @ApiModelProperty(example = "55563", value = "Transaction Reference Number")
  public String getTransactionReferenceNumber() {
    return transactionReferenceNumber;
  }

  public void setTransactionReferenceNumber(String transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
  }

  public ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Notification Of Change Date(ISO 8601 Extended)
   * @return time
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Notification Of Change Date(ISO 8601 Extended)")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }

  public ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Merchant Reference Number
   * @return code
  **/
  @ApiModelProperty(example = "TC30877-10", value = "Merchant Reference Number")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Account Type
   * @return accountType
  **/
  @ApiModelProperty(example = "Checking Account", value = "Account Type")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Routing Number
   * @return routingNumber
  **/
  @ApiModelProperty(example = "123456789", value = "Routing Number")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account Number
   * @return accountNumber
  **/
  @ApiModelProperty(example = "############1234", value = "Account Number")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges consumerName(String consumerName) {
    this.consumerName = consumerName;
    return this;
  }

   /**
   * Consumer Name
   * @return consumerName
  **/
  @ApiModelProperty(example = "Consumer Name", value = "Consumer Name")
  public String getConsumerName() {
    return consumerName;
  }

  public void setConsumerName(String consumerName) {
    this.consumerName = consumerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges reportingV3NotificationofChangesGet200ResponseNotificationOfChanges = (ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges) o;
    return Objects.equals(this.merchantReferenceNumber, reportingV3NotificationofChangesGet200ResponseNotificationOfChanges.merchantReferenceNumber) &&
        Objects.equals(this.transactionReferenceNumber, reportingV3NotificationofChangesGet200ResponseNotificationOfChanges.transactionReferenceNumber) &&
        Objects.equals(this.time, reportingV3NotificationofChangesGet200ResponseNotificationOfChanges.time) &&
        Objects.equals(this.code, reportingV3NotificationofChangesGet200ResponseNotificationOfChanges.code) &&
        Objects.equals(this.accountType, reportingV3NotificationofChangesGet200ResponseNotificationOfChanges.accountType) &&
        Objects.equals(this.routingNumber, reportingV3NotificationofChangesGet200ResponseNotificationOfChanges.routingNumber) &&
        Objects.equals(this.accountNumber, reportingV3NotificationofChangesGet200ResponseNotificationOfChanges.accountNumber) &&
        Objects.equals(this.consumerName, reportingV3NotificationofChangesGet200ResponseNotificationOfChanges.consumerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantReferenceNumber, transactionReferenceNumber, time, code, accountType, routingNumber, accountNumber, consumerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges {\n");
    
    sb.append("    merchantReferenceNumber: ").append(toIndentedString(merchantReferenceNumber)).append("\n");
    sb.append("    transactionReferenceNumber: ").append(toIndentedString(transactionReferenceNumber)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    consumerName: ").append(toIndentedString(consumerName)).append("\n");
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

