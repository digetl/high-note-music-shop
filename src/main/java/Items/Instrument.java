package Items;

import Behaviours.IPlay;

public class Instrument extends Item implements IPlay {


    public Instrument(String name) {
        super(name);
    }

    public String playSound(String sound) {
        return sound;
    }


}
