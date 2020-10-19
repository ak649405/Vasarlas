package hu.mak.oktatas;


import java.util.ArrayList;
import java.util.List;

public class Tlista {

    public List<Termek> termeks = new ArrayList<>();

    public void addItem( Termek termek ) { termeks.add( termek ) ; }

    public String ttNev( int a ) {
        //int i;
        //for(i=0; i<termeks.size(); i++) {
        //}
        return termeks.get(a).getTermeknev();
    }

    public double ttAr( int a ) {
        return termeks.get(a).getAr();
    }

    public boolean ttKedv( int a ) {
        return termeks.get(a).isMegapack();
    }

    void leker()
    {
        int i;

        System.out.println("***********Jelenleg megvásárolható termékek*************");

        for ( Termek aktTetel : termeks ) {
            System.out.println( aktTetel.getTermeknev() );
        }

        /*
        for(i=0; i<tlista.size(); i++)
        {
            System.out.println((i+1) + ". Termék:" +termeknev[i]);
        }

        System.out.println("Enter the title of the book needed:");

        String titkey;

        titkey = in.nextLine();

        int flag=0;

        for(i=0;i<n;i++)
        {
            if(titkey.equals(termeknev[i]))
            {
                flag++;
                break;
            }// end of if condition

        }// end of for loop

        if(flag != 0)
        {
            System.out.println("******Kérem vegyen fel terméket, szükséges*****");
            System.out.println("Neve:"+termeknev[i]);
            System.out.println("Megapack (I/N):"+megapack[i]);
            System.out.println("Ára:"+ar[i]);
            // System.out.println("Number of books presernt in the Book shop:"+count[i]);
        }//end of if condition
        else
            System.out.println("Jelenleg nincs termék!");
         */
    }//leker

}
