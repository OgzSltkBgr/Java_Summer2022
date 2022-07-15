package practice;

import java.util.Scanner;

public class C20_IfStatements {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        //isimlerini yazdirin
        //Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        //ilkHarf=S output = “Sali”

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin bas harfini giriniz");

        String ilkHarf = scan.next().toUpperCase();

        if (ilkHarf==("P").toUpperCase()){
            System.out.println("Pazar, Pazartesi veya Persembe");
        }
        if (ilkHarf==("S").toUpperCase()){
            System.out.println("Sali");
        }
        if (ilkHarf==("C").toUpperCase()){
            System.out.println("Carsamba, Cuma veya Cumartesi");
        }

    }
}
