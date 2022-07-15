package day15_overloading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {

        topla(5,7);
        topla(5.2,3);
        topla(3.4,6.1);

    }


    public static void topla(int sayi1, int sayi2) {
        System.out.println("Iki integerin toplami : " + (sayi1 + sayi2));
    }
    /*
    Bir class'da parametre sayisi ve parametre turleri ayni olan 2 method OLUSTURAMAYIZ
    public static void topla(int sayi3, int sayi4) {
        System.out.println("Iki integerin toplami : " + (sayi3 + sayi4));
     */

    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double ve bir integeri'in toplami : " + (sayi1 + sayi2));

    }

    public static void topla( int sayi1, double sayi2) {
        System.out.println("bir integeri ve bir double'in toplami : " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("Iki double'in toplami : " + (sayi1 + sayi2));
    }


}
