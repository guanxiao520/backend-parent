package com.mooc.backendutils.exception;

import lombok.Data;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.backendutils.exception
 * @date 2021/5/25 21:35
 */

@Data
public class CommonServiceException extends Exception {
    /**
     * 统一错误码
     */
    private Integer code;
    /**
     * 统一返回信息
     */
    private String message;

    public CommonServiceException(int code, String message) {
        this.code = code;
        this.message = message;
    }
}