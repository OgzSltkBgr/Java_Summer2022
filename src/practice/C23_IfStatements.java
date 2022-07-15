package practice;

import java.util.Scanner;

public class C23_IfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun adi giriniz");

        String gun = scan.next().toUpperCase();

        if (gun.equals("CUMA")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun.equals("CUMARTESİ")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gun.equals("PAZAR")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if (!(gun.equals("CUMARTESİ") || gun.equals("PAZAR") || gun.equals("CUMA"))){
            System.out.println("Lutfen gecerli bir gun giriniz");
        }
    }
}
