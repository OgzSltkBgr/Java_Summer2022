package day35_inheritancedeConstructorKullanimi;

public class FMemur  extends EMuhasebe{
    /*
    Extends keyword kullanilan class larda ister default cons bulunsun
    istersek de biz yeni cons-lar olusturalim
    Java cons in ilk satirina
    super(); cons call yazar

    super(); cons call default cons a benzer
    gorunmese de orda vardir ve calisir
    ancak biz ilk satira farkli bir cons call yazarsak
    Java super(); cons unu siler

    Eger biz mudahale edip kendi cons call umuzu olusturmazsak
    Java nin default olarak olusturdugu cons call
    her zaman parametresizdir
    super();

     */
    FMemur(){

        System.out.println("FMemur parametresiz cons");
    }
    FMemur(String isim){

        System.out.println("FMemur parametreli cons");
    }

    public static void main(String[] args) {

        FMemur mmr1= new FMemur("ahmet");

    }
}
