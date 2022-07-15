package practice;

import java.util.Scanner;

public class C68_ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        faktoryel(sayi);


    }

    private static void faktoryel(int sayi) {
        int sonuc= 1;

        for (int i = 1; i <=sayi ; i++) {
            sonuc *=i;

        }
        System.out.println(sonuc);

    }
}
