package Items.Instruments.Percussion;

import Items.Instrument;

public class Percussion extends Instrument {


    private PercussionInst percussionInst;


    public Percussion(String name, Double wholesalePrice, Double rrpPrice, PercussionInst percussionInst) {
        super(name, wholesalePrice, rrpPrice);

        this.percussionInst = percussionInst;
    }



    public PercussionInst getPercussionInst() {
        return percussionInst;
    }

    public void setPercussionInst(PercussionInst percussionInst) {
        this.percussionInst = percussionInst;
    }
}
