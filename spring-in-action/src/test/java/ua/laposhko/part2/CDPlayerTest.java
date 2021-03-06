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
public class CDPlayerTest {

    @Autowired
    @Qualifier("simpleCompactDisk")
    private CompactDisk compactDisk;

    @Autowired
    @Qualifier("CDPlayer")
    private CDPlayer cdPlayer;

    @Autowired
    @Qualifier("anotherCDPlayer")
    private CDPlayer anotherCDPlayer;

    @Autowired
    @Qualifier("playerFromXml")
    private CDPlayer playerFromXml;

    @Test
    public void testNotNull() {
        assertNotNull(compactDisk);
    }

    @Test
    public void testNotEmpty() {
        assertTrue(cdPlayer.getCompactDisk() != null);
    }

    @Test
    public void testNotNullAnotherPlayer() throws Exception {
        assertNotNull(anotherCDPlayer);
    }

    @Test
    public void testXmlConfigNotNull() throws Exception {
        assertNotNull(playerFromXml);
        assertNotNull(playerFromXml.getCompactDisk());
    }
}