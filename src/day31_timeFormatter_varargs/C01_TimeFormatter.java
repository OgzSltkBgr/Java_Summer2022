package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : " + tarihSaat);
        // ilk olusturulan tarih : 2022-07-25T21:40:47.458225900

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy hh:mm a");
        System.out.println("dtf = " + dtf.format(tarihSaat));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm a");
        System.out.println("dtf2 = " + dtf2.format(tarihSaat));
    }
}
