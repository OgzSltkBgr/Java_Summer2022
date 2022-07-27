package day32_StringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kayra");

        sb.substring(0,3);
        sb.subSequence(2,4);

        System.out.println(sb);
    }
}
