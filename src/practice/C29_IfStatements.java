package practice;

import java.util.Scanner;

public class C29_IfStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan iki sayi isteyin, sayilarin ikisi de poztif ise
        sayilarin toplamini yazdirin, sayilarin ikisi de negative ise
        sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere sahipse
         "farklı isaretlerde sayilarla carpma islemi yapamasin" yazdirin
         sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1>0 && sayi2>0){
            System.out.println("Sayilarin toplami :" + (sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println("Sayilarin carpimi :" + (sayi1*sayi2));
        }else if (sayi1<0&& sayi2>0){
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
        }else if (sayi1>0 && sayi2<0){
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
        }else if (sayi1==0 || sayi2==0){
            System.out.println("sifir carpmaya gore yutan elemandir");
        }


    }

}
