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

/**
 * InvoicingV2InvoicesAllGet200ResponseLinks
 */

public class InvoicingV2InvoicesAllGet200ResponseLinks {
  @SerializedName("self")
  private PtsV2PaymentsPost201ResponseLinksSelf self = null;

  @SerializedName("next")
  private PtsV2PaymentsPost201ResponseLinksSelf next = null;

  @SerializedName("previous")
  private PtsV2PaymentsPost201ResponseLinksSelf previous = null;

  public InvoicingV2InvoicesAllGet200ResponseLinks self(PtsV2PaymentsPost201ResponseLinksSelf self) {
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

  public InvoicingV2InvoicesAllGet200ResponseLinks next(PtsV2PaymentsPost201ResponseLinksSelf next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getNext() {
    return next;
  }

  public void setNext(PtsV2PaymentsPost201ResponseLinksSelf next) {
    this.next = next;
  }

  public InvoicingV2InvoicesAllGet200ResponseLinks previous(PtsV2PaymentsPost201ResponseLinksSelf previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getPrevious() {
    return previous;
  }

  public void setPrevious(PtsV2PaymentsPost201ResponseLinksSelf previous) {
    this.previous = previous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesAllGet200ResponseLinks invoicingV2InvoicesAllGet200ResponseLinks = (InvoicingV2InvoicesAllGet200ResponseLinks) o;
    return Objects.equals(this.self, invoicingV2InvoicesAllGet200ResponseLinks.self) &&
        Objects.equals(this.next, invoicingV2InvoicesAllGet200ResponseLinks.next) &&
        Objects.equals(this.previous, invoicingV2InvoicesAllGet200ResponseLinks.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, next, previous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesAllGet200ResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

