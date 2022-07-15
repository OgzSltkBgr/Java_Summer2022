package practice;

public class C02_Ternary {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi girmesinin isteyin
        Girilen sayi
        10 ise "İki basamakli en kucuk sayi"
        100 ise "Uc basamakli en kucuk sayi"
        1000 ise "dort basamakli en kucuk sayi"
        diger durumlarda "Girdigin sayiyi degistir" yazdirin
        */

        int input = 100;


        switch (input) {
            case 10:
                System.out.println("İki basamakli en kucuk sayi");
            break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi");
            break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi");
            break;
            default:
                System.out.println("Girdigin sayiyi degistir");


        }
    }

}