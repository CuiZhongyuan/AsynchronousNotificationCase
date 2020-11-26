package com.example.demo.receiverhttp;

import com.example.demo.util.Json;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SaXi {

    @PostMapping(value = "/cdb")
    public String result(@RequestBody Map<String, Object> map) {

        System.out.println("======cdb=====");

        System.out.println(Json.toJacksonStr(map));
        System.out.println("===========cdb=============");

        return "{\"msg\":\"成功 \",\"code\":\"200\",\"timestamp\":\"" + System.currentTimeMillis() + "\"}";
    }

}
