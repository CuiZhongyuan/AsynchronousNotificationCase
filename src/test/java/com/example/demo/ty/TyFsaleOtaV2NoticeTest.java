package com.example.demo.ty;

import org.junit.Before;
import org.springframework.web.client.RestTemplate;

public class TyFsaleOtaV2NoticeTest {
    RestTemplate restTemplate = null;

    /**
     * 票列表获取
     */
    @Before
    public void restTemplate() {
        restTemplate = new RestTemplate();
    }

    //本地信息
//    String partenId = "917174";
    String partenId = "950212";
    String appid = "1b256b568967e072";
    String secret = "4fc9dc1d3d060010cf2030c58ebe056eab39ad8d";
    String ip = "http://127.0.0.1:5008/";
    String token = "UjJMMW1VenNhSlovL3o4bnZmanZUUzFVR1o4ZlUvL1pUM0tPOHluTkJPZFh0SHUwemlQc2haQ0pUeVVQYWlFZ1l1c2g4bE9ieThicm85U1Zham1YVzByaWk2d2w1d0ZiK0JHYzBLWmF1cFpOeDY0aEhPOTUvM203TkZvVjNjYkhzWU9vekVNZGNHSkF6bXhqV1Mybkgxd2JDc0tGbFlDcXFPb08xYkRjUmNnPQ==";

    String toeknParam = "?app_id=" + appid + "&access_token=" + token;

}
