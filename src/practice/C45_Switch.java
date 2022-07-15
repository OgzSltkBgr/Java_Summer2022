package practice;

public class C45_Switch {
    public static void main(String[] args) {


        String gun = "cumartesi";
        gun = gun.toLowerCase();

        switch (gun) {

            case "pazartesi":

            case "sali":

            case "carsamba":

            case "persembe":

            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi" :

            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecerli gun adi giriniz");

        }
    }
}
