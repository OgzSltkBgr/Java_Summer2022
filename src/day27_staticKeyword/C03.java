package day27_staticKeyword;

public class C03 {
    int x;
    static int y;

    C03(int i){
        x+=i;
        y+=i;
    }

    public static void main(String[] args) {
        new C03(2);

        C03 dnm=new C03(3);
        System.out.println(dnm.x + "," + dnm.y);
    }
}
