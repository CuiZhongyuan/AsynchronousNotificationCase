package com.example.demo.ty.thirdsupplierv1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 第三方供应商退票通知请求参数
 *
 * @author yss
 * @date 2020/2/13 16:55
 */
@Data
public class ThirdRefundNoticeReqVo {
    /**
     * 主单号
     */
    @JsonProperty("order_no")
    private String orderNo;
    /**
     * 合作方订单号
     */
    @JsonProperty("partner_order_no")
    private String partnerOrderNo;
    /**
     * 退票单号
     */
    @JsonProperty("refund_no")
    private String refundNo;
    /**
     * 退款金额 单位:分
     */
    @JsonProperty("refund_amount")
    private Integer refundAmount;
    /**
     * 子单号列表
     */
    @JsonProperty("sub_order_nos")
    private List<String> subOrderNos;
    /**
     * 退款状态 5.成功 6.失败
     */
    @JsonProperty("order_status")
    private Integer orderStatus;
}
