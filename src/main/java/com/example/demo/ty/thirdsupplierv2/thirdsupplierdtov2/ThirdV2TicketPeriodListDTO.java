package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 第三方供应商获取时段返回参数  v2
 */
@Setter
@Getter
public class ThirdV2TicketPeriodListDTO {

    /**
     * 时段信息列表
     */
    @JsonProperty("ticket_periods")
    private List<ThirdV2TicketPeriodDTO> ticketPeriods;
}
