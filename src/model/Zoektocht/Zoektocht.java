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
    private final String omgeving;
    private final int recensieScore;

    public Zoektocht(Adres startAdres, Datum startDatum, String schat, String afstand, String omgeving, int recensieScore) {
        this.startAdres = startAdres;
        this.startDatum = startDatum;
        this.schat = schat;
        this.afstand = afstand;
        this.omgeving = omgeving;
        if (recensieScore == 0) {
            this.recensieScore = 1;
        }
        else {
            this.recensieScore = recensieScore;
        }
    }

    public String toString() {
        return " - Locatie - Type: " + startAdres.getProvincie() + " - " + omgeving + " \n" +
               " - Start Adres   : " + startAdres.toString() + " \n" +
               " - Start Datum   : " + startDatum.toString() + " \n" +
               " - Prijs         : " + schat + "\n" +
               " - Afstand       : " + afstand + "km" + "\n" +
               " - Score         : " + recensieScore + "/10" +"\n\n";
    }
}
