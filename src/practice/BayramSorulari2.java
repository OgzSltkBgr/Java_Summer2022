package practice;

import java.util.Scanner;

public class BayramSorulari2 {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int temp = sayi;
        int toplam =0;

         int birlerBasamagi = temp%10;
         toplam+=birlerBasamagi;
         temp/=10;
         int onlarBasamagi = temp%10;
         toplam+=onlarBasamagi;
         temp/=100;
        int binlerBasamagi = temp%10;
        toplam+=binlerBasamagi;
        temp/=10;
        int onbinlerBasamagi = temp%10;
        toplam+=onbinlerBasamagi;

        System.out.println(sayi + " sayisinin ilk iki ve son iki rakamlari toplami = " + toplam);





    }
}
