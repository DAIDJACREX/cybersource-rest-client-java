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
 * TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails {
  @SerializedName("salesSlipNumber")
  private Integer salesSlipNumber = null;

  public TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails salesSlipNumber(Integer salesSlipNumber) {
    this.salesSlipNumber = salesSlipNumber;
    return this;
  }

   /**
   * Transaction identifier that is generated. You have the option of printing the sales slip number on the receipt. This field is supported only on Cybersource through Visanet and JCN gateway.  Optional field.  #### Card Present processing message If you included this field in the request, the returned value is the value that you sent in the request. If you did not include this field in the request, the system generated this value for you.  The difference between this reply field and the &#x60;processorInformation.systemTraceAuditNumber&#x60; field is that the system generates the system trace audit number (STAN), and you must print the receipt number on the receipt; whereas you can generate the sales slip number, and you can choose to print the sales slip number on the receipt. 
   * maximum: 99999
   * @return salesSlipNumber
  **/
  @ApiModelProperty(value = "Transaction identifier that is generated. You have the option of printing the sales slip number on the receipt. This field is supported only on Cybersource through Visanet and JCN gateway.  Optional field.  #### Card Present processing message If you included this field in the request, the returned value is the value that you sent in the request. If you did not include this field in the request, the system generated this value for you.  The difference between this reply field and the `processorInformation.systemTraceAuditNumber` field is that the system generates the system trace audit number (STAN), and you must print the receipt number on the receipt; whereas you can generate the sales slip number, and you can choose to print the sales slip number on the receipt. ")
  public Integer getSalesSlipNumber() {
    return salesSlipNumber;
  }

  public void setSalesSlipNumber(Integer salesSlipNumber) {
    this.salesSlipNumber = salesSlipNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails tssV2TransactionsGet200ResponseOrderInformationInvoiceDetails = (TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails) o;
    return Objects.equals(this.salesSlipNumber, tssV2TransactionsGet200ResponseOrderInformationInvoiceDetails.salesSlipNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesSlipNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseOrderInformationInvoiceDetails {\n");
    
    sb.append("    salesSlipNumber: ").append(toIndentedString(salesSlipNumber)).append("\n");
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

