package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 第三方供应商订单创建返回DTO v2
 * @author wwx
 * @version v2
 */
@Data
public class ThirdV2OrderCreateResDTO implements Serializable {


    private static final long serialVersionUID = 5412316759799010162L;
    /**
     * 腾云订单号
     */
    @NotNull
    @JsonProperty("order_no")
    private String orderNo;
    /**
     * 第三方订单号
     */
    @NotNull
    @JsonProperty("partner_order_no")
    private String partnerOrderNo;
    /**
     * 凭证信息  同步且下单出票时必传
     */
    @JsonProperty("voucher_info")
    private VoucherInfo voucherInfo;
}
