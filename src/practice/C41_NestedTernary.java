package practice;

import java.util.Scanner;

public class C41_NestedTernary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi = scan.nextInt();

        System.out.println(sayi>=100 ? "uc basamakli veya daha buyuk sayi" :
                        (sayi<10 ? "rakam" : (sayi<100 ? "iki basamakli sayi" : ""))
                );
    }
}
