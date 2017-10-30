package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

/** Mathias Elholm */

public class Scammer extends Skabning{

    int scamXP; // Vælg hvor meget XP scammeren har

    public Scammer(String navn, String beskrivelse, int styrke, Gender gender, Skabning scammer) {
        super(navn, beskrivelse, styrke, gender);

    }

    public Scammer(int scamXP){
        super("# Scammer ", "who is imposing as a 'Sexy single Russian Lady' looking for a good time. #", 15, Gender.TRAP);
        this.scamXP = scamXP;
    }
}
