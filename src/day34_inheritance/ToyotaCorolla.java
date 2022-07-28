package day34_inheritance;

public class  ToyotaCorolla extends Toyota{

    public static void main(String[] args) {
    /*
    child class tan parent class a erisim de access modifier
    kurallarini bypass edemeyiz
    ornegin parent class taki private class uyelerinin
    child class tan kullanmayız
    ayni sekilde parent ve child farkli package larda ise
    parent class daki default access modifier i olan
    class uyelerini child class tan kullanamayiz
     */
        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka);
        System.out.println(arb1.model);

        
    }
}
