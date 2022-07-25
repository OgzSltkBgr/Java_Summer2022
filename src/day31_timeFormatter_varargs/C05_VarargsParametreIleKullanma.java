package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(4,"Ali","Ayse","Ismail","Ahmet","Akin");

        /*
        Varargs teorik olarak sonsuz sayida element alabilir
        bir method da parametre olarak varargs varsa
        varargs in sinirlarini bilebilmesi icin
        parametrelerin sonuncusu olamlidir
        oncesinde farkli parametreler olabilir ama
        varargs dan sonra parametre OLAMAZ

        Bu kuraldan oturu bir method da sadece 1 tane varargs olabilir
         */
    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime = kelime[0];

        for (String each :kelime) {
            if(each.length()>enUzunKelime.length()) {
                enUzunKelime=each;
            }

        }
        System.out.println("Girilen kelimelerden en uzunu : " + enUzunKelime);
    }
}
