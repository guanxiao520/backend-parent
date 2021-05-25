package com.mooc.backendutils.exception;

import com.mooc.backendutils.common.vo.BaseResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.backendutils.exception
 * @date 2021/5/25 22:07
 */
@Slf4j
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(CommonServiceException.class)
    @ResponseBody
    public BaseResponseVO baseExceptionHandler(HttpServletRequest request, CommonServiceException e) {
        log.error("CommonServiceException,code:{},message:{}", e.getCode(), e.getMessage());
        return BaseResponseVO.serviceException(e);
    }
}