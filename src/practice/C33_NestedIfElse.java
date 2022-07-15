package practice;

import java.util.Scanner;

public class C33_NestedIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz");
        String sifre = scan.next();
        char ilkHarf = sifre.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z'){
            if (ilkHarf == 'A'){
                System.out.println("Gecerli Sifre");
            } else{
                System.out.println("Gecersiz Sifre");
            }
        }else if (ilkHarf>='a' && ilkHarf<='z')

    {
        if (ilkHarf == 'z') {
            System.out.println("Gecerli Sifre");
        } else {
            System.out.println("Gecersiz Sifre");
        }
    } else

    {
        System.out.println("Lutfen ilk karakter icin sadece harf kullanin");
    }
    }
}
