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
import Model.V1FileDetailsGet200ResponseLinksFiles;
import Model.V1FileDetailsGet200ResponseLinksSelf;
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
 * V1FileDetailsGet200ResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-18T15:21:09.334+05:30")
public class V1FileDetailsGet200ResponseLinks {
  @SerializedName("self")
  private V1FileDetailsGet200ResponseLinksSelf self = null;

  @SerializedName("files")
  private List<V1FileDetailsGet200ResponseLinksFiles> files = null;

  public V1FileDetailsGet200ResponseLinks self(V1FileDetailsGet200ResponseLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public V1FileDetailsGet200ResponseLinksSelf getSelf() {
    return self;
  }

  public void setSelf(V1FileDetailsGet200ResponseLinksSelf self) {
    this.self = self;
  }

  public V1FileDetailsGet200ResponseLinks files(List<V1FileDetailsGet200ResponseLinksFiles> files) {
    this.files = files;
    return this;
  }

  public V1FileDetailsGet200ResponseLinks addFilesItem(V1FileDetailsGet200ResponseLinksFiles filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<V1FileDetailsGet200ResponseLinksFiles>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @ApiModelProperty(value = "")
  public List<V1FileDetailsGet200ResponseLinksFiles> getFiles() {
    return files;
  }

  public void setFiles(List<V1FileDetailsGet200ResponseLinksFiles> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FileDetailsGet200ResponseLinks v1FileDetailsGet200ResponseLinks = (V1FileDetailsGet200ResponseLinks) o;
    return Objects.equals(this.self, v1FileDetailsGet200ResponseLinks.self) &&
        Objects.equals(this.files, v1FileDetailsGet200ResponseLinks.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FileDetailsGet200ResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

