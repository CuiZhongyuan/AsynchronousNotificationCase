package com.example.demo.ty.thirdsupplierv1;

import com.example.demo.dto.Result;
import com.example.demo.ty.thirdsupplierv1.vo.ThirdPriceCalendarVo;
import com.example.demo.ty.thirdsupplierv1.vo.ThirdQrCodeVo;
import com.example.demo.ty.thirdsupplierv1.vo.ThirdTicketPriceVo;
import com.example.demo.ty.thirdsupplierv1.vo.ThirdTicketVo;
import com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2.ReqThirdCommonDTO;
import com.example.demo.util.JsonUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.*;

/**
 * 腾云第三供应商v1接口测试类
 * 本接口模拟第三方服务进行交互
 */
@RestController
@RequestMapping("/ty-fsale-thirdSupplier/v1")
public class ThirdSupplierV1Test {
    @Autowired
    private HttpServletRequest request;

    String supplierCode = "JQ787115";
    String appId = "1b256b568967e072";
    String appKey = "4fc9dc1d3d060010cf2030c58ebe056eab39ad8d";

    /**
     * 票列表接口
     *
     * @return
     */
    @PostMapping("/ticket/list")
    public Result<List<ThirdTicketVo>> list(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "票列表接口");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        //签名校验
        checkParam();

        ThirdTicketVo dot = new ThirdTicketVo();
        dot.setProduct_id("v1test-001");
        dot.setProduct_name("v1Product_name-001");
        dot.setSecnic_name("v1");
        dot.setBegin_date("2020-01-01 00:00:00");
        dot.setEnd_date("2027-01-01 00:00:00");
        dot.setMax_price(1);
        dot.setMin_price(1);
        dot.setSettle_price(1);
        dot.setMax_num(10);
        dot.setMin_num(1);
        dot.setMax_advance_days(30);
        dot.setMin_advance_days(1);
        dot.setAuto_cancle_Minutes(10);
        dot.setPlayer_per_type(1);
        dot.setIdcard_flag(1);
        dot.setOut_ticket_type(4);
        dot.setPeriod_flag(false);
        dot.setTicket_label("AAAA,儿童");
        dot.setInventory_num(1000);
        dot.setDay_inventory_num(1000);
        dot.setPeople_group(2);
        dot.setRefund_new_type(1);
        dot.setAdvance_booking_time("23:00:00");
        dot.setEffective_num(3);
        dot.setDescription("产品描述");
        dot.setBook_content("预订须知");
        dot.setUse_time("使用时间");
        dot.setUse_address("使用地址");
        dot.setCost_contains("费用包含");
        dot.setReversion_explanation("退改说明");
        List<ThirdTicketVo> list = new ArrayList<>();
        list.add(dot);
        ThirdTicketVo o2 = new ThirdTicketVo();
        BeanUtils.copyProperties(dot, o2);
        o2.setProduct_id("v1test-002");
        o2.setProduct_name("供应商门票V1.0");
        return Result.success(Arrays.asList(dot, o2));
    }

    /**
     * 票详情
     *
     * @return
     */
    @PostMapping("/ticket/detail")
    public Result<ThirdTicketVo> detail(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "票详情");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        //签名校验
        checkParam();

        ThirdTicketVo dot = new ThirdTicketVo();
        dot.setProduct_id("v1test-001");
        dot.setProduct_name("v1Product_name-001");
        dot.setSecnic_name("v1");
        dot.setBegin_date("2020-01-01 00:00:00");
        dot.setEnd_date("2027-01-01 00:00:00");
        dot.setMax_price(1);
        dot.setMin_price(1);
        dot.setSettle_price(1);
        dot.setMax_num(10);
        dot.setMin_num(1);
        dot.setMax_advance_days(30);
        dot.setMin_advance_days(1);
        dot.setAuto_cancle_Minutes(10);
        dot.setPlayer_per_type(1);
        dot.setIdcard_flag(1);
        dot.setOut_ticket_type(4);
        dot.setPeriod_flag(false);
        dot.setTicket_label("AAAA,儿童");
        dot.setInventory_num(1000);
        dot.setDay_inventory_num(1000);
        dot.setPeople_group(2);
        dot.setRefund_new_type(1);
        dot.setAdvance_booking_time("23:00:00");
        dot.setEffective_num(3);
        dot.setDescription("产品描述");
        dot.setBook_content("预订须知");
        dot.setUse_time("使用时间");
        dot.setUse_address("使用地址");
        dot.setCost_contains("费用包含");
        dot.setReversion_explanation("退改说明");

        return Result.success(dot);
    }

    /**
     * 价格日历
     *
     * @return
     */
    @PostMapping("/ticket/priceCalendar")
    public Result<ThirdTicketPriceVo> priceCalendar(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "价格日历");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        //签名校验
        checkParam();
        ThirdPriceCalendarVo priceCalendarVo1=new ThirdPriceCalendarVo();
        priceCalendarVo1.setDay_inventory_num(100);
        priceCalendarVo1.setPrice_date("2020-09-15");
        priceCalendarVo1.setSettle_price(1);
        priceCalendarVo1.setMin_price(1);
        priceCalendarVo1.setMax_price(1);

        ThirdTicketPriceVo dot = new ThirdTicketPriceVo();
        dot.setInventory_num(100);
        dot.setPrice_calendar_list(Arrays.asList(priceCalendarVo1));

        return Result.success(dot);
    }


    /**
     * 订单创建
     */
    @PostMapping("/order/create")
    public Result<Map<String,Object>> create(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "订单创建");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        //签名校验
        checkParam();

        ThirdQrCodeVo.QrcodeInfo qrcodeInfo=new ThirdQrCodeVo.QrcodeInfo();
        qrcodeInfo.setSub_order_no("");
        qrcodeInfo.setQrcode_content("3333333333");

        ThirdQrCodeVo qrCodeVo=new ThirdQrCodeVo();
        qrCodeVo.setExpires_in(-1);
        qrCodeVo.setQrcode_type(1);
        qrCodeVo.setQrcode_info_list(Arrays.asList(qrcodeInfo));
        qrCodeVo.setMemo("Memo");

        Map<String,Object> resMap=new HashMap<>();
        resMap.put("order_no","123456");
        resMap.put("partner_order_no","p1231");
        resMap.put("qrcode",qrCodeVo);

        return Result.success(resMap);
    }


    /**
     * 取消订单
     */
    @PostMapping("/order/cancel")
    public Result<?> cancel(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "取消订单");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        //签名校验
        checkParam();
        Map<String, Object> partnerResMap = new HashMap<>();
        partnerResMap.put("cancel_flag", true);
        return Result.success(partnerResMap);
    }


    /**
     * 支付
     */
    @PostMapping("/order/pay")
    public Result<?> pay(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "支付");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
