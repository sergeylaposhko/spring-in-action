package ua.laposhko.part3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SeveralImplementationsConfig.class)
public class SeveralImplementationsConfigTest {

    @Autowired
    private ContainingBean containingBean;

    @Test
    public void testNotNull() throws Exception {
        Assert.assertNotNull(containingBean);
    }

    @Test
    public void testInjectPrimary() throws Exception {
        Assert.assertTrue(containingBean.getPrimaryBean() instanceof PrimaryBean);
    }

    @Test
    public void testInjectSecondary() throws Exception {
        Assert.assertTrue(containingBean.getSecondaryBean() instanceof SecondaryBean);
    }

    @Test
    public void testInjectSecondaryCustomQualifier() throws Exception {
        Assert.assertTrue(containingBean.getSecondaryBeanCustomQualifier() instanceof SecondaryBean);
    }

    @Test
    public void testInjectAdvancedBean() throws Exception {
        Assert.assertTrue(containingBean.getAdvancedBean() instanceof ExtraBean);
    }

}