package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/**
 * 分销价格日历请求参数
 */
@Setter
@Getter
@Accessors(chain = true)
public class ReqThirdPriceCalendarDTO {
    /**
     * 产品id
     */
    @NotBlank(message = "product_id can not be blank")
    @JsonProperty("product_id")
    private String productId;
    /**
     * 开始时间
     */
    @NotBlank(message = "begin_date can not be blank")
    @JsonProperty("begin_date")
    private String beginDate;
    /**
     * 截止时间
     */
    @NotBlank(message = "end_date can not be blank")
    @JsonProperty("end_date")
    private String endDate;

}
