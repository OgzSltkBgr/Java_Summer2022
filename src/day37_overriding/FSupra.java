package day37_overriding;

public class FSupra extends EToyota{


    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private method lar override edilemez
        Eger child class da parent class daki private method ile
        ayni signature da bir method olusturursak
        bu overriding method OLMAZ
         */
    }

    @Override
    void motor() {
        System.out.println("Sırali 6 silindir 2JZ motor kullanır");
        /*
        @Override notasyonu Javaya bir gorev verir
        Java, bu notasyonla birbirine bagli olan iki methodu
        surekli kontrol eder
        Eger parent class daki overridden method u silerseniz
        CTE verir

        @Override notasyonu kullanmak mecburi degildir
        Eger Overridding method silinirse, kodun CTE vermesini istersek
        @Override notasyonu kullanmaliyiz
         */
    }
}
