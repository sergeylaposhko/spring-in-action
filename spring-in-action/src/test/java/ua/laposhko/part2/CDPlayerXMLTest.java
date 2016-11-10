package ua.laposhko.part2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerXMLTest {

    @Autowired
    @Qualifier("playerFromXml")
    private CDPlayer playerFromXml;

    @Test
    public void testXmlConfigNotNull() throws Exception {
        assertNotNull(playerFromXml);
        assertNotNull(playerFromXml.getCompactDisk());
        assertTrue(playerFromXml.getCompactDisk() instanceof XMLCompactDisk);
        XMLCompactDisk compactDisk = (XMLCompactDisk) playerFromXml.getCompactDisk();
        assertTrue(compactDisk.getName().equals("diskFromXml"));
    }
}