package day35_inheritancedeConstructorKullanimi;

public class GToyota {
    GToyota() {

        System.out.println("GToyota parametresiz cons");
    }

    GToyota(String isim) {
       // super(isim); EXTENDS OLMADİGİ İCİN super cons call u java kabul etmez
        System.out.println("GToyota parametreli cons");
    }
}
