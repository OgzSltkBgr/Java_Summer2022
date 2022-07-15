package practice;

public class C14_DataCasting {
    public static void main(String[] args) {

        //Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
        //yazdirin

        double sayi = 255.36;
        int sayi1 = (int) sayi;
        byte sayi2 = (byte) sayi1;
        System.out.println(sayi);
        System.out.println(sayi1);
        System.out.println(sayi2);
    }
}
