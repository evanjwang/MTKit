public class Clarinet implements Instrument {
    private Pitch key;

    public Clarinet(Pitch key) {
        this.key = key;
    }

    @Override
    public Pitch transposeFromConcert(Pitch concert, Pitch instrumentKey) {
        return ((Pitch.C.getPitchVal() - instrumentKey.getPitchVal()));
    }

    @Override
    public Pitch transposeToConcert(Pitch written, Pitch instrumentKey) {
        return null;
    }
}
