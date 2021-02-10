package org.vorobiev.lawOrder.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Элемент задолженности
 */

@Entity
@Table(name = "customerdebtitem")
public class CustomerDebtItem implements Serializable {
  /**
   * вид задолженности
   */

  public enum DebtItemTypeEnum {
    DOCDUEFINEQTY("DOCDUEFINEQTY"),


    DUELAWQTY("DUELAWQTY"),


    POSTAGELAWQTY("POSTAGELAWQTY"),

    ADLITEMLAWQTY("ADLITEMLAWQTY"),

    VALHOSTAGELAWQTY("VALHOSTAGELAWQTY");

    private String value;

    DebtItemTypeEnum(String value) {
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
    public static DebtItemTypeEnum fromValue(String value) {
      for (DebtItemTypeEnum b : DebtItemTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  /*@Column(name = "customer_id")
  private long customer_Id;

  public long getCustomer_Id() {
    return customer_Id;
  }

  public void setCustomerId(long customer_Id) {
    this.customer_Id = customer_Id;
  }
*/
  @JsonProperty("debtQty")
  @Column(name="debtqty")
  private double debtQty;

  @JsonProperty("debtBalanceOut")
  @Column(name="debtbalanceout")
  private double debtBalanceOut;


  @Column(name="priority")
  @JsonProperty("priority")
  private int priority;

  /*@ManyToOne
  @JoinColumn(name="customer_id", nullable=true)
  private Customer customer;

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
*/
  /**
   * сумма по решению суда
   * @return debtQty
   */
  @ApiModelProperty(example = "10000.22", value = "сумма по решению суда")


  public double getDebtQty() {
    return debtQty;
  }

  public void setDebtQty(double debtQty) {
    this.debtQty = debtQty;
  }


  /**
   * остаток задолженности
   * @return debtBalanceOut
   */
  @ApiModelProperty(example = "10000.22", value = "остаток задолженности")

  public double getDebtBalanceOut() {
    return debtBalanceOut;
  }

  public void setDebtBalanceOut(double debtBalanceOut) {
    this.debtBalanceOut = debtBalanceOut;
  }

  /**
   * приоритет погашения, чем меньше, тем раньше
   * @return priority
   */
  @ApiModelProperty(example = "0", value = "приоритет погашения, чем меньше, тем раньше")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  @JsonProperty("debtItemType")
  @Column(name ="debtitemtype")

  @Enumerated(EnumType.STRING)
  private DebtItemTypeEnum debtItemType;




  @ApiModelProperty(value = "вид задолженности")


  public DebtItemTypeEnum getDebtItemType() {
    return debtItemType;
  }

  public void setDebtItemType(DebtItemTypeEnum debtItemType) {
    this.debtItemType = debtItemType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDebtItem dealDebtItem = (CustomerDebtItem) o;
    return /*Objects.equals(this.debtItemType, debtItem.debtItemType) &&*/
            Objects.equals(this.debtQty, dealDebtItem.debtQty) &&
                    Objects.equals(this.debtBalanceOut, dealDebtItem.debtBalanceOut) &&
                    Objects.equals(this.priority, dealDebtItem.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(/*debtItemType,*/ debtQty, debtBalanceOut, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtItem {\n");

    /* sb.append("    debtItemType: ").append(toIndentedString(debtItemType)).append("\n");*/
    sb.append("    debtQty: ").append(toIndentedString(debtQty)).append("\n");
    sb.append("    debtBalanceOut: ").append(toIndentedString(debtBalanceOut)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

  /*public CustomerDebtItem( DebtItemTypeEnum debtItemType,double debtQty, double debtBalanceOut, int priority, Customer customer) {
    this.debtQty = debtQty;
    this.debtBalanceOut = debtBalanceOut;
    this.priority = priority;
    this.customer = customer;
    this.debtItemType = debtItemType;
  }*/

  public CustomerDebtItem() {
  }

  public CustomerDebtItem(DebtItemTypeEnum debtItemType, double debtQty, double debtBalanceOut, int priority) {
    this.debtQty = debtQty;
    this.debtBalanceOut = debtBalanceOut;
    this.priority = priority;
    this.debtItemType = debtItemType;
  }


}

