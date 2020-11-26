package com.example.demo.ty.thirdsupplierv2;

import com.example.demo.dto.Result;
import com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2.*;
import com.example.demo.util.JsonUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/ty-fsale-thirdSupplier")
public class ThirdSupplierV2Test {

    /**
     * 票列表接口
     *
     * @return
     */
    @PostMapping("/ticket/list")
    public Result<List<ThirdV2TicketDTO>> list(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "票列表接口");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        ThirdV2TicketDTO dot = new ThirdV2TicketDTO();
        dot.setProduct_id("a123");
        dot.setProduct_name("测试黄鹤楼");
        dot.setScenic_code(Arrays.asList("sceniccode"));
        dot.setSecnic_name(Arrays.asList("setSecnic_name"));
        dot.setBegin_date("2020-01-01 00:00:00");
        dot.setEnd_date("2021-01-01 00:00:00");
        dot.setInventory_num(1000);
        dot.setMax_num(10);
        dot.setMin_num(1);
        dot.setSettle_price(1);
        dot.setMax_advance_days(30);
        dot.setMin_advance_days(0);
        dot.setAuto_cancle_Minutes(2);
        dot.setPlayer_per_type(1);
        dot.setIdcard_flag(1);
        dot.setOut_ticket_type(4);
        dot.setRefund_new_type(1);
        dot.setPeople_group(1);
        dot.setAdvance_booking_time("20:00:00");
        dot.setPeriod_flag(1);
        dot.setLimit_type("1,3");
        dot.setLimit_num(1);
        dot.setLimit_cycle(1);
        dot.setEffective_mode(0);
        dot.setEffective_num(2);
        dot.setEffective_date("2020-09-01&2020-12-12");
        dot.setEffective_day_week("1,3");
        dot.setDescription("产品描述");
        dot.setBook_content("预订须知");
        dot.setUse_time("使用时间");
        dot.setUse_address("使用地址");
        dot.setCost_contains("费用包含");
        dot.setReversion_explanation("退改说明");
        dot.setWarm_prompt("温馨提示");
        dot.setTicket_label(Arrays.asList("5A,河山"));
        dot.setProduct_type(1);

