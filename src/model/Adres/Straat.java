/**
 * @Autor: Hassonov Ruslan
 * @Date: 24/09/2018
 * @Project: Geocaching
 * @Purpose: Enumerator voor straatnamen
 */
package model.Adres;

import java.util.Random;

public enum Straat {
    STATIONSTRAAT("Stationstraat"),
    KERKSTRAAT("Kerkstraat"),
    JAN_BAPTIST_LAAN("Jan-Baptistlaan"),
    GEMEENTEBAAN("Gemeentebaan"),
    LEUVENSESTEENWEG("Leuvensesteenweg"),
    NIEUWE_BOMEN_LAAN("Nieuwe Bomenlaan"),
    STEENKOOLSTRAAT("Steenkoolstraat");

    private String straatNaam;

    Straat(String straatNaam){
        this.straatNaam = straatNaam;
    }

    public static Straat getRandomStraatnaam() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public String toString(){
        return this.straatNaam;
    }
}
