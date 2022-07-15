package practice;

import java.util.Scanner;

public class C37_Ternary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();


        System.out.println(sayi1<sayi2 ? sayi1 : sayi2);


    }
}
