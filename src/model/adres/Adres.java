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
    private String provincie;
    private int nummer;

    public Adres() {
        getRandomGemeenteVanProvincie();
        setStraat();
        getRandomHuisnummer();
        getProvincie();
    }

    public String getProvincie() {return provincie;}

    public void setProvincie(String provincie) {this.provincie = provincie;}

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
                setProvincie("West-Vlaanderen");
                break;
            case OOST_VLAANDEREN:
                setGemeente("GENT");
                setProvincie("Oost-Vlaanderen");
                break;
            case ANTWERPEN:
                setGemeente("ANTWERPEN");
                setProvincie("Provincie Antwerpen");
                break;
            case LIMBURG:
                setGemeente("HASSELT");
                setProvincie("Limburg");
                break;
            case VLAAMS_BRABANT:
                setGemeente("LEUVEN");
                setProvincie("Vlaams-Brabant");
                break;
            case WAALS_BRABANT:
                setGemeente("WAVER");
                setProvincie("Waals-Brabant");
                break;
            case HENEGOUWEN:
                setGemeente("BERGEN");
                setProvincie("Henegouwen");
                break;
            case LUIK:
                setGemeente("LUIK");
                setProvincie("Provincie Luik");
                break;
            case LUXEMBURG:
                setGemeente("AARLEN");
                setProvincie("Provincie Luxemburg");
                break;
            case NAMEN:
                setGemeente("NAMEN");
                setProvincie("Provincie Namen");
                break;
        }
    }

    private void getRandomHuisnummer(){
        Random random = new Random();
        setNummer(random.nextInt(200));
    }
}