        List<ThirdV2TicketDTO> list = new ArrayList<>();
        list.add(dot);
        ThirdV2TicketDTO o2 = new ThirdV2TicketDTO();
        BeanUtils.copyProperties(dot, o2);
        o2.setProduct_id("A32");
        o2.setProduct_name("都江堰");
        return Result.success(Arrays.asList(dot, o2));
    }

    /**
     * 票详情
     *
     * @return
     */
    @PostMapping("/ticket/detail")
    public Result<ThirdV2TicketDTO> detail(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "票详情");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        ThirdV2TicketDTO dot = new ThirdV2TicketDTO();
        dot.setProduct_id("a123");
        dot.setProduct_name("测试黄鹤楼3");
        dot.setScenic_code(Arrays.asList("sceniccode"));
        dot.setSecnic_name(Arrays.asList("setSecnic_name"));
        dot.setBegin_date("2020-01-01 00:00:00");
        dot.setEnd_date("2021-01-01 00:00:00");
        dot.setInventory_num(1000);
        dot.setMax_num(10);
        dot.setMin_num(1);
        dot.setSettle_price(1);
        dot.setMax_advance_days(30);
        dot.setMin_advance_days(0);
        dot.setAuto_cancle_Minutes(2);
        dot.setPlayer_per_type(1);
        dot.setIdcard_flag(1);
        dot.setOut_ticket_type(4);
        dot.setRefund_new_type(1);
        dot.setPeople_group(1);
        dot.setAdvance_booking_time("20:00:00");
        dot.setPeriod_flag(1);
        dot.setLimit_type("1,3");
        dot.setLimit_num(1);
        dot.setLimit_cycle(1);
        dot.setEffective_mode(0);
        dot.setEffective_num(2);
        dot.setEffective_date("2020-12-01&2020-12-12");
        dot.setEffective_day_week("1,3");
        dot.setDescription("产品描述");
        dot.setBook_content("预订须知");
        dot.setUse_time("使用时间");
        dot.setUse_address("使用地址");
        dot.setCost_contains("费用包含");
        dot.setReversion_explanation("退改说明");
        dot.setWarm_prompt("温馨提示");
        dot.setTicket_label(Arrays.asList("5A,河山"));
        dot.setProduct_type(1);

        return Result.success(dot);
    }

    /**
     * 价格日历
     *
     * @return
     */
    @PostMapping("/ticket/priceCalendar")
    public Result<ThirdV2TicketPriceDTO> priceCalendar(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "价格日历");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        ThirdV2TicketPriceDTO dot = new ThirdV2TicketPriceDTO();
        dot.setInventory_num(100);
        ThirdV2TicketPriceDTO.ThirdPriceCalendar calendar = new ThirdV2TicketPriceDTO.ThirdPriceCalendar();
        calendar.setPrice_date("2020-10-09");
        calendar.setSettle_price(1);
        calendar.setDaily_stock(-1);

        dot.setPrice_calendar_list(Arrays.asList(calendar));

        return Result.success(dot);
    }


    /**
     * 时段
     *
     * @return
     */
    @PostMapping("/ticket/periodList")
    public Result<ThirdV2TicketPeriodListDTO> periodList(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "时段");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));

        ThirdV2TicketPeriodDTO.Period period = new ThirdV2TicketPeriodDTO.Period();
        period.setPeriodId("123456-id");
        period.setPeriodCaption("w");
        period.setPeriodStock(10);
        period.setBeginTime("10:00");
        period.setEndTime("12:00");
        ThirdV2TicketPeriodDTO.Period period2 = new ThirdV2TicketPeriodDTO.Period();
        period2.setPeriodId("1234562-id");
        period2.setPeriodCaption("w2");
        period2.setPeriodStock(10);
        period2.setBeginTime("11:00");
        period2.setEndTime("13:00");
        ThirdV2TicketPeriodDTO.Period backperiod = new ThirdV2TicketPeriodDTO.Period();
        backperiod.setPeriodId("456789-id");
        backperiod.setPeriodCaption("back");
        backperiod.setPeriodStock(10);
        backperiod.setBeginTime("14:00");
        backperiod.setEndTime("15:00");


        ThirdV2TicketPeriodDTO tikcetp = new ThirdV2TicketPeriodDTO();
        tikcetp.setProductId("A123");
        tikcetp.setProductName("测试黄鹤楼2");
        tikcetp.setPeriod_flag(1);
        tikcetp.setPeriods(Arrays.asList(period, period2));
        tikcetp.setBackPeriodFlag(1);
        tikcetp.setBackPeriods(Arrays.asList(backperiod));


        ThirdV2TicketPeriodListDTO dot = new ThirdV2TicketPeriodListDTO();
        dot.setTicketPeriods(Arrays.asList(tikcetp));


        return Result.success(dot);
    }

    /**
     * 订单创建
     */
    @PostMapping("/order/create")
    public Result<ThirdV2OrderCreateResDTO> create(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "订单创建");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));

        VoucherInfo.Voucher voucher = new VoucherInfo.Voucher();
        voucher.setVoucher("123456");
        voucher.setVoucherState(1);
        voucher.setVoucherCaption("第三方票-环企");


        VoucherInfo voucherInfo = new VoucherInfo();
        voucherInfo.setExpiresIn(-1);
        voucherInfo.setQrcodeType(1);
        voucherInfo.setVouchers(Arrays.asList(voucher));


        ThirdV2OrderCreateResDTO dto = new ThirdV2OrderCreateResDTO();
        dto.setOrderNo("123456");
        dto.setPartnerOrderNo("789456123");
        dto.setVoucherInfo(voucherInfo);
        return Result.success(dto);
    }


    /**
     * 取消订单
     */
    @PostMapping("/order/cancel")
    public Result<?> cancel(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "取消订单");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
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

        VoucherInfo.Voucher voucher = new VoucherInfo.Voucher();
        voucher.setVoucher("123456");
        voucher.setVoucherState(1);
        voucher.setVoucherCaption("第三方票-环企");


        VoucherInfo voucherInfo = new VoucherInfo();
        voucherInfo.setExpiresIn(-1);
        voucherInfo.setQrcodeType(1);
        voucherInfo.setVouchers(Arrays.asList(voucher));

        Map<String, Object> partnerResMap = new HashMap<>();
        //1. 同步 2.异步
        partnerResMap.put("async_flag", 1);
        //3. 出票成功 4.出票失败
        partnerResMap.put("issue_state", 4);
        partnerResMap.put("voucher_info", voucherInfo);
        return Result.success(partnerResMap);
    }

    /**
     * 获取二维码
     */
    @PostMapping("/order/qrCode")
    public Result<?> qrCode(@RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "获取二维码");
        System.out.println(JsonUtil.toJacksonStr(commonDTO));
        VoucherInfo.Voucher voucher = new VoucherInfo.Voucher();
        voucher.setVoucher("123456");
        voucher.setVoucherState(1);
        voucher.setVoucherCaption("第三方票-环企");


        VoucherInfo voucherInfo = new VoucherInfo();
        voucherInfo.setExpiresIn(-1);
        voucherInfo.setQrcodeType(1);
        voucherInfo.setVouchers(Arrays.asList(voucher));
        return Result.success(voucherInfo);
    }
//

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
        Map<String, Integer> partnerResMap = new HashMap<>();
        //1 同步
        //2 异步
        partnerResMap.put("async_flag", 2);
//        同步时必填 1.退票成功 2.退票中
        partnerResMap.put("refund_state", 2);
        return Result.success(partnerResMap);
    }


    /**
     * 短信重发
     *
     * @param commonDTO
     * @return
     */
    @PostMapping("/order/resend-sms")
    public Result<Void> resendSMS(@RequestParam("app_id")String appid, @RequestParam("access_token")String accessToken, @RequestBody ReqThirdCommonDTO commonDTO) {
        System.out.println(LocalDateTime.now() + "短信重发");
        System.out.println(String.format("app_id=%s\naccess_token=%s",appid,accessToken));
        System.out.println(JsonUtil.toJacksonStr(commonDTO));

        return Result.success();
    }
}
