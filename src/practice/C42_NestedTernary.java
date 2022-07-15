package practice;

import java.util.Scanner;

public class C42_NestedTernary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        System.out.println(harf>='a' && harf <='z' ? "Kucuk Harf" :
                (harf>='A' && harf <='Z' ? "Buyuk Harf" : "girdiginiz karakter harf degil"));
    }
}
