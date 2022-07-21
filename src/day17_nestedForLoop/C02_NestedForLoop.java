package day17_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
         // verilen sayiya gore carpim tablosu olusturun
        /*
        input 3
        1 2 3
        2 4 6
        3 6 9
         */
        int input = 3;

        for (int i = 1; i <=input ; i++) { // satırı kontrol edecek

            for (int j = 1; j <=input ; j++) { // sutunu kontrol edecek

                System.out.print(i*j + " ");

            }
            System.out.println(""); // 1 2 3 yazdıktan sonra alt satıra atsın diye bos sout yaptik

        }
    }
}
