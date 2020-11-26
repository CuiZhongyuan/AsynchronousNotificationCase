package com.example.demo.ty.thirdsupplierv1.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2019-06-13.
 * 第三方供应商返回子订单信息
 */
@Setter
@Getter
public class ThirdSubOrderVo {

    /**
     * 腾云子订单号
     */
    private String sub_order_no;
    /**
     * 启用状态 0. 禁用  1. 启用   2. 挂失
     */
    private Integer use_flag;
    /**
     * 子订单状态 1.待付款   2.已付款  3.已出票  4.交易完成 5.已结算  6.退订申请   7. 退订审核  8. 已退订  9 取消订单  11.已使用  12.已过期  13.已失效
     */
    private Integer sub_order_status;
    /**
     * 游客证件号
     */
    private String player_idcard;
    /**
     * 游客手机号
     */
    private String player_mobile;
    /**
     * 游客姓名
     */
    private String player_name;
    /**
     *  游玩开始时间 yyyy-MM-dd HH:mm:ss
     */
    private String begin_pass_time;
    /**
     *  游玩截止时间 yyyy-MM-dd HH:mm:ss
     */
    private String end_pass_time;
    /**
     *  备注
     */
    private String memo;
}
