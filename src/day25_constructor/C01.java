package day25_constructor;

public class C01 {

    /*
    Java OOp konsept kullandigi icin
    olusturulan her bir class in ihtiyac oldunda obje
    uretebilmesine uygun dizayn etmistir
    Ama her class dan obje uretilmeyebilir

    bunun icin java ihtiyac halinde kullanilmasi icin
    her class da default bir constructor koymustur.

    bu default constructor
    class dan obje olusturuldugunda otomatik olarak calisir

    ornegin bu class da constructor gorunmesine ragmen
    C02 class inda icinde oldugumuz c01 class indan constructor uretebildik

    1- Obje olusturmak icin constructor kullanmak zorundayiz
    2- Constructor'da parametre ile ozellikleri belirlemezsek, java standart bir obje olusturur
    3- Her class'da gormesek bile Java'nin koydugu default constructor vardir

     */

    /*
    obje olusturmak icin construcxtor a ihitiyacımız var
    parametre yazmazsak java spesifik uretir gonderir kafasına gore
    gorunmese bile class da obje olusturuldugunda java yedek constructor  koymustur
     */
    int sayi;

    public void deneme(){
        System.out.println("C01 den deneme method calisir");
    }
}
