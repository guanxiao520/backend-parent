package com.mooc.meetingfilm.user.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mooc.backendutils.util.MD5Util;
import com.mooc.meetingfilm.user.BackendUserApplicationTests;
import com.mooc.meetingfilm.user.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.user.dao.mapper.MoocBackendUserTMapper;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.mooc.meetingfilm.backend.common.backend.user
 * @date 2021/5/25 0:53
 */
public class UserTest extends BackendUserApplicationTests {

    @Resource
    private MoocBackendUserTMapper backendUser;

    @Test
    public void add() {
        MoocBackendUserT user = new MoocBackendUserT();
        user.setUserName("admin");
        user.setUserPwd(MD5Util.encrypt("admin123"));
        user.setUserPhone("18588888888");
        backendUser.insert(user);
    }

    @Test
    public void delete() {
        backendUser.deleteById(2);
    }

    @Test
    public void update() {
        MoocBackendUserT moocBackendUserT = new MoocBackendUserT();
        moocBackendUserT.setUuid(2);
        moocBackendUserT.setUserName("admin");
        moocBackendUserT.setUserPwd("caryguan");
        moocBackendUserT.setUserPhone("11111111111");
        backendUser.updateById(moocBackendUserT);

    }

    @Test
    public void select() {
        // MoocBackendUserT moocBackendUserT = backendUserTMapper.selectById(2);
        // System.out.println(moocBackendUserT);
        //
        // System.out.println("===========================");
        // //查询列表
        // List<MoocBackendUserT> moocBackendUserTS = backendUserTMapper.selectList(null);
        // //java8 流式API
        // moocBackendUserTS.stream().forEach(
        //         System.out::println
        // );

        System.out.println("===========================");
        QueryWrapper queryWrapper = new QueryWrapper();
        //注意这里的user_name不是属性名,是数据库字段,这是mp作为一个orm框架不完善的地方
        queryWrapper.eq("user_name", "admin4");
        List<MoocBackendUserT> moocBackendUserTS1 = backendUser.selectList(queryWrapper);
        //java8 流式API
        moocBackendUserTS1.stream().forEach(
                System.out::println
        );
    }

    @Test
    public void selectPage() {
        //当前页数1,十条
        Page<MoocBackendUserT> objectPage = new Page<>(1, 10);
        QueryWrapper queryWrapper = new QueryWrapper();
        //注意这里的user_name不是属性名,是数据库字段,这是mp作为一个orm框架不完善的地方
        queryWrapper.like("user_name", "admin");
        // List<MoocBackendUserT> moocBackendUserTS1 = backendUserTMapper.selectList(queryWrapper);
        IPage<MoocBackendUserT> moocBackendUserTIPage = backendUser.selectPage(objectPage, queryWrapper);
        //java8 流式API
        moocBackendUserTIPage.getRecords().stream().forEach(
                System.out::println
        );
    }

}