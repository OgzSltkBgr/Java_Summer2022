package day35_inheritancedeConstructorKullanimi;

public class EMuhasebe extends DPersonel{
    EMuhasebe(){

        System.out.println("EMuhasebe parametresiz cons");
    }
    EMuhasebe(String isim){
        System.out.println("EMuhasebe parametreli cons");
    }
}
