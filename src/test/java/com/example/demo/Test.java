package com.example.demo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2019-06-19.
 */
public class Test {

    @org.junit.Test
    public void contextLoads() throws IOException {
        String txt = "";
        //建立url爬取核心对象
        try {
            URL url = new URL("http://www.baidu.com");

            //通过url建立与网页的连接
            URLConnection conn = url.openConnection();
            //通过链接取得网页返回的数据
            InputStream is = conn.getInputStream();
            //一般按行读取网页数据，并进行内容分析
            //因此用BufferedReader和InputStreamReader把字节流转化为字符流的缓冲流
            //进行转换时，需要处理编码格式问题
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "GBK"));

            //按行读取并打印
            String line = null;
            while ((line = br.readLine()) != null) {
                txt += line;
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void contextLoadsas() {
        try {
            String name = "www.baidu.com";
            InetAddress[] addresses = InetAddress.getAllByName(name);
            for (int i = 0; i < addresses.length; i++) {
                System.out.println(name + "[" + i + "]: "
                        + addresses[i].getHostAddress());
            }
        } catch (UnknownHostException uhe) {
            System.err.println("Unable to find: " );
        }
//        try {
////            String hostName = Address.getHostName(InetAddress.getByName("61.135.169.125"));
////            System.out.println(hostName);
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
    }
}
