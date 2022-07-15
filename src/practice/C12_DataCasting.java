package practice;

public class C12_DataCasting {
    public static void main(String[] args) {

        // Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adim adim widening yapin ve yazdirin

        byte sayi = 32;

        short sayi1= sayi;
        int sayi2= sayi;
        float sayi3= sayi;
        double sayi4= sayi;
        System.out.println(sayi);
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println(sayi4);


    }
}
