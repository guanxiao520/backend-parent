package com.mooc.meetingfilm.user.controller.vo;

import com.mooc.backendutils.common.vo.BaseRequestVO;
import com.mooc.backendutils.exception.CommonServiceException;
import com.mooc.backendutils.util.ToolUtils;
import lombok.Data;

/**
 * 登录请求对象
 *
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.user.controller.vo
 * @date 2021/5/25 21:26
 */
@Data
public class LoginReqVO extends BaseRequestVO {

    private String username;
    private String password;

    @Override
    public void checkParam() throws CommonServiceException {
        //TODO 验证数据合法性
        if (ToolUtils.strIsNull(username) || ToolUtils.strIsNull(password)) {
            throw new CommonServiceException(404, "username or password is null");
        }else{

        }
    }
}