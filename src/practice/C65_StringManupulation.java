package practice;

import java.util.Scanner;

public class C65_StringManupulation {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini, soyismini ve kredi kartı bilgisini isteyin ve asagidaki gibi yazdirn
        isim-soyisim : M*** B****
        kart no : **** **** **** 1234
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine().toLowerCase();

        System.out.println("Lutfen soyismiinizi giriniz");
        String soy = scanner.nextLine().toLowerCase();

        System.out.println("Lutfen kart biligisi giriniz");
        String kart = scanner.nextLine();

        isim =isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w", "*");
        soy = soy.substring(0,1).toUpperCase()+soy.substring(1).replaceAll("\\w", "*");



        System.out.println(isim + " " + soy);
        System.out.println(kart.substring(0,4).replaceAll("\\d", "*")+ " "
                + (kart.substring(4,8).replaceAll("\\d", "*"))+ " " +
                (kart.substring(8,12).replaceAll("\\d", "*"))+ " " +
                kart.substring(12));
    }
}
