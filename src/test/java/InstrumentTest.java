import Items.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    private Instrument instrument1;

//    @Before
//    public void before() {
//         instrument1 = new Instrument();
//    }


    @Test
    public void canPlaySound(){
        assertEquals("Toot", instrument1.playSound("Toot"));
    }



}
