package practice;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Kullanicidan iki tam sayi alip, bu sayilarin toplam, fark ve carpimlarini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz ve aralarda enter tusuna basiniz");

        int sayi =scan.nextInt();
        int sayi1= scan.nextInt();

        System.out.println("Sayilar toplami =" + (sayi+sayi1));
        System.out.println("Sayilarin farki =" + (sayi-sayi1));
        System.out.println("Sayilarin carpimi ="+ (sayi*sayi1));


    }
}
