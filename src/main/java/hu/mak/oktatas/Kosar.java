package hu.mak.oktatas;

import java.util.ArrayList;
import java.util.List;


public class Kosar {

    private List<Tetel> tetels = new ArrayList<>();

    public void addItem( Tetel tetel ) { tetels.add( tetel);  }

    // public List<Tetel> getTetel() {
    //        return tetels;
    //}

    public List<Tetel> getTetels() {
        return new ArrayList<>(tetels);
    }

    /*
    public void removeTetel(String nev ) {

        Tetel toBeRemoved = null;
        for (Tetel currentItem : Tetel) {
            if (currentItem.getTermeknev().equals(nev) {
                toBeRemoved = currentItem;
            }
        }
        tetels.remove(toBeRemoved);

    }
    */

    public double sumAr() {
        double sum = 0.0;
        for ( Tetel tetel : getTetels() ) {
            sum += tetel.getAr()*tetel.getDb();
        }
        return sum;
    }


    public void clearKosar() {
        tetels.clear();
    }

}
