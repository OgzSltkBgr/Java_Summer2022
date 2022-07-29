package day35_inheritancedeConstructorKullanimi;

public class LOgretmen {
    LOgretmen(){

        System.out.println("LOgretmen p.siz constructor caisti");
    }
    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen p.li constructor caisti");
    }
}
