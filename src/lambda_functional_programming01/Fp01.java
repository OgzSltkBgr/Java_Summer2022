package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {
        /*
        1) Lambda Functional Programming Java 8 ile kullanilmaya baslamistir
        2) Functional Programming de "Ne yapılacak" (What to do) üzerinde yogunlasilir.
            Structured Programming (How to do)nasıl yapılacak uzerine yogunlasir
        3) Functional Programming, Arrays ve Collections ile kullanilir.
        4) "entrySet() methodu ile map Set e dousturulerek Functional Programming de kullanılabilir.

         */

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
        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKupCarpimi(liste);
        getMaxEleman(liste);
        getMaxEleman02(liste);
        getYedidenBuyukMin(liste);
        getYedidenBuyukMin2(liste);
        getYedidenBuyukCiftMin2(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);
//1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    }

    public static void listElemanlariniYazdirStructured(List<Integer> list) {

        for (Integer w : list) {
            System.out.print(w + " ");
        }

    }

    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));
        // stream() methodu collectiodan elementleri dahil etmek icin ve methodlara ulasmak icin kullanilir

    }
    //2)Çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer> list) {

        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //2)Çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }
    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        // Elemanların degerleri degisecekse map() methodu kullanılır
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {

        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {

        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupCarpimi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);
    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer> list){
        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t :u);
        System.out.println(max);
    }
    // 2.Yol:
    public static void getMaxEleman02(List<Integer> list){
        Integer max=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("max = "+max);
    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void getYedidenBuyukMin(List<Integer> list){
        Integer min=list.stream().distinct().filter(t-> t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
        System.out.println(min);
    }
    // 2.Yol
    public static void getYedidenBuyukMin2(List<Integer> list){
        Integer min=list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println(min);
    }
    // 3.Yol
    public static void getYedidenBuyukCiftMin2(List<Integer> list){
        Integer min=list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(min);

    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){

        List<Double>sonuc=list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);
    }
}