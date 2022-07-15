package practice;

public class C36_Ternary {
    public static void main(String[] args) {

        int x =112;
        System.out.println((x>5) ? ("Inek") : ("Koyun"));

        int y =1;
        int z =1;

        int a= y<10 ? y++ : z++;    //a=1 y=2
        System.out.println(y + "," + z + "," + a); // 2,1,1

    }
}
