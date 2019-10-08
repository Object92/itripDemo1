package com.bdqn.config;

import com.bdqn.ItripbizApplication;
import com.bdqn.biz.config.TestConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ItripbizApplication.class})
public class TestConfigTest {
    TestConfig config = new TestConfig();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAge() {
        System.out.println(config.getAge());
    }

    @Test
    public void setAge() {
    }

    @Test
    public void getName() {
        System.out.println(config.getName());

    }

    @Test
    public void setName() {
    }
}