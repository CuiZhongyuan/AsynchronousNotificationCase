package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * ota时段信息返回参数 dto v2
 */
@Setter
@Getter
public class ThirdV2TicketPeriodDTO {

    /**
     * 产品id
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * 门票名称
     */
    @JsonProperty("product_name")
    private String productName;
    /**
     * 时段资源类型 	0--无时段资源；1--时间段资源；  2--时间点资源；
     */
    @JsonProperty("period_flag")
    private Integer period_flag;
    /**
     * 时段资源 period_flag为0时此值为null
     */
    @JsonProperty("periods")
    private List<Period> periods;

    /**
     * 包含返程 	0--无返程时段；1--有返回时段；
     */
    @JsonProperty("back_period_flag")
    private Integer backPeriodFlag;
    /**
     * 返程时段 period_flag不为0时且back_period_flag为1时传此值
     */
    @JsonProperty("back_periods")
    private List<Period> backPeriods;

    @Setter
    @Getter
    public static class Period {
        /**
         * 时段控制 ID
         */
        @JsonProperty("period_id")
        private String periodId;

        /**
         * 时段显示名称 例: 10:00~11:00或10:30,分别对应时间段资源和时间点资源
         */
        @JsonProperty("period_caption")
        private String periodCaption;
        /**
         * 门票剩余数量 -1表示无限
         */
        @JsonProperty("period_stock")
        private Integer periodStock;

        /**
         * 开始时间 HH:mm
         */
        @JsonProperty("begin_time")
        private String beginTime;
        /**
         * 结束时间 HH:mm 当产品使用的是时间点资源时此值恒等于23:59
         */
        @JsonProperty("end_time")
        private String endTime;
    }
}
