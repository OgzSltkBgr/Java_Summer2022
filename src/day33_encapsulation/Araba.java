package day33_encapsulation;

public class Araba {

    String marka="Marka belirtilmedi";// markanın access modifieri default acces modifier
                                        // oldugundan package icerisinde kullanılabilir
    private String model="model belirtilmedi";
    private String yakıt="Elektrikli";// tum arabalar elektirkli ise bu variable in degistirelememesi lazim
    // private yaptigimiz model ve yakit variable larina erisimi yetkilendirelim
    // modele deger atabilsin ama gorulemesin(setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin istiyorum(getter)

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakıt() {
        return yakıt;
    }
}
