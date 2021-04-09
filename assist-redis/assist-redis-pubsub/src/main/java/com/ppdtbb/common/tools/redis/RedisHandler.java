package com.ppdtbb.common.tools.redis;

import redis.clients.jedis.Jedis;

/**
 * @Author wanggang
 * @Date 2021/4/2 0002
 */
public class RedisHandler {

    public Thread psubscribe(final RedisPubSub xxxPubSub, final String... patterns) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Jedis jedis = null;
            }
        });
        return thread;
    }

}
