package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UseNoticeDTO {
    @NotBlank(message="orderNo is not blank")
    private String orderNo;
    @NotBlank(message="subOrderNo is not blank")
    private String subOrderNo;


}
