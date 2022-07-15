package practice;

public class C76_WhileLoop {
    public static void main(String[] args) {


        int sayi =549;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int sabit =sayi;

        while(sabit>0){

            birlerBasamagi=sabit%10;
            rakamlarToplami+=birlerBasamagi;
            sabit/=10;

        }System.out.println(sayi+ " sayisinin rakamlar toplami = " + rakamlarToplami);
    }
}
