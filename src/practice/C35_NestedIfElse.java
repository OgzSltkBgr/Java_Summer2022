package practice;

import java.util.Scanner;

public class C35_NestedIfElse {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");

        int yil = scan.nextInt();
        /*
        if (yil%4 != 0){
            System.out.println("Artik yil degil");
        } else if(yil%100 !=0){
            System.out.println("artik yil");
        } else if (yil%400 !=0){
            System.out.println("Artik yil degil");
        } else {
            System.out.println("artik yil");
         */

        if(yil%4==0){
            if (yil%100==0){
                if (yil%400==0){
                    System.out.println("artik yil");
                }
            }else {
                System.out.println("artik yil");
            }
        }else{
            System.out.println("artik yil degil");
        }
    }
}
