package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan tam sayilar alin
        kullanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */

        Scanner scan = new Scanner (System.in);
        int sayi= 0;

        // while ile yapalim
        /*
        looplarda kullanacagimiz variable ları looptan once olusturmaliyiz
        while loopta, loop dan once olusturdugumuz bu variable a atayacagimiz degeri iyi dusunmemiz gerekiyor

         */

        while(sayi%2==0){

            System.out.println("Lutfen bir tam sayi giriniz");
            sayi=scan.nextInt();

            if (sayi%2==0){
                System.out.println("Girilen sayi cift : "+ sayi);
            }else{
                System.out.println("girilen sayi tek : " + sayi);
            }

            // do while loop ile yapalim
            // do while loopda onceden olusturulan vcariable a hangi deger atandiginin
            // hic bir onemi yok kodumuz her durumda calisir



            do{
                System.out.println("Lutfen bir tam sayi giriniz");
                sayi=scan.nextInt();

                if (sayi%2==0){
                    System.out.println("Girilen sayi cift : "+ sayi);
                }else{
                    System.out.println("girilen sayi tek : " + sayi);
                }



            }while(sayi%2==0);{

            }


        }
    }
}
