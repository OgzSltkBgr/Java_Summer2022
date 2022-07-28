package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }
    // getter methodu da tek bir satirlik islem yapiyor
    // baska class larin private oldugu icin erisemedigi
    //tasiTuru bilgisini, class icinden alip
    // istenen farkli class lar return ediyor

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }
    //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor o bir satırlık islemde bizim gönderdiğimiz parametreyi instence variable a atıyor.

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }
    // boolean variable lar icin olusturulan gettermethodlarinin ismi
    // isVariable ismi seklinde olur

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
