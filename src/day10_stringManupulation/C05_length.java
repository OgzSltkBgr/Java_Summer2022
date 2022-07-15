package day10_stringManupulation;

public class C05_length {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.length()); // str in karakter sayisini dondurur

        System.out.println(str.charAt(str.length()-1)); // str in karakter

        System.out.println(str.charAt(str.length()-3)); // str in karakter

        /*
        Java'da null pointer (isaretleyici) bir deger degil,
        karsisina yazildigi variable'in hic bir deger almadiginin isaretcisidir
        */

        String str2= ""; // str2'ye bir deger atanmis ve bu deger : hicliktir.

        System.out.println(str2.length()); //

        String str3=null;   // str3'ye bir deger atanmis midir HAYIR
                            // null bu deger atamamayi isaret etmektedir

        System.out.println(str3.length()); // bir deger atanmamais ki nasil uzunlugu olsun
                                            // NullPointerException olarak hata verir


    }
}
