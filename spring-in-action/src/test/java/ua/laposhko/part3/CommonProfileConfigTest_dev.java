package ua.laposhko.part3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.laposhko.common.SimpleBean;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CommonProfileConfig.class)
@ActiveProfiles("dev")
public class CommonProfileConfigTest_dev {

    @Autowired
    private SimpleBean simpleBean;

    @Test
    public void testProdBeanIsConfigured() throws Exception {
        assertEquals("commonDevProfile", simpleBean.getStringProperty());
    }

}