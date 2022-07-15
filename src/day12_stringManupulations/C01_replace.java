package day12_stringManupulations;

public class C01_replace {
    public static void main(String[] args) {

        String str=" Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ", "")); // boslukları yok etmek icin

        //hava kelimesini java yapalim

        System.out.println(str.replace("h", "J").replace(" ", ""));

        //guz el yerine harika yazalim
        System.out.println(str.replace("guz el","harika"));

        // Cumleyi replace kullanarak bugun Java cok guzel yapalim

        str =str.replace("bu gun ", "bugun")
                .replace("ha va ", "Java")
                .replace("harika", "guzel")
                .replace(" ", "");
        System.out.println(str);

    }
}
