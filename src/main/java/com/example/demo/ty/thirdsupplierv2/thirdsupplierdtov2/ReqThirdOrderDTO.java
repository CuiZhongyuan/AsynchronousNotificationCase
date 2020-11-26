package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Map;

/**
 * Created by wwx on 2019-06-10.
 * 第三方票源订单vo请求参数
 */
@Getter
@Setter
@Accessors(chain = true)
public class ReqThirdOrderDTO {

    /**
     * 产品id
     */
    @NotEmpty(message = "product_id can't be empty")
    @JsonProperty("product_id")
    private String productId;
    /**
     * 购买数量
     */
    @NotNull(message = "buy_num can't be null")
    @JsonProperty("buy_num")
    private Integer buyNum;
    /**
     * 票时段控制id
     */
    @JsonProperty("time_interval_id")
    private String timeIntervalId;
    /**
     * 联系人姓名
     */
    @NotEmpty(message = "contact_name can't be empty")
    @JsonProperty("contact_name")
    private String contactName;
    /**
     * 联系人手机号
     */
    @NotEmpty(message = "contact_phone can't be empty")
    @JsonProperty("contact_phone")
    private String contactPhone;
    /**
     * 联系人身份证号
     */
    @NotEmpty(message = "contact_idcard can't be empty")
    @JsonProperty("contact_idcard")
    private String contactIdCard;
    /**
     * 游客信息
     * player_name
     * player_phone
     * player_idcard
     */
    private List<Map<String,String>>  players;
    /**
     * 使用日期 yyyy-MM-dd
     */
    @NotEmpty(message = "used_date can't be empty")
    @JsonProperty("used_date")
    private String usedDate;
    /**
     * 结算价格  \分
     */
    @NotNull(message = "settle_price can't be null")
    @JsonProperty("settle_price")
    private Integer settlePrice;
    /**
     * 腾云订单号
     */
    @NotEmpty(message = "order_no can't be empty")
    @JsonProperty("order_no")
    private  String orderNo;
    /**
     * 子订单号
     */
    @NotNull(message = "sub_order_no_list can't be null")
    @Size(min = 1, message = "sub_order_no_list size can't less than 1")
    @JsonProperty("sub_order_no_list")
    private List<String> subOrderNoList;
    /**
     * 时段信息
     */
    @Valid
    @JsonProperty("order_periods")
    private List<OrderPeriod> orderPeriods;

    @Data
    public static class OrderPeriod {
        /**
         * 门票id
         */
        @NotNull(message = "order_periods.product_id can't be null")
        private String product_id;
        /**
         * 时段
         */
        @Valid
        @NotNull(message = "order_periods.period can't be null")
        private Period period;
        /**
         * 返程时段
         */
        @Valid
        private Period back_period;
    }

    @Data
    public static class Period {
        /**
         * 时段控制 ID
         */
        @Valid
        @NotNull(message = "order_periods.period.period_id can't be null")
        private String period_id;
        /**
         * 开始时间 HH:mm
         */
        private String begin_time;
        /**
         * 结束时间 HH:mm
         */
        private String end_time;
    }

}
