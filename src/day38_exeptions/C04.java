package day38_exeptions;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
        Kullaniciya index sorup, o index'teki urunu yazdiran bir program hazirlayalim.
        Kullanici urun sayisindan buyuk bir index girerse exception vermesinin onune gecelim.
         */
        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
        while (true){
            try {
                System.out.println("Istediginiz urunun sira nosunu giriniz.");
                int istenenSira = sayiIsteme();
                System.out.println("Aradiginiz urun : " + urunler[istenenSira - 1]);
                break;
            } catch (Exception exception) {
                System.out.println("Bir tam sayi girmelisiniz. Girebileceginiz maksimum deger " + urunler.length + " olabilir.");
            }
        }
    }
    private static int sayiIsteme() {
        Scanner scan = new Scanner(System.in);
        int sayi= scan.nextInt();
        return sayi;
    }

}
