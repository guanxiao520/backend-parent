package com.mooc.backendutils.common.vo;

import com.mooc.backendutils.exception.CommonServiceException;
import lombok.Data;

/**
 * 分页请求类
 *
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.backendutils.common.vo
 * @date 2021/5/29 1:48
 */

@Data
public class BasePageVO extends BaseRequestVO {
    private Integer nowPage = 1;
    private Integer pageSize = 10;

    @Override
    public void checkParam() throws CommonServiceException {
       if(nowPage==null||pageSize==null){

       }
    }

}