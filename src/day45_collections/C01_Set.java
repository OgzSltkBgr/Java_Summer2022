package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // verilen bir array deki tekrar eden elementleri silip
        // tekrarsiz halini array e ataya kod yaziniz

        int arr[]={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};
        Set<Integer> tekrarsizSet = new HashSet<>();

        for (int each :arr) {
            tekrarsizSet.add(each);
        }
        System.out.println(tekrarsizSet);

        int tekrarsiArr[]=new int[tekrarsizSet.size()];
        int i=0;
        for (int each : tekrarsizSet){
            tekrarsiArr[i]=each;
            i++;
        }

        arr=tekrarsiArr;
        System.out.println(Arrays.toString(arr));



    }
}
