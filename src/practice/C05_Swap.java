package practice;

public class C05_Swap {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=0;
        System.out.println(sayi1);
        System.out.println(sayi2);

        sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;

        System.out.println(sayi1);
        System.out.println(sayi2);

        int sayi4 =30;
        int sayi5=40;

        System.out.println(sayi4);
        System.out.println(sayi5);

        sayi4=sayi5-sayi4;  // sayi4 =10
        sayi5=sayi5-sayi4;  // sayi5 =30
        sayi4=sayi5+sayi4;  // sayi4 =40

        System.out.println(sayi4);
        System.out.println(sayi5);



    }
}
