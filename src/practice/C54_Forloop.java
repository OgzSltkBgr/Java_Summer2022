package practice;

import java.util.Scanner;

public class C54_Forloop {
    public static void main(String[] args) {
        /*
                Soru4)
                   Kullanicidan 100 den kucuk bir sayi isteyin
                    1 den başlayarak 3 un kati olan sayilari girilen sayiya kadar yazdirin
            */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tamsayi giriniz: ");
        int sayi= scan.nextInt();


            for (int i=1; i<=sayi; i++){
                if (sayi <=0|| sayi>=100){
                    System.out.println("Gecerli bir sayi giriniz");
                }else if (i%3==0){

                    System.out.println(i+",");


            }
        }


    }
}


