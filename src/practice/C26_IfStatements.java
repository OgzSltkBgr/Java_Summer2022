package practice;

import java.util.Scanner;

public class C26_IfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas = scan.nextInt();

        if (yas<65){
            System.out.println("Emekli olamazsin");
        }else
            System.out.println("Emekli olabilirsin");
    }
}
