package day31_timeFormatter_varargs;

public class C07_Varargs {
    public static void main(String[] args) {
        new C07_Varargs().Go(1,"Hello");
        new C07_Varargs().Go(2,"Hello", "hi");

    }
    public void Go(int x, String... y){
        System.out.print(y[y.length-x]+" ");
    }
}
