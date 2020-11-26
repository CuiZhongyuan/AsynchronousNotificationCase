package com.example.demo.ty.thirdsupplierv2.thirdsupplierdtov2;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/**
 * 腾云请求第三方供应商票列表接口dto
 */
@Setter
@Getter
@Accessors(chain = true)
public class ReqThirdTicketDTO {

    /**
     * 当前页数(从1开始取值)，
     * 当method=page 时必传
     */
    @JsonProperty("current_page")
    private Integer currentPage;
    /**
     * 每页记录数
     * (如果不传或者为空，默认为20),
     * 当method=page 时必传
     */
    @JsonProperty("page_size")
    private Integer pageSize;
    /**
     * method=page表示分页查询。method=multi表示批量查询
     */
    @NotBlank(message = "method can not be blank")
    private String method;

}
