public class FrenchHorn implements Instrument {
    private Pitch key;

    public FrenchHorn(Pitch key) {
        this.key = key;
    }

    @Override
    public Pitch transposeFromConcert() {
        return null;
    }

    @Override
    public Pitch transposeToConcert() {
        return null;
    }
}
