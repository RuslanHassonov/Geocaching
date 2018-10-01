/**
 * @Autor: Hassonov Ruslan
 * @Date: 24/09/2018
 * @Project: Geocaching
 * @Purpose: Classe voor ArrayList van zoektochten
 */
package utility;

import model.Zoektocht.Zoektocht;
import java.util.ArrayList;

public class StorageZoektocht {

    private static ArrayList<Zoektocht> lijstZoektochten;

    public StorageZoektocht() {
        lijstZoektochten = new ArrayList<>();
    }

    public static ArrayList<Zoektocht> getLijstZoektochten() {
        return lijstZoektochten;
    }

    public void setLijstZoektochten(Zoektocht zoektocht) {
        lijstZoektochten.add(zoektocht);
    }
}
