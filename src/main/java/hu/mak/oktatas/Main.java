package hu.mak.oktatas;

import java.util.Scanner;

public class Main {

    private static Object VasarloKosar;

    public static void main(String[] args) {
        // write your code here

        //Kosar kosar;
        VasarloKosar vasarloKosar;
        Tlista tlista;

        //Vásárolható tételek
        tlista = new Tlista();
        tlista.addItem(new Termek("téliszalámi", 2000, false ));
        tlista.addItem(new Termek("gumikacsa", 3000, false ));
        tlista.addItem(new Termek("megapack uborka", 2800, true ));
        tlista.addItem(new Termek("megapack gesztenye", 1000, true ));

        int i;
        int ch;
        Scanner sc = new Scanner(System.in);

        // bookshopmethods ob = new bookshopmethods();
        Scanner in = new Scanner(System.in);

        while(true)
        {
            System.out.println("********************MENŰ****************");
            System.out.println("\t\t1.Termékek fölvitele-(automatikus)\n\t\t2.Termék lista\n\t\t3.Vásárló kosár\n\t\t4.Vásárló kosár törlése\n\t\t5.Exit");
            System.out.println("Kérem válaszon :");
            ch = in.nextInt();

            vasarloKosar = new VasarloKosar();
            switch(ch)
            {
                case 1: System.exit(0); //ob.setdata();
                    break;
                case 2: tlista.leker ();
                    break;
                case 3:
                    //Rendelés
                    for (i = 0; i < 4; i++) {
                        System.out.println( tlista.ttNev (i) + " mennyiség: " );
                        int t_db = ( sc.nextInt() );
                        vasarloKosar.addItem(new Tetel( tlista.ttNev (i), tlista.ttAr (i), tlista.ttKedv(i),  t_db ));
                        //tetel.setDb();
                    }
                    // Ár
                    System.out.println("Eredeti ár:" + vasarloKosar.kosar.sumAr());
                    System.out.println("Kedvezményes ár:" + vasarloKosar.sumKedvar());
                    System.out.println("Kedvezmény típus:" + vasarloKosar.getKedvtipus() );
                    break;
                case 4: vasarloKosar.kosar.clearKosar();
                    System.out.println("Eredeti ár:" + vasarloKosar.kosar.sumAr());
                    System.out.println("Kedvezményes ár:" + vasarloKosar.sumKedvar());
                    System.out.println("Kedvezményes típus:" + vasarloKosar.getKedvtipus() );
                    break;
                case 5: System.exit(0);

            }//end of switch case

        }// end of while loop


    }
}

