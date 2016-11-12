package ua.laposhko.part3.externalvalues;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.laposhko.common.SimpleBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = InjectingExternalValuesConfig.class)
public class InjectingExternalValuesConfigTest {

    @Autowired
    private SimpleBean simpleBean;

    @Test
    public void testConfiguredCorrectly() throws Exception {
        Assert.assertEquals("String", simpleBean.getStringProperty());
        Assert.assertEquals(12, simpleBean.getIntProperty());
    }
}