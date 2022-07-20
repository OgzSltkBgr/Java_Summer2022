package day20_Arrays;
import java.util.Arrays;
public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[] = new int[3];

        System.out.println(sayilar); // [I@19dfb72a
        // non-primitive data turundeki datalari
        // her zaman direkt yazdiramayabiliriz
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0] 'int in default degeri'

        sayilar [0]= 10;
        sayilar [2]= 5;
        sayilar [1]= 3;

        System.out.println(sayilar); // [I@19dfb72a
        System.out.println(Arrays.toString(sayilar)); //[10, 3, 5]

        String siniflist[]= {"ali", "ayse", "ahmet"};
        System.out.println(Arrays.toString(siniflist));//[ali, ayse, ahmet]

        siniflist[1]= "Hasan";

        System.out.println(Arrays.toString(siniflist));//[ali, Hasan, ahmet]

        System.out.println(siniflist[1]); // Hasan








    }
}
