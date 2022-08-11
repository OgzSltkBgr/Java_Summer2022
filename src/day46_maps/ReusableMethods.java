package day46_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReusableMethods {

    public static Map<Integer,String> mapOlustur(){
        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, Java");
        sinifList.put(104,"Derya, Deniz, Tester");

        return sinifList;
    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira=1;
        for (String each: ogrenciMap.values()
             ) {
            System.out.println(sira+" - "+each);
            sira++;
        }
    }


    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList = new ArrayList<>();
        String[] eachArr;
        for (String each: ogrenciMap.values()
             ) {
            eachArr=each.split(", ");
            methoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }
        return methoddakiList;
    }
}
