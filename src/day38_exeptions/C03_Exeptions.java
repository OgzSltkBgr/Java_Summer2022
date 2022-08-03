package day38_exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exeptions {
    public static void main(String[] args) {

        /*
        Marketteki tum urunleri bir array de tutugumuzu varsayalim
        Kullaniciya index sorup, o indexteki urunu yazdiran bir
        program hazirlayalim
        Kullanici urun sayisindan buyuk bir index girerse
        exeption vermesinin onune gecelim
         */
        String urunler[]= {"Nutella", "Cokokrem","Sut", "Cay", "Findik"};

        Scanner scan = new Scanner(System.in);
        System.out.println("İstediginiz urunun sira nosunu giriniz");

        /*
         try catch blogu 3 bolumden olusur
        try bolumune bizim calistirmayi dusundugumuz ama risk olusturdugunu dusnudugumuz kısmı yazarız
        catch parantezi bizim yakalamayi dusundugumuz hatayi(exeptionu) yazar
        catch blogu o problem yakalnadııgnda ne yapacagini yaziyoruz
         */
        int istenenSira=0;
        try {
            istenenSira= scan.nextInt();
        } catch (InputMismatchException e) {
        //    e.printStackTrace();
            System.out.println("Urun idexi icin bir tam sayi girmeniz gerekli");
            System.out.println(e);

        }
        /*
        catch blogunun onundeki parantezde
        exeptioon class inin ismi ve yaninda
        yakalanan exeptionu atadigimiz variable in ismi olur (e)

        Eger yakalanan exeptioın ile ilgili bilgileri
        kullaniciya vermek isterseniz bu objeyi kullanabilirsiniz
        Eger exeption ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
        e kullanilmasa da kod calisir
         */

        try {
            System.out.println("Aradiginiz urun : " + urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                    "\nSira numarasi en fazla : " + urunler.length + " olabilir");
        }


    }
}
