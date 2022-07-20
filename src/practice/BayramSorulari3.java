package practice;

import java.util.Scanner;

public class BayramSorulari3 {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk vize notunuzu giriniz");
        int vize = scan.nextInt();
        System.out.println("Lutfen ikinci vize notunuzu giriniz");
        int vize2 = scan.nextInt();
        System.out.println("Lutfen final notunuzu giriniz");
        int fınal = scan.nextInt();
        double gecmeNotu= ((vize+vize2)/2)*0.3 +(fınal*0.7);

        System.out.println(gecmeNotu);

    }
}
