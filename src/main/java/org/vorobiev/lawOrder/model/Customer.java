package org.vorobiev.lawOrder.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

import java.util.*;

/**
 * ответчики
 */
/*@ApiModel(description = "ответчики")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-17T00:36:07.304Z")
*/

@Entity
@Table(name = "customer")

public class Customer   {
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private int id;


  // @JsonProperty("customerId")
  @Column(name="customerid")
  private UUID customerId = null;

  // @JsonProperty("firstName")
  @Column(name="firstname")
  private String firstName = null;

  // @JsonProperty("middleName")
  @Column(name="middlename")
  private String middleName = null;

  // @JsonProperty("lastName")
  @Column(name="lastname")
  private String lastName = null;

  // @JsonProperty("birthDate")
  @Column(name="birthdate")
  private Date birthDate = null;

  // @JsonProperty("passportSerial")
  @Column(name="passportserial")
  private String passportSerial = null;

  // @JsonProperty("passportNumber")
  @Column(name="passportnumber")
  private String passportNumber = null;

  // @JsonProperty("passportDate")
  @Column(name="passportdate")
  private Date passportDate = null;

  // @JsonProperty("passportDivsion")
  @Column(name="passportdivision")
  private String passportDivsion = null;

  /**
   * Вид документа
   */

  public enum PassportTypeEnum {
    Паспорт_РФ("Паспорт РФ"),

    Паспорт_иностранного_гражданина("Паспорт иностранного гражданина");

    private String value;

    PassportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PassportTypeEnum fromValue(String text) {
      for (PassportTypeEnum b : PassportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

   @JsonProperty("passportType")
   @Enumerated(EnumType.STRING)
   @Column(name="passporttype")
  private PassportTypeEnum passportType = PassportTypeEnum.Паспорт_РФ;

  /**
   * тип ответчика
   */
  public enum CustomerTypeEnum {
    Заемщик("Заемщик"),

    Созаемщик("Созаемщик"),

    Поручитель("Поручитель"),

    Наследник("Наследник");

    private String value;

    CustomerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerTypeEnum fromValue(String text) {
      for (CustomerTypeEnum b : CustomerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

   @JsonProperty("customerType")
  @Column(name="customertype")
  @Enumerated(EnumType.STRING)
  private CustomerTypeEnum customerType = CustomerTypeEnum.Заемщик;

  public Customer customerId(UUID customerId) {
    this.customerId = customerId;
    return this;
  }

/*
   * идентификатор
   * @return customerId
  **/

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя
   * @return firstName
  **/
  @ApiModelProperty(example = "Василий", required = true, value = "Имя")
  //@NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Отчество
   * @return middleName
  **/
  @ApiModelProperty(example = "Васильевич", value = "Отчество")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия
   * @return lastName
  **/
  @ApiModelProperty(example = "Васильев", required = true, value = "Фамилия")
  //@NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Дата рождения
   * @return birthDate
  **/
  @ApiModelProperty(example = "2000-01-01T00:00:00.000Z", required = true, value = "Дата рождения")
  //@NotNull

 //  @Valid

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public Customer passportSerial(String passportSerial) {
    this.passportSerial = passportSerial;
    return this;
  }

  /**
   * серия паспорта
   * @return passportSerial
  **/
  @ApiModelProperty(example = "2222", required = true, value = "серия паспорта")
  //@NotNull


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
  **/
  @ApiModelProperty(example = "666666", required = true, value = "номер паспорта")
  //@NotNull


  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public Customer passportDate(Date passportDate) {
    this.passportDate = passportDate;
    return this;
  }

  /**
   * дата выдачи
   * @return passportDate
  **/
  @ApiModelProperty(example = "2020-01-01T00:00:00.000Z", value = "дата выдачи")

 //  @Valid

  public Date getPassportDate() {
    return passportDate;
  }

  public void setPassportDate(Date passportDate) {
    this.passportDate = passportDate;
  }

  public Customer passportDivsion(String passportDivsion) {
    this.passportDivsion = passportDivsion;
    return this;
  }

  /**
   * код подразделения
   * @return passportDivsion
  **/
  @ApiModelProperty(example = "000-000", value = "код подразделения")


  public String getPassportDivsion() {
    return passportDivsion;
  }

  public void setPassportDivsion(String passportDivsion) {
    this.passportDivsion = passportDivsion;
  }

  /*public Customer passportType(PassportTypeEnum passportType) {
    this.passportType = passportType;
    return this;
  }
*/
  /**
   * Вид документа
   * @return passportType
  **/
  //@ApiModelProperty(value = "Вид документа")


  public PassportTypeEnum getPassportType() {
    return passportType;
  }

  public void setPassportType(PassportTypeEnum passportType) {
    this.passportType = passportType;
  }



  @OneToMany(/*mappedBy ="customer", */cascade = CascadeType.ALL, fetch =FetchType.EAGER)
  @JoinColumn(name = "customer_id")
  /*@JoinTable(
          name = "customer",
          joinColumns = @JoinColumn(name = "id")

  )*/
  private List<CustomerDebtItem> customerDebtItems;

  public List<CustomerDebtItem> getCustomerDebtItems() {
    return this.customerDebtItems;
  }

  public void setCustomerDebtItems(List<CustomerDebtItem> CustomerDebtItems) {
    this.customerDebtItems = CustomerDebtItems;

  }



  public Customer(UUID customerId,
                  String firstName, String middleName, String lastName, Date birthDate, String passportSerial,
                  String passportNumber, Date passportDate, String passportDivsion
                  //,PassportTypeEnum passportType, CustomerTypeEnum customerType
                  ) {
    this.customerId = customerId;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.passportSerial = passportSerial;
    this.passportNumber = passportNumber;
    this.passportDate = passportDate;
    this.passportDivsion = passportDivsion;
  //  this.passportType = passportType;
   // this.customerType = customerType;
  }

  public Customer(String firstName, String middleName, String lastName) {
    this.customerId = UUID.randomUUID();
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }


  public Customer() {
    this.customerId = UUID.randomUUID();

  }

  public Customer(UUID customerId, String firstName, String middleName, String lastName,
                  Date birthDate, String passportSerial, String passportNumber,
                  Date passportDate, String passportDivsion, PassportTypeEnum passportType,
                  CustomerTypeEnum customerType, Set<CustomerDebtItem> CustomerDebtItems) {
    this.customerId = customerId;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.passportSerial = passportSerial;
    this.passportNumber = passportNumber;
    this.passportDate = passportDate;
    this.passportDivsion = passportDivsion;
    this.passportType = passportType;
    this.customerType = customerType;
    this.customerDebtItems = customerDebtItems;
  }

  /**
  /**
   * тип ответчика
   * @return customerType
  **/
  @ApiModelProperty(value = "тип ответчика")

/*
  public CustomerTypeEnum getCustomerType() {
    return customerType;
  }

  public void setCustomerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
  }

*/



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
        Objects.equals(this.middleName, customer.middleName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.birthDate, customer.birthDate) &&
        Objects.equals(this.passportSerial, customer.passportSerial) &&
        Objects.equals(this.passportNumber, customer.passportNumber) &&
        Objects.equals(this.passportDate, customer.passportDate) &&
        Objects.equals(this.passportDivsion, customer.passportDivsion) ;
      //  Objects.equals(this.passportType, customer.passportType) &&
       // Objects.equals(this.customerType, customer.customerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, firstName, middleName, lastName, birthDate, passportSerial, passportNumber, passportDate, passportDivsion
           // , passportType, customerType
    );
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    passportSerial: ").append(toIndentedString(passportSerial)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportDate: ").append(toIndentedString(passportDate)).append("\n");
    sb.append("    passportDivsion: ").append(toIndentedString(passportDivsion)).append("\n");
    //sb.append("    passportType: ").append(toIndentedString(passportType)).append("\n");
   // sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
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

