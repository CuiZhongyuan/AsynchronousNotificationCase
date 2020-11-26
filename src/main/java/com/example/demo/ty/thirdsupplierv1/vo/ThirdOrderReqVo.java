package com.example.demo.ty.thirdsupplierv1.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * Created by wwx on 2019-06-10.
 * 第三方票源订单vo请求参数
 */
@Getter
@Setter
public class ThirdOrderReqVo {

    /**
     * 产品id
     */
    private String product_id;
    /**
     * 购买数量
     */
    private Integer buy_num;
    /**
     * 票时段控制id
     */
    private String time_interval_id;
    /**
     * 联系人姓名
     */
    private String contact_name;
    /**
     * 联系人手机号
     */
    private String contact_phone;
    /**
     * 联系人身份证号
     */
    private String contact_idcard;
    /**
     * 游客信息
     * player_name
     * player_phone
     * player_idcard
     */
    private List<Map<String,String>>  players;
    /**
     * 使用日期 yyyy-MM-dd
     */
    private String used_date;
    /**
     * 结算价格  \分
     */
    private Integer settle_price;
    /**
     * 腾云订单号
     */
    private  String order_no;
    /**
     * 子订单号
     */
    private List<String> sub_order_no_list;

}
