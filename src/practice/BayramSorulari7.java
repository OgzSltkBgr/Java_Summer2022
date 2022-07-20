package practice;

import java.util.Scanner;

public class BayramSorulari7 {
    public static void main(String[] args) {
        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        String gun = "Pazartesi";
        Scanner scan = new Scanner(System.in);
        System.out.println("kac gun sonrasini gormek istiyosunuz");
        int gun1= scan.nextInt();

              gun1%=7;
            switch (gun1){
                case 0:
                    System.out.println("Pazartesi");
                    break;
                    case 1:
                    System.out.println("Sali");
                    break;
                    case 2:
                    System.out.println("Carsamba");
                        break;
                    case 3:
                    System.out.println("Persembe");
                        break;
                    case 4:
                    System.out.println("Cuma");
                        break;
                    case 5:
                    System.out.println("Cumartesi");
                        break;
                    case 6:
                    System.out.println("Pazar");
                        break;
                default:
                    System.out.println("Gecersiz gun");
            }
        }


    }

