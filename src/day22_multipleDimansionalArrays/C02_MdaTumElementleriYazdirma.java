package day22_multipleDimansionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {

        // verilen bir multi-dimensional arrayin
        // tum elementlerini yazdiran bir method hazirlayalim

        int[][] sayilar = {{1,5,6,9},{2,5},{3,1,6}};

        elementleriYazdir(sayilar);
    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) { // i = 0,1,2 degererlini alacak
            for (int j = 0; j < sayilar[i].length ; j++) { // inner arraylerin uzunluguna bagladik
                System.out.print(sayilar[i][j]+ " "); // 1 5 6 9 2 5 3 1 6

            }

        }
    }
}
