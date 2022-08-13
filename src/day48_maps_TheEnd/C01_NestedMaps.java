package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {
        /*
        eger bir elementle ile ilgili tutacagimiz bilgiler coksa veya kompleks ise
        bu defa ic ice map kullanmayi tercih edebiliriz

        ic ice map kullandigimizda daha fazla datayı,
        daha duzenli olarak tutma imkanımız olur ancak
        bilgiye ulasmak ve manipule etmek zorlasacaktır

        Ornek olarak dunki map imizi maplerden olusan bir map olarak olusturalim
        sinifList.put(no=102,isim=Enes,soyisim= Cem,brans= Tester);
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Devops");
         */

        Map<String,String> ogr101=new HashMap<>();
        ogr101.put("isim","Enes");
        ogr101.put("soyisim","Cem");
        ogr101.put("brans","Tester");

        Map<String,String> ogr102=new HashMap<>();
        ogr102.put("isim","Taha");
        ogr102.put("soyisim","Emre");
        ogr102.put("brans","JDev");

        Map<String,String> ogr103=new HashMap<>();
        ogr103.put("isim","Derya");
        ogr103.put("soyisim","Deniz");
        ogr103.put("brans","Devops");

        Map<Integer,Map<String,String>> ogrencinestedMap=new HashMap<>();
        ogrencinestedMap.put(101,ogr101);
        ogrencinestedMap.put(102,ogr102);
        ogrencinestedMap.put(103,ogr103);

        Set<Map.Entry<Integer,Map<String,String>>> ogrenciEntrySeti= ogrencinestedMap.entrySet();
        for (Map.Entry each :ogrenciEntrySeti){
            System.out.println(each);
        }
        // 102 nolu kişinin ismini yazdiralim

        System.out.println(ogrencinestedMap.get(102).get("isim"));

    }
}
