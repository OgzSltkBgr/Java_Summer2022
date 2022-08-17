package day44_collections;

import java.util.*;

public class Denme {
    public static void main(String[] args) {
        LinkedList<String> ll1= new LinkedList();
        ll1.add("sari");
        ll1.add("mavi");
        ll1.add("turuncu");
        ll1.add("yesil");
        ll1.add("siyah");
        ll1.add("beyaz");
        ListIterator it1=ll1.listIterator();
        System.out.println(it1.next());
        while(it1.hasNext()){
            it1.next();
        }

        System.out.println(it1.previous());

    }
}
