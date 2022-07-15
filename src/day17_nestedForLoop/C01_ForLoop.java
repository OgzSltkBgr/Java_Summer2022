package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // verilen Stringdeki kullanilan harfleri
        // tekrarsız olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yapalim

        String input="Java her zaman guzel";

        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W","");//Javaherzamanguzel
        System.out.print(islenecekKelime.substring(0,1)); // J
        benzersizInput+=islenecekKelime.substring(0,1); // J

        for (int i = 0; i <islenecekKelime.length() ; i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){ // Siradaki harfi aliyo bu satir
                System.out.print(","+ islenecekKelime.substring(i,i+1)); // benzersizse yazdiriyo
                benzersizInput+=islenecekKelime.substring(i,i+1); //benzersiz harfi ekliyo
            }

        }
        System.out.println("");
        System.out.println("input: " + input);
        System.out.println("benzersiz input : " + benzersizInput);
        System.out.println("benzersiz harf sayisi : " + benzersizInput.length());

    }
}
