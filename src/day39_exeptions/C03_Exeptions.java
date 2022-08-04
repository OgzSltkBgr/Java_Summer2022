package day39_exeptions;

public class C03_Exeptions {
    public static void main(String[] args) {

        String str="123a5";

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("\u001B[31m"+"Yazdiginiz deger sadece rakamlardan olusmalidir");
        }catch (Exception e){
            System.out.println("Ongorulemeyen bir hata olustu");
        }


        System.out.println("Sayinin karesi : " + sayi*sayi);

        /*
        Kullanicidan String olarak bir deger aliyor ve bunu integer a ceviriyorsak
        NumberFormatException ile karsilacabilecegimizi ongoruruz
        NFE aldigimizda kodun durmamasini istiyorsak
        try catch ile cevreleyebiliriz

        Eger bilmedigim bir exeption daha olusursa
        kodum durmasin istiyorsak
        bir kere daha catch cumlesi ekleyip ona en genis Exeption i yazabiliriz
         */
    }
}
