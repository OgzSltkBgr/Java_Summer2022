package day36_inheritanceDataTypeKullanimi;

public class APersonel {
        /*
        ---------  Inherintance Data type kullanimi ve overriding  ---------------

1 - Inherintance'da child class'dan olusturacagimiz objelerde data turu olarak parent class'lari secebiliriz.

2 - Child class'daki bir obje'nin child class ozelliklerini degil de, parent class'a ait ozelliklerini
vurgulamak istersek bu yonteme basvururuz.

3- Bu asamada eger parent class'da genel olarak belirlenmis bir ozellik, chil class'da spesifiklestirilmis ise
(override) daha guncel oldugu icin chil class'daki gecerlidir.
   Burada onemli nokta su, bir objenin ozelligini aramaya data turunden baslariz, orada bulamazsak kullanilmaz,
bulursak,daha gunceli var mi diye overriding aranir.
         */
    String isim ="Isim belirtilmedi";
    String soyisim ="Soyisim belirtilmedi";
    String departman = "Departman belirtilmedi";

    protected  void maas(){
        System.out.println("Tum personelimiz maas alir");
    }

    protected  void sigorta(){
        System.out.println("Tum personelimiz sigortalidir");
    }

}
