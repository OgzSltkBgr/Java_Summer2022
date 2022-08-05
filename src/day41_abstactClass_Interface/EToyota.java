package day41_abstactClass_Interface;

public abstract class EToyota extends DAraba{

    @Override
    public void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    public void yakit() {

    }
    /*
    Parent class daki standart belirleyici method lar
    (absract method) larin tamami child class tarafindan override edilmelidir

    concrete methodlarin override edilme mecburiyeti yoktur
    istersek override edebiliriz istemezsek etmeyiz

    Aslinda Toyota class i da obje uretecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz
    Toyota class ini da absract yapmamiz guzel olur
     */
}
