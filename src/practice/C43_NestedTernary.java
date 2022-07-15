package practice;

import java.util.Scanner;

public class C43_NestedTernary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdorrtgenin uzunlugunu ve genisligini giriniz");

        int uzun = scan.nextInt();
        int gen  = scan.nextInt();

        System.out.println(uzun==gen ? "Kare" : "Kare degil");
    }
}
