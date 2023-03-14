package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        // bir onceki swap sorusunu bos kova kullanmadan yapin
        int sayi1 = 60;
        int sayi2 = 90;
        sayi2= sayi2-sayi1;
        sayi1= sayi2+sayi1;
        sayi2=sayi1-sayi2;
        System.out.println(sayi1);
        System.out.println(sayi2);

    }
}
