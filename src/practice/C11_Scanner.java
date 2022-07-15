package practice;

import java.util.Scanner;

public class C11_Scanner {
    public static void main(String[] args) {

        // Kullanicidan ismini alip isminin bas harfini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");

        String isim = scan.nextLine();

        System.out.println("İsminiz = " + isim.toUpperCase().charAt(0));
    }
}
