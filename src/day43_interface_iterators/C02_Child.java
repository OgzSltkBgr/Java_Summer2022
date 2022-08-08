package day43_interface_iterators;

public class C02_Child implements I01_InterfaceBodyolanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    parent interface de abstract olan 3 ethod u implement ettigimizde Java itirazi durdurur
    sonradan ekledigimiz default ve static keyword ile tanimladigimiz
    method lari implemen etmemiz sorun olusturmadi

    O zamannicin 2 keyword (static ve dafault) tanimlanmistir ?
     Bu iki farkli kelimenin amaci
     child class lardan bu method a nasil erisilebilecegini belirlemek icindir
     static keyword kullanilirsa child class lardan bu method a erismek icin
     interfaceAdi.methodAdi yeterli olur

     default keyword kullanilirsa method a erismek icin obje olusturulmalidir
     */

    public static void main(String[] args) {
        I01_InterfaceBodyolanMethod.direksiyon();

        C02_Child obj= new C02_Child();
        obj.teker();

    }
}
