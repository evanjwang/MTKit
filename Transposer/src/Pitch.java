/* MTKit: Pitch
Enum for the letter of the alphabet corresponding to the pitch of the note
Created: 07/25/18
Modified: 07/25/18
Evan Wang   wang3407@purdue.edu
 */

import java.util.*;

public enum Pitch {
    C(1),
    D(2),
    E(3),
    F(4),
    G(5),
    A(6),
    B(7);

    private int pitchVal;
    private static Map map = new HashMap<>();

    private Pitch(int pitchVal) {
        this.pitchVal = pitchVal;
    }

    static {
        for (Pitch pitch: Pitch.values()) {
            map.put(Pitch.pitchVal, pitch);
        }
    }

    public static Pitch valueOf(int pitch) {
        return (Pitch) map.get(pitch);
    }

    public int getPitchVal() {
        return this.pitchVal;
    }



}
