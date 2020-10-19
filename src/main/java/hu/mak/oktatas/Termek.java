package hu.mak.oktatas;

import java.util.ArrayList;
import java.util.List;

public class Termek {

    private String termeknev;
    private double ar;
    private boolean megapack;

    public Termek(String termeknev, double ar, boolean megapack) {
        this.termeknev = termeknev;
        this.ar = ar;
        this.megapack = megapack;
    }

    public String getTermeknev() {
        return termeknev;
    }

    public double getAr() {
        return ar;
    }

    public boolean isMegapack() {
        return megapack;
    }


    // public set_tetel_db ( int db ) {
    //    return t
    // }



}

