package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1);
        /*
        Bişzim olusturdugumuz date ve time
        camli saat veya tarih degildir
        LocalTime.now(); kullandıgımız satırda o anki tarih veya saati alip b
        bizim variable imiza store eder
        time1 variable inin degeri SABİTTİR

         */


        Thread.sleep(3000);// zamanı durdurur milisaniye kadar
        time1= LocalTime.now();
        System.out.println(time1);


        time1= LocalTime.now();
    }
}
