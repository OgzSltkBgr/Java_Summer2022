package day22_multipleDimansionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*
        tek katli arraylerde arrayi direk yazdiramiyoruz
        cunku array non-primitive data turudur ve
        her non-primitive data direkt yazdirilamayabilir

        ancak arrayin icerisindeki elementleri direkt yazdirabiliyoruz
        cunku genelde primitive data turu veya String elementler kullaniliyordu

        Multi-dimensional arraylerde en dikkat edecegimiz konu
        ulasmak istedigimiz elementin bir array mi yoksa
        primitive data mı oldugudur

         */
        int [][] sayilar ={{1,2,4,5},{3,4}};
        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array var
        sayilar[0] ==> [1,2,4,5]

        ancak en icerideki elementlere ulasirsak direkt yazdirabiliriz
         */
        System.out.println(sayilar[0]); // [I@19dfb72a
        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]

        System.out.println(sayilar[0][1]); // 2
        System.out.println(sayilar[1][0]); // 3

        System.out.println(Arrays.toString(sayilar));// [[I@19dfb72a, [I@17c68925]
        System.out.println(Arrays.deepToString(sayilar)); //[[1, 2, 4, 5], [3, 4]]

        /*
        Array'i iki sekilde declare edebiliyorduk
        1- Elemanlari direkt yazabiliriz
        int [] [] sayilar = {{1, 2, 4, 5}, {3, 4}}

        2- Outer ve inner array'lerin uzunluklarini belirtere olusturabiliriz
        int [][] sayilar = new int [3][4];

        Ancak ikinci yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
        Bu ornek icin outer array'in 3 tane inner array'i vardir
        Her bir inner array'in ise 4'er elemani vardir.

        Eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
        mecburen 1.yontemi kullanmalisiniz
        */
        int arr[][] = new int [3][2]   ;
        System.out.println(Arrays.deepToString(arr));
    }
}
