package day12_stringManupulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim = "Suleyman";
        String soyisim = "Karanfil";
        String kartNo= "1234 4534 2343 3434";

        System.out.println(isim.substring(3)); // eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); // fil
        System.out.println(soyisim.substring(5,8)); // fil

        // isim ve soyismin ilk harfi buyuk harf, geriye kalan x
        // kredi kartinin ilk 4 rakami gorunsun geriye kalan x

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w", "*");

        String soyIsimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyIsimGeriyeKalanlar=soyisim.substring(1).replaceAll("\\w", "*");

        String kkIlk=kartNo.substring(0,4);
        String kkGeriyeKalanlar= " *** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "
                +soyIsimIlkHarf+soyIsimGeriyeKalanlar+"\n" +
                kkIlk+kkGeriyeKalanlar );
    }
}
