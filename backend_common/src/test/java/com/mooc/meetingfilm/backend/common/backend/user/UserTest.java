package com.mooc.meetingfilm.backend.common.backend.user;

import com.mooc.meetingfilm.backend.common.BackendCommonApplicationTests;
import com.mooc.meetingfilm.backend.common.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.backend.common.dao.mapper.MoocBackendUserTMapper;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.backend.common.backend.user
 * @date 2021/5/25 0:53
 */
public class UserTest extends BackendCommonApplicationTests {

    @Resource
    private MoocBackendUserTMapper backendUserTMapper;

    @Test
    public void add() {
        MoocBackendUserT user = new MoocBackendUserT();
        user.setUserName("admin");
        user.setUserPwd("admin");
        user.setUserPhone("12312312312");
        backendUserTMapper.insert(user);
    }

    @Test
    public void delete() {
        backendUserTMapper.deleteById(2);
    }

    @Test
    public void update() {
        MoocBackendUserT moocBackendUserT = new MoocBackendUserT();
        moocBackendUserT.setUuid(2);
        moocBackendUserT.setUserName("admin");
        moocBackendUserT.setUserPwd("caryguan");
        moocBackendUserT.setUserPhone("11111111111");
        backendUserTMapper.updateById(moocBackendUserT);

    }

    @Test
    public void select() {
        MoocBackendUserT moocBackendUserT = backendUserTMapper.selectById(2);
        System.out.println(moocBackendUserT);

        System.out.println("===========================");
        //查询列表
        List<MoocBackendUserT> moocBackendUserTS = backendUserTMapper.selectList(null);
        //java8 流式API
        moocBackendUserTS.stream().forEach(
                System.out::println
        );
    }
}