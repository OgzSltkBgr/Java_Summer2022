package practice;

public class C59_StringManupulation {
    public static void main(String[] args) {
        /*
        String methodlarinin kullanarak " Java ogrenmek123 Cok guzel@ "
        stringini "Java ogrenmek cok guzel." seklinde yazdirin
         */

        String str = " Java ogrenmek123 Cok guzel@ ";

        str =str.replaceAll("\\W", " ");
        System.out.println(str);
        str = str.replaceAll("\\d","").toLowerCase();
        System.out.println(str);
        str = str.trim();
        System.out.println(str.toUpperCase().charAt(0)+str.substring(1)+".");







    }
}
