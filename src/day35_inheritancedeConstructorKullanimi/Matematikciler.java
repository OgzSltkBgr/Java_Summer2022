package day35_inheritancedeConstructorKullanimi;

public class Matematikciler extends LOgretmen{

    Matematikciler(){
        System.out.println("Matematikciler p.siz constructor caisti");
    }
    Matematikciler(String isim){
        this();
        System.out.println("Matematikciler p.li constructor caisti");
    }

    public static void main(String[] args) {

        Matematikciler obj1 = new Matematikciler("Cuneyt");
    }
    /*
    this() cons call icinde bulunula class daki cons lari
    super() ise parent class da bulunan cons lari cagirir

    this() veya super() parametre yapisina uygun bir cons bulamazsa
    Java CTE verir

    cons konusunda  -gordugumuz this.
    o class daki instance variable lari refere ediyordu

    inheritance da da super. vardir
    super. parent class daki instance variable lari refere eder
     */
}
