package Items.Instruments.Percussion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {

    private Percussion snaredrum;

    @Before
    public void setUp() {
        snaredrum = new Percussion("Ludwig bad boy", 80.00, 160.00, PercussionInst.SNAREDRUM2);
    }

    @Test
    public void getName() {
        assertEquals("Ludwig bad boy", snaredrum.getName());
    }

    @Test
    public void setName() {
        snaredrum.setName("Ludwig bad boy2");
        assertEquals("Ludwig bad boy2", snaredrum.getName());
    }

    @Test
    public void getPercussionInst() {
        assertEquals(PercussionInst.SNAREDRUM2, snaredrum.getPercussionInst());
    }

    @Test
    public void canPlaySound() {
        assertEquals("Boom", snaredrum.playSound("Boom"));
    }

}