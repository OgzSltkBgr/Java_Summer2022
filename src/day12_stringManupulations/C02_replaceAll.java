package day12_stringManupulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str= "1Bu2gu3n Ja*va- cok g3uz/el";

        //str'i Bugun Java guzel haline getirin
        //replaceAll() deki all'in amaci ayni ozellikteki tum karakterleri kapsamasidir
        //butun sayilari sil
        //butun ozel karakterleri sil

        // tum ozel karakterleri silelim dedigimizde space'lerde siliniyor
        // space!leri korumak icin en basta onlarin yerine cumlede bulunmayacak
        //bir string koyalim
        // "qazwsx"

        str=str.replace(" ", "qazwsx");// boşlukları qazwsx e atadik
        System.out.println(str);
        str=str.replaceAll("\\W",""); // harf ve karakter harici sildik
        System.out.println(str);
        str=str.replaceAll("\\d", ""); // sadece rakamları sildik
        str=str.replace("qazwsx"," "); // qazwsx i boşluk a atadik tekrar
        System.out.println(str);


    }
}
