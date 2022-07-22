package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        bir list olusturalim
        iki yari method dan birinde
        sadece elemanlari degistirelim
        giderinde yeni bir list atayip,
        ayni sayida yeni eleman ekleyelim

        ve her iki method call dan sonra kenid listemizi
        main icerisinde kontrol edelim
         */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("İLk basta list : " + list);
        elemanlariDegistir(list);

        System.out.println("Elemandegistir methodunda sonra list : " + list);

        listDegistir(list);

        System.out.println("listdegistir methodunda sonra list : " + list);
    }

    public static void listDegistir(List<String> list) {

        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("list degistir methodunda : " + list);
    }

    public static void elemanlariDegistir(List<String> list) {

        list.set(0, "Oguz");
        list.set(1, "Murat");
        list.set(2, "Fatih");
        System.out.println("Elamaan degistir methodunda : " + list);
    }
}
