package practice;

public class C47_Switch {
    public static void main(String[] args) {

        int sayi =1000;

        switch (sayi) {
            case 10 :
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100 :
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default :
                System.out.println("Lutfen gecerli bir sayi giriniz");
        }
    }
}
