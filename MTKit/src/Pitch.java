/* MTKit: Pitch
Enum for the letter of the alphabet corresponding to the pitch of the note
Created: 07/25/18
Modified: 07/25/18
Evan Wang   wang3407@purdue.edu
 */

public enum Pitch {
    C(1),
    D(2),
    E(3),
    F(4),
    G(5),
    A(6),
    B(7);

    int pitchVal;

    Pitch(int pitchVal) {
        this.pitchVal = pitchVal;
    }

    public int getPitchVal() {
        return this.pitchVal;
    }
}
