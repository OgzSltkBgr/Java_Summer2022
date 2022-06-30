package practice;

import java.util.Scanner;

public class C49_indexOf {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle ve bir harf isteiyn, harfin cumlede var ollup olmadıgini yazdirin
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle =scan.nextLine();

        System.out.println("Lutfen bir harf giriniz");
        char harf =scan.next().charAt(0);

        if (cumle.indexOf(harf) != -1) {
            System.out.println("Girdiginiz harf cumlede geciyor");
        }else System.out.println("Girdiginiz harf cumlede gecmiyor");



    }
}
