package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Administrator on 2019-06-06.
 */
@Getter
@Setter
public class ThirdV2TicketPriceDTO {
    /**
     * 库存总量 --剩余数量
     */
    private Integer inventory_num;
    /**
     * 价格日历
     */
    private List<ThirdPriceCalendar> price_calendar_list;


    @Getter
    @Setter
    public static class ThirdPriceCalendar {
        /**
         * 日期  yyyy-MM-dd
         */
        private String price_date;
        /**
         * 结算价 分
         */
        private Integer settle_price;
        /**
         * 日库存 --剩余数量 -1为无限制
         */
        private Integer daily_stock;


    }


}
