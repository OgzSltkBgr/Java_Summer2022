package day35_inheritancedeConstructorKullanimi;

public class BParent extends AGrandParent {
    protected  String isim = "Parent isim belirtilmedi";
    protected  String parentKlupAdi="Parent klubu";
    BParent(){
        System.out.println("parent cons calisti");
    }

}
