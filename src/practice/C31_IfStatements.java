package practice;

import java.util.Scanner;

public class C31_IfStatements {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Maas teklifini giriniz");
        int maas =scan.nextInt();

        if (maas >80000){
            System.out.println("Kabul ediyorum");
        }else if (maas<=80000 && maas >=60000){
            System.out.println("Konusabiliriz");
        }else System.out.println("Maalesef kabul edemem");
    }
}
