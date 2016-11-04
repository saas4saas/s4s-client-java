/**
 * s4s-full
 * description
 *
 * OpenAPI spec version: stable
 * Contact: rui.p.oliveira@impactinglabs.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Model description
 */
@ApiModel(description = "Model description")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-04T14:36:36.360Z")
public class UserContact   {
  @SerializedName("email")
  private String email = null;

  @SerializedName("emailConfirmation")
  private Boolean emailConfirmation = null;

  public UserContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserContact emailConfirmation(Boolean emailConfirmation) {
    this.emailConfirmation = emailConfirmation;
    return this;
  }

   /**
   * Get emailConfirmation
   * @return emailConfirmation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEmailConfirmation() {
    return emailConfirmation;
  }

  public void setEmailConfirmation(Boolean emailConfirmation) {
    this.emailConfirmation = emailConfirmation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserContact userContact = (UserContact) o;
    return Objects.equals(this.email, userContact.email) &&
        Objects.equals(this.emailConfirmation, userContact.emailConfirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, emailConfirmation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserContact {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailConfirmation: ").append(toIndentedString(emailConfirmation)).append("\n");
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

