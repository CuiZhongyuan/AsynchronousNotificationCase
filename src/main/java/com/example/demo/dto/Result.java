package com.example.demo.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@JsonInclude(Include.NON_NULL)
public class Result<T> {
    public Result(T data) {
        this.data = data;
        this.errorcode = 0;
        this.msg = "success";
        this.ret = 0;
    }

    public Result() {
        this(null);
    }

    public T data;
    private Integer errorcode;
    private String msg;
    private Integer ret;

    public static <Ts> Result<Ts> success(Ts data) {
        return new Result<>(data);
    }

    public static Result<Void> success() {
        return new Result<>(null);
    }

    /**
     * 自定义错误码,错误码不能为0
     */
    public static Result<Void> fail(int errorcode, String msg) {
        if (errorcode == 0) {
            throw new IllegalArgumentException("errorcode can't be 0");
        }
        Result<Void> result = new Result<>();
        result.setErrorcode(errorcode);
        result.setMsg(msg);
        result.setRet(1);
        return result;
    }

    /**
     * 默认返回500错误码
     */
    public static Result<Void> fail(String msg) {
        return fail(500, msg);
    }

    public boolean resultIsError() {
        if (this.errorcode == null || this.ret == null) {
            return true;
        }
        return this.errorcode != 0 || this.ret != 0;
    }


}
