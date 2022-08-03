package day38_exeptions;

public class Soru2 {
    public static void main(String[] args) {
        System.out.println(exeptions()); // acde
    }
    @SuppressWarnings("finally")
    public static String exeptions() {
        String result ="";
        String v=null;
        try {
            try {
                result=result+"a";
                v.length();
                result=result+"b";
            }catch (NullPointerException e) {
                result=result+"c";
            }finally {
                result=result+"d";
                throw new Exception();
            }
        }catch (Exception e) {
            result=result+"e";
        }
        return result;
    }
}
