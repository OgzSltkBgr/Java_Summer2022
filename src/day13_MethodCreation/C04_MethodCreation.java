package day13_MethodCreation;

public class C04_MethodCreation {

    public static void main(String[] args) {

        // input olarak verilen 2 integer i toplayipi yazdiran bir method olusturun

        int input1=20;
        int input2=20;

        // method 4 adimda olusturulur
        // 1.adim method call
        //2.adim argumetn eklenmesi gerekiyorsa ekleyelim
        // eger methpdun return type voidde farkli olacaksa
        // bir variable olusturup, method call'u assıgn edelim


        topla(input1, input2);




    }

    public static void topla(int input1, int input2) {
        //3. adim method deklarasyonunda degistirilmesi gereken
        // bolumleri degistir (access modifier, return type vb..)
        // 4. eger return type void diisnda bir seyse
        // return keywordu ve donecek degeri hesaplamaliyiz
        System.out.println("Girilen iki sayini toplami : "+ (input1+input2));

    }
}
