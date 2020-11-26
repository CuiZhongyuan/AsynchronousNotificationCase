package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 退票请求DTO
 *
 * @date 2020-03-12 14:45:00
 * @author yss
 */
@Setter
@Getter
@Accessors(chain = true)
public class ReqThirdRefundDTO {
    /**
     * 腾云订单号
     */
    @NotEmpty(message = "order_no can't be null")
    @JsonProperty("order_no")
    private String orderNo;
    /**
     * 腾云子单号列表
     */
    @JsonProperty("sub_order_nos")
    private List<String> subOrderNos;
    /**
     * 合作方订单号
     */
    @NotEmpty(message = "partner_order_no can't be null")
    @JsonProperty("partner_order_no")
    private String partnerOrderNo;
    /**
     * 退票原因
     */
    @JsonProperty("refund_reason")
    private String refundReason;
    /**
     * 退票单号
     */
    @NotEmpty(message = "refund_no can't be null")
    @JsonProperty("refund_no")
    private String refundNo;
}
