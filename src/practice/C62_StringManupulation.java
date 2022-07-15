package practice;

import java.util.Scanner;

public class C62_StringManupulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyisim isteiyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scan.nextLine();

        int isimUzunluk = isim.length();
        int soyIsimUzunluk = soyIsim.length();

        if (isimUzunluk<soyIsimUzunluk){
            System.out.println("Soyisminiz isminizden uzun");
        }else if (soyIsimUzunluk==isimUzunluk){
            System.out.println("İsminiz ve soyisminiz esit uzunlukta");
        }else System.out.println("İsminiz soyisminizden uzun");
    }
}
