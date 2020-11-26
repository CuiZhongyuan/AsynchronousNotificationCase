package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 第三方供应商票接口返回参数
 */
@Getter
@Setter
@Accessors(chain=true)
public class ResThirdTicketDTO {

    /**
     * 产品id
     */
    private String product_id;
    /**
     * 产品名称
     */
    private String product_name;
    /**
     * 景点名称
     */
    private String secnic_name;
    /**
     * 开始时间
     */
    private String begin_date;
    /**
     * 结束时间
     */
    private String end_date;
    /**
     * 最高销售价格 单位/分
     */
    private Integer max_price;
    /**
     * 最低销售价格 单位/分
     */
    private Integer min_price;
    /**
     * 结算价 单位/分
     */
    private Integer settle_price;

    /**
     * 单笔购买上限
     */
    private Integer max_num;
    /**
     * 单笔购买下限
     */
    private Integer min_num;

    /**
     * 最大购买提前天数
     */
    private Integer max_advance_days;
    /**
     * 最小购买提前天数
     */
    private Integer min_advance_days;
    /**
     * 自动取消时间 /分钟 未支付的订单一定时间后自动取消
     * [1，60]
     */
    private Integer auto_cancle_Minutes;
    /**
     * 人张类型 1.一票一人 2.一票多人 目前只支持一票一人
     */
    private Integer player_per_type;
    /**
     * 是否实名制 0.非实名制 1. 实名制
     * 实名制票需要游客的身份证号
     */
    private Integer idcard_flag;
    /**
     * 出票方式 1 二次换票  2 .订单取票  3. 身份证绑定 4. 在线联码
     */
    private Integer out_ticket_type;
    /**
     * 是否时段控制票 如果是时段控制票,需先获取时段控制信息,下单的时候传入时段控制ID
     * 暂不支持时段票,可填false
     */
    private Boolean period_flag;
    /**
     * 门票标签 多个英文逗号连接
     */
    private String ticket_label;
    /**
     * 总库存数量
     */
    private Integer inventory_num;
    /**
     * 日库存数量
     */
    private Integer day_inventory_num;
    /**
     * 适用人群
     * 1:成人
     * 2:儿童
     * 4:学生
     * 8:老人
     * 16:其他
     * 32:家 庭
     */
    private Integer people_group;
    /**
     * 退订类型 1.随时退  2.非随时退  3.不可退
     */
    private Integer refund_new_type;

    /**
     * 当天预定截止时间 HH:mm:ss
     */
    private String advance_booking_time;
    /**
     * 有效期 单位/天
     */
    private Integer effective_num;

    /**
     * 产品描述
     */
    private String description;
    /**
     * 预订须知
     */
    private String book_content;

    /**
     * 使用时间
     */
    private String use_time;
    /**
     * 使用地址
     */
    private String use_address;
    /**
     * 费用包含
     */
    private String cost_contains;
    /**
     * 退改说明
     */
    private String reversion_explanation;

}
