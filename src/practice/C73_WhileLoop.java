package practice;

import java.util.Scanner;

public class C73_WhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini tam sayi olarak giriniz");
        int bas = scan.nextInt();
        System.out.println("Lutfen bitis degerini tam sayi olarak giriniz");
        int son = scan.nextInt();
        int temp= bas;

        while(temp < son) {

            System.out.println(temp + " ="+bas+ " ve "+ son + " arasindaki sayi");
            temp++;
        }
    }
}
