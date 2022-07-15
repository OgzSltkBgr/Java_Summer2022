package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C24_IfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarını giriniz");

        int uzun = scan.nextInt();
        int kısa = scan.nextInt();

        if (uzun == kısa) {
            System.out.println("Girdiginiz uzunluklara gore sekil kare");
        }else
            System.out.println("Girdiginiz uzunluklara gore sekil kare degil");
    }
}
