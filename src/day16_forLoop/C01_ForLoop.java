package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // verilen pozitif bir tam sayinin
        // pozitif tam bolenlerini yazdıralim

        int input=120;

        for (int i = 1; i <=input ; i+=2) {

            if (input%i==0) {
                System.out.print(i + " ");
            }

        }
        for (int i = 1; i <=input ; i=i+2) {

            if (input % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
