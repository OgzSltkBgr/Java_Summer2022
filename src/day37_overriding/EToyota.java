package day37_overriding;

public class EToyota extends DAraba{

    void marka(){
        System.out.println("Markamizz Toyota");
        /*
        super.marka();
        eger hem overridden hem de overridding methodu calismasini istersek
        ilk satira super.marka() yazabiliriz
         */
    }
    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir");

    }

}
