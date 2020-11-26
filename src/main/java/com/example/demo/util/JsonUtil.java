package com.example.demo.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    private static ObjectMapper objmap = new ObjectMapper();
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
