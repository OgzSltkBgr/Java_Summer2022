package practice;

public class C18_Concatenation {
    public static void main(String[] args) {

        /*
        Asagida verilen variable’lari kullanarak istenen sonuclari yazdiran programlari yaziniz.

        Variables                            Istenen Yazilar
        String str1= “Java”;                 1) Java Guzel 54
        String str2= “Guzel”;                2) Java 5 Guzel
        int sayi1=5;                         3) Java 94
        int sayi2=4                          4) Java 19
                                             5) 54 Guzel
         */

        String str1= "Java";
        String str2= "Guzel";
        int sayi1 = 5;
        int sayi2 = 4;

        System.out.println(str1+" "+str2+ " "+sayi1+sayi2);
        System.out.println(str1+" "+ sayi1+" "+str2);
        System.out.println(str1+ " "+ (sayi1+sayi2)+ sayi2);
        System.out.println(str1+ " "+(sayi1-sayi2)+ (sayi1+sayi2));
        System.out.println(""+sayi1+sayi2+" "+str2);
    }
}
