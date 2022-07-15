package practice;

import java.util.Scanner;

public class C38_Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi = scan.nextInt();

        System.out.println(sayi%2==0 ?  "Cift" : "Tek");
    }
}
