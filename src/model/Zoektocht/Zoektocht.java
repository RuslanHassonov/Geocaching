/**
 * @Autor: Hassonov Ruslan
 * @Date: 24/09/2018
 * @Project: Geocaching
 * @Purpose: Definitie class Zoektocht
 */
package model.Zoektocht;

import model.Adres.Adres;
import model.Datum.Datum;

public class Zoektocht {
    private final Adres startAdres;
    private final Datum startDatum;
    private final String schat;
    private final String afstand;
    private final int recensieScore;

    public Zoektocht(Adres startAdres, Datum startDatum, String schat, String afstand, int recensieScore) {
        this.startAdres = startAdres;
        this.startDatum = startDatum;
        this.schat = schat;
        this.afstand = afstand;
        this.recensieScore = recensieScore;
    }

    public String toString() {
        return " - Locatie/Type: " + startAdres.getLocatie() + " \n" +
               " - Adres: " + startAdres.toString() + " \n" +
               " - Datum: " + startDatum.toString() + " \n" +
               " - Prijs: " + schat + "\n" +
               " - Afstand: " + afstand + "km" + "\n" +
               " - Score: " + recensieScore+ "\n\n";
    }
}
