package com.ppdtbb.common.tools.redis;

import redis.clients.jedis.JedisPubSub;

/**
 * @Author wanggang
 * @Date 2021/4/1 0001
 */
public class RedisPubSub extends JedisPubSub {

    public Boolean run = true;

    @Override
    public void unsubscribe() {
        this.run = false;
        super.unsubscribe();
    }

}
