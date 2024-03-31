package com.learning.jenkins.api;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
public class SpringJenkinsApplicationTest {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTest.class);

    @Test
    public void contextLoads(){
        assertEquals(true, true);
    }
}
