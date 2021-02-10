package org.vorobiev.lawOrder.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.*;
import java.util.Date;

/**
 * Договор, который является предметов решения суда
 */
@ApiModel(description = "Договор, который является предметов решения суда")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-06T21:34:28.028525Z[Etc/UTC]")

@Entity
@Table(name = "deal")
public class Deal   {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private long id;


  @JsonProperty("dealId")
  @Column(name="dealid")
  private UUID dealId;

  @JsonProperty("numebr")
  @Column(name="numebr")
  private String numebr;

  @JsonProperty("date")
  @Column(name="date")
  private Date date;

  /**
   * Валюта договора
   */
  public enum FundEnum {
    _810("810"),
    
    _840("840"),
    
    _978("978"),
    
    _756("756"),
    
    _826("826");

    private String value;

    FundEnum(String value) {
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
    public static FundEnum fromValue(String value) {
      for (FundEnum b : FundEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("fund")
  @Column(name="fund")
  private FundEnum fund = FundEnum._810;

  /**
   * Валюта по решению суда
   */
  public enum LawOrderFundEnum {
    _810("810"),
    
    _840("840"),
    
    _978("978"),
    
    _756("756"),
    
    _826("826");

    private String value;

    LawOrderFundEnum(String value) {
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
    public static LawOrderFundEnum fromValue(String value) {
      for (LawOrderFundEnum b : LawOrderFundEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("lawOrderFund")
  @Column(name = "laworderfund")
  private LawOrderFundEnum lawOrderFund = LawOrderFundEnum._810;

  @JsonProperty("lawOrderFundRate")
  @Column(name = "laworderfundrate")
  private BigDecimal lawOrderFundRate;

  @JsonProperty("lawOrderCreditRate")
  @Column(name = "lawordercreditrate")
  private BigDecimal lawOrderCreditRate;

  @JsonProperty("lawOrderFeeRate")
  @Column(name = "laworderfeerate")
  private BigDecimal lawOrderFeeRate;

  /**
   * Тип стваки пени
   */
  public enum LawOrderFeeRateTypeEnum {
    year("Год"),
    
    day("День");

    private String value;

    LawOrderFeeRateTypeEnum(String value) {
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
    public static LawOrderFeeRateTypeEnum fromValue(String value) {
      for (LawOrderFeeRateTypeEnum b : LawOrderFeeRateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("lawOrderFeeRateType")
  @Column(name = "laworderfeeratetype")
  private LawOrderFeeRateTypeEnum lawOrderFeeRateType = LawOrderFeeRateTypeEnum.day;


  @Column(name = "dealid")
  public Deal dealId(UUID dealId) {
    this.dealId = dealId;
    return this;
  }



  @JsonProperty("debtItems")
  @OneToMany(mappedBy = "dealid", fetch = FetchType.EAGER)
  private List<DealDebtItem> dealDebtItems = null;


  /**
   * идентификатор
   * @return dealId
  */
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "идентификатор")



  public UUID getDealId() {
    return dealId;
  }

  public void setDealId(UUID dealId) {
    this.dealId = dealId;
  }

  public Deal numebr(String numebr) {
    this.numebr = numebr;
    return this;
  }

  /**
   * номер договора
   * @return numebr
  */
  @ApiModelProperty(example = "0000-КУ/00", value = "номер договора")


  public String getNumebr() {
    return numebr;
  }

  public void setNumebr(String numebr) {
    this.numebr = numebr;
  }

  public Deal date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * дата договора
   * @return date
  */
  @ApiModelProperty(example = "Tue Jan 01 00:00:00 UTC 2019", value = "дата договора")


  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Deal fund(FundEnum fund) {
    this.fund = fund;
    return this;
  }

  /**
   * Валюта договора
   * @return fund
  */
  @ApiModelProperty(example = "810", value = "Валюта договора")


  public FundEnum getFund() {
    return fund;
  }

  public void setFund(FundEnum fund) {
    this.fund = fund;
  }

  public Deal lawOrderFund(LawOrderFundEnum lawOrderFund) {
    this.lawOrderFund = lawOrderFund;
    return this;
  }

  /**
   * Валюта по решению суда
   * @return lawOrderFund
  */
  @ApiModelProperty(example = "810", value = "Валюта по решению суда")


  public LawOrderFundEnum getLawOrderFund() {
    return lawOrderFund;
  }

  public void setLawOrderFund(LawOrderFundEnum lawOrderFund) {
    this.lawOrderFund = lawOrderFund;
  }

  public Deal lawOrderFundRate(BigDecimal lawOrderFundRate) {
    this.lawOrderFundRate = lawOrderFundRate;
    return this;
  }

  /**
   * Курс установленный по решению суда
   * @return lawOrderFundRate
  */
  @ApiModelProperty(example = "70.77", value = "Курс установленный по решению суда")


  public BigDecimal getLawOrderFundRate() {
    return lawOrderFundRate;
  }

  public void setLawOrderFundRate(BigDecimal lawOrderFundRate) {
    this.lawOrderFundRate = lawOrderFundRate;
  }

  public Deal lawOrderCreditRate(BigDecimal lawOrderCreditRate) {
    this.lawOrderCreditRate = lawOrderCreditRate;
    return this;
  }

  /**
   * Процентная ставка по решению суда в %
   * @return lawOrderCreditRate
  */
  @ApiModelProperty(example = "10.5", value = "Процентная ставка по решению суда в %")


  public BigDecimal getLawOrderCreditRate() {
    return lawOrderCreditRate;
  }

  public void setLawOrderCreditRate(BigDecimal lawOrderCreditRate) {
    this.lawOrderCreditRate = lawOrderCreditRate;
  }

  public Deal lawOrderFeeRate(BigDecimal lawOrderFeeRate) {
    this.lawOrderFeeRate = lawOrderFeeRate;
    return this;
  }

  /**
   * Ставка по пеням по решению суда
   * @return lawOrderFeeRate
  */
  @ApiModelProperty(example = "0.2", value = "Ставка по пеням по решению суда")


  public BigDecimal getLawOrderFeeRate() {
    return lawOrderFeeRate;
  }

  public void setLawOrderFeeRate(BigDecimal lawOrderFeeRate) {
    this.lawOrderFeeRate = lawOrderFeeRate;
  }

  public Deal lawOrderFeeRateType(LawOrderFeeRateTypeEnum lawOrderFeeRateType) {
    this.lawOrderFeeRateType = lawOrderFeeRateType;
    return this;
  }

  /**
   * Тип стваки пени
   * @return lawOrderFeeRateType
  */
  @ApiModelProperty(example = "День", value = "Тип стваки пени")


  public LawOrderFeeRateTypeEnum getLawOrderFeeRateType() {
    return lawOrderFeeRateType;
  }

  public void setLawOrderFeeRateType(LawOrderFeeRateTypeEnum lawOrderFeeRateType) {
    this.lawOrderFeeRateType = lawOrderFeeRateType;
  }

  public Deal dealDebtItems(List<DealDebtItem> dealDebtItems) {
    this.dealDebtItems = dealDebtItems;
    return this;
  }

  public Deal addDebtItemsItem(DealDebtItem dealDebtItemItems) {
    if (this.dealDebtItems == null) {
      this.dealDebtItems = new ArrayList<DealDebtItem>();
    }
    this.dealDebtItems.add(dealDebtItemItems);
    return this;
  }

  /**
   * Get dealDebtItems
   * @return dealDebtItems
  */
  @ApiModelProperty(value = "")

  public List<DealDebtItem> getDebtItems() {
    return dealDebtItems;
  }

  public void setDebtItems(List<DealDebtItem> dealDebtItems) {
    this.dealDebtItems = dealDebtItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deal deal = (Deal) o;
    return Objects.equals(this.dealId, deal.dealId) &&
        Objects.equals(this.numebr, deal.numebr) &&
        Objects.equals(this.date, deal.date) &&
        Objects.equals(this.fund, deal.fund) &&
        Objects.equals(this.lawOrderFund, deal.lawOrderFund) &&
        Objects.equals(this.lawOrderFundRate, deal.lawOrderFundRate) &&
        Objects.equals(this.lawOrderCreditRate, deal.lawOrderCreditRate) &&
        Objects.equals(this.lawOrderFeeRate, deal.lawOrderFeeRate) &&
        Objects.equals(this.lawOrderFeeRateType, deal.lawOrderFeeRateType) &&
        Objects.equals(this.dealDebtItems, deal.dealDebtItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealId, numebr, date, fund, lawOrderFund, lawOrderFundRate, lawOrderCreditRate, lawOrderFeeRate, lawOrderFeeRateType, dealDebtItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deal {\n");
    
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    numebr: ").append(toIndentedString(numebr)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
    sb.append("    lawOrderFund: ").append(toIndentedString(lawOrderFund)).append("\n");
    sb.append("    lawOrderFundRate: ").append(toIndentedString(lawOrderFundRate)).append("\n");
    sb.append("    lawOrderCreditRate: ").append(toIndentedString(lawOrderCreditRate)).append("\n");
    sb.append("    lawOrderFeeRate: ").append(toIndentedString(lawOrderFeeRate)).append("\n");
    sb.append("    lawOrderFeeRateType: ").append(toIndentedString(lawOrderFeeRateType)).append("\n");
    sb.append("    dealDebtItems: ").append(toIndentedString(dealDebtItems)).append("\n");
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
}

