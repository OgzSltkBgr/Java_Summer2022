package practice;

import java.util.Scanner;

public class BayramSorulari8 {
    public static void main(String[] args) {

        //        1
        //        2 3
        //        4 5 6
        //        7 8 9 10
        //        11 12 13 14 15
        //        16 17 18 19 20 21
        //        22 23 24 25 26 27 28
        //        29 30 31 32 33 34 35 36

        int say=0;
       for (int i = 1; i <9 ; i++) {
           for (int j = 1; j <=i ; j++) {
               say+=1;
               System.out.print(say+ " ");
           }
           System.out.println("");

    //   Scanner scan=new Scanner(System.in);
    //   System.out.println("bir satır numarası girin..");
    //   int satir=scan.nextInt();
    //   int say=0;
    //   for (int i = 1; i <= satir; i++) {
    //       for (int j = 1; j <= i ; j++) {
    //           say+=1;
    //           System.out.print(say+" ");
    //       } System.out.println("");
        }
    }
}
