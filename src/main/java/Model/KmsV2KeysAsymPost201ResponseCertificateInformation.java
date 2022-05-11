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
 * KmsV2KeysAsymPost201ResponseCertificateInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:37:08.221+05:30")
public class KmsV2KeysAsymPost201ResponseCertificateInformation {
  @SerializedName("alias")
  private String alias = null;

  @SerializedName("keyId")
  private String keyId = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  public KmsV2KeysAsymPost201ResponseCertificateInformation alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Key alias
   * @return alias
  **/
  @ApiModelProperty(value = "Key alias")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public KmsV2KeysAsymPost201ResponseCertificateInformation keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Key Serial Number 
   * @return keyId
  **/
  @ApiModelProperty(value = "Key Serial Number ")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public KmsV2KeysAsymPost201ResponseCertificateInformation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * value of the key 
   * @return key
  **/
  @ApiModelProperty(value = "value of the key ")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public KmsV2KeysAsymPost201ResponseCertificateInformation expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration time in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return expirationDate
  **/
  @ApiModelProperty(value = "The expiration time in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KmsV2KeysAsymPost201ResponseCertificateInformation kmsV2KeysAsymPost201ResponseCertificateInformation = (KmsV2KeysAsymPost201ResponseCertificateInformation) o;
    return Objects.equals(this.alias, kmsV2KeysAsymPost201ResponseCertificateInformation.alias) &&
        Objects.equals(this.keyId, kmsV2KeysAsymPost201ResponseCertificateInformation.keyId) &&
        Objects.equals(this.key, kmsV2KeysAsymPost201ResponseCertificateInformation.key) &&
        Objects.equals(this.expirationDate, kmsV2KeysAsymPost201ResponseCertificateInformation.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, keyId, key, expirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KmsV2KeysAsymPost201ResponseCertificateInformation {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

