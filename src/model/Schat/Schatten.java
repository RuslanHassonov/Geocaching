/**
 * @Autor: Hassonov Ruslan
 * @Date: 24/09/2018
 * @Project: Geocaching
 * @Purpose: Vastlegging voor eventuele schatten
 */
package model.Schat;

import java.util.Random;

public enum Schatten {
    AUTO("Auto - BMW M5"),
    VLIEGTUIG("Vliegtuig - Boeing 787"),
    DIAMANTEN("Diamant - 250 karaat"),
    GELD("Geld - $100.000.000"),
    BAKSTEEN("Baksteen"),
    BANAAN("Banaan"),
    EMMER_EIEREN("Emmer eieren"),
    COLA("Levenslange voorraad Coca-Cola"),
    BIER("Een extra grote krat Jupiler"),
    BIER2("Een extra kleine krat Jupiler"),
    GSM("Een Samsung Galaxy S20");

    private String schat;

    Schatten(String schat){this.schat = schat;}

    public static Schatten getRandomSchat() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public String toString(){return this.schat;}
}

