package practice;

import java.util.Scanner;

public class C64_StringManupulation {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
        "Sifre basari ile tanimlandi", sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin yazdirin

        -Ilk harf buyuk olmali
        -Son harf kucuk olmali
        -Sifre bosluk icermemeli
        -Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scan.nextLine();

        int toplam = 0;

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            toplam++;
        }else {
            System.out.println("Ilk harf buyuk olmali");
        }

        if (sifre.length()-1>= 'a' && sifre.length()-1<='z'){
            toplam++;
        }else {
            System.out.println("Son harf kucuk olmali");
        }

        if (!sifre.contains(" ")){
            toplam++;
        }else {
            System.out.println("Sifre bosluk icermemeli");
        }

        if (sifre.length()>=8){
            toplam++;
        }else {
            System.out.println("Sifre en az 8 karakter olmali");
        }

        if (toplam==4){
            System.out.println("Sifre basari ile tanimlandi");
        }else System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");







    }
}
