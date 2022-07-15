package practice;

import java.util.Scanner;

public class C44_NestedTernary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scan.nextInt();

        System.out.println(sayi>99 && sayi<1000 ? "Uc basamakli sayi" : "Uc basamakli sayi degil");
    }
}
