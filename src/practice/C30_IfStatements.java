package practice;

import java.util.Scanner;

public class C30_IfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan 100 üzerinden notunu isteyin. Notu harf sistemine cevirip yazdirin.
        50'den kucukse "D" 50-60 arasi "c" 60-80 arasi "B", 80 uzeri "A"
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 100 puan sistemi uzerinden notunuzu giriniz");
        int not =scan.nextInt();


        if (not<0 || not>100){
            System.out.println("Lutfen gecerli not giriniz");
        }else if (not <=100 && not>=80){
            System.out.println("A");
        }else if (not>=60){
            System.out.println("B");
        }else if (not>=50){
            System.out.println("C");
        }else  {
            System.out.println("D");

        }

        }

    }

