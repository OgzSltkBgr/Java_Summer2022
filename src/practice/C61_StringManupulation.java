package practice;

import java.util.Scanner;

public class C61_StringManupulation {
    public static void main(String[] args) {

        /*
        Kullanicidan isim isteyrin. Eger ;
        -isim "a" harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
        -isim "Z" harfi iceriyorsa "Girdiginiz isim Z harfi iceriyor"
        -ikisi de yoksa "Girdiginiz isim a veya Z harfi icermiyor" yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = scan.next();

        if (isim.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }else if (isim.contains("Z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }else System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
    }
}
