package hu.mak.oktatas;


import java.util.ArrayList;
import java.util.List;

public class Tetel extends Termek {

    private int db;

    public Tetel(String termeknev, double ar, boolean megapack, int db) {
        super(termeknev, ar, megapack);
        this.db = db;
    }

    public int getDb() {

        return db;
    }

    public void setDb(int db) {

        this.db = db;
    }

    //public int setDb(int a) {
    //  db = a;
    //}

    //public List<Tetel> getTetels() {
    //  return new ArrayList<>(tetels);


}

