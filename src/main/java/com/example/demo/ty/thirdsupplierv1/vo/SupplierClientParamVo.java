package com.example.demo.ty.thirdsupplierv1.vo;


/**
 * <p> Description: 请求数据对应的entity</p>
 *
 * @package com.uticket.api.supplier.dto
 * @Author yangsongsong on 2018/11/1 0001 上午 10:28
 * @return
 */
public class SupplierClientParamVo {

    /**
     * 授权码
     */
    private String code;

    /**
     * 业务数据 base64加密
     */
    private String content;

    /**
     * 签名 （content+key+timestamp）
     */
    private String sign;

    /**
     * 时间 yyyy-MM-dd HH:mm:ss
     */
    private String timestamp;

    /**
     * 补充数据
     */
    private String extendData="";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getExtendData() {
        return extendData;
    }

    public void setExtendData(String extendData) {
        this.extendData = extendData;
    }
}
