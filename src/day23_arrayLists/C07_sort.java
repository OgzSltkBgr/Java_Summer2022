package day23_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        System.out.println(urunler);

        /*
        List ile gelen sort methodunda siralama ozelliginin girmek gerekiyor
        bunun yerine Collections class indan sort methodunu kullaniyoruz
        bu method listemizi natural order gore siralar
         */

    }
}
