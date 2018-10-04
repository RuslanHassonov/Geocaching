/**
 * @Autor: Hassonov Ruslan
 * @Date: 24/09/2018
 * @Project: Geocaching
 * @Purpose: Definitie class adres
 */
package model.adres;

import java.util.Random;

public class Adres {
    private String gemeente;
    private String straat;
    private String locatie;
    private int nummer;

    public Adres() {
        getRandomGemeenteVanProvincie();
        setStraat();
        getRandomHuisnummer();
        getProvincie();
    }

    public String getProvincie() {return locatie;}

    public void setLocatie(String locatie) {this.locatie = locatie;}

    public String getGemeente()
    {
        return gemeente;
    }

    public void setGemeente(final String gemeente)
    {
        this.gemeente = gemeente;
    }

    public String getStraat()
    {
        return straat;
    }

    public void setStraat()
    {
        this.straat = Straat.getRandomStraatnaam().toString();
    }

    public int getNummer()
    {
        return nummer;
    }

    public void setNummer(final int nummer)
    {
        this.nummer = nummer;
    }

    @Override
    public String toString()
    {
        return  getGemeente() +", "+
                getStraat() +
                " n° " + getNummer();
    }

    private void getRandomGemeenteVanProvincie(){
        switch (Provincies.getRandomProvincienaam()) {
            case WEST_VLAANDEREN:
                setGemeente("BRUGGE");
                setLocatie("West-Vlaanderen");
                break;
            case OOST_VLAANDEREN:
                setGemeente("GENT");
                setLocatie("Oost-Vlaanderen");
                break;
            case ANTWERPEN:
                setGemeente("ANTWERPEN");
                setLocatie("Provincie Antwerpen");
                break;
            case LIMBURG:
                setGemeente("HASSELT");
                setLocatie("Limburg");
                break;
            case VLAAMS_BRABANT:
                setGemeente("LEUVEN");
                setLocatie("Vlaams-Brabant");
                break;
            case WAALS_BRABANT:
                setGemeente("WAVER");
                setLocatie("Waals-Brabant");
                break;
            case HENEGOUWEN:
                setGemeente("BERGEN");
                setLocatie("Henegouwen");
                break;
            case LUIK:
                setGemeente("LUIK");
                setLocatie("Provincie Luik");
                break;
            case LUXEMBURG:
                setGemeente("AARLEN");
                setLocatie("Provincie Luxemburg");
                break;
            case NAMEN:
                setGemeente("NAMEN");
                setLocatie("Provincie Namen");
                break;
        }
    }

    private void getRandomHuisnummer(){
        Random random = new Random();
        setNummer(random.nextInt(200));
    }
}
