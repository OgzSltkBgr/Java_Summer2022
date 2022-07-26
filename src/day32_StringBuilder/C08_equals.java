package day32_StringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Jave");
        String str = "Java";

        System.out.println(sb1.equals(sb2));// false
        System.out.println(sb1.equals(sb1));// true
        // StringBuilder da equals methodu ancak aynı obje olursa true doner
        // String deki gibi dusunmemek lazım

        System.out.println(sb1.equals(str)); // false

        System.out.println(sb1.compareTo(sb2));// 0
        System.out.println(sb1.compareTo(sb3));//-4

        /*
        compareTo() iki stringBuilder'i bastan baslayarak
        harf harf karsilastirir
        ilk harfler ayni ise, ikincilere gecer
        ikinciler ayni ise 3.lere gecer ve
        ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir

        eger hic farkli harf yoksa
        sonuc olarak 0 dondurur
         */


    }
}
