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
import Model.PaymentInstrumentListLinksFirst;
import Model.PaymentInstrumentListLinksLast;
import Model.PaymentInstrumentListLinksNext;
import Model.PaymentInstrumentListLinksPrev;
import Model.PaymentInstrumentListLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentInstrumentListLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-16T15:14:23.160+05:30")
public class PaymentInstrumentListLinks {
  @SerializedName("self")
  private PaymentInstrumentListLinksSelf self = null;

  @SerializedName("first")
  private PaymentInstrumentListLinksFirst first = null;

  @SerializedName("prev")
  private PaymentInstrumentListLinksPrev prev = null;

  @SerializedName("next")
  private PaymentInstrumentListLinksNext next = null;

  @SerializedName("last")
  private PaymentInstrumentListLinksLast last = null;

  public PaymentInstrumentListLinks self(PaymentInstrumentListLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListLinksSelf getSelf() {
    return self;
  }

  public void setSelf(PaymentInstrumentListLinksSelf self) {
    this.self = self;
  }

  public PaymentInstrumentListLinks first(PaymentInstrumentListLinksFirst first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListLinksFirst getFirst() {
    return first;
  }

  public void setFirst(PaymentInstrumentListLinksFirst first) {
    this.first = first;
  }

  public PaymentInstrumentListLinks prev(PaymentInstrumentListLinksPrev prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListLinksPrev getPrev() {
    return prev;
  }

  public void setPrev(PaymentInstrumentListLinksPrev prev) {
    this.prev = prev;
  }

  public PaymentInstrumentListLinks next(PaymentInstrumentListLinksNext next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListLinksNext getNext() {
    return next;
  }

  public void setNext(PaymentInstrumentListLinksNext next) {
    this.next = next;
  }

  public PaymentInstrumentListLinks last(PaymentInstrumentListLinksLast last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")
  public PaymentInstrumentListLinksLast getLast() {
    return last;
  }

  public void setLast(PaymentInstrumentListLinksLast last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentListLinks paymentInstrumentListLinks = (PaymentInstrumentListLinks) o;
    return Objects.equals(this.self, paymentInstrumentListLinks.self) &&
        Objects.equals(this.first, paymentInstrumentListLinks.first) &&
        Objects.equals(this.prev, paymentInstrumentListLinks.prev) &&
        Objects.equals(this.next, paymentInstrumentListLinks.next) &&
        Objects.equals(this.last, paymentInstrumentListLinks.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentListLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

