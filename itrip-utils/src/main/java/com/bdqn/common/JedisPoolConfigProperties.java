package com.bdqn.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPoolConfig;


/**
 * @ClassName: cn.itrip.common.JedisPoolConfigProperties
 * @Description: JedisPool配置类
 * @Author:      Administrator
 * @CreateDate: 2019/7/29 0029 下午 9:37
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
@Configuration
@ConfigurationProperties(prefix = "spring.redis.jedis.pool")
public class JedisPoolConfigProperties {

    private int maxActive;
    private int maxIdle;
    private int maxWait;

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    @Bean
    public JedisPoolConfig jedisPoolConfig(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxTotal(maxActive);
        jedisPoolConfig.setMaxWaitMillis(maxWait);
        jedisPoolConfig.setTestOnBorrow(true);
        return jedisPoolConfig;
    }
}
