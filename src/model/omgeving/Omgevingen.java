package model.omgeving;

import java.util.Random;

public enum Omgevingen {
    PLATTE_LAND("Door de velden"),
    ZEE("Op zee"),
    MOERAS("Door de moerassen"),
    STAD("In de stad"),
    BOS("In het bos"),
    STRAND("Op het strand"),
    BERGEN("In de bergen");

    private String naamOmgeving;

    Omgevingen(String naamOmgeving){ this.naamOmgeving = naamOmgeving; }

    public static Omgevingen getRandomOmgeving(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public String toString(){ return this.naamOmgeving; }
}
