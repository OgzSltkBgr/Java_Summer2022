package practice;

import java.util.Scanner;

public class BayramSorulari5 {
    public static void main(String[] args) {
        /*
         * Problem tanimi : Kulanicidan aracinin hizini aliniz Trafik cezasinin degerini
         * hesaplayin. 55 hiz siniridir. Eger hiziniz 55-74 arasinda ise: Ceza 100
         * $'dir.
         *
         * Eger hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         *
         * Eger hiziniz 85 -94 arasinda ise: Ceza 320 $'dir.
         *
         * Eger hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         *
         * ve ayrica, Eger sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aracin hizini km/s olarak giriniz");
        int hiz = scan.nextInt();
        System.out.println("Ehliyetiniz var mi");
        boolean ehliyet = scan.nextBoolean();

        if (hiz>=55 && hiz<=74 && ehliyet==true){
            System.out.println("Cezaniz 100 $");
        }else if (hiz>=55 && hiz<=74 && ehliyet==false){
            System.out.println("Cezaniz 300 $");
        }else if (hiz>=75 && hiz<=84 && ehliyet==true) {
            System.out.println("Cezaniz 150 $");
        }else if (hiz>=75 && hiz<=84 && ehliyet==false){
            System.out.println("Cezaniz 350 $");
        }else if (hiz>=85 && hiz<=94 && ehliyet==true){
            System.out.println("Cezaniz 320 $");
        }else if (hiz>=85 && hiz<=94 && ehliyet==false) {
            System.out.println("Cezaniz 520 $");
        }else if (hiz>94 && ehliyet==true){
            System.out.println("Cezaniz 500$");
        }else if (hiz>94 && ehliyet==false) {
            System.out.println("Cezaniz 700$");

        }
    }
}
