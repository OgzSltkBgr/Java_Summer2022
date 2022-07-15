package practice;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
        SDET kisaltmasindaki harflerden birini yazmasini isteiyin.
        S girerse "Software"
        D girerse "Developer"
        E girerse "Engineer"
        T girerse "In Testing" yazdirin

         */

        String input = "E" ;

        switch (input) {

            case "S":
                System.out.println("Software");
            break;
            case "D":
                System.out.println("Developer");
            break;
            case "E":
                System.out.println("Engineer");
            break;
            case "T":
                System.out.println("In Testing");
            break;
                    }
    }
}
