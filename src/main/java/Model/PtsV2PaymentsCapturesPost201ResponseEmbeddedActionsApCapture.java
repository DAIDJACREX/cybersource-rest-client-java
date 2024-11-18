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
 * PtsV2PaymentsCapturesPost201ResponseEmbeddedActionsApCapture
 */

public class PtsV2PaymentsCapturesPost201ResponseEmbeddedActionsApCapture {
  @SerializedName("reason")
  private String reason = null;

  public PtsV2PaymentsCapturesPost201ResponseEmbeddedActionsApCapture reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason why the captured payment status is PENDING or DENIED. BUYER_COMPLAINT The payer initiated a dispute for this captured payment with processor. CHARGEBACK The captured funds were reversed in response to the payer disputing this captured payment with the issuer of the financial instrument used to pay for this captured payment. ECHECK The payer paid by an eCheck that has not yet cleared. INTERNATIONAL_WITHDRAWAL Visit your online account. In your Account Overview, accept and deny this payment. OTHER No additional specific reason can be provided. For more information about this captured payment, visit your account online or contact processor. PENDING_REVIEW The captured payment is pending manual review. RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION The payee has not yet set up appropriate receiving preferences for their account. For more information about how to accept or deny this payment, visit your account online. This reason is typically offered in scenarios such as when the currency of the captured payment is different from the primary holding currency of the payee. REFUNDED The captured funds were refunded. TRANSACTION_APPROVED_AWAITING_FUNDING The payer must send the funds for this captured payment. This code generally appears for manual EFTs. UNILATERAL The payee does not have a processor account. VERIFICATION_REQUIRED The payee&#39;s processor account is not verified. String with values,  &#x60;BUYER_COMPLAINT&#x60;  &#x60;CHARGEBACK&#x60;  &#x60;ECHECK&#x60;  &#x60;INTERNATIONAL_WITHDRAWAL&#x60;  &#x60;OTHER&#x60;  &#x60;PENDING_REVIEW&#x60;  &#x60;RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION&#x60;  &#x60;REFUNDED&#x60;  &#x60;TRANSACTION_APPROVED_AWAITING_FUNDING&#x60;  &#x60;UNILATERAL&#x60;  &#x60;VERIFICATION_REQUIRED&#x60; 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason why the captured payment status is PENDING or DENIED. BUYER_COMPLAINT The payer initiated a dispute for this captured payment with processor. CHARGEBACK The captured funds were reversed in response to the payer disputing this captured payment with the issuer of the financial instrument used to pay for this captured payment. ECHECK The payer paid by an eCheck that has not yet cleared. INTERNATIONAL_WITHDRAWAL Visit your online account. In your Account Overview, accept and deny this payment. OTHER No additional specific reason can be provided. For more information about this captured payment, visit your account online or contact processor. PENDING_REVIEW The captured payment is pending manual review. RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION The payee has not yet set up appropriate receiving preferences for their account. For more information about how to accept or deny this payment, visit your account online. This reason is typically offered in scenarios such as when the currency of the captured payment is different from the primary holding currency of the payee. REFUNDED The captured funds were refunded. TRANSACTION_APPROVED_AWAITING_FUNDING The payer must send the funds for this captured payment. This code generally appears for manual EFTs. UNILATERAL The payee does not have a processor account. VERIFICATION_REQUIRED The payee's processor account is not verified. String with values,  `BUYER_COMPLAINT`  `CHARGEBACK`  `ECHECK`  `INTERNATIONAL_WITHDRAWAL`  `OTHER`  `PENDING_REVIEW`  `RECEIVING_PREFERENCE_MANDATES_MANUAL_ACTION`  `REFUNDED`  `TRANSACTION_APPROVED_AWAITING_FUNDING`  `UNILATERAL`  `VERIFICATION_REQUIRED` ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsCapturesPost201ResponseEmbeddedActionsApCapture ptsV2PaymentsCapturesPost201ResponseEmbeddedActionsApCapture = (PtsV2PaymentsCapturesPost201ResponseEmbeddedActionsApCapture) o;
    return Objects.equals(this.reason, ptsV2PaymentsCapturesPost201ResponseEmbeddedActionsApCapture.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsCapturesPost201ResponseEmbeddedActionsApCapture {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

