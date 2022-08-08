package day43_interface_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List <Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);

        // listedeki tum elementleri INDEX KULLANMADAN 3 artirin
        for (Integer each: liste             ) {
            each+=3;
            System.out.println(liste);
        }
        /*
        Java index yapisi olmayan collectinon lardaki
        elementlere ulasmak veya degistirmek icin
        Iterator ulasmak veya degistirmek icin
        Iterator interface ini olusturmuştur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir
        bunun yerine bize iterator dödüren liste.iterator() methodunu kullaniyoruz
         */
        System.out.println(liste);
        Iterator it1 = liste.iterator();

        System.out.println(it1.next());// 10
        System.out.println(it1.next());// 20
        System.out.println(it1.next());// 30
      //  System.out.println(it1.next());// 30 dan sonra element kalmadıgından NoSuchElementException

        // Iterator de geri donus yok, adim adim sona ulastiktan sonra
        // basa gelmek isterseniz yeniden bir iterator olusturmak gerekir

        // [10, 20, 30]
        Iterator it2=liste.iterator();
        // yeni it2 yi kullanarak listenin tum elementlerini silelim
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste);

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

        Iterator it3=liste.iterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println(liste);

        /*
        Goruldugu gibi Iterator kullanarak yapabildigim
        1- tum collection u yazdirmak
        2- tum collection elementlerini silmek
        Bu da bize yetmez
         */
    }
}
