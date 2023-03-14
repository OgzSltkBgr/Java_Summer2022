package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Calisma01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        System.out.println(list);


            //1.Soru Tekrarsiz 9 dan buyuk cift elamanların karelerini getiriniz
            list.stream().distinct().filter(t->  t%2==0).filter(t->t>9).map(t-> t*t).forEach(t -> System.out.print(t + " "));

            //2.Soru Listedeki 3. en buyuk elemanı bulunuz
            list.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).skip(2).forEach(t -> System.out.print(t + " "));

            //3.Soru En kucuk 2. elemanın kupunu alın
            list.stream().distinct().sorted().limit(2).skip(1).map(t-> t*t*t).forEach(t -> System.out.print(t));

            //4.Soru Tekrarsız tek sayıların kupunu yazınız
            list.stream().distinct().filter(t-> t%2==1).map(t->t*t*t).forEach(t -> System.out.print(t));
        }
}
