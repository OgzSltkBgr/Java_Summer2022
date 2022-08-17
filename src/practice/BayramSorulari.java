package practice;

import java.util.Scanner;

public class BayramSorulari {
    public static void main(String[] args) {
        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int temp = sayi;
        int birlerBasamagi= temp%10;
        temp/=10;
        System.out.println(sayi + " sayisinin birlerBasamagi " + birlerBasamagi);
        int onlarBasamagi= temp%10;
        temp/=10;
        System.out.println(sayi + " sayisinin onlarBasamagi " + onlarBasamagi);
        int yuzlerBasamagi= temp%10;
        temp/=10;
        System.out.println(sayi + "sayisinin yuzlerBasamagi " + yuzlerBasamagi);
    }
}
