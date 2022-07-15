package day11_stringManupulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok guzel";
        /*
         Verilen bir String'de herhangi bir String veya char'in
         ilk kullaildigi indexi bize dondurur
         */

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.length()-1); // 22
        System.out.println(str.indexOf("j")); // -1
        System.out.println(str.indexOf("mek"));

        // eger istedigimiz index'ten sonrasini kontrol etmek istersek
        // o zaman ayni method'u iki parametreli olarak kullanabiliriz

        System.out.println(str.indexOf("g",(6+1))); // yazilan index'ten baslar

        // yukarıdaki str'da 2. ve 3. e'nin indexlerini bulun
        // 2.e'yi bulabilmek icin 1. e'nin indexine ihtiyacim var

        int ilke=str.indexOf("e");
        int ikincie= str.indexOf("e", ilke+1);

        if (ikincie==-1){
            System.out.println("verilen str'da 2.e yok");
        }else{
            int ucuncue=str.indexOf("e", ikincie+1);
            if (ucuncue == -1) {
                System.out.println("verilen str'da 3.e yok");
            }else{
                System.out.println("verilen str'daki 3.e'nin indexi : " + ucuncue);
            }
        }
    }
}
