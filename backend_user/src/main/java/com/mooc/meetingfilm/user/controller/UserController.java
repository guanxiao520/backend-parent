package com.mooc.meetingfilm.user.controller;

import com.mooc.backendutils.common.vo.BaseResponseVO;
import com.mooc.backendutils.exception.CommonServiceException;
import com.mooc.meetingfilm.user.controller.vo.LoginReqVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.user.controller
 * @date 2021/5/25 21:23
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponseVO login(@RequestBody LoginReqVO reqVO) throws CommonServiceException {

        //数据验证
        reqVO.checkParam();

        Map<String, String> result = new HashMap<>();
        result.put("randomKey", "");
        result.put("token", "");

        return BaseResponseVO.success(result);
    }
}