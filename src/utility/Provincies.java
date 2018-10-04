/**
 * @Autor: Hassonov Ruslan
 * @Date: 24/09/2018
 * @Project: Geocaching
 * @Purpose: Provincies (types van) voor zoektochten
 */

package utility;

import java.util.Random;

public enum Provincies {
    WEST_VLAANDEREN,
    OOST_VLAANDEREN,
    ANTWERPEN,
    LIMBURG,
    VLAAMS_BRABANT,
    WAALS_BRABANT,
    HENEGOUWEN,
    LUIK,
    LUXEMBURG,
    NAMEN;

    private String provincieNaam;

    //Provincies(String provincieNaam){this.provincieNaam = provincieNaam;}

    public static Provincies getRandomProvincienaam() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public static String getProvincieNaam(){
        return values().toString();
    }

    public String toString(){return this.provincieNaam;}
}
