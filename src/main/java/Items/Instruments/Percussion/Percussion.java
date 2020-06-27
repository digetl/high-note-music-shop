package Items.Instruments.Percussion;

public class Percussion {

    private String name;
    private PercussionInst percussionInst;

    public Percussion(String name, PercussionInst percussionInst) {
        this.name = name;
        this.percussionInst = percussionInst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PercussionInst getPercussionInst() {
        return percussionInst;
    }

    public void setPercussionInst(PercussionInst percussionInst) {
        this.percussionInst = percussionInst;
    }
}
