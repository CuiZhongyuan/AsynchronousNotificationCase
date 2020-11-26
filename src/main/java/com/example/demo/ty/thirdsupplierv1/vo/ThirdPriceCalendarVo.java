package com.example.demo.ty.thirdsupplierv1.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2019-06-06.
 */
@Getter
@Setter
public class ThirdPriceCalendarVo {
    /**
     * 当天库存量 --剩余数量
     */
    private Integer day_inventory_num;
    /**
     * 日期  yyyy-MM-dd
     */
    private  String  price_date;
    /**
     * 结算价
     */
    private  Integer settle_price;
    /**
     * 最低价
     */
    private  Integer min_price;
    /**
     * 最高价
     */
    private  Integer max_price;



}
