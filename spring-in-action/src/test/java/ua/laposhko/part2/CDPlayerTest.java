package ua.laposhko.part2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisk compactDisk;

    @Autowired
    private CDPlayer cdPlayer;


    @Test
    public void testNotNull() {
        assertNotNull(compactDisk);
    }

    @Test
    public void testNotEmpty() {
        assertTrue(cdPlayer.getCompactDisk() != null);
    }

}