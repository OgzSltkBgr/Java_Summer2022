package day09_ternary;

import java.util.Scanner;

public class C05_NestedTernary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen uzunlugu giriniz");
        double uz= scan.nextDouble();

        System.out.println("Lutfen genisligi giriniz");
        double gen= scan.nextDouble();

        System.out.println((uz==gen) ? ("kare") : ("kare degil"));

    }
}
