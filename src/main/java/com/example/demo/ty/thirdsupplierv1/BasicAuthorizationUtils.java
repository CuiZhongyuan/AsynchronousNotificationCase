package com.example.demo.ty.thirdsupplierv1;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.client.methods.HttpRequestBase;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 验证OTA的签名
 *
 * @author LGL
 * @date :2018-11-20 上午10:35
 */
public class BasicAuthorizationUtils {
    private static final String ALGORITHM_HMAC_SHA1 = "HmacSHA1";
    public static final String HTTP_HEADER_PARTNERID = "partner_id";
    public static final String HTTP_HEADER_DATE = "date";
    public static final String HTTP_HEADER_SIGNATURE = "signature";

    /**
     * 生成请求头认证信息
     *
     * @param date          日期格式为 yyyy-MM-dd HH:mm:ss
     * @param requestMethod 传入的请求方法全部转换为大写(toUpperCase)
     * @param appId         给OTA分配的权限id
     * @param appKey        给OTA分配的权限key
     */
    public static String generateAuthSignature(String date, String requestMethod, String appId,
                                               String appKey) {
        String stringToSign = appId + date + requestMethod.toUpperCase();
        String authorization;
        try {
            authorization = getSignature(stringToSign.getBytes(), appKey.getBytes());
        } catch (Exception e1) {
            e1.printStackTrace();
            return "";
        }
        return authorization;
    }

    /**
     * 生成请求头认证信息
     *
     * @param request
     * @param appId
     * @param appKey
     */
    public static void generateAuthAndDateHeader(HttpRequestBase request, String appId,
                                                 String appKey,String partnerId) {
        Date sysdate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(sysdate);
        String stringToSign = appId + date + request.getMethod().toUpperCase();
        String authorization;
        try {
            authorization = getSignature(stringToSign.getBytes(), appKey.getBytes());
        } catch (Exception e1) {
            e1.printStackTrace();
            return;
        }
        // 请将partnerId替换为商家自身的partnerId
        request.addHeader(HTTP_HEADER_PARTNERID, partnerId);
        request.addHeader(HTTP_HEADER_SIGNATURE, authorization);
        request.addHeader(HTTP_HEADER_DATE, date);
    }

    /**
     * 生产签名
     *
     * @param data
     * @param key
     * @return
     * @throws InvalidKeyException
     * @throws NoSuchAlgorithmException
     */
    public static String getSignature(byte[] data, byte[] key)
            throws InvalidKeyException, NoSuchAlgorithmException {
        SecretKeySpec signingKey = new SecretKeySpec(key, ALGORITHM_HMAC_SHA1);
        Mac mac = Mac.getInstance(ALGORITHM_HMAC_SHA1);
        mac.init(signingKey);
        byte[] rawHmac = mac.doFinal(data);
        return new String(Base64.encodeBase64(rawHmac));
    }
}
