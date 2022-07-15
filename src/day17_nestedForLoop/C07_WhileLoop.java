package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {

        /*
        artış yada azalış miktarını yazmazsak sonsuza gider. Ornek..

        int sayi = 10;
        while (sayi<50){
            System.out.println(sayi);
        }
         */
        int bas = 20;
        int bitis =50;
        for (int i = bas; i <=bitis ; i++) {
            if ((i%2==0)){
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        int temp =bas;
        while (temp<=bitis) {
           if (temp%2==0){
               System.out.print(temp + " ");
           }
           temp++;

        }
    }
}
