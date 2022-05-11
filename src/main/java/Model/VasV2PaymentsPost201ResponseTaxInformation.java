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
 * VasV2PaymentsPost201ResponseTaxInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class VasV2PaymentsPost201ResponseTaxInformation {
  @SerializedName("commitIndicator")
  private Boolean commitIndicator = null;

  @SerializedName("refundIndicator")
  private Boolean refundIndicator = null;

  public VasV2PaymentsPost201ResponseTaxInformation commitIndicator(Boolean commitIndicator) {
    this.commitIndicator = commitIndicator;
    return this;
  }

   /**
   * Indicates whether this is a committed tax transaction. For a committed tax transaction, the status in the Tax Detail Report is “Committed.” For an uncommitted tax transaction, the status in the Tax Detail Report is “Uncommitted.” Possible values: - &#x60;true&#x60;: This is a committed tax transaction. - &#x60;false&#x60; (default): This is not a committed tax transaction.  A committed tax request is a tax service request that sets the status field in the Tax Detail Report to committed. The committed status indicates that the amount calculated by the tax service is included in the amount of a capture or credit.  Use a void service request to cancels a committed tax request or a committed refund tax request. The void transaction is included as a separate entry in the Tax Detail Report. The value of the status field is cancelled. The value of the link ID is the request ID of the committed tax request or refund tax request that was voided. You can use the value of the link ID to reconcile your orders.  Optional for U.S., Canadian, international tax, and value added taxes. 
   * @return commitIndicator
  **/
  @ApiModelProperty(value = "Indicates whether this is a committed tax transaction. For a committed tax transaction, the status in the Tax Detail Report is “Committed.” For an uncommitted tax transaction, the status in the Tax Detail Report is “Uncommitted.” Possible values: - `true`: This is a committed tax transaction. - `false` (default): This is not a committed tax transaction.  A committed tax request is a tax service request that sets the status field in the Tax Detail Report to committed. The committed status indicates that the amount calculated by the tax service is included in the amount of a capture or credit.  Use a void service request to cancels a committed tax request or a committed refund tax request. The void transaction is included as a separate entry in the Tax Detail Report. The value of the status field is cancelled. The value of the link ID is the request ID of the committed tax request or refund tax request that was voided. You can use the value of the link ID to reconcile your orders.  Optional for U.S., Canadian, international tax, and value added taxes. ")
  public Boolean getCommitIndicator() {
    return commitIndicator;
  }

  public void setCommitIndicator(Boolean commitIndicator) {
    this.commitIndicator = commitIndicator;
  }

  public VasV2PaymentsPost201ResponseTaxInformation refundIndicator(Boolean refundIndicator) {
    this.refundIndicator = refundIndicator;
    return this;
  }

   /**
   * Indicates whether this is a refund tax transaction. For a refund tax transaction, amounts in the Tax Detail Report will be negative. Possible values: - &#x60;true&#x60;: This is a refund tax transaction. - &#x60;false&#x60; (default): This is not a refund tax transaction.  A refund tax request is a tax service request that sets the transaction type field in the Tax Detail Report to refunded and makes the reported amount negative. Tax amounts are returned as positive amounts in reply messages, but they are saved in reports as negative amounts which enables the reporting software to accurately calculate the aggregate amounts.  Optional for U.S., Canadian, international tax, and value added taxes. 
   * @return refundIndicator
  **/
  @ApiModelProperty(value = "Indicates whether this is a refund tax transaction. For a refund tax transaction, amounts in the Tax Detail Report will be negative. Possible values: - `true`: This is a refund tax transaction. - `false` (default): This is not a refund tax transaction.  A refund tax request is a tax service request that sets the transaction type field in the Tax Detail Report to refunded and makes the reported amount negative. Tax amounts are returned as positive amounts in reply messages, but they are saved in reports as negative amounts which enables the reporting software to accurately calculate the aggregate amounts.  Optional for U.S., Canadian, international tax, and value added taxes. ")
  public Boolean getRefundIndicator() {
    return refundIndicator;
  }

  public void setRefundIndicator(Boolean refundIndicator) {
    this.refundIndicator = refundIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VasV2PaymentsPost201ResponseTaxInformation vasV2PaymentsPost201ResponseTaxInformation = (VasV2PaymentsPost201ResponseTaxInformation) o;
    return Objects.equals(this.commitIndicator, vasV2PaymentsPost201ResponseTaxInformation.commitIndicator) &&
        Objects.equals(this.refundIndicator, vasV2PaymentsPost201ResponseTaxInformation.refundIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitIndicator, refundIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VasV2PaymentsPost201ResponseTaxInformation {\n");
    
    sb.append("    commitIndicator: ").append(toIndentedString(commitIndicator)).append("\n");
    sb.append("    refundIndicator: ").append(toIndentedString(refundIndicator)).append("\n");
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

