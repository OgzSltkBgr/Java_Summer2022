package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

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
        //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    }
    public static void listElemanlariniYazdirStructured(List<Integer>list){

        for (Integer w:list) {
            System.out.print(w+" ");
        }

    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
        public static void listElemanlariniYazdirFunctional(List<Integer>list){

            list.stream().forEach(t-> System.out.print(t+" "));
        // stream() methodu collectiodan elementleri dahil etmek icin ve methodlara ulasmak icin kullanilir

        }
    //2)Çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer>list){

        for (Integer w :list) {
            if (w%2==0){
                System.out.print(w+ " ");
            }
        }
    }
    //2)Çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer>list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }
    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer>list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+ " "));
        // Elemanların degerleri degisecekse map() methodu kullanılır
    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer>list){

        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer>list){

     Integer toplam=list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }
}
