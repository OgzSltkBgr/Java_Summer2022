package day12_stringManupulations;

public class C05_substring {
    public static void main(String[] args) {

        String input= "Veli";

        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);
        System.out.println(tersInput);
    }
}
