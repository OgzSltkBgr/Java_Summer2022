package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen inputa gore * lardan olusan bir ucgen olusturun
        ornek input:4 ise

        *
        * *
        * * *
        * * * *

         */

        int boy =5;

        for (int i = 1; i <=boy ; i++) { // satır sayısını kontrol ediyor (Outer Loop)
            for (int j = 1; j <=i ; j++) { // (İnner loop)
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
