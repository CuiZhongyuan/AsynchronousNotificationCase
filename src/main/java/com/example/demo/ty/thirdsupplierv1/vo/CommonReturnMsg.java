package com.example.demo.ty.thirdsupplierv1.vo;

/**
 * <p> Description: 返回码及其描述</p>
 *
 * @package com.uticket.api.supplier.dto
 * @Author yangsongsong on 2018/11/1 0001 上午 10:47
 * @return
 */
public class CommonReturnMsg {

    /**
     * req  validate
     */
    public static final String RETURN_CODE_200 = "200";
    public static final String RETURN_CODE_200_MSG = "成功";
    public static final String RETURN_CODE_201 = "201";
    public static final String RETURN_CODE_201_MSG = "授权码不存在";
    public static final String RETURN_CODE_202 = "202";
    public static final String RETURN_CODE_202_MSG = "IP地址未授权";
    public static final String RETURN_CODE_203 = "203";
    public static final String RETURN_CODE_203_MSG = "签名错误";
    public static final String RETURN_CODE_204 = "204";
    public static final String RETURN_CODE_204_MSG = "请求数据有误";

    /**
     * service
     */
    public static final String RETURN_SUBCODE_1000 = "1000";
    public static final String RETURN_SUBCODE_1000_MSG = "成功";
    public static final String RETURN_SUBCODE_2000 = "2000";
    public static final String RETURN_SUBCODE_2000_MSG = "程序错误";
    public static final String RETURN_SUBCODE_1001 = "1001";
    public static final String RETURN_SUBCODE_1001_MSG = "业务参数不合法";
    public static final String RETURN_SUBCODE_2001 = "2001";
    public static final String RETURN_SUBCODE_2001_MSG = "该票不存在或被禁用";

}
