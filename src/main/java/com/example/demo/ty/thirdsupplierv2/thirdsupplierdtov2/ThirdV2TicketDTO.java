package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by wwx on 2019-06-05.
 */
@Getter
@Setter
public class ThirdV2TicketDTO {

    /**
     * 产品id
     */
    private String product_id;
    /**
     * 产品名称
     */
    private String product_name;
    /**
     * 景区编码
     */
    private List<String> scenic_code;
    /**
     * 景区名称
     */
    private List<String> secnic_name;
    /**
     * 开始时间
     */
    private String begin_date;
    /**
     * 结束时间
     */
    private String end_date;
    /**
     * 总库存数量
     */
    private Integer inventory_num;
    /**
     * 单笔购买上限
     */
    private Integer max_num;
    /**
     * 单笔购买下限
     */
    private Integer min_num;
    /**
     * 结算价 单位/分
     */
    private Integer settle_price;

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
     * 退订类型 1.随时退  2.非随时退  3.不可退
     */
    private Integer refund_new_type;
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
     * 当天预定截止时间 HH:mm:ss
     */
    private String advance_booking_time;
    /**
     * 时段控制标记
     * 0--无时段资源；
     * 1--时间段资源；例 ：00:00~01:00
     * 2--时间点资源；例 ：00:00
     * 此值非0时，下单的时候传入时段资源ID
     */
    private Integer period_flag;
    /**
     * 重复购票限制类型
     * 1.表示身份证限制。3.第三方用户id限制
     * --可同时使用多个限制，没有表示不限制，多个时用英文逗号连接
     */
    private String limit_type;
    /**
     * 重复购票限制次数 limit_type有值时必填
     */
    private Integer limit_num;
    /**
     * 重复购票限制周期 limit_type有值时必填 单位：天
     */
    private Integer limit_cycle;
    /**
     * 有效期模式 0 ：固定单位（有效期x天），1：固定日期段（有效期 x年x月x日至x年x月x日）
     */
    private Integer effective_mode;
    /**
     * 有效期 单位/天
     */
    private Integer effective_num;
    /**
     * 有效期日期  有效期模式为1时必填; 格式：有效期开始时间&有效期截止时间，示例：2019-12-01&2019-12-12
     */
    private String effective_date;
    /**
     * 有效期星期 有效期模式为1时必填; 表示周几有效，可表示多天，如：1,2,3,4,5 表示周一到周五有效，中间用英文逗号分隔，1表示周一，7表示周日
     */
    private String effective_day_week;
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
    /**
     * 温馨提示
     */
    private String warm_prompt;
    /**
     * 门票标签
     */
    private List<String> ticket_label;
    /**
     * 票务类型  1--景区门票  2--剧场  3--直通车
     */
    private Integer product_type;



}
