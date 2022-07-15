package practice;

import java.util.Locale;
import java.util.Scanner;

public class C21_IfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi girniz");

        String girilenGun =scan.next().toLowerCase();

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilen gun hafta sonu");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("salı") || girilenGun.equals("carsamba") ||
        girilenGun.equals("persembe") || girilenGun.equals("cuma"))
            System.out.println("Girilen gun hafta ici");
        {
            if (!(girilenGun.equals("pazar") || girilenGun.equals("cumartesi")||
            girilenGun.equals("pazartesi") || girilenGun.equals("salı") ||
                    girilenGun.equals("carsamba") || girilenGun.equals("persembe") || girilenGun.equals("cuma")))
            System.out.println("Gecerli bir gun ismi giriniz");
        }
    }
}
