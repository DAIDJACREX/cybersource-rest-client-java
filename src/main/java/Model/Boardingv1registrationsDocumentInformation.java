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
import Model.Boardingv1registrationsDocumentInformationSignedDocuments;
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
 * Boardingv1registrationsDocumentInformation
 */

public class Boardingv1registrationsDocumentInformation {
  @SerializedName("signedDocuments")
  private List<Boardingv1registrationsDocumentInformationSignedDocuments> signedDocuments = null;

  public Boardingv1registrationsDocumentInformation signedDocuments(List<Boardingv1registrationsDocumentInformationSignedDocuments> signedDocuments) {
    this.signedDocuments = signedDocuments;
    return this;
  }

  public Boardingv1registrationsDocumentInformation addSignedDocumentsItem(Boardingv1registrationsDocumentInformationSignedDocuments signedDocumentsItem) {
    if (this.signedDocuments == null) {
      this.signedDocuments = new ArrayList<Boardingv1registrationsDocumentInformationSignedDocuments>();
    }
    this.signedDocuments.add(signedDocumentsItem);
    return this;
  }

   /**
   * Get signedDocuments
   * @return signedDocuments
  **/
  @ApiModelProperty(value = "")
  public List<Boardingv1registrationsDocumentInformationSignedDocuments> getSignedDocuments() {
    return signedDocuments;
  }

  public void setSignedDocuments(List<Boardingv1registrationsDocumentInformationSignedDocuments> signedDocuments) {
    this.signedDocuments = signedDocuments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsDocumentInformation boardingv1registrationsDocumentInformation = (Boardingv1registrationsDocumentInformation) o;
    return Objects.equals(this.signedDocuments, boardingv1registrationsDocumentInformation.signedDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedDocuments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsDocumentInformation {\n");
    
    sb.append("    signedDocuments: ").append(toIndentedString(signedDocuments)).append("\n");
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

