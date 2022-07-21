package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        %25 indirimli fiyati hsaplayip bize donduren bir method olusturun
         */

        double satisFiyati=100;

        double indirimliFiyat= indirimliFiyatHesapla(satisFiyati);
    }

    public static double indirimliFiyatHesapla(double satisFiyati) {

        double indirimliFiyat = satisFiyati*0.75;

        return indirimliFiyat;
    }
}
