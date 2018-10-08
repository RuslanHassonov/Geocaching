/**
 * @Autor: Hassonov Ruslan
 * @Date: 24/09/2018
 * @Project: Geocaching
 * @Purpose: Main class voor test
 */
package view;

import model.factory.ZoektochtFactory;
import model.zoektocht.Zoektocht;
import utility.Berekeningen;
import utility.StorageZoektocht;

import java.util.Scanner;

public class TestZoektocht {

    Scanner input;

    public static void main(String[] args){
        TestZoektocht zoektocht = new TestZoektocht();
        zoektocht.lineClearance();
        zoektocht.startMenu();
    }

    private void startMenu(){
        input = new Scanner(System.in);

        System.out.print("\nMaak een keuze: \n" +
                "1) Maak een nieuwe lijst van zoektochten\n" +
                "2) Laad een bestaande lijst van zoektochten\n\n" +
                "Keuze: ");
        try {
            switch (input.nextInt()){
                case 1:
                    lineClearance();
                    setUp();
                    print();
                    subMenu();
                    break;
                case 2:
                    lineClearance();
                    System.out.print("Bestand wordt geladen");
                    subMenu();
                    break;
                default:
                    System.out.print("\n--- !!! --- Ongeldige ingave --- !!! ---\n");
                    startMenu();
            }
        } catch (Exception e) {
            System.out.print("\n--- !!! --- Ongeldige ingave. Waarde moet numeriek zijn --- !!! ---\n");
            startMenu();
        }

    }

    private void subMenu(){
        input = new Scanner(System.in);

        System.out.print("\n\nWat wil je doen? \n" +
                "1) Geef aantal schattentochten per provincie.\n" +
                "2) Meest populaire omgeving voor schattentocht.\n" +
                "3) Totale afstand.\n" +
                "4) Vaakst gewonnen prijs.\n" +
                "5) Terugkeren naar hoofdmenu." +
                "\n\nKeuze: ");
        try {
            switch (input.nextInt()){
                case 1:
                    Berekeningen.getAantalZoektochtenPerProvincie(StorageZoektocht.getLijstZoektochten());
                    break;
                case 2:
                    Berekeningen.getMeestPopulaireOmgeving(StorageZoektocht.getLijstZoektochten());
                    break;
                case 3:
                    Berekeningen.getTotaleAfstand(StorageZoektocht.getLijstZoektochten());
                    break;
                case 4:
                    Berekeningen.getVaakstGewonnenPrijs(StorageZoektocht.getLijstZoektochten());
                    break;
                case 5:
                    lineClearance();
                    startMenu();
                    break;
                default:
                    System.out.print("\n--- !!! --- Ongeldige ingave --- !!! --- \n");
                    subMenu();
            }
        } catch (Exception e) {
            System.out.print("\n--- !!! --- Ongeldige ingave. Waarde moet numeriek zijn --- !!! --- \n");
            subMenu();
        }
    }


    private void setUp(){
        ZoektochtFactory factory = new ZoektochtFactory();
        int ctr = 1;
        while (ctr <= 25){
            factory.maakNieuweZoektocht();
            ctr++;
        }
    }

    private void print(){
        int ctr = 1;
        for (Zoektocht z: StorageZoektocht.getLijstZoektochten()) {
            System.out.print("*** ZOEKTOCHT " + ctr + " ***" + "\n" +z.toString());
            ctr++;
        }
    }

    private void lineClearance(){
        for (int i = 0; i < 50; i++){
            System.out.print("\n");
        }
    }
}
