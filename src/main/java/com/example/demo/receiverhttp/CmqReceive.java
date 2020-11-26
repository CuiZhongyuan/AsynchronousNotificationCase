package com.example.demo.receiverhttp;

import com.example.demo.util.Json;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

@RestController
public class CmqReceive {
    @Resource
    private HttpServletRequest request;


    /**
     * test 签约通知票详情
     *
     * @throws IOException
     */
    @PostMapping("/saas/cmq/msgSend/onMessage")
    public Integer receiveMessage() throws IOException {
        String param = StreamUtils.copyToString(this.request.getInputStream(), Charset.forName("UTF-8"));
        Map map = Json.conversion(param, Map.class);
        Map map1 = Json.conversion(map.get("msgBody"), Map.class);
//        System.out.println();
//        System.out.println(Json.toJacksonStr(map1));
        return 200;
    }
    /**
     * test 签约通知票详情
     *
     * @throws IOException
     */
    @PostMapping("cmq/contract")
    public Integer test() throws IOException {
        String param = StreamUtils.copyToString(this.request.getInputStream(), Charset.forName("UTF-8"));
        Map map = Json.conversion(param, Map.class);
        Map map1 = Json.conversion(map.get("msgBody"), Map.class);
        System.out.println(Json.toJacksonStr(map1));
        return 200;
    }
}
