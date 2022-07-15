package practice;

import java.util.Scanner;

public class C40_Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        double sayi = scan.nextDouble();

        System.out.println(sayi>0 ? "Sayi pozitif" : (sayi*sayi));
    }
}
