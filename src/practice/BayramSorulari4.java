package practice;

import java.util.Scanner;

public class BayramSorulari4 {
    public static void main(String[] args) {
        /*
         * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
         * hatali giris seklinde kod yazniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        if (harf>='a' && harf <='z'){
            System.out.println("Girdiginiz karakter kucuk harf");
        }else if (harf>='A' && harf<='Z'){
            System.out.println("Girdiginiz karakter buyuk harf");
        }else
            System.out.println("hatali giris yaptiniz");

    }
}
