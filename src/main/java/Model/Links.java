/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Links
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class Links {
  @SerializedName("self")
  private InlineResponseDefaultLinksNext self = null;

  @SerializedName("documentation")
  private List<InlineResponseDefaultLinksNext> documentation = null;

  @SerializedName("next")
  private List<InlineResponseDefaultLinksNext> next = null;

  public Links self(InlineResponseDefaultLinksNext self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public InlineResponseDefaultLinksNext getSelf() {
    return self;
  }

  public void setSelf(InlineResponseDefaultLinksNext self) {
    this.self = self;
  }

  public Links documentation(List<InlineResponseDefaultLinksNext> documentation) {
    this.documentation = documentation;
    return this;
  }

  public Links addDocumentationItem(InlineResponseDefaultLinksNext documentationItem) {
    if (this.documentation == null) {
      this.documentation = new ArrayList<InlineResponseDefaultLinksNext>();
    }
    this.documentation.add(documentationItem);
    return this;
  }

   /**
   * Get documentation
   * @return documentation
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponseDefaultLinksNext> getDocumentation() {
    return documentation;
  }

  public void setDocumentation(List<InlineResponseDefaultLinksNext> documentation) {
    this.documentation = documentation;
  }

  public Links next(List<InlineResponseDefaultLinksNext> next) {
    this.next = next;
    return this;
  }

  public Links addNextItem(InlineResponseDefaultLinksNext nextItem) {
    if (this.next == null) {
      this.next = new ArrayList<InlineResponseDefaultLinksNext>();
    }
    this.next.add(nextItem);
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponseDefaultLinksNext> getNext() {
    return next;
  }

  public void setNext(List<InlineResponseDefaultLinksNext> next) {
    this.next = next;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.self, links.self) &&
        Objects.equals(this.documentation, links.documentation) &&
        Objects.equals(this.next, links.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, documentation, next);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

