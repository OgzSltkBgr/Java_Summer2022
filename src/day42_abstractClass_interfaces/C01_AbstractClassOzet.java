package day42_abstractClass_interfaces;

public class C01_AbstractClassOzet {
    /*
Abstract Class Özet:
1-Bir class'i abstract yapip yapmamaya bastan karar veririz. Eger bir class'tan obje olusturmayacaksak
o class'i child class'larinin uymasi gereken kurallari belirleyecek sekilde dizayn etmek istiyorsak, abstract class yapariz
2- Abstract bir class ta child classlarin mutlaka uymasi gereken kurallari abstract methodlar ile belirleriz
Abstract methodlar mutlaka child class'larda override edileceği icin body'ye ihtiyac duymaz
3-Abstract olarak tanimlanan methodlarin bodysi olmaz.
4-Abstract class zincirinden sonra gelen ilk concrete class,
 parent'larinda bulunan ve concrete olmayan tum methodlari override etmek ZORUNDADIR.
 ancak parent abstract class larda bulunan concrete methodlari override etmek zorunda degildir
 5- Abstract bir class'in abstract child'i parent'daki
abstract methodlari override etmek zorunda degildir
 6- Abstract class'lar constructor'a sahiptir fakat
abstract class'lardan OBJE olusturulamaz
 8-abstract class in abstrcat olan child i parenttaki tum abstract methodlari override etmek zorunda degildir.
ama concrete olan child classlar zorunda.
abstract oldugundan obje olusturulamaz
 */
}
