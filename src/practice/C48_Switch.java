package practice;

public class C48_Switch {
    public static void main(String[] args) {

        char harf = 'D';

        switch (harf) {
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Gecerli harf giriniz");
        }
    }
}
