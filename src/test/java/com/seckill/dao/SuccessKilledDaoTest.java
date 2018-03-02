package com.seckill.dao;

import com.seckill.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 配置spring和Junit整合，Junit启动时加载IOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉Junit，spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() {
        int insertCount = this.successKilledDao.insertSuccessKilled(1000L,13678987654L);
        System.out.println(insertCount);
    }

    @Test
    public void queryByIdWithSecKill() {
        SuccessKilled successKilled = this.successKilledDao.queryByIdWithSecKill(1000L,13678987654L);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }
}