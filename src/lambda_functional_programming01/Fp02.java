package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1-)t-> "Logic",(t,u)-> "Logic"
    Bu yapıya "Lambda Expression"
    2-) Functional Programming kapsaminda "Lambda Expression" kullanilabilir ama önerilmez.
        "Lambda Expression"  yerine  "Method Reference" tercih edilir.
    3-) "Method Reference" kullanimi "Class None :: Method Name"

        Aynı zamanda kendi class larınızı da kullanabilirsiniz.
        Örneğin bir Animal class ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
    */
    public static void main(String[] args) {
        //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdir(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKareToplami2(liste);
        tekrarsizCiftElemanlarinKareToplami3(liste);
        tekrarsizCiftElemanlarinKuplerinCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMin(liste);


    }

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    private static void listElemanlariniYazdir(List<Integer> list) {
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) // 1.yol
    // Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0, (Math::addExact));
        System.out.println(toplam);
    }

    //2.yol
    public static void tekrarsizCiftElemanlarinKareToplami2(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce((Math::addExact)).get();
        System.out.println(toplam);
    }

    //3.yol
    public static void tekrarsizCiftElemanlarinKareToplami3(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0, (Integer::sum));
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKuplerinCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1, (Math::multiplyExact));
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMaxEleman(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }

    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void yedidenBuyukCiftMin(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t > 7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
        System.out.println(min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void terSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {
        List<Double> sonuc = list.stream().//Gerekli methodları kullanmamızı sağlar
                distinct().//Tekarlı olanları almaz
                filter(t -> t > 5).//Koşula göre filtreleme yapar
                map(Utils::yarisiniAl).//Her bir elemanın değerini değiştirmeye yarar
                sorted(Comparator.reverseOrder()).//Sıralama yapar
                collect(Collectors.toList());//Elamanları collection'a çevirir.
        System.out.println(sonuc);
        //   public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer>list){
        //       List<Double> sonuc=  list.stream(). // gerekli methodlari kullanmamizi saglar
        //               distinct(). // tekrarli olanlari almaz
        //               filter(t->t>5). // kosula göre filtreleme yapar
        //               map(Utils::yarisiniAl). // her bir elemanin degerini degistirmeye yarar
        //               sorted(Comparator.reverseOrder()). //TERS SIRALAM YAPAR BU METHOD
        //               collect(Collectors.toList()); // //Elamanları collection'a çevirir.
        //       System.out.println(sonuc);

        //    }

    }
}
