package org.vorobiev.lawOrder.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * Решение суда
 */

@Entity
@Table(name = "laworder")
public class LawOrder {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private int id;


  @JsonProperty("lawOrderId")
  @Column(name = "laworderid")
  private UUID lawOrderId;

  @JsonProperty("number")
  @Column(name = "number")
  private String number;

  @JsonProperty("numberOfCase")
  @Column(name = "numberofcase")
  private String numberOfCase;

  @JsonProperty("documentName")
  @Column(name = "documentname")
  private String documentName;

  @JsonProperty("date")
  @Column(name = "date")
  private Date date;

  @JsonProperty("numberOfExecOrder")
  @Column(name = "numberofexecorder")
  private String numberOfExecOrder;

  @JsonProperty("dateOfExecOrder")
  @Column(name = "dateofexecorder")
  private Date dateOfExecOrder;

  /**
   * статус судебного решения
   */
  public enum StatusEnum {
    open("открыто"),
    
    closed("закрыто"),
    
    canceled("отменено"),
    
    added("введено");

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
  @Column(name = "status")
  @Enumerated(EnumType.STRING)
  private StatusEnum status = StatusEnum.added;

  /**
   * тип судебного решения
   */
  public enum OrderKindEnum {
    fee("взыскание"),
    
    eviction("выселение");

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
  @Column(name = "orderkind")
  @Enumerated(EnumType.STRING)
  private OrderKindEnum orderKind = OrderKindEnum.fee;

  @JsonProperty("deals")
  @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.LAZY)
  @JoinColumn(name = "laworder_id")
  private List<Deal> deals = null;

  @JsonProperty("customers")

  @OneToMany(cascade = CascadeType.ALL, fetch =FetchType.LAZY)
  @JoinColumn(name = "laworder_id")
  private List<Customer> customers = null;

  public LawOrder lawOrderId(UUID lawOrderId) {
    this.lawOrderId = lawOrderId;
    return this;
  }

  /**
   * идентификатор
   * @return lawOrderId
  */

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

  public LawOrder date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Дата решения суда
   * @return date
  */

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
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

  public LawOrder dateOfExecOrder(Date dateOfExecOrder) {
    this.dateOfExecOrder = dateOfExecOrder;
    return this;
  }

  /**
   * Дата исполнительного листа /судебного приказа
   * @return dateOfExecOrder
  */


  public Date getDateOfExecOrder() {
    return dateOfExecOrder;
  }

  public void setDateOfExecOrder(Date dateOfExecOrder) {
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

  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public LawOrder() {
  }

  public LawOrder(UUID lawOrderId, String number, String numberOfCase, String documentName, Date date, String numberOfExecOrder, Date dateOfExecOrder, StatusEnum status, OrderKindEnum orderKind, List<Deal> deals, List<Customer> customers) {
    this.lawOrderId = lawOrderId;
    this.number = number;
    this.numberOfCase = numberOfCase;
    this.documentName = documentName;
    this.date = date;
    this.numberOfExecOrder = numberOfExecOrder;
    this.dateOfExecOrder = dateOfExecOrder;
    this.status = status;
    this.orderKind = orderKind;
    this.deals = deals;
    this.customers = customers;
  }
}

