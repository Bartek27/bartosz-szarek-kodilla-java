package Butelka;

public class butelka {
    private double ileLitrow;

    butelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;
    }

    double getIleLitrow() {
        return ileLitrow;
    }

    void wlej(double ilosc)
    {
        this.ileLitrow += ilosc;
    }

    boolean wylej(double ilosc)
    {
        if ( ilosc < ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;
        return true;
    }

    void przelej(double ilosc, butelka gdziePrzelac) {
        if (this.wylej(ilosc)) {
            gdziePrzelac.wlej(ilosc);
        } else
            System.out.println("Za malo");
    }


    public static void main(String[] args) {
        butelka[] butelkaa = new butelka[10];

        for(int i = 0; i<10; i++)
        {
            butelkaa[i] = new butelka(5);
        }


        butelkaa[0].wlej(5);

        butelkaa[0].przelej(2, butelkaa[1]);

        System.out.println(butelkaa[0].getIleLitrow());
        System.out.println(butelkaa[1].getIleLitrow());
        System.out.println(butelkaa[2].getIleLitrow());
    }
}
