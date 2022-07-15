package practice;

import java.util.Scanner;

public class C17_Modulus {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        // sayi 5264 olsun
        int sayi = scan.nextInt();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi = sayi;

       birlerBasamagi=sayi%10 ; // 7
        rakamlarToplami+= birlerBasamagi;
        sayi/=10;

       birlerBasamagi=sayi%10 ; // bb 6 rt 4
        rakamlarToplami += birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10 ; // bb 2 rt 10
        rakamlarToplami += birlerBasamagi;
        sayi/=10;

        birlerBasamagi= sayi%10 ; // bb 5 rt 12
        rakamlarToplami += birlerBasamagi;
        sayi/=10;


        System.out.println(ilkGirilenSayi + " sayisinin rakammlar toplami "+ rakamlarToplami);



    }
}
