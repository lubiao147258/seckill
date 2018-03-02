package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SeckillDao {

    /**
     * 减库存，
     * @param seckillId  商品ID
     * @param killTime  秒杀时间
     * @return 如果影响行数>1，表示更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId ,@Param("killTime") Date killTime);

    /**
     * 根据ID查询秒杀对象
     * @param seckillId  商品ID
     * @return  查询的商品对象
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return  商品列表
     */
    List<Seckill> queryAll(@Param("offset") int offset , @Param("limit")  int limit);
}
