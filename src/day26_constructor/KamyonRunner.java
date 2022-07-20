package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1 = new Kamyon();
        System.out.println("Kamyon ozellikleri " + kamyon1.toString());

        Kamyon kamyon2=new Kamyon("Mercedes", "Axor", 2010, 250000);

        Kamyon kamyon4 = new Kamyon("Scania", "s540");
    }
}
