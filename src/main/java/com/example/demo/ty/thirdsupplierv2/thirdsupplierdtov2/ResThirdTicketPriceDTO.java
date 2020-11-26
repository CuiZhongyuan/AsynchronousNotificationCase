package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 腾云第三方供应商返回价格日历采参数
 * @author wwx
 */
@Getter
@Setter
@Accessors(chain=true)
public class ResThirdTicketPriceDTO {
    /**
     * 库存总量 --剩余数量
     */
    private Integer inventory_num;
    /**
     * 价格日历
     */
    private List<ThirdPriceCalendarDto>  price_calendar_list;



    @Getter
    @Setter
    @Accessors(chain=true)
    public static class ThirdPriceCalendarDto {
        /**
         * 日库存 --剩余数量 -1为无限制
         */
        private Integer daily_stock;
        /**
         * 日期  yyyy-MM-dd
         */
        private  String  price_date;
        /**
         * 结算价
         */
        private  Integer settle_price;
    }

}
