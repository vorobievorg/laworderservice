package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.model.Customer;
import org.openapitools.model.Deal;
import org.threeten.bp.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

/**
 * Решение суда
 */
@ApiModel(description = "Решение суда")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-06T21:34:28.028525Z[Etc/UTC]")


public class LawOrder extends RepresentationModel<LawOrder>   {
  @JsonProperty("lawOrderId")
  private UUID lawOrderId;

  @JsonProperty("number")
  private String number;

  @JsonProperty("numberOfCase")
  private String numberOfCase;

  @JsonProperty("documentName")
  private String documentName;

  @JsonProperty("date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate date;

  @JsonProperty("numberOfExecOrder")
  private String numberOfExecOrder;

  @JsonProperty("dateOfExecOrder")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateOfExecOrder;

  /**
   * статус судебного решения
   */
  public enum StatusEnum {
    _("открыто"),
    
    _("закрыто"),
    
    _("отменено"),
    
    _("введено");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status = StatusEnum._;

  /**
   * тип судебного решения
   */
  public enum OrderKindEnum {
    _("взыскание"),
    
    _("выселение");

    private String value;

    OrderKindEnum(String value) {
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
    public static OrderKindEnum fromValue(String value) {
      for (OrderKindEnum b : OrderKindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("orderKind")
  private OrderKindEnum orderKind = OrderKindEnum._;

  @JsonProperty("deals")
  @Valid
  private List<Deal> deals = null;

  @JsonProperty("customers")
  @Valid
  private List<Customer> customers = null;

  public LawOrder lawOrderId(UUID lawOrderId) {
    this.lawOrderId = lawOrderId;
    return this;
  }

  /**
   * идентификатор
   * @return lawOrderId
  */
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", required = true, value = "идентификатор")
  @NotNull

  @Valid

  public UUID getLawOrderId() {
    return lawOrderId;
  }

  public void setLawOrderId(UUID lawOrderId) {
    this.lawOrderId = lawOrderId;
  }

  public LawOrder number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Номер иска
   * @return number
  */
  @ApiModelProperty(example = "3333333", required = true, value = "Номер иска")
  @NotNull


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public LawOrder numberOfCase(String numberOfCase) {
    this.numberOfCase = numberOfCase;
    return this;
  }

  /**
   * Номер гражданского дела
   * @return numberOfCase
  */
  @ApiModelProperty(example = "3333333", value = "Номер гражданского дела")


  public String getNumberOfCase() {
    return numberOfCase;
  }

  public void setNumberOfCase(String numberOfCase) {
    this.numberOfCase = numberOfCase;
  }

  public LawOrder documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * Наименование документа
   * @return documentName
  */
  @ApiModelProperty(example = "документ", value = "Наименование документа")


  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public LawOrder date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Дата решения суда
   * @return date
  */
  @ApiModelProperty(example = "Fri Jan 01 00:00:00 UTC 2021", value = "Дата решения суда")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public LawOrder numberOfExecOrder(String numberOfExecOrder) {
    this.numberOfExecOrder = numberOfExecOrder;
    return this;
  }

  /**
   * Номер исполнительного листа /судебного приказа
   * @return numberOfExecOrder
  */
  @ApiModelProperty(example = "33333", value = "Номер исполнительного листа /судебного приказа")


  public String getNumberOfExecOrder() {
    return numberOfExecOrder;
  }

  public void setNumberOfExecOrder(String numberOfExecOrder) {
    this.numberOfExecOrder = numberOfExecOrder;
  }

  public LawOrder dateOfExecOrder(LocalDate dateOfExecOrder) {
    this.dateOfExecOrder = dateOfExecOrder;
    return this;
  }

  /**
   * Дата исполнительного листа /судебного приказа
   * @return dateOfExecOrder
  */
  @ApiModelProperty(example = "Fri Jan 01 00:00:00 UTC 2021", value = "Дата исполнительного листа /судебного приказа")

  @Valid

  public LocalDate getDateOfExecOrder() {
    return dateOfExecOrder;
  }

  public void setDateOfExecOrder(LocalDate dateOfExecOrder) {
    this.dateOfExecOrder = dateOfExecOrder;
  }

  public LawOrder status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * статус судебного решения
   * @return status
  */
  @ApiModelProperty(value = "статус судебного решения")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public LawOrder orderKind(OrderKindEnum orderKind) {
    this.orderKind = orderKind;
    return this;
  }

  /**
   * тип судебного решения
   * @return orderKind
  */
  @ApiModelProperty(value = "тип судебного решения")


  public OrderKindEnum getOrderKind() {
    return orderKind;
  }

  public void setOrderKind(OrderKindEnum orderKind) {
    this.orderKind = orderKind;
  }

  public LawOrder deals(List<Deal> deals) {
    this.deals = deals;
    return this;
  }

  public LawOrder addDealsItem(Deal dealsItem) {
    if (this.deals == null) {
      this.deals = new ArrayList<Deal>();
    }
    this.deals.add(dealsItem);
    return this;
  }

  /**
   * Get deals
   * @return deals
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Deal> getDeals() {
    return deals;
  }

  public void setDeals(List<Deal> deals) {
    this.deals = deals;
  }

  public LawOrder customers(List<Customer> customers) {
    this.customers = customers;
    return this;
  }

  public LawOrder addCustomersItem(Customer customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<Customer>();
    }
    this.customers.add(customersItem);
    return this;
  }

  /**
   * Get customers
   * @return customers
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LawOrder lawOrder = (LawOrder) o;
    return Objects.equals(this.lawOrderId, lawOrder.lawOrderId) &&
        Objects.equals(this.number, lawOrder.number) &&
        Objects.equals(this.numberOfCase, lawOrder.numberOfCase) &&
        Objects.equals(this.documentName, lawOrder.documentName) &&
        Objects.equals(this.date, lawOrder.date) &&
        Objects.equals(this.numberOfExecOrder, lawOrder.numberOfExecOrder) &&
        Objects.equals(this.dateOfExecOrder, lawOrder.dateOfExecOrder) &&
        Objects.equals(this.status, lawOrder.status) &&
        Objects.equals(this.orderKind, lawOrder.orderKind) &&
        Objects.equals(this.deals, lawOrder.deals) &&
        Objects.equals(this.customers, lawOrder.customers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lawOrderId, number, numberOfCase, documentName, date, numberOfExecOrder, dateOfExecOrder, status, orderKind, deals, customers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LawOrder {\n");
    
    sb.append("    lawOrderId: ").append(toIndentedString(lawOrderId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfCase: ").append(toIndentedString(numberOfCase)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    numberOfExecOrder: ").append(toIndentedString(numberOfExecOrder)).append("\n");
    sb.append("    dateOfExecOrder: ").append(toIndentedString(dateOfExecOrder)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderKind: ").append(toIndentedString(orderKind)).append("\n");
    sb.append("    deals: ").append(toIndentedString(deals)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
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

