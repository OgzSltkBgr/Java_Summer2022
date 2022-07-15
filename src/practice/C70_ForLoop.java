package practice;

public class C70_ForLoop {
    public static void main(String[] args) {

        String str = "Java ile hayat cok guzel";

        tekrarsizStr(str);
    }

            public static void tekrarsizStr(String str) {
                int harfSayisi = 1;
                String islenecekKelime = str.replaceAll("\\W","");
                String benzersizStr = "";
                System.out.print(islenecekKelime.substring(0,1));
                benzersizStr+=islenecekKelime.substring(0,1);

                for (int i = 1; i <islenecekKelime.length(); i++) {

                    if (!benzersizStr.contains((islenecekKelime.substring(i,i+1)))){
                        System.out.print(", " + islenecekKelime.substring(i,i+1));
                        benzersizStr+=islenecekKelime.substring(i,i+1);
                        harfSayisi++;
                    }
                }
                System.out.println("");
                System.out.println("str: " + str);
                System.out.println("benzersizStr: " + benzersizStr);
                System.out.println("harfSayisi: " + harfSayisi);
    }
}
