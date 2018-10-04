/**
 * @Autor: Hassonov Ruslan
 * @Date: 24/09/2018
 * @Project: Geocaching
 * @Purpose: Definitie class zoektocht
 */
package model.zoektocht;

import model.adres.Adres;
import model.datum.Datum;
import model.schat.Schat;
import model.omgeving.Omgeving;

public class Zoektocht {


    private final Adres startAdres;
    private final Datum startDatum;
    private final Schat schat;
    private final String afstand;
    private final Omgeving omgeving;
    private final int recensieScore;

    public Zoektocht(Adres startAdres, Datum startDatum, Schat schat, String afstand, Omgeving omgeving, int recensieScore) {
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

    public Adres getStartAdres() {
        return startAdres;
    }

    public String toString() {
        return " - Locatie - Type: " + startAdres.getProvincie() + " - " + omgeving.getOmgevingNaam() + " \n" +
               " - Start adres   : " + startAdres.toString() + " \n" +
               " - Start datum   : " + startDatum.toString() + " \n" +
               " - Prijs         : " + schat.getSchatNaam() + "\n" +
               " - Afstand       : " + afstand + "km" + "\n" +
               " - Score         : " + recensieScore + "/10" +"\n\n";
    }
}
