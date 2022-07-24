package day30_immutable_date;

import java.util.Scanner;

public class BuyukSorusu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dogum tarihinizi yil olarak giriniz");
        int yil1= scan.nextInt();
        System.out.println("Lutfen dogum tarihinizi yil olarak giriniz");
        int yil2= scan.nextInt();
        System.out.println("Lutfen dogum tarihinizi ay olarak giriniz");
        int ay1= scan.nextInt();
        System.out.println("Lutfen dogum tarihinizi ay olarak giriniz");
        int ay2= scan.nextInt();
        System.out.println("Lutfen dogum tarihinizi gun olarak giriniz");
        int gun1= scan.nextInt();
        System.out.println("Lutfen dogum tarihinizi gun olarak giriniz");
        int gun2= scan.nextInt();

        if (yil1>yil2){
            System.out.println("2. kullanici buyuk");
            if (yil1==yil2){
                if (ay1>ay2){
                    System.out.println("2. kullanici buyuk");
                    if (ay1==ay2){
                        if (gun1>gun2){
                            System.out.println("2. kullanici buyuk");
                        }else {
                            System.out.println("1. kullanici buyuk");
                        }
                    }
                }else {
                    System.out.println("1. kullanici buyuk");
                }
            }
        }else {
            System.out.println("1. kullanici buyuk");
        }
    }
}
