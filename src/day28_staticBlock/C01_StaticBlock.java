package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static{
        /*
        Static block class uyelerinin tamamindan once calisir
        (main method dan bile once)

        static block class olusturuldugunda calisir
        genelllikle de class la ilgili on ayarlamalar
        veya static variable lara deger atamak icin kullanilir

        static block larin clas icerisinde nerede oldugu onemli degildir once
        static bloklar calisir

        birden fazla static block olursa once yukaridaki calisir
         */
        System.out.println("static blok calisti");
        sayi=10;
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");
        System.out.println(sayi);
    }
    static{
        System.out.println("main method altindaki static block calisti");
    }
}
