package com.example.demo.receiverhttp;

import com.example.demo.util.JsonUtil;
import org.springframework.web.bind.annotation.*;

import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

/**
 *
 */
@RestController
@RequestMapping("/ty-fsale")
public class TyFsaleAction {
    public static List<String> list=new ArrayList<>();


    @PostMapping(value = "/notice")
    public Map<String,Object> notice(@RequestBody Map<String,Object> reqParam){

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println(JsonUtil.toJacksonStr(reqParam));
        System.out.println("========================ty-fsale");
        list.add(JsonUtil.toJacksonStr(reqParam));
        Map<String,Object> result=new HashMap<>();
        result.put("ret",0);
        result.put("errorcode",0);
        result.put("msg","成功");
        return result;
    }

//------------------  ota通知并发测试 ----------------------
    private static int total = 2000;
    private static String filePath="C:\\Users\\Administrator\\Desktop\\testlog.txt";




    private static int i = 0;
    private static String block = "block";
    private static StringBuffer sb=new StringBuffer();

    @PostMapping(value = "/concurrent/test")
    public Map<String,Object> concurrentTest(@RequestBody Map<String,Object> reqParam){
        synchronized (block) {
            i++;
            String str=LocalDateTime.now().toString()+" # count:" + i;
            System.out.println(str);
            sb.append("\r\n").append(str);

            fileAppendText("\r\n"+str);

        }
        //睡眠500毫秒 模拟业务处理用时
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map<String,Object> result=new HashMap<>();
        result.put("ret",0);
        result.put("errorcode",0);
        result.put("msg","成功");
        return result;
    }

    private void fileAppendText(String str){
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(filePath,true);
            fileOutputStream.write(str.getBytes(Charset.forName("UTF-8")));
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println("-----文件输出异常------");
        }
    }


    @GetMapping(value = "/data")
    public List<String> data(){
        return list;
    }
}
