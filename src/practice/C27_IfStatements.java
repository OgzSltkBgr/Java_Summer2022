package practice;

import java.util.Scanner;

public class C27_IfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("LUtfen ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar2==kenar3) {
            System.out.println("Eskenar ucgen");

        }else
            System.out.println("Eskenar degil");
    }
}
