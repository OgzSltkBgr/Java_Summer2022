package day27_staticKeyword;

public class C04 {
    static int x;
    int y;
    C04(){
        x+=2;
        y++;
    }
    static int getSquare(){
        return x*x;
    }

    public static void main(String[] args) {
        C04 sm1 = new C04();
        C04 sm2 = new C04();
        int z = sm1.getSquare();
        System.out.println("-x" + z + "-y" + sm2.y);
    }
}
