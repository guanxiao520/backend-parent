package com.mooc.backendutils.common.vo;

import com.mooc.backendutils.exception.CommonServiceException;
import lombok.Data;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.backendutils.common.vo
 * @date 2021/5/25 2:52
 */

@Data
public class BaseResponseVO<M> {

 /*   public String run(String message) {
        return "baseResponseVO: " + message;
    }*/

    /**
     * 业务编号
     */
    private Integer code;
    /**
     * 异常信息
     */
    private String message;
    /**
     * 业务数据返回
     */
    private M data;


    // 成功但是无参数
    public static BaseResponseVO success(){
        BaseResponseVO response = new BaseResponseVO();
        response.setCode(200);
        response.setMessage("");
        return response;
    }

    // 成功有参数
    public static<M> BaseResponseVO success(M data){
        BaseResponseVO response = new BaseResponseVO();
        response.setCode(200);
        response.setMessage("");
        response.setData(data);
        return response;
    }

    // 未登录异常
    public static<M> BaseResponseVO noLogin(){
        BaseResponseVO response = new BaseResponseVO();
        response.setCode(401);
        response.setMessage("请登录");
        return response;
    }

    // 出现业务异常
    public static<M> BaseResponseVO serviceException(CommonServiceException e){
        BaseResponseVO response = new BaseResponseVO();
        response.setCode(e.getCode());
        response.setMessage(e.getMessage());
        return response;
    }
}