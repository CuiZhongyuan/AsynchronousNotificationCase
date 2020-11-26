package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * 核销凭证vo
 *
 * @author wwx
 * @version v2
 */
@Data
public class VoucherInfo implements Serializable {

    private static final long serialVersionUID = -8148000551760905426L;


    /**
     * 有效时长  	单位 /分钟 -1表示一直有效
     */
    @NotNull
    @JsonProperty("expires_in")
    private Integer expiresIn;
    /**
     * 二维码类型 1.一单一码；2.一票一码
     */
    @NotNull
    @JsonProperty("qrcode_type")
    private Integer qrcodeType;
    /**
     * 二维码信息 一单一码时该字段是长度为1 的只有一个二维码的数组,
     */
    @NotNull
    private List<Voucher> vouchers;


    @Data
    public static class Voucher {
        /**
         * 凭证信息 二维码文本信息
         */
        @NotNull
        private String voucher;
        /**
         * 凭证状态
         * 1--未全核销；表示凭证还能再使用
         * 0--已全部核销；表示凭证已不能再使用；
         */
        @JsonProperty("voucher_state")
        private Integer voucherState;
        /**
         * 凭证的显示名称，可能是凭证原值/产品名称等
         */
        @JsonProperty("voucher_caption")
        private String voucherCaption;

    }


    /**
     * 二维码类型 1.一单一码；
     */
    public static final Integer qrcodeType_OneOrder = 1;
    /**
     * 二维码类型 2.一票一码
     */
    public static final Integer qrcodeType_OneTicket = 2;
    /**
     * 凭证状态  1--未全核销；表示凭证还能再使用
     */
    public static final Integer voucherState_NotAllEnd = 1;
    /**
     * 凭证状态  0--已全部核销；表示凭证已不能再使用；
     */
    public static final Integer voucherState_AllEnd = 0;
}
