package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 腾云第三方供应商二维码接口返回参数
 */
@Setter
@Getter
@Accessors(chain = true)
public class ResThirdQrCodeDTO {
    /**
     * 有效时长 单位 /分钟  -1表示一直有效
     */
    private Integer expires_in;
    /**
     * 二维码类型 1.一单一码；2.一票一码。暂时只支持一单一码
     */
    private Integer qrcode_type;
    /**
     * 一单一码时该字段是长度为1 的只有一个二维码的数组
     */
    private List<QrcodeInfo> qrcode_info_list;
    /**
     * 备注
     */
    private String memo;

    @Setter
    @Getter
    @Accessors(chain = true)
    public static class QrcodeInfo {

        /**
         * 子订单号
         */
        private String sub_order_no;
        /**
         * 二维码文本
         */
        private String qrcode_content;
    }

}
