package com.example.demo.ty.thirdsupplierv1.vo;

/**
 * @program: platform
 * @description: 供应商实体类(VO)
 * @author: LiWu
 * @create: 2018-11-02 19:41
 **/
public class SupplierVo {
    /**
     * 供应商编码 ,唯一
     */
    private String supplierCode;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 供应商地址
     */
    private String supplierAddress;
    /**
     * 联系人姓名
     */
    private String linkerName;
    /**
     * 客服电话
     */
    private String phone;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 开户行信息
     */
    private String bankName;
    /**
     * 供应商简介
     */
    private String simpleInfo;

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getLinkerName() {
        return linkerName;
    }

    public void setLinkerName(String linkerName) {
        this.linkerName = linkerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSimpleInfo() {
        return simpleInfo;
    }

    public void setSimpleInfo(String simpleInfo) {
        this.simpleInfo = simpleInfo;
    }
}
