package day25_constructor;

public class C02_Constructor {

    public static void main(String[] args) {

        C01         obj1        =   new         C01()           ;
     // class adi   objenin adi     keyword     constructor

        /*
        Javada bir obje olusturabilmek icin mutlaka bir
        constructor kullanamazsiniz
         */
        System.out.println(obj1.sayi); // 0
        obj1.deneme(); // C01 den deneme method calisir
    }
}
