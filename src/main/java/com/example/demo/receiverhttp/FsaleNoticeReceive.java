package com.example.demo.receiverhttp;

import com.example.demo.util.Json;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;
import java.util.*;

@Controller
@RequestMapping("/fsale")
public class FsaleNoticeReceive {
    String appSecret = "505e76a4958746d198ebce36d57a58b1";

    @RequestMapping("/use")
    @ResponseBody
    public String useNotice(String orderNo, String subOrderNo, String thirdPartyNo, String useTime, String num, String sign) {
        System.out.println("------------ use ---------------------");
        Map<String, String> map = new HashMap<>();
        map.put("orderNo", orderNo);
        map.put("subOrderNo", subOrderNo);
        map.put("thirdPartyNo", thirdPartyNo);
        map.put("useTime", useTime);
        map.put("num", num);
        map.put("sign", sign);
        System.out.println(Json.toJacksonStr(map));
        map.remove("sign");
        String thisSign=getSign(map);
        System.out.println(String.format("req sign:%s\nthisSign:%s\nsign is equals:%s", sign, thisSign, thisSign.equals(sign)));
        Map<String, String> resMap = new HashMap<>();
        resMap.put("code", "1000");
        resMap.put("msg", "success");
        return Json.toJacksonStr(resMap);
    }

    @RequestMapping("/end")
    @ResponseBody
    public String endNotice(String orderNo, String subOrderNo, String thirdPartyNo, String verificationTime, String verificationNum, String sign) {
        System.out.println("------------ end ---------------------");
        Map<String, String> map = new HashMap<>();
        map.put("orderNo", orderNo);
        map.put("subOrderNo", subOrderNo);
        map.put("thirdPartyNo", thirdPartyNo);
        map.put("verificationTime", verificationTime);
        map.put("verificationNum", verificationNum);
        map.put("sign", sign);
        System.out.println(Json.toJacksonStr(map));
        map.remove("sign");
        System.out.println("sign is :" + getSign(map).equals(sign));
        Map<String, String> resMap = new HashMap<>();
        resMap.put("code", "1000");
        resMap.put("msg", "success");
        resMap.put("status", "0");//驴妈妈通知成功
        return Json.toJacksonStr(resMap);
    }

    /**
     * 生成签名
     *
     * @param map
     * @return
     */
    private String getSign(Map<String, String> map) {

        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        String str = "";
        for (String key : keyList) {
            str += map.get(key);
        }
        String sign = DigestUtils.md5DigestAsHex((str + appSecret).getBytes(Charset.forName("utf-8")));
        return sign;
    }

    /**
     * 1.0退订通知，一票一推送
     * @return
     */
    @RequestMapping("/refundOneTicket")
    @ResponseBody
    public String refundOneTicket(String orderNo, String subOrderNo, String thirdPartyNo, String unsubscribeAmount, String orderRefundCharge,
                                  String refundResult, String unsubscribeTime, String unsubscribeNum, String sign) {
        System.out.println("------------refundOneTicket ---------------------");
        Map<String, String> map = new HashMap<>();
        map.put("orderNo", orderNo);
        map.put("subOrderNo", subOrderNo);
        map.put("thirdPartyNo", thirdPartyNo);
        map.put("unsubscribeAmount", unsubscribeAmount);
        map.put("orderRefundCharge", orderRefundCharge);
        map.put("refundResult", refundResult);
        map.put("unsubscribeTime", unsubscribeTime);
        map.put("unsubscribeNum", unsubscribeNum);
        map.put("sign", sign);
        System.out.println(Json.toJacksonStr(map));
        map.remove("sign");
        System.out.println("sign is :" + getSign(map).equals(sign));
        Map<String, String> resMap = new HashMap<>();
        resMap.put("code", "1000");
        resMap.put("msg", "success");
        return Json.toJacksonStr(resMap);
    }
    /**
     * 1.0退订通知，一单一推送（一次退票申请一次推送）
     * @return
     */
    @RequestMapping("/refundOnce")
    @ResponseBody
    public String refundOnce(String orderNo, String subOrderNos, String thirdPartyNo, String approveSubOrderNos, String approveNum,
                             String unapproveNum, String unsubscribeTime, String unsubscribeAmount, String orderRefundCharge,String sign) {
        System.out.println("------------ refundOnce ---------------------");
        Map<String, String> map = new HashMap<>();
        map.put("orderNo", orderNo);
        map.put("subOrderNos", subOrderNos);
        map.put("thirdPartyNo", thirdPartyNo);
        map.put("unsubscribeAmount", unsubscribeAmount);
        map.put("orderRefundCharge", orderRefundCharge);
        map.put("approveSubOrderNos", approveSubOrderNos);
        map.put("unsubscribeTime", unsubscribeTime);
        map.put("approveNum", approveNum);
        map.put("unapproveNum", unapproveNum);
        map.put("sign", sign);
        System.out.println(Json.toJacksonStr(map));
        map.remove("sign");
        System.out.println("sign is :" + getSign(map).equals(sign));
        Map<String, String> resMap = new HashMap<>();
        resMap.put("code", "1000");
        resMap.put("msg", "success");
        resMap.put("status", "0");//驴妈妈通知成功
        return Json.toJacksonStr(resMap);
    }


}
