package day32_StringBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java her zaman guzel");
        sb.delete(8,9);
        System.out.println("sb = " + sb); // Java herzaman guzel

        sb.deleteCharAt(4);
        System.out.println("sb = " + sb);// Javaherzaman guzel

        // bastan baslayarak her loopda ilk harfi silip kalani yazdiralim

        int son=sb.length();
        for (int i = 0; i <son ; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }
}