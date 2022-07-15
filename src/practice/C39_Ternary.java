package practice;

import java.util.Scanner;

public class C39_Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        double sayi = scan.nextDouble();

        System.out.println(sayi>=0 ? sayi : (-1*sayi));


    }
}
