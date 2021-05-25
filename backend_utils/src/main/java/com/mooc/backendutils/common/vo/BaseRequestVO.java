package com.mooc.backendutils.common.vo;

import com.mooc.backendutils.exception.CommonServiceException;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.backendutils.common.vo
 * @date 2021/5/25 21:31
 */
public abstract class BaseRequestVO {

    /**
     * 公共的参数验证方法,并可能返回公共的错误异常
     */
    public abstract void checkParam() throws CommonServiceException;
}