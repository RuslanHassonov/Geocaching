/**
 * @Autor: Hassonov Ruslan
 * @Date: 24/09/2018
 * @Project: Geocaching
 * @Purpose: Main class voor test
 */
package view;

import model.Factory.ZoektochtFactory;
import model.Zoektocht.Zoektocht;
import utility.StorageZoektocht;

public class TestZoektocht {

    public static void main(String[] args){
        TestZoektocht zoektocht = new TestZoektocht();
        zoektocht.setUp();
        zoektocht.print();
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
}
