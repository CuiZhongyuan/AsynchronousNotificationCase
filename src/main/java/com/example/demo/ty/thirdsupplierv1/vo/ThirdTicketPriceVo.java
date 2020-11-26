package com.example.demo.ty.thirdsupplierv1.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Administrator on 2019-06-06.
 */
@Getter
@Setter
public class ThirdTicketPriceVo {
    /**
     * 库存总量 --剩余数量
     */
    private Integer inventory_num;
    /**
     * 价格日历
     */
    private List<ThirdPriceCalendarVo>  price_calendar_list;





}
