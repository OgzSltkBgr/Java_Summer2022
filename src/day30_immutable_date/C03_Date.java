package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);

        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getEra() = " + tarih.getEra());
        System.out.println("tarih.getChronology() = " + tarih.getChronology());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getClass() = " + tarih.getClass());
        System.out.println("tarih.isLeapYear() = " + tarih.isLeapYear()); // artık yıl

        LocalDate tarih2 =LocalDate.of(2001,5,15);
        System.out.println(tarih2); // 2001-05-15

        LocalDate tarih3 = LocalDate.of(1990, Month.JANUARY,10);
        System.out.println(tarih3); // 1990-01-10

        System.out.println(tarih.plusDays(100));// 2022-10-31

        System.out.println("tarih.minusDays(100) = " + tarih.minusDays(100));// 2022-04-14

        System.out.println("tarih.isAfter(tarih2) = " + tarih.isAfter(tarih2)); // true

        // iki farkli dogum gunu girildiginde hangiinin daha buyuk oldugunuu bulunuz

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else{
            System.out.println("iki tarih birbiri ile ayni");
        }
    }
}
