package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        // baslangic noktasindan sonra
        // bitis sartina yaklasmıyorsak sonsuz loop olusur

        /*
        ex/
        for (int i = 0; i > -10 ; i++) {
                sout(i);
        }
         */

        // eger ilk deger icin bile bitis sarti saglanmiyorsa
        // for loop calisir
        // ama loop body'si hic bir zaman devreye girmez(calismaz)

        for (int i = 0; i > 5; i++) {
            System.out.println(i);

        }



    }
}
