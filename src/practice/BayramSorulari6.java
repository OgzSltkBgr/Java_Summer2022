package practice;

import java.util.Scanner;

public class BayramSorulari6 {
    public static void main(String[] args) {
        /*
         * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
         * olanlarini konsola yazdiriniz int num1 int num2 int num3
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("Lutfen ucuncu sayiyi giriniz");
        int sayi3 = scan.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3 && sayi2 > sayi3) {
            System.out.println("En buyuk sayi :" + sayi1 + " En kucuk sayi :" + sayi3);
        } else if (sayi1 > sayi2 && sayi1 > sayi3 && sayi3 > sayi2) {
            System.out.println("En buyuk sayi :" + sayi1 + " En kucuk sayi :" + sayi2);
        } else if (sayi2 > sayi1 && sayi2 > sayi3 && sayi1 > sayi3) {
            System.out.println("En buyuk sayi :" + sayi2 + " En kucuk sayi :" + sayi3);
        } else if (sayi2>sayi1 && sayi2>sayi3 && sayi3>sayi1){
            System.out.println("En buyuk sayi :"+ sayi2 + " En kucuk sayi :" + sayi1);
        }else if (sayi3>sayi1 && sayi3>sayi2 && sayi1>sayi2) {
            System.out.println("En buyuk sayi :" + sayi3 + " En kucuk sayi :" + sayi2);
        }else if (sayi3>sayi1 && sayi3>sayi2 && sayi1<sayi2) {
            System.out.println("En buyuk sayi :" + sayi3 + " En kucuk sayi :" + sayi1);
        }
    }
}
