package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        Eger bir class'in icerinde herhangi bir hesaplama yapip
        bunu da kalici olarak saklamak istersek
        kodumuzu sade ve amlasilir tutmak icim
        islemi bir method'da yapip
        sonucunu main method'a dondurebiliriz
        Return type'i void olmayan bir method'un sonucunu main method'da bir variable'a atama yaparsak
        pragramin geri kalninda bu yeni degeri kullanma sansimiz olur
         */


        // kullanicidan sehir ismini ve dogum tarihini alip
        // bunlari programda kullanacagimiz formatta bize donduren bir method olusuturun
        // Sehir ismin programimizda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println("Girdiginiz sehir : "+ sehir);
        System.out.println("Girdiginiz tarih : "+ tarih);
    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan = new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil =scan.nextInt();
        if (yil>1900 && yil<2100){
            tarih = yil+"-";
        }else{
            System.out.println("yil icin gecerli bir sayi yazmalisiniz(1900-2100)");
        }
        System.out.println("kacinci ay oldugunu tamsayi olarak yaziniz");
        int ay= scan.nextInt();

        if (ay<=0 || ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir");
        }else if (ay<10){
            tarih = tarih+"0"+ay+"-";
        }else{
            tarih=tarih+ay+"-";
        }
        System.out.println("Lutfen ayin kacinci gunu oldugunu tam sayi olarak giriniz");
        int gun =scan.nextInt();

        if (gun<=0 || gun>31 ){
            System.out.println("Gun no olarak 1-31 arasinda sayi girilmelidir");
        }else if (gun<10){
            tarih =tarih+"0"+gun;
        }else{
            tarih=tarih+gun;
        }
        return tarih;

    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz");
        String sehirAdi = scan.next().toUpperCase();
        return sehirAdi;
    }
}
