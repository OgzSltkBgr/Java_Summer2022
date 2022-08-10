package day45_collections;

import java.util.ArrayList;
import java.util.List;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        /*
        Coolections<DataTuru> nü Object seçmeniz durumunda
        collectiona afarkli data turlerinden objeler koymanıza iizn verir
        Bu depolama açısından bize esneklik sağlar
        ancak işlem yaparken tum objeleri object olarak tanımladıgımızdan
        cok fazla casting yapmamiz gerekebilir
         */

        List<String> liste = new ArrayList<>();
        //liste.add(5);
        //liste.add('');
        //liste.add(true);

        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add('a');
        list.add(true);

        System.out.println(list);
    }
}
