/* MTKit: Note
Abstraction of a note
Created: 07/25/18
Modified: 07/25/18
Evan Wang   wang3407@purdue.edu
 */

public class Note {
    private Pitch pitch;
    private int octave;
    private String name;
    private String accidental;
    private static final String SHARP = "\u266F";
    private static final String FLAT = "\u266D";
    private static final String NATURAL = "\u266E";
    private static final String DOUBLESHARP = "\uD834\uDD2A";
    private static final String DOUBLEFLAT = "\uD834\uDD2B";

    public Note(Pitch pitch) {
        this.pitch = pitch;
        this.name = String.valueOf(pitch);
    }

    public Note(Pitch pitch, int octave) {
        this.pitch = pitch;
        this.octave = octave;
        this.name = String.valueOf(pitch) + octave;
    }

    public Note(Pitch pitch, String accidental, int octave) {
        this.pitch = pitch;
        this.accidental = accidental;
        this.octave = octave;
        this.name = String.valueOf(pitch) + accidental + octave;
    }

    public Pitch getPitch() {
        return this.pitch;
    }

    public void setPitch(Pitch pitch) {
        this.pitch = pitch;
    }

    public int getOctave() {
        return this.octave;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }

    public String getAccidental() {
        return this.accidental;
    }

    public void setAccidental(String accidental) {
        this.accidental = accidental;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Note middleC = new Note(Pitch.C, NATURAL, 4);
        System.out.println(middleC.getName());
    }


}
