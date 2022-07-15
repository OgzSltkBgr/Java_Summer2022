package practice;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

        // İsminizi ve soyisminizi alt alta yazin ve Kursumuza katiliminiz alinmistir, tesekkur ederiz, yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi yaziniz");

        String isim = scan.nextLine();
        String soyIsim = scan.nextLine();

        System.out.println("İsminiz = " +isim);
        System.out.println("Soyisminiz = " +soyIsim);
        System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz");
    }
}
