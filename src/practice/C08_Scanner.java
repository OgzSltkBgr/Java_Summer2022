package practice;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        // Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yaricap giriniz");
        double r = scan.nextDouble();

        System.out.println("Cemberin cevresi =" + (2*3.14*r));
        System.out.println("Dairenin alani = " + (3.14*r*r));
    }
}
