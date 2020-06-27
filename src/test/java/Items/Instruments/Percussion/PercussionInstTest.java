package Items.Instruments.Percussion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PercussionInstTest {

    private Percussion snaredrum;

    @Before
    public void setUp() {
        snaredrum = new Percussion("LudwigBasic", PercussionInst.SNAREDRUM1);
    }


    @Test
    public void getBrand() {
        assertEquals("LudwigBasic",snaredrum.getName());
    }

    @Test
    public void getWidth() {
        assertEquals(14, snaredrum.getPercussionInst().getWidth());
    }

    @Test
    public void getHeight() {
        assertEquals(7, snaredrum.getPercussionInst().getHeight());
    }

    @Test
    public void getDescription() {
        assertEquals("Basic Snare", snaredrum.getPercussionInst().getDescription());
    }

    @Test
    public void getWholesalePrice() {
    }

    @Test
    public void getRrpPrice() {
    }

    @Test
    public void values() {
    }

    @Test
    public void valueOf() {
    }
}