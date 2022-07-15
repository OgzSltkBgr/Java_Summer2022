package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {

       /*
        Java'da olusturdugumuz methodlarin yaptigi isler ile uyumlu olmasini isteriz
        mesela bir string'in bir bolumunu almak icin Java
        2 adet substring() method'u veya
        Verilen String'deki bazi parcalari yenileri ile degistirmek icin
        2 adet replace() method'u var

        Java ayni isimde birden fazla method varsa
        hangisinin kullanilacagina parametre sayisi ve
        parametrelerin data turune gore karar verir.
         */

        String str = "Bu Java ogrenilecek, baska yolu yok.";
        str.substring(2);
        str.substring(2,4);

        str.replace('c','v');
        str.replace("J","H");
        // str.replace(5,8);

        /*
        Ayni isimde ama farkli methodlari olusutmal icin
        degistirebilecegimiz seyler
        1- parametre sayisini degisitirebiliriz
        2- ayni sayida paramatreye sahip olasa bile, parametlerin data turlerini degisitirebiliriz
        3- ayni sayida ve ayni data turunde parametleri  olan methodlarda
            parametrelerin sıralanisini degisitirebiliriz
         */
    }
}
