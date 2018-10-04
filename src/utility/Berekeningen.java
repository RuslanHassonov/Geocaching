package utility;

import model.zoektocht.Zoektocht;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
}
