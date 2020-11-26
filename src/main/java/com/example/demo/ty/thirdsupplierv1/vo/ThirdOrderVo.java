package com.example.demo.ty.thirdsupplierv1.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Administrator on 2019-06-13.
 */
@Setter
@Getter
public class ThirdOrderVo {
    /**
     * 腾云订单号
     */
    private String order_no;
    /**
     * 合作方订单号
     */
    private String partner_order_no;
    /**
     * 订单状态 1.待付款  2.已付款  3.已出票  4.交易完成  5.交易全部取消  6.已结算  7.退订等待审核  8.全部退订  11.已使用  12.已过期  13.已失效
     */
    private Integer order_status;
    /**
     * 子订单详情
     */
    private List<ThirdSubOrderVo> sub_order_list;
    /**
     * 备注
     */
    private String memo;


}
