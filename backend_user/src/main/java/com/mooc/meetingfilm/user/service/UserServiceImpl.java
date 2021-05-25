package com.mooc.meetingfilm.user.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mooc.backendutils.exception.CommonServiceException;
import com.mooc.backendutils.util.MD5Util;
import com.mooc.meetingfilm.user.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.user.dao.mapper.MoocBackendUserTMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.user.service
 * @date 2021/5/25 22:37
 */
public class UserServiceImpl implements UserServiceAPI {

    @Resource
    private MoocBackendUserTMapper userTMapper;

    @Override
    public String checkUserLogin(String username, String password) throws CommonServiceException {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_name", username);
        List<MoocBackendUserT> list = userTMapper.selectList(queryWrapper);
        MoocBackendUserT user = null;
        if (list != null && list.size() > 0) {
            user = list.stream().findFirst().get();
        } else {
            throw new CommonServiceException(404, "用户名输入有误");
        }

        String encrypt = MD5Util.encrypt(password);
        if (!encrypt.equals(user.getUserPwd())) {
            throw new CommonServiceException(500, "用户密码有误!");
        } else {
            return user.getUuid()+"";
        }
    }
}