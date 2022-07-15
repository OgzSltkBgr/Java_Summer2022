package practice;

public class C13_DataCasting {
    public static void main(String[] args) {
        //Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        int sayi = 150;
        short sayi1= (short) sayi;
        byte sayi2= (byte) sayi;
        System.out.println(sayi);
        System.out.println(sayi1);
        System.out.println(sayi2);
    }
}
