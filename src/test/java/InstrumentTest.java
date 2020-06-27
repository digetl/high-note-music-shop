import Items.Instrument;
import Items.Instruments.Percussion.Percussion;
import Items.Instruments.Percussion.PercussionInst;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    private Instrument instrument1;
//    private PercussionInst snaredrum1;

    @Before
    public void before() {
         instrument1 = new Instrument();
    }


    @Test
    public void canPlaySound(){
        assertEquals("Toot", instrument1.playSound("Toot"));
    }



}
