package org.seckill.exeception;

/**
 * 秒杀相关的所有业务异常
 * Created by wunaifu on 2017/8/4.
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}