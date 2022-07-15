package practice;

import java.util.Scanner;

public class C22_IfStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kısa ve uzun kenarı giriniz");
        int kısa = scan.nextInt();
        int uzun =scan.nextInt();

        if (kısa==uzun){
            System.out.println("Kare");
        }
        if (kısa!=uzun){
            System.out.println("Kare degil");
        }

    }
}
