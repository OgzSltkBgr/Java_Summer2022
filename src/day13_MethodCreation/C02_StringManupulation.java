package day13_MethodCreation;

import java.util.Scanner;

public class C02_StringManupulation {
    public static void main(String[] args) {
        /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scan.nextLine();
        int kontrol =0;
        //ilk harf kontrolu
        if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
            kontrol++;
        }else {
            System.out.println("İlk harf buyuk harf olmali");

        }
        // son harf kontrolu
        if (sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else {
            System.out.println("Son harfin kucuk harf olmali");
        }
        // bosluk kontrolu
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else {
            kontrol++;
        }
        if (sifre.length() >=8){
            kontrol++;
        }else{
            System.out.println("Lutfen en az 8 karakter giriniz");
        }

        if (kontrol == 4){
            System.out.println("Sifre basari ile tanimlandi");
        }else{
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }

    }
}
