/**
 * @Autor: Hassonov Ruslan
 * @Date: 01/10/2018
 * @Project: Geocaching
 * @Purpose: Opbouw van ZoektochtFactory pattern
 */
package model.factory;

import model.adres.Adres;
import model.datum.Datum;
import model.schat.Schat;
import model.schat.Schatten;
import model.zoektocht.Zoektocht;
import model.omgeving.*;
import utility.StorageZoektocht;

import java.text.DecimalFormat;
import java.util.Random;

public class ZoektochtFactory{

    StorageZoektocht alleZoektochten = new StorageZoektocht();

    public Zoektocht maakNieuweZoektocht(){

        Zoektocht nieuweZoektocht = new Zoektocht(new Adres(),
                                                  new Datum(),
                                                  new Schat(Schatten.getRandomSchat().toString()),
                                                  getRandomAfstand(),
                                                  new Omgeving(Omgevingen.getRandomOmgeving().toString()),
                                                  getRandomRecensie());
        alleZoektochten.setLijstZoektochten(nieuweZoektocht);
        return nieuweZoektocht;
    }

    private String getRandomAfstand (){
        DecimalFormat df2 = new DecimalFormat(".##");
        Random random = new Random();
        return df2.format(random.nextDouble()*100.0);
    }

    private int getRandomRecensie(){
        Random random = new Random();
        return random.nextInt(10);
    }

}
