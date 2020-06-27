package Items;

import Behaviours.IPlay;

public class Instrument extends Item implements IPlay {


    public Instrument(String name, Double wholesalePrice, Double rrpPrice) {
        super(name, wholesalePrice, rrpPrice);
    }

    public String playSound(String sound) {
        return sound;
    }


}
