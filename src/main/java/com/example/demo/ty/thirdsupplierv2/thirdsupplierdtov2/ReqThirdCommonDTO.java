package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by Administrator on 2019-06-04.
 */
@Setter
@Getter
@Accessors(chain = true)
public class ReqThirdCommonDTO {

    @JsonProperty("partner_id")
    private String partnerId;

    @JsonProperty("business_data")
    private Object businessData;




}
