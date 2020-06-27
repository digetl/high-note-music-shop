package Items.Instruments.Percussion;

import Items.Instrument;

public class Percussion extends Instrument {


    private PercussionInst percussionInst;


    public Percussion(String name, PercussionInst percussionInst) {
        super(name);

        this.percussionInst = percussionInst;
    }



    public PercussionInst getPercussionInst() {
        return percussionInst;
    }

    public void setPercussionInst(PercussionInst percussionInst) {
        this.percussionInst = percussionInst;
    }
}
