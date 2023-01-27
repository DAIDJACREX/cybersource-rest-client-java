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
import Model.InvoicingV2InvoicesGet200ResponseTransactionDetails;
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
 * InvoicingV2InvoicesGet200ResponseInvoiceHistory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class InvoicingV2InvoicesGet200ResponseInvoiceHistory {
  @SerializedName("event")
  private String event = null;

  @SerializedName("date")
  private DateTime date = null;

  @SerializedName("transactionDetails")
  private InvoicingV2InvoicesGet200ResponseTransactionDetails transactionDetails = null;

  public InvoicingV2InvoicesGet200ResponseInvoiceHistory event(String event) {
    this.event = event;
    return this;
  }

   /**
   * The event triggered for the invoice.  Possible values:  - &#x60;CREATE&#x60;  - &#x60;UPDATE&#x60;  - &#x60;SEND&#x60;  - &#x60;RESEND&#x60;  - &#x60;REMINDER&#x60;  - &#x60;PAYMENT&#x60;  - &#x60;CANCEL&#x60; 
   * @return event
  **/
  @ApiModelProperty(value = "The event triggered for the invoice.  Possible values:  - `CREATE`  - `UPDATE`  - `SEND`  - `RESEND`  - `REMINDER`  - `PAYMENT`  - `CANCEL` ")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public InvoicingV2InvoicesGet200ResponseInvoiceHistory date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date and time when the invoice event was triggered in ISO 8601 format. Format: YYYY-MM-DDThh:mm:ssZ 
   * @return date
  **/
  @ApiModelProperty(value = "The date and time when the invoice event was triggered in ISO 8601 format. Format: YYYY-MM-DDThh:mm:ssZ ")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public InvoicingV2InvoicesGet200ResponseInvoiceHistory transactionDetails(InvoicingV2InvoicesGet200ResponseTransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

   /**
   * Get transactionDetails
   * @return transactionDetails
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesGet200ResponseTransactionDetails getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(InvoicingV2InvoicesGet200ResponseTransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesGet200ResponseInvoiceHistory invoicingV2InvoicesGet200ResponseInvoiceHistory = (InvoicingV2InvoicesGet200ResponseInvoiceHistory) o;
    return Objects.equals(this.event, invoicingV2InvoicesGet200ResponseInvoiceHistory.event) &&
        Objects.equals(this.date, invoicingV2InvoicesGet200ResponseInvoiceHistory.date) &&
        Objects.equals(this.transactionDetails, invoicingV2InvoicesGet200ResponseInvoiceHistory.transactionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, date, transactionDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesGet200ResponseInvoiceHistory {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
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

