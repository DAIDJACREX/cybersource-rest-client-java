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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CardProcessingConfigFeaturesCardNotPresentInstallment
 */

public class CardProcessingConfigFeaturesCardNotPresentInstallment {
  @SerializedName("enableInstallment")
  private Boolean enableInstallment = null;

  @SerializedName("installmentPlan")
  private String installmentPlan = null;

  public CardProcessingConfigFeaturesCardNotPresentInstallment enableInstallment(Boolean enableInstallment) {
    this.enableInstallment = enableInstallment;
    return this;
  }

   /**
   * This flag is to enable for installment plan programs. Applicable for Fiserv (fiserv), Vero (vero) and American Express Direct (amexdirect) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Default Value&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return enableInstallment
  **/
  @ApiModelProperty(value = "This flag is to enable for installment plan programs. Applicable for Fiserv (fiserv), Vero (vero) and American Express Direct (amexdirect) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Default Value</th></tr></thead> <tr><td>American Express Direct</td><td>cnp</td><td>No</td><td>No</td></tr> </table> ")
  public Boolean isEnableInstallment() {
    return enableInstallment;
  }

  public void setEnableInstallment(Boolean enableInstallment) {
    this.enableInstallment = enableInstallment;
  }

  public CardProcessingConfigFeaturesCardNotPresentInstallment installmentPlan(String installmentPlan) {
    this.installmentPlan = installmentPlan;
    return this;
  }

   /**
   * This indicates the type of funding for the installment plan associated with the payment.  Valid values: \&quot;merchant\&quot; - Merchant-funded installment plan \&quot;issuer\&quot; - Issuer-funded installment plan  Applicable for Fiserv (fiserv), American Express Direct (amexdirect) and Vero (vero) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return installmentPlan
  **/
  @ApiModelProperty(value = "This indicates the type of funding for the installment plan associated with the payment.  Valid values: \"merchant\" - Merchant-funded installment plan \"issuer\" - Issuer-funded installment plan  Applicable for Fiserv (fiserv), American Express Direct (amexdirect) and Vero (vero) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th></tr></thead> <tr><td>American Express Direct</td><td>cnp</td><td>No</td></tr> </table> ")
  public String getInstallmentPlan() {
    return installmentPlan;
  }

  public void setInstallmentPlan(String installmentPlan) {
    this.installmentPlan = installmentPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardProcessingConfigFeaturesCardNotPresentInstallment cardProcessingConfigFeaturesCardNotPresentInstallment = (CardProcessingConfigFeaturesCardNotPresentInstallment) o;
    return Objects.equals(this.enableInstallment, cardProcessingConfigFeaturesCardNotPresentInstallment.enableInstallment) &&
        Objects.equals(this.installmentPlan, cardProcessingConfigFeaturesCardNotPresentInstallment.installmentPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableInstallment, installmentPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardProcessingConfigFeaturesCardNotPresentInstallment {\n");
    
    sb.append("    enableInstallment: ").append(toIndentedString(enableInstallment)).append("\n");
    sb.append("    installmentPlan: ").append(toIndentedString(installmentPlan)).append("\n");
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

