package practice;

import java.util.Scanner;

public class C50_indexOf {
    public static void main(String[] args) {

        /*
        Kullanicida bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak
        asagidaki 3 cumleden uygun olani yazdirin

            - Girilen kelime cumlede kullanilmamis
            - Girilen kelime cumlede 1 kere kullanilmis
            - Girilen kelime cumlede 1'den fazla kullanilmis
         */


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("lutfen bir kelime giriniz");
        String kelime=scan.next();

        int ilkkelime=cumle.indexOf(kelime);
        int ikincikelime=cumle.indexOf(kelime,ilkkelime+1);

        if(cumle.indexOf(kelime)==-1){
            System.out.println("kelime kullanilmamis");
        }else if(ikincikelime==-1){
            System.out.println("kelime 1 kere kullanilmis");
        }else {
            System.out.println("kelime 1 den fazla kullanilmis");
        }






    }
}
