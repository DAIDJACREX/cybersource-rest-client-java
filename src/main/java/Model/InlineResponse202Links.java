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
import Model.InlineResponse202LinksStatus;
import Model.InlineResponse401LinksSelf;
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
 * InlineResponse202Links
 */

public class InlineResponse202Links {
  @SerializedName("self")
  private InlineResponse401LinksSelf self = null;

  @SerializedName("status")
  private List<InlineResponse202LinksStatus> status = null;

  public InlineResponse202Links self(InlineResponse401LinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public InlineResponse401LinksSelf getSelf() {
    return self;
  }

  public void setSelf(InlineResponse401LinksSelf self) {
    this.self = self;
  }

  public InlineResponse202Links status(List<InlineResponse202LinksStatus> status) {
    this.status = status;
    return this;
  }

  public InlineResponse202Links addStatusItem(InlineResponse202LinksStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<InlineResponse202LinksStatus>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse202LinksStatus> getStatus() {
    return status;
  }

  public void setStatus(List<InlineResponse202LinksStatus> status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse202Links inlineResponse202Links = (InlineResponse202Links) o;
    return Objects.equals(this.self, inlineResponse202Links.self) &&
        Objects.equals(this.status, inlineResponse202Links.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse202Links {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
