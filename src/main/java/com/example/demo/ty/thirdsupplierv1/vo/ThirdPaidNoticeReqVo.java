package com.example.demo.ty.thirdsupplierv1.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 第三方供应商出票通知请求vo
 *
 * @author yss
 * @date 2020/03/16 14:10
 */
@Setter
@Getter
@Accessors(chain = true)
public class ThirdPaidNoticeReqVo {

    /**
     * 腾云订单号
     */
    @JsonProperty("order_no")
    private String orderNo;
    /**
     * 合作方订单号
     */
    @JsonProperty("partner_order_no")
    private String partnerOrderNo;
    /**
     * 订单状态 3.支付失败 4.支付成功
     */
    @JsonProperty("order_status")
    private Integer orderStatus;
    /**
     * 二维码信息
     */
    @JsonProperty("qrcode")
    private ThirdQrCodeVo qrCodeVo;
}
