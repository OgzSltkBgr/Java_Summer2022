package day27_staticKeyword;

public class C01 {

    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
        /*
        class level da iki tur variable olusturabiliriz
        static variable larin diger adi class varaible idi
        instance ise obje variable idi

        static variablr lar tum class  tan kullanılabilirken
        instance variable lar static olmayan methodlarda direkt kullanılabilir
        instance variable lara static method dan ulasmak istersek
        obje olusturmamız gerekir

        instance variable lar obje variable oldugu icin
        herhangi bir satirda instance variable in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir

        static variable lar class variable oldugu icin
        herhangi bir satirda variable in degerinin ne oldugu bulmak icini
        CLASS IN BASINDAN itibaren kod incelenmelidir
         */

        C01 obj1 = new C01();
        System.out.println("obj1 in rakam degeri : " +obj1.rakam);

        System.out.println("obj1 in sayi degeri : " +sayi);

        obj1.rakam+=1;
        sayi+=1;

        System.out.println("obj1 in rakam degeri : " +obj1.rakam);

        System.out.println("obj1 in sayi degeri : " +sayi);

        C01 obj2 =new C01();
        System.out.println("obj2 in rakam degeri : " +obj2.rakam);

        System.out.println("obj2 in sayi degeri : " +obj2.sayi);

        obj2.rakam+=1;


    }
}
