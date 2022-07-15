package practice;

public class C72_WhileLoop {
    public static void main(String[] args) {
        // 3 basamakli sayilardan 100 e bolunebilen sayilari yazdirin.
        // for loop ve while kullanin

        int sayi=100;
//
        while (sayi>99 && sayi<999){
            sayi++;
            if (sayi%15==0) {
                System.out.println(sayi +" "+ "15'e bolunebilen sayi");
            }else if (sayi%20==0) {
                System.out.println(sayi+ " "+"20'e bolunebilen sayi");
            }else if (sayi%90==0) {
                System.out.println(sayi+" "+"90'e bolunebilen sayi");
            }
//
        }

        for (int i = 100; i <=999 ; i++) {
            if (i%15==0) {
                System.out.println(i +" "+ "15'e bolunebilen sayi");
            }else if (i%20==0) {
                System.out.println(i+ " "+"20'e bolunebilen sayi");
            }else if (i%90==0) {
                System.out.println(i + " " + "90'e bolunebilen sayi");
            }

        }




        }


        }








