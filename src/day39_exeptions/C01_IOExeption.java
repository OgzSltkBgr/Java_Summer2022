package day39_exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExeption {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Javada bilgidayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz
        Ayni sekilde Java dan bilgisayarimizdaki bir dosyaya ekleme veya update yapmak istersek
        FileOutputStream Class'indan yardim aliriz
         */
        FileInputStream fis = new FileInputStream("src/day39_exeptions/Test.txt");

        /*
        Goruldugu gibi compile time da altini kirimizi cizen her durum
        Compile Time Error degildir
        Java da bazi exeptionlar da
        Compile Time Exeption dir
        OZellikle dosya okuma ve yazma ile ilgili exeptionlar
        Compile Time Exeption dir

        Compile time Exeption olustugunda JAva cozum icin iiki ihtimal onerir
        1- try catch ile cevrelemek
        2- method signature ina throws keyword ile beklenen exeption turunu yazmak

        throws exception sadece olayin farkinda oldugumuzun deklarasyonudur
        exception in handle edilmesinde hicbir rolu yoktur
        Yani try catch ile kontrol altina aldigimiz exeptionlarda
        kod calismaya devam ediyordu
        Ancak throws Exeption yazdigimizda Java bir exeptionla karsilasirsa yine hic bir sey yapmamisiz gibi
        hata mesaji yayinlayip calismayi durdurur
         */

    }
}
