package com.example.demo.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2019-06-12.
 */
@RestController
public class Hello {
    public static List<String> list=new ArrayList<>();

    private static ObjectMapper objmap = new ObjectMapper();


    @RequestMapping(value = "/hello")
    public String hello(String name) {
        list.add(name);
        return "hello!！！！！";
    }
    @RequestMapping(value = "/hello/data")
    public List<String> hellodata() {
        return list;
    }



    @PostMapping(value = "/test")
    public Map<String, Object> test(@RequestBody Map<String, Object> map) {

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println(toJacksonStr(map));
        System.out.println("========================");
        Map<String, Object> qrCodeVo = new HashMap<>();
        qrCodeVo.put("qrcode_content", "123456789");
        List<Map<String, Object>> qrcodeInfoList = new ArrayList<>();
        qrcodeInfoList.add(qrCodeVo);
        Map<String, Object> thirdQrCodeVo = new HashMap<>();
        thirdQrCodeVo.put("expires_in", 2);
        thirdQrCodeVo.put("qrcode_type", 1);
        thirdQrCodeVo.put("qrcode_info_list", qrcodeInfoList);
        thirdQrCodeVo.put("memo", "memomemo");
        Map<String, Object> result = new HashMap<>();
        result.put("ret", 0);
        result.put("msg", "成功");
        result.put("errorcode", 0);
        result.put("data", thirdQrCodeVo);
        return result;
    }

    @PostMapping(value = "/result")
    public String result(@RequestBody Map<String, Object> map) {

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println(toJacksonStr(map));
        System.out.println("========================");

        return "{\"errorcode\":0,\"msg\":\"success\",\"ret\":0}";
    }


    public static String toJacksonStr(Object obj) {
        String content = "";
        try {
            content = objmap.writeValueAsString(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        return content;
    }
}
