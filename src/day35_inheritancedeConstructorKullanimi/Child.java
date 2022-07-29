package day35_inheritancedeConstructorKullanimi;

public class Child extends BParent {

    String isim ="Child isim belirtilmedi";
    protected  String childKlupAdi="Child klubu";
    Child(){
        System.out.println("Child cons calisti");
   }

    public static void main(String[] args) {
       // AGrandParent gp1= new AGrandParent();
        // bu objeyi olusturmak icin Grandpa Cons, calisir
        // Parent veya Child cons calismaz

        Child child1= new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        // child1 objesi icin child cons calisti
        /*
        Java da bir class i kullanabilmek icin
        o class dan obje olusturur dolayisiyla
        o class in constructorını kullanirdik

        Java inheritance da parent class lardaki ozellikleri kullanabilmek icin
        o class larin constructor larını otomatik calistiran bir yapi kurmustur.

        Ornegin biz child class inda
        Child class indan bir obje olusturmak istedigimizde
        Child constructorını kullaniriz

        Java Child(){} gordugunde
        once parent in cons ini calistirmam lazim der
        buradan parent cons a gider
        Parent class inda Parent(){} gorunce
        once bunun parent inin yani GrandParent cons calismasi gerekir der
        Boylece extends keyword olmayan class akadar gişder
        ve oradan baslyarak tum cons lari asagi dogru calistirir
         */

    }
}
