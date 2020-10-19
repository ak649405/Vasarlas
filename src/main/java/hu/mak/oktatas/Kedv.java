package hu.mak.oktatas;


public enum Kedv {
    MKOSSZEG (6000),
    DRKEDV (12);

    private final int ertek;

    private Kedv(int ertek) {
        this.ertek = ertek;
    }

    public int getErtek() {
        return ertek;
    }
}