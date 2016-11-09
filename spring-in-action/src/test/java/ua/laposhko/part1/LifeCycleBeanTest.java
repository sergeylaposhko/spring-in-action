package ua.laposhko.part1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Part1Config.class)
public class LifeCycleBeanTest {

    @Autowired
    private LifeCycleBean lifeCycleBean;

    @Test
    public void notNull() throws Exception {
        assertNotNull(lifeCycleBean);
    }
}