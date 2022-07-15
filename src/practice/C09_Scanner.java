package practice;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {

        // Kullanicidan dikdortgenler prizmasinin uzun,kisa kenarlarini ve yuksekligini isteyip
        // prizmanin hacmini hesaplayin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Dikdortgenin uzun,kisa kenarlarini ve yuksekligini yaziniz");

        int kısa= scan.nextInt();
        int uzun= scan.nextInt();
        int yukseklik = scan.nextInt();

        System.out.println("Dikdortgenler prizmasi hacmi = " + (uzun*kısa*yukseklik));
    }
}
