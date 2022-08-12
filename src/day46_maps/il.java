package day46_maps;

import java.util.Scanner;

public class il {
    public static void main(String[] args) {
        /* emeklilik kontrolü yapan bir program yaziniz
        cinsiyet olarak E (erkek) K (kadın) degiskenlerini kabul etsin
        farkli bir harf veya sembol girilirse hata mesaji versin
        emeklilik için kadinlarda yas siniri 60
        erkeklerde ise 65 olsun
        negatif yas veya 80 den büyük girilirse hata mesaji versin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" + "kadin icin K " + "erkek icin E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (cinsiyet=='E') {

            if (yas>=65){
                System.out.println("Emekli olabilirsiniz");
            } else if (yas<65) {
                System.out.println("Emekliliginize" + (65-yas) + "yil vardir");

            } else if (yas<0) {
                System.out.println("Negatif yas degeri giremezsiniz");

            } else System.out.println("Lutfen gecerli bir yas degeri girin");

        } else if (cinsiyet=='K') {
            //  System.out.println("Lutfen yasinizi giriniz");
            if (yas >= 60) {
                System.out.println("Emekli olabilirsiniz");

            } else if (yas < 60 && yas > 0) {
                System.out.println("Emekliliginize" + (60 - yas) + "yil vardir");

            } else if (yas < 0) {
                System.out.println("Negatif yas degeri giremezsiniz");

                //   } else System.out.println("Lutfen gecerli bir yas degeri girin");

            } else System.out.println("Lutfen gecerli bir deger giriniz");

        }
    }
}
