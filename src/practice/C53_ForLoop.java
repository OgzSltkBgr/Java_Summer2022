package practice;

import java.util.Scanner;

public class C53_ForLoop {
    public static void main(String[] args) {
        // Ekrana 10 kez yazdirma
        String str = "Java guzeldir";

        for (int i = 1; i <11 ; i++) {
            System.out.println(str);

        }
            // 10 ile 30 arasındaki sayilari aralarinda virgul olarak aynı satırda yazdirin

            int bas =10;
            int son=30;
        for (int i = bas; i <=son ; i++) {

            if (i<son) {
                System.out.print(i+",");
            }else {
                System.out.println(i);
            }
        }

        // 100 den baslayarak 50'ye kadar olan sayilari aralarinda virgul olarak ayni satırda yazdirin

        for (int i = 100; i >=50 ; i--) {

            System.out.println(i+",");

        }



    }

}
