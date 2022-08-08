package day43_interface_iterators;

public interface I01_InterfaceBodyolanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class da olfumuzu dusunsek
    iki tane access modifier kullanma ihtimali OLAMAZ

    asagidaki method da goreceginiz gibi
     interface de istisnai olarak body si olan methodlar olusturulabilir
     Bu ozellik Java 8 den sonra kullanilmaya baslamistir
     bu ozellikten once, bir interface e yeni bir method eklememiz gerektiginde
     eskiden beri bu interface i implemen eden tum class lara gidip
     yeni eklenen method u override etmemiz gerekirdi

     bu ozellik sayesinde basina default veya static keyword ekleyerek
     interface de yeni ve body si olan bir method olusturursak
     nu method un child class lar taradından override edilme mecburiyeti olmaz
     ve eskiden implemet etmiş class lari degistirmemiz gerekmez

     Bu istisnai bir durumdur ve interface icin olusturtulan
     genel kurallari bozmaz

     Bu method larin body leri olsa da concrete method denmez
     ama override edilme mecburiyetleri yoktur

     buradaki default kelimesi access modifier degil
     istisnai durumun belirtilmesi icindir

     O zamannicin 2 keyword (static ve dafault) tanimlanmistir ?
     Bu iki farkli kelimenin amaci
     child class lardan bu method a nasil erisilebilecegini belirlemek icindir
     static keyword kullanilirsa child class lardan bu method a erismek icin
     interfaceAdi.methodAdi yeterli olur

     default keyword kullanilirsa method a erismek icin obje olusturulmalidir

     */

    public default void teker(){
        System.out.println("tum arabalarin tekeri vardir");
    }
    public static void direksiyon(){
        System.out.println("tum arabalarin direksiyonu vardir");
    }
}
