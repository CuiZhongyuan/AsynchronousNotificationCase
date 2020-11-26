package com.example.demo;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2019-06-19.
 */
public class TestTxt {


    public String contextLoads(String strurl) throws IOException {
        String txt = "";
        //建立url爬取核心对象
        try {
            URL url = new URL(strurl);

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
        //1. 标题
        String title = txt.split("<div class=\"bookname\">")[1].split("<h1>")[1].split("</h1>")[0];
//        System.out.println(title);
        //2.内容
        String content = txt.split("<div id=\"content\">")[1].replaceAll("<br /><br />&nbsp;&nbsp;&nbsp;&nbsp;", "\r\n").replace("&nbsp;&nbsp;&nbsp;&nbsp;", "  ").split("</div>")[0];
//        System.out.println(content.split("～")[0]);
        //3.下一个
        String next = "https://www.biquge.biz" + txt.split("nextpage=\"")[1].split("html")[0] + "html";
//        System.out.println(next);
        System.out.println(title);
        return next;
    }

    @Test
    public void write() throws IOException {
        String strurl = "https://www.biquge.biz/27_27384/11592786.html";///27_27384/11569413.html
        strurl = contextLoads(strurl);
        System.out.println("***********  end ");
    }

}
