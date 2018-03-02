package com.seckill.execption;

/**
 * 重复执行秒杀操作异常（运行期异常）
 */
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }


}
