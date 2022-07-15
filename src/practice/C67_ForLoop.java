package practice;

import java.util.Scanner;

public class C67_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi isteyin.Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        sonucu yazdiran bir program yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        toplam(sayi1, sayi2);

        }


    private static void toplam(int sayi1, int sayi2) {
        int toplam=0;
        if (sayi1 <= sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }
        }else {
            for (int i =sayi2; i <=sayi1 ; i++) {
                toplam += i;
            }

            }System.out.println("Girilen sayilari toplami :" + toplam);



    }
}
