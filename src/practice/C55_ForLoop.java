package practice;

public class C55_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 5 Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1 den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin
         */

        int sayi = 96;

        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print(i+",");
            }

        }

    }
}
