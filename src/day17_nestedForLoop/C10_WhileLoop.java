package day17_nestedForLoop;

public class C10_WhileLoop {
    public static void main(String[] args) {

        boolean dogruMu=false;
        int sayi = 10;


        while (!dogruMu){

            if(sayi>20){ // sart saglandiginda while loop un conditionu(parantez ici) false olmali
                System.out.println("Bu islem tamam "+ sayi + " > 20");
                dogruMu=true; // yukaridaki false oldugu icin bu true oldu. Sartı sagladigi icin tersi oldu.
            }else { // sart saglanmadigi muddetce while loopun kontrol ettigi degisken degismeli
                System.out.println("İstenen sart saglanamadi " + sayi);
                sayi++;
            }
        }
    }


}
