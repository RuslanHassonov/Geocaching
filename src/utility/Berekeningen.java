package utility;

import model.zoektocht.Zoektocht;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Berekeningen {

    public static void getAantalZoektochtenPerProvincie(ArrayList<Zoektocht> lijst) {

        ArrayList<String> lijstProvincies = new ArrayList<String>();
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (Zoektocht i: lijst) {
            lijstProvincies.add(i.getStartAdres().getProvincie());
        }

        for (String i : lijstProvincies) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<String, Integer> val : hm.entrySet()){
            System.out.println(" - " + val.getKey() + ": " + val.getValue());
        }

    }

    public static void getMeestPopulaireOmgeving(ArrayList<Zoektocht> lijst) {

        ArrayList<String> lijstOmgevingen = new ArrayList<String>();
        Map<String, Integer> hm = new HashMap<String, Integer>();
        int max = 0;
        String maxNaam = null;

        for (Zoektocht i: lijst) {
            lijstOmgevingen.add(i.getOmgeving().getOmgevingNaam());
        }

        for (String i : lijstOmgevingen) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<String, Integer> val : hm.entrySet()){

            if (val.getValue() > max){
                max = val.getValue();
                maxNaam = val.getKey();
            }
        }
        System.out.println("\n - Meest bezochte omgeving: " + maxNaam + "(" + max + " keer)");
    }

    public static void getVaakstGewonnenPrijs(ArrayList<Zoektocht> lijst) {

        ArrayList<String> lijstPrijzen = new ArrayList<String>();
        Map<String, Integer> hm = new HashMap<String, Integer>();
        int max = 0;
        String maxNaam = null;

        for (Zoektocht i: lijst) {
            lijstPrijzen.add(i.getSchat().getSchatNaam());
        }

        for (String i : lijstPrijzen) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<String, Integer> val : hm.entrySet()){

            if (val.getValue() > max){
                max = val.getValue();
                maxNaam = val.getKey();
            }
        }
        System.out.println("\n - Vaakst gewonnen prijs: " + maxNaam + "(" + max + " keer)");
    }

    public static void getTotaleAfstand(ArrayList<Zoektocht> lijst) {
        double totaal = 0;
        DecimalFormat df2 = new DecimalFormat(".##");

        for (Zoektocht i: lijst) {
            double afstand = Double.parseDouble(i.getAfstand());
            totaal += afstand;
        }

        System.out.println("\n - Totale astand van alle zoektochten: " + df2.format(totaal) + " km.");

    }
}