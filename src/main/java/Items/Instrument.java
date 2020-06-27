package Items;

import Behaviours.IPlay;

public class Instrument extends Item implements IPlay {

    public String playSound(String sound) {
        return sound;
    }
}
