package hu.mak.oktatas;

public class VasarloKosar {

    private static String kedvtipus;
    public  Kosar kosar = new Kosar();

    public void addItem(Tetel tetel) {
        kosar.addItem(tetel);
    }



    public double sumKedvar() {
        Kedv a = Kedv.MKOSSZEG;
        Kedv b = Kedv.DRKEDV;

        double sum = 0.0;
        double fizet_megap = 0.00;
        double fizet_23 = 0.00;
        int    megakedvosszeg = a.getErtek();  //Kedv.MKOSSZEG.getErtek();
        double megakedvezmeny;


        // Megapack
        fizet_megap = 0;
        for ( Tetel tetel : kosar.getTetels()) {

            if (tetel.getDb() / b.getErtek() >= 1 && tetel.isMegapack()) {
                megakedvezmeny = tetel.getDb() / b.getErtek() * megakedvosszeg;
                fizet_megap += tetel.getAr() * tetel.getDb() - megakedvezmeny;
            }
            else
                fizet_megap += tetel.getAr()*tetel.getDb();
        }

        // 23
        fizet_23   = 0;
        for ( Tetel tetel : kosar.getTetels() ) {

            if (tetel.getDb()/3 >= 1 && !tetel.isMegapack()) {
                fizet_23 += tetel.getAr() * ( tetel.getDb() - (tetel.getDb()/3) ) ;
            }
            else
                fizet_23 += tetel.getAr()*tetel.getDb();
        }



        if (  fizet_23 > fizet_megap ) {
            sum = fizet_megap;
            kedvtipus = "megapack";
        }
        else {
            if (fizet_23 == kosar.sumAr()) {
                kedvtipus = "nincs kedvezmény";
            }else
                kedvtipus = "2-fizet 3-kap";
            sum = fizet_23;

        }

        return sum;
    }


    public  String getKedvtipus() {
        return kedvtipus;
    }



}

