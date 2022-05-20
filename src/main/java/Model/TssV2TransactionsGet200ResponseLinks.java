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
import Model.PtsV2PaymentsPost201ResponseLinksSelf;
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
 * TssV2TransactionsGet200ResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class TssV2TransactionsGet200ResponseLinks {
  @SerializedName("self")
  private PtsV2PaymentsPost201ResponseLinksSelf self = null;

  @SerializedName("relatedTransactions")
  private List<PtsV2PaymentsPost201ResponseLinksSelf> relatedTransactions = null;

  public TssV2TransactionsGet200ResponseLinks self(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(PtsV2PaymentsPost201ResponseLinksSelf self) {
    this.self = self;
  }

  public TssV2TransactionsGet200ResponseLinks relatedTransactions(List<PtsV2PaymentsPost201ResponseLinksSelf> relatedTransactions) {
    this.relatedTransactions = relatedTransactions;
    return this;
  }

  public TssV2TransactionsGet200ResponseLinks addRelatedTransactionsItem(PtsV2PaymentsPost201ResponseLinksSelf relatedTransactionsItem) {
    if (this.relatedTransactions == null) {
      this.relatedTransactions = new ArrayList<PtsV2PaymentsPost201ResponseLinksSelf>();
    }
    this.relatedTransactions.add(relatedTransactionsItem);
    return this;
  }

   /**
   * Get relatedTransactions
   * @return relatedTransactions
  **/
  @ApiModelProperty(value = "")
  public List<PtsV2PaymentsPost201ResponseLinksSelf> getRelatedTransactions() {
    return relatedTransactions;
  }

  public void setRelatedTransactions(List<PtsV2PaymentsPost201ResponseLinksSelf> relatedTransactions) {
    this.relatedTransactions = relatedTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseLinks tssV2TransactionsGet200ResponseLinks = (TssV2TransactionsGet200ResponseLinks) o;
    return Objects.equals(this.self, tssV2TransactionsGet200ResponseLinks.self) &&
        Objects.equals(this.relatedTransactions, tssV2TransactionsGet200ResponseLinks.relatedTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, relatedTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    relatedTransactions: ").append(toIndentedString(relatedTransactions)).append("\n");
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

