package practice;

import java.util.Scanner;

public class C51_lastIndex {
    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf isteiyn, harfin cumlede var olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf =scan.next().charAt(0);

        if (cumle.lastIndexOf(harf) != -1){
            System.out.println("Harf cumlede geciyor");
        }else
            System.out.println("Harf cumlede gecmiyor");

    }

}
