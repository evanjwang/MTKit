public interface Instrument {
    Pitch transposeToConcert(Pitch written, Pitch instrumentKey);
    Pitch transposeFromConcert(Pitch concert, Pitch instrumentKey);
}
