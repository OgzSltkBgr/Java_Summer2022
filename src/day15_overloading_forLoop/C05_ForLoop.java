package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        // 1'den 5 e kadar(5 dahil) olan tam sayilari toplayalim
        int toplam=0;

        for (int i = 1; i <=5 ; i++) {

            toplam+=i;

        }
        System.out.println("toplam : " + toplam);

        toplam =0;
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;

        }
        System.out.println("10-20 arasi toplam : " + toplam);
        toplam=0;

        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;

        }
        System.out.println("30-50 arasi cift sayilarin toplami : " + toplam);
        toplam=0;
        // 2. yontem
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }

        }
        System.out.println("30-50 arasi cift sayilarin toplami : " + toplam);
        toplam=0;
        // 1500 ile 1600 arasinda 7 ile bolunebilen sayilari toplayin
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }

        }
        System.out.println("1500-1600 arasi yedi ile bolunebilen sayilarin toplami : " + toplam);
    }
}
