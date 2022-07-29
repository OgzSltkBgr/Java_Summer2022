package day35_inheritancedeConstructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her class da gorunmese bile bir constructor vardir
    Bu class dan obje olusturmak istedigimizde
    default constructor devreye girecektir.

    Default constructor i gozlemleyemeyecegimiz icin
    onun yerine kullanılabilecek paremetresiz constructor olusturualim
     */
    protected  String grandpaKlupAdi="Grandpa klubu";

    AGrandParent() {
        System.out.println("Grandpa cons calisti");
    }

}