//签名校验
        checkParam();
        Map<String, Object> partnerResMap = new HashMap<>();
        //1. 同步 2.异步
        partnerResMap.put("drawer_flag", true);
        return Result.success(partnerResMap);
    }

    /**
     * 获取二维码
     */
    @PostMapping("/order/qrCode")
    public Result<?> qrCode(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "获取二维码");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        //签名校验
        checkParam();
        ThirdQrCodeVo.QrcodeInfo qrcodeInfo=new ThirdQrCodeVo.QrcodeInfo();
        qrcodeInfo.setSub_order_no("");
        qrcodeInfo.setQrcode_content("3333333333");

        ThirdQrCodeVo qrCodeVo=new ThirdQrCodeVo();
        qrCodeVo.setExpires_in(-1);
        qrCodeVo.setQrcode_type(1);
        qrCodeVo.setQrcode_info_list(Arrays.asList(qrcodeInfo));
        qrCodeVo.setMemo("Memo");
        return Result.success(qrCodeVo);
    }


    /**
     * 退票
     *
     * @param commonDTO
     * @return
     */
    @PostMapping("/order/refund")
    public Result<Map<String, Integer>> refund(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "退票");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        //签名校验
        checkParam();
        Map<String, Integer> partnerResMap = new HashMap<>();
        // 退票结果  1.退票成功   2.等待退票审核（需要审核后通知腾云）  注：暂不支持审核退票
        partnerResMap.put("refund_result", 1);
        // 退款金额
        partnerResMap.put("refund_money", 1);
        //手续费金额
        partnerResMap.put("fee", 1);
        return Result.success(partnerResMap);
    }

    private void checkParam() {
        String partnerId = request.getHeader("partner_id");
        if(!supplierCode.equals(partnerId)){
            throw new RuntimeException("partner_id 错误");
        }
        //校验access_token
        String appId = request.getParameter("app_id");
        String accessToken = request.getParameter("access_token");
//        boolean tokenValid = appId != null && accessToken != null && ;
//        if (!tokenValid) {
//            throw new RuntimeException("access_token 校验失败");
//        }
        //签名校验
        boolean signValid = this.validataSign();
        if (!signValid) {
            throw new RuntimeException("签名校验失败");
        }
    }

    private Boolean validataSign() {
        String headerDate = request.getHeader("date");
        String headerPartnerId = request.getHeader("partner_id");
        String headerSignature = request.getHeader("signature");
        if (StringUtils.isEmpty(headerSignature)) {
            return false;
        }
        String postMethod = request.getMethod();
        String localSign = BasicAuthorizationUtils.generateAuthSignature(headerDate, postMethod, appId, appKey);
        return localSign.equals(headerSignature);
    }
}
