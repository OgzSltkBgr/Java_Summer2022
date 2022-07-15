package practice;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // Kullanicidan karenin bir kenar uzunluğunu alin ve karenin cevresini ve alanini hesaplayip yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen karenin kenar uzunlugunu giriniz");

        int kenar=scan.nextInt();

        System.out.println("Karenin cevresi ve alanı = " + (kenar*kenar));
    }
}
