package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1= new Araba();
        // arb1 objesi uzerinden marka variable ina
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        // access modifier kullanarak marka variable ina ulaşımı
        // tamamen serbest yapabilir veya tamamen engelleyebilirm
        // private yaptigimiz modele ise hic ulasamayiz
        // yani access modifier ya hep ya hic diyor

        // modeli degistirelim ama goremeyelim
        // yakiti da gorelim ama degistiremeyelim

        // set ve get yetkilerini ozel olarak tanımlamak isterseniz
        //** 1. adim- ozel yetki tanımlayacaginiz variable lari private yapin   **
        // private bir dataya baska class lardan ulasmak mumkun olmadigindan
        //** 2. adim set yetkisi icin setter, get yetkisi icin getter methodlari olusturualim   **

        arb1.setModel("Supra");// model olarak Suprayi  atadik
        // modeli yazdirma imkanımız yok, cunku getter methodu yok
        System.out.println(arb1.getYakıt());// elektrikli bilgisini yazdırabildik
        // yakiti degistiremeyiz cunku setter methodu yok
    }
}
