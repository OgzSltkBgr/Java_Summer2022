package day09_ternary;

import java.util.Scanner;

public class C06_NestedTernary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        System.out.println((99<sayi && sayi<1000) ? "uc basamakli sayi" : "Uc basamakli sayi degil");


    }
}
