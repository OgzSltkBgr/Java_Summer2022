package day25_constructor;

public class C03 {
    /*
    proje olustururken bazi class lar run etmek icin degil
    variable ve method olusturup
    bunlari baska class lardan kullanmak icin olusturulur
     */

    /*
    Default constructor, parametresizdir
    goremesek bile ihtiyac oldugunda calisir
    // Cok kıskanctir,benim ustume gul koklarsan ben burda durmam der
    Parametreli yada parametresiz constructor olusturuldugunda
     java default constructor i siler
     */

    C03 (){  // default constructor degil parametresiz constructor


    }
    /*
    olusturdugumuz parametresiz bu constructor
    default constructor ile bire bir aynidir
    ama biz olusturdugumuz icin buna
    default constructor deriz
    parametresiz constructor deriz.
     */

    String isim="Etka";
    public void  method01(){
        System.out.println("C03 method calisti");
    }
}
