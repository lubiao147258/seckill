package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.execption.RepeatKillException;
import com.seckill.execption.SeckillCloseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
//告诉Junit，spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class SeckillServiceTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;

    @Test
    public void getSeckillList() {
        List<Seckill> list = seckillService.getSeckillList();
        logger.info("list={}",list);
    }

    @Test
    public void getById() {
        Seckill seckill = seckillService.getById(1000);
        logger.info("seckill={}",seckill);
    }

    @Test
    public void exportSeckillUrl() {
        long id = 1000;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        logger.info("exposer1234567={}",exposer);
    }

    @Test
    public void executeSeckill() {
        long id = 1000L;
        long phone = 13567898065L;
        String md5 = "dd718b51b56251c2a7fd8de24cd7f352";
        SeckillExecution seckillExecution = seckillService.executeSeckill(id,phone,md5);
        logger.info("result123456789={}",seckillExecution);
    }

    @Test
    //完整逻辑代码测试，注意可重复执行
    public void testSeckillLogic() {
        long seckillId=1002L;
        Exposer exposer=seckillService.exportSeckillUrl(seckillId);
        if (exposer.isExposed())
        {
            long userPhone=13476199876L;
            String md5=exposer.getMd5();
            try {
                SeckillExecution seckillExecution = seckillService.executeSeckill(seckillId, userPhone, md5);
                logger.info("result123456789={}",seckillExecution);
            }catch (RepeatKillException e){
                logger.error(e.getMessage());
            }catch (SeckillCloseException e1){
                logger.error(e1.getMessage());
            }
        }else {
            //秒杀未开启
            logger.warn("exposer1234567={}",exposer);
        }
    }
}