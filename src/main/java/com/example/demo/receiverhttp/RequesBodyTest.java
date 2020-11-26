package com.example.demo.receiverhttp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/requesBody")
public class RequesBodyTest {

    @PostMapping(value = "/text")
    public Map<String,Object> test(@RequestBody String aaa){

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//        System.out.println(JsonUtil.toJacksonStr(map));
        System.out.println(aaa);
        Map<String,Object> result=new HashMap<>();
        result.put("code",200);
        result.put("msg","成功");
        return result;
    }
}
