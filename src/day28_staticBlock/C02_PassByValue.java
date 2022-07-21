package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {

        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati)); // 90

        System.out.println(satisFiyati);// 100

        System.out.println(indirimliFiyat(satisFiyati)); // 90

        // iki farklli method da satisFiyati isminde variable olabilir
        // Java buna itiraz etmez cunku, scopelari farklidir.
    }

    public  static  double indirimliFiyat(double orjinalFiyat) {
        // methodumuz %10 indirim yapip
        // yeni fiyati main method'a dondursun

        return  orjinalFiyat*0.9;
    }
}
