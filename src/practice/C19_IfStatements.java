package practice;

import java.util.Scanner;

public class C19_IfStatements {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girdiginiz sayi cift");
        }
        if (sayi%2!=0){
            System.out.println("Girdiginiz sayi tek");
        }





    }
}
