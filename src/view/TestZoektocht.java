/**
 * @Autor: Hassonov Ruslan
 * @Date: 24/09/2018
 * @Project: Geocaching
 * @Purpose: Main class voor test
 */
package view;

import model.factory.ZoektochtFactory;
import model.zoektocht.Zoektocht;
import utility.StorageZoektocht;

import java.util.Scanner;

public class TestZoektocht {

    public static void main(String[] args){
        TestZoektocht zoektocht = new TestZoektocht();
        zoektocht.lineClearance();
        zoektocht.startMenu();
    }

    private void startMenu(){
        Scanner input = new Scanner(System.in);

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
                    break;
                case 2:
                    lineClearance();
                    System.out.print("Bestand wordt geladen");
                    break;
                default:
                    System.out.print("\nOngeldige ingave.\n");
                    startMenu();
            }
        } catch (Exception e) {
            System.out.print("\nOngeldige ingave. Waarde moet numeriek zijn.\n");
            startMenu();
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
