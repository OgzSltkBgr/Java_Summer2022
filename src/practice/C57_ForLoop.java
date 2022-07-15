package practice;

public class C57_ForLoop {
    public static void main(String[] args) {

        String str = "Java guzeldir";

        tersYazdir(str);


    }

    private static void tersYazdir(String str) {
        String tersStr = str.substring(str.length()-1);
        for (int i = str.length()-2 ; i >=0 ; i--) {
            tersStr += str.substring(i,i+1);

        }
        System.out.println(tersStr);

    }
}
