package com.example.demo.ty.thirdsupplierv1.vo;


/**
 * <p> Description: 第三方门票信息entity</p>
 *
 * @package com.uticket.api.supplier.dto
 * @Author yangsongsong on 2018/11/1 0001 上午 10:52
 * @return
 */
public class ThirdSupplierTicketVo {
    /**
     * 操作方式
     * REQ_ADD:添加
     * REQ_UPDATE:更新
     */
    private String opearateService;

    /**
     * 门票ID
     */
    private String ticketId;

    /**
     * 门票编码
     */
    private String ticketCode;

    /**
     * 第三方供应商门票编码
     */
    private String sticketCode;

    /**
     * 票名称
     */
    private String ticketName;

    /**
     * 门票分类
     * 1-普通票
     * 2-长期票
     * 3-年卡
     * 9-身份证免费
     */
    private Integer ticketClassification;

    /**
     * 门票有效开始时间
     */
    private String startTime;

    /**
     * 门票有效结束时间
     */
    private String endTime;

    /**
     * 票面价格
     */
    private double ticketPrice;

    /**
     * 备注
     */
    private String memo;

    public String getOpearateService() {
        return opearateService;
    }

    public void setOpearateService(String opearateService) {
        this.opearateService = opearateService;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public Integer getTicketClassification() {
        return ticketClassification;
    }

    public void setTicketClassification(Integer ticketClassification) {
        this.ticketClassification = ticketClassification;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getSticketCode() {
        return sticketCode;
    }

    public void setSticketCode(String sticketCode) {
        this.sticketCode = sticketCode;
    }
}
