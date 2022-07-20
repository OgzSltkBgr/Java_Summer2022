package day27_staticKeyword;

public class C02 {
      int count=0;
    public void increment(){
        count++;
    }
    public static void main(String[] args) {
        C02 obj1=new C02();
        C02 obj2=new C02();
        obj1.increment();
        obj2.increment();
        System.out.println("obj1 : count is=" + obj1.count);
        System.out.println("obj2 : count is=" + obj2.count);
    }
}
