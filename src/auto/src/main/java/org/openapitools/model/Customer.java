package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DebtItem;
import org.openapitools.model.oas_any_type_not_mapped;
import org.threeten.bp.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

/**
 * ответчики
 */
@ApiModel(description = "ответчики")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-06T21:34:28.028525Z[Etc/UTC]")


public class Customer extends RepresentationModel<Customer>   {
  @JsonProperty("customerId")
  private oas_any_type_not_mapped customerId = null;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("birthDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate birthDate;

  @JsonProperty("passportSerial")
  private String passportSerial;

  @JsonProperty("passportNumber")
  private String passportNumber;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("passportDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate passportDate;

  @JsonProperty("passportDivsion")
  private String passportDivsion;

  /**
   * Вид документа
   */
  public enum PassportTypeEnum {
    _("Паспорт РФ"),
    
    _("Паспорт иностранного гражданина");

    private String value;

    PassportTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PassportTypeEnum fromValue(String value) {
      for (PassportTypeEnum b : PassportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("passportType")
  private PassportTypeEnum passportType = PassportTypeEnum._;

  /**
   * тип ответчика
   */
  public enum CustomerTypeEnum {
    _("Заемщик"),
    
    _("Созаемщик"),
    
    _("Поручитель"),
    
    _("Наследник");

    private String value;

    CustomerTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerTypeEnum fromValue(String value) {
      for (CustomerTypeEnum b : CustomerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("customerType")
  private CustomerTypeEnum customerType = CustomerTypeEnum._;

  @JsonProperty("debtItems")
  @Valid
  private List<DebtItem> debtItems = null;

  public Customer customerId(oas_any_type_not_mapped customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * идентификатор
   * @return customerId
  */
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", required = true, value = "идентификатор")
  @NotNull

  @Valid

  public oas_any_type_not_mapped getCustomerId() {
    return customerId;
  }

  public void setCustomerId(oas_any_type_not_mapped customerId) {
    this.customerId = customerId;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя
   * @return firstName
  */
  @ApiModelProperty(example = "Василий", required = true, value = "Имя")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия
   * @return lastName
  */
  @ApiModelProperty(example = "Васильев", required = true, value = "Фамилия")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Дата рождения
   * @return birthDate
  */
  @ApiModelProperty(example = "Sat Jan 01 00:00:00 UTC 2000", required = true, value = "Дата рождения")
  @NotNull

  @Valid

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Customer passportSerial(String passportSerial) {
    this.passportSerial = passportSerial;
    return this;
  }

  /**
   * серия паспорта
   * @return passportSerial
  */
  @ApiModelProperty(example = "2222", required = true, value = "серия паспорта")
  @NotNull


  public String getPassportSerial() {
    return passportSerial;
  }

  public void setPassportSerial(String passportSerial) {
    this.passportSerial = passportSerial;
  }

  public Customer passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * номер паспорта
   * @return passportNumber
  */
  @ApiModelProperty(example = "666666", required = true, value = "номер паспорта")
  @NotNull


  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public Customer middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Отчество
   * @return middleName
  */
  @ApiModelProperty(example = "Васильевич", value = "Отчество")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Customer passportDate(LocalDate passportDate) {
    this.passportDate = passportDate;
    return this;
  }

  /**
   * дата выдачи
   * @return passportDate
  */
  @ApiModelProperty(example = "Wed Jan 01 00:00:00 UTC 2020", value = "дата выдачи")

  @Valid

  public LocalDate getPassportDate() {
    return passportDate;
  }

  public void setPassportDate(LocalDate passportDate) {
    this.passportDate = passportDate;
  }

  public Customer passportDivsion(String passportDivsion) {
    this.passportDivsion = passportDivsion;
    return this;
  }

  /**
   * код подразделения
   * @return passportDivsion
  */
  @ApiModelProperty(example = "000-000", value = "код подразделения")


  public String getPassportDivsion() {
    return passportDivsion;
  }

  public void setPassportDivsion(String passportDivsion) {
    this.passportDivsion = passportDivsion;
  }

  public Customer passportType(PassportTypeEnum passportType) {
    this.passportType = passportType;
    return this;
  }

  /**
   * Вид документа
   * @return passportType
  */
  @ApiModelProperty(value = "Вид документа")


  public PassportTypeEnum getPassportType() {
    return passportType;
  }

  public void setPassportType(PassportTypeEnum passportType) {
    this.passportType = passportType;
  }

  public Customer customerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * тип ответчика
   * @return customerType
  */
  @ApiModelProperty(value = "тип ответчика")


  public CustomerTypeEnum getCustomerType() {
    return customerType;
  }

  public void setCustomerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
  }

  public Customer debtItems(List<DebtItem> debtItems) {
    this.debtItems = debtItems;
    return this;
  }

  public Customer addDebtItemsItem(DebtItem debtItemsItem) {
    if (this.debtItems == null) {
      this.debtItems = new ArrayList<DebtItem>();
    }
    this.debtItems.add(debtItemsItem);
    return this;
  }

  /**
   * Get debtItems
   * @return debtItems
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DebtItem> getDebtItems() {
    return debtItems;
  }

  public void setDebtItems(List<DebtItem> debtItems) {
    this.debtItems = debtItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.birthDate, customer.birthDate) &&
        Objects.equals(this.passportSerial, customer.passportSerial) &&
        Objects.equals(this.passportNumber, customer.passportNumber) &&
        Objects.equals(this.middleName, customer.middleName) &&
        Objects.equals(this.passportDate, customer.passportDate) &&
        Objects.equals(this.passportDivsion, customer.passportDivsion) &&
        Objects.equals(this.passportType, customer.passportType) &&
        Objects.equals(this.customerType, customer.customerType) &&
        Objects.equals(this.debtItems, customer.debtItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, firstName, lastName, birthDate, passportSerial, passportNumber, middleName, passportDate, passportDivsion, passportType, customerType, debtItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    passportSerial: ").append(toIndentedString(passportSerial)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    passportDate: ").append(toIndentedString(passportDate)).append("\n");
    sb.append("    passportDivsion: ").append(toIndentedString(passportDivsion)).append("\n");
    sb.append("    passportType: ").append(toIndentedString(passportType)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    debtItems: ").append(toIndentedString(debtItems)).append("\n");
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

