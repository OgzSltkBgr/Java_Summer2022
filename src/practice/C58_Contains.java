package practice;

import java.util.Scanner;

public class C58_Contains {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle isteyin. Cumle "buyuk" kelimesi iceriyorsa
        tum cumleyi buyuk harf olarak, "kucuk" harf iceriyorsa tum cumleyi
        kucuk harf olarak yazdirin, iki kelimeyi de icermiyorsa
        "cumle kucuk yada buyuk kelime icermiyor" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cumle giriniz");
        String cumle = scan.nextLine();

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        }else System.out.println("cumle kucuk yada buyuk kelimesi icermiyor");
    }
}
