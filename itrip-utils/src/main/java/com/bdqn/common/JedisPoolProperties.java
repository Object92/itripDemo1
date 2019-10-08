package com.bdqn.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.Resource;

/**
 * @ClassName: cn.itrip.common.JedisPoolConfigProperties
 * @Description: JedisPool配置类
 * @Author: Administrator
 * @CreateDate: 2019/7/29 0029 下午 9:37
 * @UpdateUser: Administrator
 * @Version: 1.0
 **/
@Configuration
@ConfigurationProperties(prefix = "spring.redis")
public class JedisPoolProperties {

    private String host;
    private int port;
    private String password;
    private int database;
    private int timeout;

    @Resource
    private JedisPoolConfig jedisPoolConfig;

    public String getHost() {
        return host;
    }


    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDatabase() {
        return database;
    }

    public void setDatabase(int database) {
        this.database = database;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Bean
    public JedisPool jedisPool() {
        return new JedisPool(jedisPoolConfig, host, port, timeout, password);
    }
}
