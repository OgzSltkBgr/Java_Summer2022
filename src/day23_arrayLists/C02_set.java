package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
        elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip
        eski urunu, var olan eski urunler listesine ekleyelim
         */
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler = new ArrayList<>();
        // listedeki ikramin yerine biskrem koyakim,
        // ikrami da eski urunler listesine ekleyeleim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+ urunler);
        System.out.println("Eski urunler lisdtesi : " + eskiUrunler);

         yeniUrun="Kahve";
         silinecekUrun="Cay";

         temp=urunler.indexOf(silinecekUrun);
         silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+ urunler);
        System.out.println("Eski urunler lisdtesi : " + eskiUrunler);

        yeniUrun="Findik";
        silinecekUrun="Cekirdek";temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+ urunler);
        System.out.println("Eski urunler lisdtesi : " + eskiUrunler);



    }
}
