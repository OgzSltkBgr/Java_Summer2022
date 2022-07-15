package practice;

import java.util.Scanner;

public class C66_ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen bir String giriniz");
        String str = scan.nextLine();

        String tersStr = str.substring(str.length()-1);

        for (int i = str.length()-2 ; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);
        }if (str.equals(tersStr)){
            System.out.println(str+" " + tersStr);
        }else
            System.out.println("Giriginiz String palindrome degil");



    }
}
